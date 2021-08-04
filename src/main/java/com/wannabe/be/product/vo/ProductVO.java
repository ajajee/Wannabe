package com.wannabe.be.product.vo;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ProductVO {
	int product_no;
	String product_category_code;
	String product_category_ref;
	String product_title;
	String product_content;
	String product_writer;
	int product_price;
	int product_delivery_price;
	int product_sale_percent;
	int product_quantity;
	int startRowNum;
	int endRowNum;
	int rowCount;
	String formattedPrice;
	Date regdate;
	int avg_rating; 
	int reviewCount;

	private List<ProductAttachVO> attachList;
}
