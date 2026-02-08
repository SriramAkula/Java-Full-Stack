import os
import re

# ===== CONFIG =====
PROJECT_ROOT = r"C:\Users\srira\Desktop\Java-Full-Stack\core_java"
SRC_PATH = os.path.join(PROJECT_ROOT, "src")


def normalize_folder_name(name: str) -> str:
    """
    Convert CamelCase / spaced names to lowercase without spaces
    """
    return re.sub(r"\s+", "", name).lower()


def rename_folders():
    """
    Rename folders bottom-up to avoid path conflicts
    """
    for root, dirs, _ in os.walk(SRC_PATH, topdown=False):
        for d in dirs:
            new_name = normalize_folder_name(d)
            if d == new_name:
                continue

            old_path = os.path.join(root, d)
            new_path = os.path.join(root, new_name)

            if not os.path.exists(new_path):
                os.rename(old_path, new_path)
                print(f"📁 Renamed: {old_path} → {new_path}")


def fix_package_declaration(java_file):
    rel_path = os.path.relpath(java_file, SRC_PATH)
    parts = rel_path.split(os.sep)[:-1]  # remove file name
    if not parts:
        return

    correct_package = ".".join(parts)

    with open(java_file, "r", encoding="utf-8") as f:
        lines = f.readlines()

    new_lines = []
    changed = False

    for line in lines:
        if line.strip().startswith("package "):
            current = line.strip().replace("package", "").replace(";", "").strip()
            if current != correct_package:
                new_lines.append(f"package {correct_package};\n\n")
                changed = True
            else:
                new_lines.append(line)
        else:
            new_lines.append(line)

    if changed:
        with open(java_file, "w", encoding="utf-8") as f:
            f.writelines(new_lines)
        print(f"✔ Fixed package: {java_file}")


def fix_all_packages():
    for root, _, files in os.walk(SRC_PATH):
        for file in files:
            if file.endswith(".java"):
                fix_package_declaration(os.path.join(root, file))


def main():
    print("🔧 Fixing CamelCase folder names...")
    rename_folders()

    print("\n🔧 Fixing package declarations...")
    fix_all_packages()

    print("\n✅ CamelCase package normalization completed")


if __name__ == "__main__":
    main()
