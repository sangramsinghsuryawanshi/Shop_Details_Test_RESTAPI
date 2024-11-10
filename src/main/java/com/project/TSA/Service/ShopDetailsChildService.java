package com.project.TSA.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.TSA.Repository.ShopDetailsRepository;
import com.project.TSA.ShopModel.ShopDetails;

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
		if(SDR.existsById(shopId)==true)
		{
			SDR.deleteById(shopId);
			return "Deleted successfully..";
		}
		else
		{
			return "id Not Found";
		}
	}

	@Override
	public ShopDetails getShopDetails(int shopId) {
		
		return SDR.findById(shopId).get();
	}

	@Override
	public List<ShopDetails> getAllShopDetails() {
	
		return SDR.findAll();
	}

}
