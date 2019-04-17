package com.quizportal.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserRole implements Serializable {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "RoleId")
private Long Id;

public Long getId() {
	return Id;
}

public void setId(Long id) {
	Id = id;
}

private String roleName;

public String getRoleName() {
	return roleName;
}

public void setRoleName(String roleName) {
	this.roleName = roleName;
}



	
	

}
