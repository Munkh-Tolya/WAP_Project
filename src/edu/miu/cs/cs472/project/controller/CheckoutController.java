/*
 * CheckoutController.java - Controller for the checkout page.
 * @author Namuun S
 * @version 1.0
 */
package edu.miu.cs.cs472.project.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.miu.cs.cs472.project.model.ShoppingCard;
import edu.mum.cs.cs472.project.service.ShoppingCardService;

/**
 * Servlet implementation class CheckoutController
 */
@WebServlet(description = "Checkout", urlPatterns = { "/checkout" })
public class CheckoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShoppingCardService shoppingCardService;
       
    public CheckoutController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShoppingCard shoppingCard = shoppingCardService.getShoppingCard();
		request.setAttribute("shoppingCard", shoppingCard);
		request.getRequestDispatcher("/WEB-INF/views/checkout.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	public void init(ServletConfig config) throws ServletException {
		shoppingCardService = new ShoppingCardService(config.getServletContext());
	}

}
