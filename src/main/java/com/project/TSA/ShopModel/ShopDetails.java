package com.project.TSA.ShopModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShopDetails 
{
	@Id
	private int shopId;
	private String shopName;
	private String shopOwnerName;
	private String shopAddress;
	public ShopDetails(int shopId, String shopName, String shopOwnerName, String shopAddress) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopOwnerName = shopOwnerName;
		this.shopAddress = shopAddress;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopOwnerName() {
		return shopOwnerName;
	}
	public void setShopOwnerName(String shopOwnerName) {
		this.shopOwnerName = shopOwnerName;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public ShopDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
