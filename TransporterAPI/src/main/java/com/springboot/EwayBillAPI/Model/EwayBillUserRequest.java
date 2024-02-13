package com.springboot.EwayBillAPI.Model;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class EwayBillUserRequest {
	@NotBlank
	private String username;
	@NotBlank
    private String password;
	@NotBlank
    private String gstin;
	@NotBlank
    private String role;
    private long stateCode;

}
