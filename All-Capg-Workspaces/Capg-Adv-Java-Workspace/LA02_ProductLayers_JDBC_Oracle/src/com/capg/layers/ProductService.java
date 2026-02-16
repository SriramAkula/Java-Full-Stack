package com.capg.layers;

public class ProductService {
	
	
	int discount;
	
	public int addProduct(int pid,String pname, double price) {
		
		System.out.println("This is ProductService");
		System.out.println(pid+" "+pname+" "+price);
		
		if(price>1000) {
			discount = 1;
		}else {
			discount = 0;
		}
		
		ProductBean productBean = new ProductBean();
		
		productBean.setPid(pid);
		productBean.setPname(pname);
		productBean.setPrice(price);
		productBean.setDiscountable(discount);
		
		ProductDAO productDAO = new ProductDAO();
		
		int i = productDAO.addProduct(productBean);
		
		return i;
		
	}
}
