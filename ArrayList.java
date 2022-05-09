package com.ArraylistVsLinkedList;
import java.util.LinkedList;
import java.util.List;
public class ArrayList {

	public static void main(String[] args)
	{

		ArrayList al=new ArrayList();//creating arraylist    
		  ((List<String>) al).add("Ravi");//adding object in arraylist    
		  ((List<String>) al).add("Vijay");    
		  //al.add("Ravi");    
		  //al.add("Ajay");    
		  
		  
		  
		  List<String> al2=new LinkedList<String>();  //creating linkedlist    
		  al2.add("James");  //adding object in linkedlist    
		  al2.add("Serena");    
		  al2.add("Swati");    
		  al2.add("Junaid");    
		    
		  System.out.println("arraylist: "+al);  
		  System.out.println("linkedlist: "+al2);  
	
	
	}

}
