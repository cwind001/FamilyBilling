package com.cwind.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ExpenseType")
public class ExpenseType {
	private Integer id;
	private Integer category_id;
	private String displayname;
	
	public ExpenseType(){
		
	}
	
	public ExpenseType(Integer id, Integer category_id, String displayname) {
		super();
		this.id = id;
		this.category_id = category_id;
		this.displayname = displayname;
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="category_id")
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	
	@Column(name="displayname")
	public String getDisplayname() {
		return displayname;
	}
	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}
}
