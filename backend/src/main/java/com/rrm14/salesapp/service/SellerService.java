package com.rrm14.salesapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rrm14.salesapp.dto.SellerDTO;
import com.rrm14.salesapp.entity.SellerEntity;
import com.rrm14.salesapp.repository.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<SellerEntity> sellerList = repository.findAll();
		return sellerList.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
	}

}
