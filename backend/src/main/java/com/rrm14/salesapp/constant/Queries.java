package com.rrm14.salesapp.constant;

public final class Queries {
	
	public static final String AMOUNT_GROUPED_SELLER  
	= "SELECT new com.rrm14.salesapp.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
	+ " FROM SaleEntity AS obj GROUP BY obj.seller";
	
	public static final String SUCCESS_GROUPED_SELLER  
	= "SELECT new com.rrm14.salesapp.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited) ,"
	+ "SUM(obj.deals))  FROM SaleEntity AS obj GROUP BY obj.seller";

}
