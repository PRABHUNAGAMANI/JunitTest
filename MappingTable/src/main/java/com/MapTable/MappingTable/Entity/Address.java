package com.MapTable.MappingTable.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address 
{
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String street;
	private String city;
	private String state;
	
	public Address() 
	{
		
	}

	public Address(long id, String street, String city, String state) 
	{
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getStreet() 
	
	{
		return street;
	}

	public void setStreet(String street) 
	{
		this.street = street;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}
}
