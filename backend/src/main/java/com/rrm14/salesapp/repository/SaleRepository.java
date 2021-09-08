package com.rrm14.salesapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rrm14.salesapp.dto.SaleSuccessDTO;
import com.rrm14.salesapp.dto.SaleSumDTO;
import com.rrm14.salesapp.entity.SaleEntity;
import com.rrm14.salesapp.constant.Queries;

public interface SaleRepository extends JpaRepository<SaleEntity, Long>{
	
	@Query(Queries.AMOUNT_GROUPED_SELLER)
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query(Queries.SUCCESS_GROUPED_SELLER)
	List<SaleSuccessDTO> successGroupedBySeller();
}
