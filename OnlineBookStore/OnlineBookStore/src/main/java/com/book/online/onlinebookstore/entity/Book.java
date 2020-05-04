package com.book.online.onlinebookstore.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="tbl_book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="sku")
	private String sku;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	private float unit_price;
	private String image_Url;
	private boolean active;
	private int units_in_stock;
	private Date date_created;
	private Date last_updated;
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable = false)
	private BookCategory category;

	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getSku() {
		return sku;
	}



	public void setSku(String sku) {
		this.sku = sku;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public float getUnit_price() {
		return unit_price;
	}



	public void setUnit_price(float unit_price) {
		this.unit_price = unit_price;
	}



	public String getImage_Url() {
		return image_Url;
	}



	public void setImage_Url(String image_Url) {
		this.image_Url = image_Url;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public int getUnits_in_stock() {
		return units_in_stock;
	}



	public void setUnits_in_stock(int units_in_stock) {
		this.units_in_stock = units_in_stock;
	}



	public Date getDate_created() {
		return date_created;
	}



	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}



	public Date getLast_updated() {
		return last_updated;
	}



	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}



	public BookCategory getCategory() {
		return category;
	}



	public void setCategory(BookCategory category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description + ", unit_price="
				+ unit_price + ", image_Url=" + image_Url + ", active=" + active + ", units_in_stock=" + units_in_stock
				+ ", date_created=" + date_created + ", last_updated=" + last_updated + ", category=" + category + "]";
	}
 
		
	
	
	
	

}
