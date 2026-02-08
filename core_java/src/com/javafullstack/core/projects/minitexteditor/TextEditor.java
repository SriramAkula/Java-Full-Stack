package com.javafullstack.core.projects.minitexteditor;

import java.util.Stack;

public class TextEditor {
	
	private StringBuilder document;
	
	private Stack<String> undoStack;
	private Stack<String> redoStack;
	
	TextEditor(){
		document=new StringBuilder();
		undoStack=new Stack<>();
		redoStack=new Stack<>();
		
	}
	public void saveStateForUndo() {
		undoStack.push(document.toString());
		redoStack.clear();
	}
	
	public void addText(String text) {
		saveStateForUndo();
		document.append(text);
		System.out.println("Text added successfully!");
	}
	public void deleteText(int n) {
		if(document.length()>=n) {
			saveStateForUndo();
			document.delete(document.length()-n, document.length());
			System.out.println("Text deleted successfully!");
			return;
		}
		System.out.println("Text deletion not possible!");

		
	}
	public void searchWord(String word) {
		System.out.println(document.indexOf(word));
	}
	public void replaceWord(String oldWord,String newWord) {
		undoStack.push(document.toString());
		int st=document.indexOf(oldWord);
		if(st!=-1) {
			saveStateForUndo();
			document.replace(st,st+oldWord.length(),newWord);
			System.out.println("Text replaced successfully!");
		}
		
	}
	
	public void undo() {
		if(!undoStack.empty()) {
			redoStack.push(undoStack.peek());
			document=new StringBuilder(undoStack.pop());
			System.out.println("Undo successful!");
		}else {
			System.out.println("Nothing to Undo");
		}
	}
	public void redo() {
		if(!redoStack.empty()) {
			undoStack.push(document.toString());
			document=new StringBuilder(redoStack.pop());
			System.out.println("edo Successfully");
			return;
		}
		System.out.println("Nothing to redo");

	}
	
	public void display() {
		System.out.println("Current Document: ");
		System.out.println(document.toString());
	}
	
}
