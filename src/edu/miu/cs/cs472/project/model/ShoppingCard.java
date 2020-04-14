package edu.miu.cs.cs472.project.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
	private List<Item> items;
	public ShoppingCard() {
		items = new ArrayList<>();
	}
	public void removeItem(Item item) {
		items.remove(item);
	}
	public void addItem(Item item) {
		items.add(item);
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
