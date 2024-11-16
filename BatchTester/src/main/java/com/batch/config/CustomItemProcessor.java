package com.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.batch.entity.Product;

public class CustomItemProcessor implements ItemProcessor<Product, Product> {

	@Override
	public Product process(Product item) throws Exception {
		try{
			int discount=Integer.parseInt(item.getDiscount().trim());
			int price=Integer.parseInt(item.getPrice().trim());
			int discPrice=price-(price*discount/100);
			
			item.setDiscountedPrice(String.valueOf(discPrice));
		}catch(NumberFormatException ex){
			ex.printStackTrace();
		}
		return item;
	}

}
