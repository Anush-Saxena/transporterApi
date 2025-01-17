package com.springboot.EwayBillAPI.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "EwayBillUsers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class EwayBillUsers {
    @Id
    @NotBlank(message ="User Id Can not be blank")
    private String userId;
    @NotBlank(message ="UserName Can not be blank")
    private String username;
    @NotBlank(message ="Password Can not be blank")
    private String password;
    @NotBlank(message = "gstin number Can not be blank")
    private String gstin;
    @NotBlank(message = "role Can not be blank")
    private String role;
    private long stateCode;
}
