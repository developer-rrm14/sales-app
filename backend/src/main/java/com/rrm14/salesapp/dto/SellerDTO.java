package com.rrm14.salesapp.dto;

import java.io.Serializable;

import com.rrm14.salesapp.entity.SellerEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerDTO implements Serializable{
	
	private static final long serialVersionUID = 6278460470020435092L;
	private Long id;
	private String name;
	
	public SellerDTO(SellerEntity entity) {
		id = entity.getId();
		name = entity.getName();
	}

}
