//package com.swapstech.hackathon.employer.model;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//@Table(name = "ENTITY_MSTR")
//public class Company {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "ID", nullable=false)
//	private Long id;
//	
//	@Column(name="ENTITY_ID")
//	private String companyId;
//	
//	
//	
////	@OneToOne(cascade = CascadeType.ALL)
////    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "id")
////	private Address address;
//	
//	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
//	@JsonIgnore
//	private List<User> users;
//	
//	
//	
//	
//	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
////	public Address getAddress() {
////		return address;
////	}
////
////	public void setAddress(Address address) {
////		this.address = address;
////	}
//
//	public List<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}
//
//	public String getCompanyId() {
//		return companyId;
//	}
//
//	public void setCompanyId(String companyId) {
//		this.companyId = companyId;
//	}
//	
//	
//	
//	
//	
//	
//	
//}
