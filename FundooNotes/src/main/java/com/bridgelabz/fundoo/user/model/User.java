package com.bridgelabz.fundoo.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="user")
public class User 
{
	@Id
	@Column(name="id")
	@NotEmpty(message = "please provide your id")
	private long id;

	@Column(name="name")
	@NotEmpty(message = "please provide your name")
	private String name;

	@Column(name="email", nullable=false, unique=true)
	@Email(message = "Please provide a valid e-mail")
	@NotEmpty(message="Please provide valid email")
	private String email;

	@Column(name="mobileNumber")
	@Pattern(regexp="[0-9]{10}",message = "provide valid mobile number")
	private long mobileNumber;
	
	@Column(name="password")
	@Transient
	private String password;

}
