package com.mycompany.rhosapp3.service;

import java.util.List;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.mycompany.rhosapp3.dto.CustomersDTO;
import com.mycompany.rhosapp3.dto.CustomersPageDTO;

public class CustomerService {
	
	final String path = "https://hrk-app6.herokuapp.com/api/v1/customer"; 
	
	public CustomerService(){}
	
    public List<CustomersDTO> getAll(int start, int size)
    {  
    	ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(path + "/all/" + (start + 1));
        Response response = target.request().get();
        CustomersPageDTO value = response.readEntity(CustomersPageDTO.class);
        response.close();
        return value.getContent();
    }

    public int count()
    {
    	ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target(path + "/count");
        Response response = target.request().get();
        Integer value = response.readEntity(Integer.class);       
        response.close();
        return value;
    }
    
    
    
     
    
}