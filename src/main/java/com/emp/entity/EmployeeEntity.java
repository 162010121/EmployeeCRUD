package com.emp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.persistence.Id;

import lombok.Data;

@Table(name = "student")
@Data
@Entity
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentId")
	private Integer Id;
	
	@NotBlank(message = "student_Name cannot be blank")
	@NotEmpty
	@Column(name = "studentName")
	private String name;
	@Column(name = "studentCity")
	private String city;
	@Column(name = "studentNumber")
	private Integer number;

}
