package Collections;

import java.util.*;

public class CollectionsSort {
	
	public static void main(String[] ar)
	{
//		ArrayList<Employee> e = new ArrayList<Employee>();
//	e.add(new Employee("sumanth"));
//	e.add(new Employee("raghu"));
//	e.add(new Employee("abc"));
//	System.out.println(e);
//	Collections.sort(e, (e1,e2)->(e1.name.compareTo(e2.name)));
//	System.out.println(e);
		
		
	//integer sorting
		
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(20);
	a.add(10);
	a.add(12);
	System.out.println(a);
	//Comparator<Integer> c=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
	Collections.sort(a, (i1,i2)->(i1<i2)?-1:(i1>i2)?1:0);
	System.out.println(a);
	
	/*
	ArrayList<String> a = new ArrayList<String>();
		a.add("sonu");
		a.add("raghu");
		a.add("abc");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	*/
	}

}
