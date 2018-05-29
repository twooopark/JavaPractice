package com.javaex.problem08;

public class Book {
    int bookNo;
    String title;
    String author;
    int stateCode;
    
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	this.stateCode = 1;
    }
    
    public void rent() {
    	if(this.stateCode!=0) {
	    	this.stateCode = 0;
	    	System.out.println(title+" 이(가) 대여 됐습니다.");
    	}else {
    		System.out.println("이미 대여중인 책입니다.");
        }
    }
    public void print() {
    	System.out.println(this.bookNo+"책 제목: "+this.title+", 작가:"+
    			author+", 대여 유무: "+(this.stateCode==0?"대여중":"재고있음"));
    }
   
}
