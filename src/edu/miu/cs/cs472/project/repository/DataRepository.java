package edu.miu.cs.cs472.project.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.miu.cs.cs472.project.model.Category;
import edu.miu.cs.cs472.project.model.Order;
import edu.miu.cs.cs472.project.model.Product;
import edu.miu.cs.cs472.project.model.ShoppingCard;

public class DataRepository{
	List<Category> categoryList;
	List<Product> productList;
	ShoppingCard shoppingCard;
	List<Order> orderList;
	public DataRepository() {
		initData();
	}
	public void initData() {
		categoryList = new ArrayList<>();
		productList = new ArrayList<>();
		shoppingCard = new ShoppingCard();
		orderList = new ArrayList<>();
		
		System.out.println("initializing data");
		Category c1 = new Category(1,"Headphones");
		Category c2 = new Category(2,"Laptops");
		Category c3 = new Category(3,"Smartphones");
		Category c4 = new Category(4,"Cameras");
		categoryList.addAll(Arrays.asList(c1,c2,c3,c4));
		
		Product p1 = new Product(1,"ONTEC E Headset","Sample product",175,"headphone.png",10,c1);
		Product p2 = new Product(2,"Solo Headset","Sample product",235,"headphone1.png",10,c1);
		Product p3 = new Product(3,"Ultra Whitte Wireless","Sample product",350,"headphone2.png",10,c1);
		Product p4 = new Product(4,"Wireless Mondo","Sample product",266,"headphone3.png",10,c1);
		
		Product p5 = new Product(5,"Tablet Red 8500U 2TB","Sample product",100,"laptop1.png",10,c2);
		Product p6 = new Product(6,"Tablet VX3000 Extra","Sample product",850,"laptop2.png",10,c2);
		Product p7 = new Product(7,"Laptop Sens 7200L","Sample product",760,"laptop3.png",10,c2);

		productList.addAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7));
	}
	public List<Category> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public ShoppingCard getShoppingCard() {
		return shoppingCard;
	}
	public void setShoppingCard(ShoppingCard shoppingCard) {
		this.shoppingCard = shoppingCard;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
}
