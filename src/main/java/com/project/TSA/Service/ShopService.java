package com.project.TSA.Service;

import java.util.List;

import com.project.TSA.ShopModel.ShopDetails;
public interface ShopService 
{
	public String createShopDetails(ShopDetails shopdetails);
	public String updateShopDetails(ShopDetails shopdetails);
	public String deleteShopDetails(int shopId);
	public ShopDetails getShopDetails(int shopId);
	public List<ShopDetails> getAllShopDetails();
	
}
