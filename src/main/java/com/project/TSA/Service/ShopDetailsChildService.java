package com.project.TSA.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.TSA.Repository.ShopDetailsRepository;
import com.project.TSA.ShopModel.ShopDetails;
import com.project.TSA.exception.ShopNotFoundException;

@Service
public class ShopDetailsChildService implements ShopService 
{
	ShopDetailsRepository SDR;
	
	
	public ShopDetailsChildService(ShopDetailsRepository sDR) {
		super();
		SDR = sDR;
	}

	@Override
	public String createShopDetails(ShopDetails shopdetails) {
		if(SDR!=null)
		{
			SDR.save(shopdetails);
			return "Successfully shop details created..";
		}
		else
		{
			return "shop details not created..";
		}
		
	}

	@Override
	public String updateShopDetails(ShopDetails shopdetails) {
		SDR.save(shopdetails);
		return "Successfully shop details updated..";
	}

	@Override
	public String deleteShopDetails(int shopId) 
	{
		ShopDetails shop = SDR.findById(shopId).orElse(null);
		if(shop==null)
		{
			throw new ShopNotFoundException("Shop Id Does Not Exits Try Again..!");
		}
		SDR.deleteById(shopId);
		return "Deleted successfully.!";
	}

	@Override
	public ShopDetails getShopDetails(int shopId) 
	{
		ShopDetails shopdetails=SDR.findById(shopId).orElse(null);
		if(shopdetails==null)
		{
		 	throw new ShopNotFoundException("Shop Does Not Exits Try Again..!");
		}
		return shopdetails;
	}

	@Override
	public List<ShopDetails> getAllShopDetails() {
	
		return SDR.findAll();
	}

}
