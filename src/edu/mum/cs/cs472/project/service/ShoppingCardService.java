package edu.mum.cs.cs472.project.service;

import java.util.List;

import javax.servlet.ServletContext;

import edu.miu.cs.cs472.project.model.Item;
import edu.miu.cs.cs472.project.model.Product;
import edu.miu.cs.cs472.project.model.ShoppingCard;
import edu.miu.cs.cs472.project.repository.DataRepository;

public class ShoppingCardService {
	DataRepository dataRepository;
	ServletContext servletContext;
	public ShoppingCardService(ServletContext servletContext) {
		this.servletContext = servletContext;
		dataRepository  = (DataRepository)this.servletContext.getAttribute("data");
	}
	public ShoppingCard getShoppingCard() {
		return dataRepository.getShoppingCard();
	}
	public String addItem(int quantity, int productId) {
		Product product = dataRepository.getProductById(productId);
		if(product.getQuantity() < quantity) {
			return "Sorry, Product is out of stock";
		}else {
			ShoppingCard card = dataRepository.getShoppingCard();
			Item item = dataRepository.getItemByProductId(productId);
			if(item == null) {
				dataRepository.addItemToCard(new Item(product,quantity));
			}else {
				item.setQuantity(item.getQuantity() + quantity);
			}
			product.setQuantity(product.getQuantity() - quantity);
			return "Successfull";
		}
	}
}
