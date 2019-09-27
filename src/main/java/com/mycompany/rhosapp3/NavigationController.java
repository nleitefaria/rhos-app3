package com.mycompany.rhosapp3;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class NavigationController {
	
	public String listProducts(){
	    return "products?faces-redirect=true";
	}
	
	public String listCustomers(){
	    return "customers?faces-redirect=true"; 
	}

}
