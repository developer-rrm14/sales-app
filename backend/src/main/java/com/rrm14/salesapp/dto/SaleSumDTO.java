package com.rrm14.salesapp.dto;

import java.io.Serializable;

import com.rrm14.salesapp.entity.SellerEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleSumDTO implements Serializable {
	
	private static final long serialVersionUID = -6678880008845265616L;
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO(SellerEntity seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

}
