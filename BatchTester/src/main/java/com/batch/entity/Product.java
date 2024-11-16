package com.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private String productId;
	private String title;
	private String description;
	private String price;
	private String discount;
	private String discountedPrice;

}
