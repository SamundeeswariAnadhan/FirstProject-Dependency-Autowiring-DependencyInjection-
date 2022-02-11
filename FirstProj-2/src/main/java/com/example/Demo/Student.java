package com.example.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") //we can create instance by getBean in main class
public class Student {
	
	private int Sid;
	private String Sname;
	private String dep;
	@Autowired //Search by type
	@Qualifier("lap1") //search by name
	private Laptop laptop;
	
	public Student() {
		super();
		System.out.println("Object created by constructor...");
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	

	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show()
	{
		System.out.println("in show");
		laptop.compile();
	}
	
	

}
