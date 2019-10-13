package com.mycompany.rhosapp3.service;

import java.util.List;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.mycompany.rhosapp3.dto.CountDTO;
import com.mycompany.rhosapp3.dto.ProductsDTO;
import com.mycompany.rhosapp3.dto.ProductsPageDTO;

public class ProductService {
	
	final String path = "http://rhos-app1-rhos-app1.apps.us-west-1.starter.openshift-online.com:80/rhos-app1/resources/product"; 
	
	public ProductService(){}
	
    public List<ProductsDTO> getAll(int start, int size)
    {  
    	ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(path + "/all/" + start);
        Response response = target.request().get();
        ProductsPageDTO value = response.readEntity(ProductsPageDTO.class);
        response.close();
        return value.getProductsPage();
    }

    public int count()
    {
    	ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(path + "/count");
        Response response = target.request().get();
        CountDTO value = response.readEntity(CountDTO.class);
        response.close();
        return value.getCount();
    }
    
    
    
     
    
}