package edu.miu.cs.cs472.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.miu.cs.cs472.project.model.Category;
import edu.miu.cs.cs472.project.model.Product;
import edu.miu.cs.cs472.project.model.ShoppingCard;
import edu.miu.cs.cs472.project.repository.DataRepository;
import edu.mum.cs.cs472.project.service.ShoppingCardService;
import edu.mum.cs.cs472.project.service.ShoppingService;

@WebServlet(description = "This is a shopping page", urlPatterns = { "/shop" })
public class ShoppingController extends HttpServlet{
    private static final long serialVersionUID = 1L;
    ShoppingService shoppingService;
    ShoppingCardService shoppingCardService;

    public ShoppingController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<Product> products = shoppingService.getProducts(request.getParameter("category"));
    	List<Category> categories = shoppingService.getCategories();
    	ShoppingCard shoppingCard = shoppingCardService.getShoppingCard();
    	request.setAttribute("products", products);
    	request.setAttribute("categories", categories);
    	request.setAttribute("shoppingCard", shoppingCard);
    	request.getRequestDispatcher("WEB-INF/views/shop.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println(shoppingCardService.addItem(1,1));
    	System.out.println("post request called");
    }
    public void init(ServletConfig config) throws ServletException {
    	shoppingService = new ShoppingService(config.getServletContext());
    	shoppingCardService = new ShoppingCardService(config.getServletContext());
    	System.out.println("creating");
    }
    
}
