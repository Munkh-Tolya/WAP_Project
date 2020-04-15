/*
 * ShoppingCardController.java - Controller for the shopping cart page.
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
 * Servlet implementation class ShoppingCardController
 */
@WebServlet(description = "Shopping Card", urlPatterns = { "/cart","/cart/*" })
public class ShoppingCardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ShoppingCardService shoppingCardService;
       
   public ShoppingCardController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ShoppingCard shoppingCard = shoppingCardService.getShoppingCard();
		request.setAttribute("shoppingCard", shoppingCard);
		request.getRequestDispatcher("/WEB-INF/views/cart.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int delId = Integer.parseInt(request.getParameter("item"));
		ShoppingCard shoppingCard = shoppingCardService.getShoppingCard();
		for(int i=0;i<shoppingCard.getItems().size();i++) {
			if(shoppingCard.getItems().get(i).getProduct().getId()==delId) {
				shoppingCard.getItems().remove(i);
			}
		}
				
	}
		
	public void init(ServletConfig config) throws ServletException {
		shoppingCardService = new ShoppingCardService(config.getServletContext());
	}

}
