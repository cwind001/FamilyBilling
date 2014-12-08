package com.cwind.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class Expense {
	
	private Integer id;
	private Integer user_id;
	private String description;
	private Integer expenseType_id;
	private Date created;
	
	public Expense(){
		
	}
	
	public Expense(Integer id, Integer user_id, String description,
			Integer expenseType_id, Date created) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.description = description;
		this.expenseType_id = expenseType_id;
		this.created = created;
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

	@Column(name="user_id")
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Column(name="description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="expensetype_id")
	public Integer getExpenseType_id() {
		return expenseType_id;
	}

	public void setExpenseType_id(Integer expenseType_id) {
		this.expenseType_id = expenseType_id;
	}

	@Column(name="created")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
}
