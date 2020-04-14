package edu.mum.cs.cs472.project.service;

import java.util.List;

import javax.servlet.ServletContext;

import edu.miu.cs.cs472.project.repository.DataRepository;
import edu.miu.cs.cs472.project.model.Category;
import edu.miu.cs.cs472.project.model.Product;

public class ShoppingService {
	DataRepository dataRepository;
	ServletContext servletContext;
	public ShoppingService(ServletContext servletContext) {
		this.servletContext = servletContext;
		dataRepository  = (DataRepository)this.servletContext.getAttribute("data");
	}
	public List<Product> getAllProduct() {
		return dataRepository.getProductList();
	}
	public List<Category> getCategories() {
		return dataRepository.getCategoryList();
	}
}
