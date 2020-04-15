package edu.mum.cs.cs472.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.json.JSONException;
import org.json.JSONObject;

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
	public String addItem(String strQuantity, String strProductId) throws JSONException {
		JSONObject jo = new JSONObject();
		int quantity = Integer.parseInt(strQuantity);
		int productId = Integer.parseInt(strProductId);
		Product product = dataRepository.getProductById(productId);
		if(product.getQuantity() < quantity) {
			jo.put("success", false);
			jo.put("message", "Sorry, Product is out of stock");
		}else {
			Item item = dataRepository.getItemByProductId(productId);
			if(item == null) {
				dataRepository.addItemToCard(new Item(product,quantity));
			}else {
				item.setQuantity(item.getQuantity() + quantity);
				item.setPrice(item.getPrice() + quantity * product.getPrice());
			}
			product.setQuantity(product.getQuantity() - quantity);
			
			jo.put("success", true);
			jo.put("message", "The product " + product.getName() + " has been added to cart.");
			jo.put("cardSize", dataRepository.getShoppingCard().getItems().size());
		}
		return jo.toString();
	}
}
