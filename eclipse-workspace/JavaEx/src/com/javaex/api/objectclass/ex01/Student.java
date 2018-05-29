package com.javaex.api.objectclass.ex01;

class Student{  
	 int id;  
	 String name;  
	 String address;  

	 Student(int id, String name, String address){  
	 this.id=id;  
	 this.name=name;  
	 this.address=address;  
	 }  

	//overriding the toString() method  
	public String toString(){ 
	  return id+" "+name+" "+address;  
	 }  
	 public static void main(String args[]){  
	   Student s1=new Student(100,"Joe","success");  
	   Student s2=new Student(50,"Jeff","fail");  

	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	 }  
	} 