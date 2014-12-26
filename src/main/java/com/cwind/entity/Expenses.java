package com.cwind.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Expenses")
public class Expenses {
	
	private Integer id;
	private Integer user_id;
	private String title;
	private String vender;
	private double price;
	private String memo;
	private Integer expenseType_id;
	private Date created;
	
	public Expenses(){
		
	}
	
	public Expenses(Integer id, Integer user_id, String title, String vender, double price,
			String memo,	Integer expenseType_id, Date created) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.title = title;
		this.vender = vender;
		this.price = price;
		this.memo = memo;
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

	@Column(name="memo")
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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

	@Column(name="title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name="vender")
	public String getVender() {
		return vender;
	}

	public void setVender(String vender) {
		this.vender = vender;
	}

	@Column(name="price")
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
