package com.mycompany.rhosapp3.dto;

import java.util.List;

public class CustomersPageDTO {
	
	private List<CustomersDTO> content;
	private int totalElements;
	
	public CustomersPageDTO() {
		super();
	}

	public CustomersPageDTO(List<CustomersDTO> content, int totalElements) {
		super();
		this.content = content;
		this.totalElements = totalElements;
	}

	public List<CustomersDTO> getContent() {
		return content;
	}

	public void setContent(List<CustomersDTO> content) {
		this.content = content;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

}
