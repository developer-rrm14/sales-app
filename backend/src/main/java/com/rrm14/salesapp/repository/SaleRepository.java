package com.rrm14.salesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrm14.salesapp.entity.SaleEntity;

public interface SaleRepository extends JpaRepository<SaleEntity, Long>{

}
