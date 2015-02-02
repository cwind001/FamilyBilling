package com.cwind.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FundAccount")
public class FundAccount {
	private Integer id;
	private Integer category_id;
	private String title;
	private String vender;
	private String description;
	
	public FundAccount() {
		
	}
	
	public FundAccount(Integer id, Integer category_id, String title,
			String vender, String description) {
		super();
		this.id = id;
		this.category_id = category_id;
		this.title = title;
		this.vender = vender;
		this.description = description;
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
	
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
