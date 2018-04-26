package com.basicsdatastructures;
import java.util.*;
import java.util.ArrayList;

public class Testclass {

	public static void main(String[] args) {
		ArrayList<Studentclass>list=new ArrayList<Studentclass>();
		Studentclass s1= new Studentclass("john",12,522);
		Studentclass s2= new Studentclass("amanda",10,520);
		Studentclass s3= new Studentclass("mary",11,548);
		Studentclass s4= new Studentclass("jona",10,523);
		Studentclass s5= new Studentclass("ram",13,512);
		Studentclass s6= new Studentclass("mike",12,545);
		Studentclass s7= new Studentclass("cheng",11,511);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		
		
		
	
	for(Studentclass roshu:list) {
		System.out.println(roshu.name+" "+roshu.age+" "+roshu.marks);
		
	}

}
}