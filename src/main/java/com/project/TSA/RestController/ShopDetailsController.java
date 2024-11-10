package com.project.TSA.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.TSA.Service.ShopService;
import com.project.TSA.ShopModel.ShopDetails;

@RestController
@RequestMapping("/ShopAPI")
public class ShopDetailsController 
{
	ShopService SS;
	
	
	public ShopDetailsController(ShopService sS) {
		super();
		SS = sS;
	}

	@GetMapping("{shopId}")
	public ShopDetails getShopDetails(@PathVariable("shopId") int shopId)
	{
		return SS.getShopDetails(shopId);
	}
	
	@GetMapping()
	public List<ShopDetails> getAllShopDetails()
	{
		return SS.getAllShopDetails();
	}
	
	@PostMapping
	public ResponseEntity<String> createShopDetails(@RequestBody ShopDetails shopdetails)
	{
		String s=SS.createShopDetails(shopdetails);
		if(s.equals("Successfully shop details created.."))
		{
			return new ResponseEntity<>(s, HttpStatus.OK); 
		}
		else
		{
			return new ResponseEntity<>(s, HttpStatus.NOT_FOUND); 
		}
	}
	
	@PutMapping
	public ResponseEntity<String> updateShopDetails(@RequestBody ShopDetails shopdetails)
	{
		String s=SS.updateShopDetails(shopdetails);
		if(s.equals("Successfully shop details updated.."))
		{
			return new ResponseEntity<>(s, HttpStatus.OK); 
		}
		else
		{
			return new ResponseEntity<>(s, HttpStatus.NOT_FOUND); 
		}
	}
	
	@DeleteMapping("{shopId}")
	public ResponseEntity<String> deleteShopDetails(@PathVariable("shopId") int shopId) {
	    String result = SS.deleteShopDetails(shopId);
	    
	    if (result.equals("Deleted successfully..")) 
	    {
	        return new ResponseEntity<>(result, HttpStatus.OK); 
	    } 
	    else 
	    {
	        return new ResponseEntity<>(result, HttpStatus.NOT_FOUND); 
	    }
	}

}
