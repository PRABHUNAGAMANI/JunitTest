package com.MapTable.MappingTable.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee 
{
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
      private long id;
	  
      private String name;
      private String age;
      private String department;
      
      @OneToOne(cascade=CascadeType.ALL)
      @JoinColumn(name="address_id",referencedColumnName="id")
      private Address address;
       
	public Employee() 
	{
	
	}

	public Employee(long id, String name, String age, String department, Address address) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.address = address;
	}

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAge() 
	{
		return age;
	}

	public void setAge(String age) 
	{
		this.age = age;
	}

	public String getDepartment() 
	{
		return department;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address address) 
	{
		this.address = address;
	}  
}
