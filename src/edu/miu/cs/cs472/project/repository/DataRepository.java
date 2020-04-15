package edu.miu.cs.cs472.project.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.miu.cs.cs472.project.model.Category;
import edu.miu.cs.cs472.project.model.Item;
import edu.miu.cs.cs472.project.model.Order;
import edu.miu.cs.cs472.project.model.Product;
import edu.miu.cs.cs472.project.model.ShoppingCard;

public class DataRepository{
	List<Category> categoryList;
	List<Product> productList;
	ShoppingCard shoppingCard;
	List<Order> orderList;
	
	/*Added by: Namuun; April 14, 2020*/
	List<Product> featuredProducts;
	List<Product> topSellingProducts;
	List<Product> hotOfferProducts;
	
	public DataRepository() {
		initData();
	}
	public void initData() {
		categoryList = new ArrayList<>();
		productList = new ArrayList<>();
		shoppingCard = new ShoppingCard();
		orderList = new ArrayList<>();
		
		/*Added by: Namuun; April 14, 2020; START*/
		featuredProducts = new ArrayList<>();
		topSellingProducts = new ArrayList<>();
		hotOfferProducts = new ArrayList<>();
		/*Added by: Namuun; April 14, 2020; END*/
		
		System.out.println("initializing data");
		Category c1 = new Category(1,"Headphones");
		Category c2 = new Category(2,"Laptops");
		Category c3 = new Category(3,"Smartphones");
		Category c4 = new Category(4,"Cameras");
		Category c5 = new Category(5,"TV & Audio");
		Category c6 = new Category(6,"Watches");
		/*c5 and c6 added by Namuun*/
		categoryList.addAll(Arrays.asList(c1,c2,c3,c4,c5,c6));
		
		Product p1 = new Product(1,"ONTEC E Headset","Sample product",175,"uploads/pro1.png",10,c1);
		Product p2 = new Product(2,"Solo Headset","Sample product",235,"uploads/pro2.png",10,c1);
		Product p3 = new Product(3,"Ultra Whitte Wireless","Sample product",350,"uploads/pro3.png",10,c1);
		Product p4 = new Product(4,"Wireless Mondo","Sample product",266,"uploads/pro33",10,c1);
		
		Product p5 = new Product(5,"Tablet Red 8500U 2TB","Sample product",100,"uploads/pro4.png",10,c2);
		Product p6 = new Product(6,"Tablet VX3000 Extra","Sample product",850,"uploads/pro6.png",10,c2);
		Product p7 = new Product(7,"Laptop Sens 7200L","Sample product",760,"uploads/pro8.png",10,c2);

		productList.addAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7));
		
		/*Added by: Namuun; April 14, 2020; START:*/
		featuredProducts.addAll(Arrays.asList(p1,p2,p3));
		
		Product p8 = new Product(8,"Ellite Pro Book 15'6 7500U","Sample product",850.00,"uploads/pro5.png",10,c2);
		Product p9 = new Product(9,"Tablet VX3000 Extra Light","Sample product",850.00,"uploads/pro6.png",10,c2);
		topSellingProducts.addAll(Arrays.asList(p5,p8,p9));
		
		Product p10 = new Product(10,"Tablet VX4000 8500 3TB","Sample product",940,"uploads/pro7.png",10,c2);
		Product p11 = new Product(11,"Laptop XS3000 WiFi Smart","Sample product",1200,"uploads/pro9.png",10,c2);
		hotOfferProducts.addAll(Arrays.asList(p10,p7,p11));
		/*Added by: Namuun; April 14, 2020; END*/
		
		Item i1 = new Item(p1,3);
		Item i2 = new Item(p2,2);
		shoppingCard.addItem(i1);
		shoppingCard.addItem(i2);
	
	}
	public Product getProductById(int productId) {
		return productList.stream().filter(p -> p.getId() == productId).findAny().orElse(null);
	}
	public Item getItemByProductId(int productId) {
		return shoppingCard.getItems().stream().filter(p -> p.getProduct().getId() == productId).findAny().orElse(null);
	}
	public ShoppingCard addItemToCard(Item item) {
		shoppingCard.addItem(item);
		return shoppingCard;
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
	public List<Product> getFeaturedProducts() {
		return featuredProducts;
	}
	public void setFeaturedProducts(List<Product> featuredProducts) {
		this.featuredProducts = featuredProducts;
	}
	public List<Product> getTopSellingProducts() {
		return topSellingProducts;
	}
	public void setTopSellingProducts(List<Product> topSellingProducts) {
		this.topSellingProducts = topSellingProducts;
	}
	public List<Product> getHotOfferProducts() {
		return hotOfferProducts;
	}
	public void setHotOfferProducts(List<Product> hotOfferProducts) {
		this.hotOfferProducts = hotOfferProducts;
	}
	
}
