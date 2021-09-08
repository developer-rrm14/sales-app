package com.rrm14.salesapp.dto;

import java.io.Serializable;

import com.rrm14.salesapp.entity.SellerEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleSuccessDTO implements Serializable {
	

	private static final long serialVersionUID = 1869462080507656414L;
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO(SellerEntity seller,Long visited, Long deals) {
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

}
