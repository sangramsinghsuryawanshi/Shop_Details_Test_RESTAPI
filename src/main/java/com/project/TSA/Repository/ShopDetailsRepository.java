package com.project.TSA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.TSA.ShopModel.ShopDetails;

public interface ShopDetailsRepository extends JpaRepository<ShopDetails, Integer> 
{
	
}
