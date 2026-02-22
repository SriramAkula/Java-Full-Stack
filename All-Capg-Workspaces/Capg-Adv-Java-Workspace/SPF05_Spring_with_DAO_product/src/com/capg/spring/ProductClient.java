package com.capg.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductClient {

    public static void main(String[] args) {


        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext_Dao.xml");

        ProductDao obj = (ProductDao) factory.getBean("productDao");

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        System.out.println("Welcome to Product Management Portal!");

        while (flag) {

            System.out.println("1. Add Product");
            System.out.println("2. Get Product Details");
            System.out.println("3. Remove Product");
            System.out.println("4. Update Product Name");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Manufacturer: ");
                    String manufacturer = sc.nextLine();

                    ProductBean pb = new ProductBean(id, name, category, manufacturer);

                    obj.save(pb);
                    break;

                case 2:

                    System.out.print("Enter Product ID: ");
                    int id1 = sc.nextInt();

                    ProductBean pb1 = obj.get(id1);

                    if (pb1 == null)
                        System.out.println("No Product Found!");
                    else
                        System.out.println(pb1);

                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    int id2 = sc.nextInt();

                    int res = obj.removeProduct(id2);

                    if (res == 0)
                        System.out.println("No Product Found!");
                    else
                        System.out.println("Product Deleted Successfully!");

                    break;

                case 4:

                    System.out.print("Enter Product ID: ");
                    int id3 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Product Name: ");
                    String newName = sc.nextLine();

                    int res1 = obj.updateProductName(id3, newName);

                    if (res1 == 0)
                        System.out.println("No Product Found!");
                    else
                        System.out.println("Product Updated Successfully!");

                    break;

                case 5:
                    flag = false;
                    System.out.println("Thank You for Using our services");
                    break;

                default:
                    System.out.println("Enter Valid Option!");
            }
        }

        sc.close();
    }
}