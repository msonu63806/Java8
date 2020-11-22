package Collections;

import java.util.Random;
import java.util.UUID;

public class Employee {
	
	int id;
	String name;
	
	Random r = new Random();
	
	public Employee(String n)
	{
		this.name = n;
		this.id = r.nextInt(100);
		//this.id = UUID.randomUUID().toString();
	}
	
	public String toString()
	{
		return this.id+":"+this.name;
	}

}
