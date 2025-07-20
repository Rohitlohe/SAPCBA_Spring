package com.sapcba.sapcbaapp.studentdto;

public class StudentDTO {
private long id;
private String name;
private String lastName;
private long contact;
private String email;
public StudentDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentDTO(long id, String name, String lastName, long contact, String email) {
	super();
	this.id = id;
	this.name = name;
	this.lastName = lastName;
	this.contact = contact;
	this.email = email;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", lastName=" + lastName + ", contact=" + contact + ", email="
			+ email + "]";
}

}
