package com.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// creating arraylist with generics
		ArrayList<String> employeeNameList = new ArrayList<String>();
// adding elements to list
		employeeNameList.add("Rohan");
		employeeNameList.add("Virath");
		employeeNameList.add("Rohit");
		employeeNameList.add("Raman");
		System.out.println("EmployeesName :");
		print(employeeNameList);

// Removing names from the list at specified index
		employeeNameList.remove(2);
		System.out.println("EmployeesName After removing :");
		print(employeeNameList);

// Adding elements at specified index

		employeeNameList.add(2, "Rohit");
		System.out.println("Employees name added at specified position");
		print(employeeNameList);
		
//To get elements from array list
		String str=employeeNameList.get(2);
		System.out.println("the Name is:"+str);
		
//remove object
		employeeNameList.remove("Raman");
		System.out.println("Employees removed specifically");
		print(employeeNameList);
		
//updating an element at specified index
		employeeNameList.set(2, "Raman");
		System.out.println("list after updating is");
		print(employeeNameList);
		
//finding index of element
//-1 if element does not exist
		int index=employeeNameList.indexOf("Raman");
		System.out.println("Raman is in "+index);
		int index2=employeeNameList.indexOf("Rohit");
		System.out.println("index of rohit is :"+index2);

//collection method
ArrayList<String> list2=new ArrayList<String>();
list2.add("Rajesh");
list2.add("Rohit");
employeeNameList.addAll(list2);
System.out.println("After add info of another list");
print(employeeNameList);
		
// clearing the list
		employeeNameList.clear();
		System.out.println("After Clear");
		print(employeeNameList);
	}

	private static void print(ArrayList employeeNameList) {

		for (Object empNames : 	employeeNameList) {
			String names = empNames.toString();
			System.out.println(names);
		}

	}

}
