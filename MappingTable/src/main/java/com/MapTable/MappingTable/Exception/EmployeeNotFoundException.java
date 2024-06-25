package com.MapTable.MappingTable.Exception;


public class EmployeeNotFoundException extends RuntimeException
{
	private String resourceName;
	private String fieldName;
	public EmployeeNotFoundException(String resourceName, String fieldName) 
	{
		super(String.format("%s details not found with %s",resourceName,fieldName));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
	}
	public EmployeeNotFoundException() {
		super();
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	

}
