package edu.mum.cs.cs472.project.service;

import javax.servlet.ServletContext;

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
}
