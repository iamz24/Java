package com.example.demo.dto;

import lombok.Data;

@Data
public class searchDTO {
	private String searchName;
	private String sortField = "id";
	private Integer currentPage = 1;
	private Integer size = 2;

	
}
