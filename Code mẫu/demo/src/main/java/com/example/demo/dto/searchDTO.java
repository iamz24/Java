package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class searchDTO {
	@NotBlank(message = "This fied is required")
	@Size(min = 6, max = 20, message = "Length is between 6 to 20")
	private String searchName;
	private String sortField = "id";
	private Integer currentPage = 1;
	private Integer size = 2;

	
}
