package com.rrm14.salesapp.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.rrm14.salesapp.entity.SaleEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO implements Serializable{
	
	
	private static final long serialVersionUID = 2780489419489644765L;
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	private SellerDTO seller;
	
	public SaleDTO(SaleEntity entity) {
		id      = entity.getId();
		visited = entity.getVisited();
		deals   = entity.getDeals();
		amount  = entity.getAmount();
		date    = entity.getDate();
		seller  = new SellerDTO(entity.getSeller());
	}

}
