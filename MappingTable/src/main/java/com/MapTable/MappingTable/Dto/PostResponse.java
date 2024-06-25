package com.MapTable.MappingTable.Dto;

import java.util.List;

import com.MapTable.MappingTable.Entity.Employee;

public class PostResponse 
{
	private List<Employee> content;
    private int PageNo;
    private int PageSize;
    private long totalElements;
    private int totalPages;
    private boolean last;
    
	public PostResponse() 
	{
		
	}

	public PostResponse(List<Employee> content, int pageNo, int pageSize, long totalElements, int totalPages,
			boolean last) 
	{
		this.content = content;
		PageNo = pageNo;
		PageSize = pageSize;
		this.totalElements = totalElements;
		this.totalPages = totalPages;
		this.last = last;
	}

	public List<Employee> getContent() 
	{
		return content;
	}

	public void setContent(List<Employee> content) 
	{
		this.content = content;
	}

	public int getPageNo() 
	{
		return PageNo;
	}

	public void setPageNo(int pageNo) 
	{
		this.PageNo = pageNo;
	}

	public int getPageSize() 
	{
		return PageSize;
	}

	public void setPageSize(int pageSize) {
		this.PageSize = pageSize;
	}

	public long getTotalElements() 
	{
		return totalElements;
	}

	public void setTotalElements(long totalElements) 
	{
		this.totalElements = totalElements;
	}

	public int getTotalPages() 
	{
		return totalPages;
	}

	public void setTotalPages(int totalPages) 
	{
		this.totalPages = totalPages;
	}

	public boolean isLast() 
	{
		return last;
	}

	public void setLast(boolean last) 
	{
		this.last = last;
	}
}
