package com.rrm14.salesapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rrm14.salesapp.dto.SaleDTO;
import com.rrm14.salesapp.dto.SaleSuccessDTO;
import com.rrm14.salesapp.dto.SaleSumDTO;
import com.rrm14.salesapp.entity.SaleEntity;
import com.rrm14.salesapp.repository.SaleRepository;
import com.rrm14.salesapp.repository.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<SaleEntity> saleList = repository.findAll(pageable);
		return saleList.map(sale -> new SaleDTO(sale));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}

}
