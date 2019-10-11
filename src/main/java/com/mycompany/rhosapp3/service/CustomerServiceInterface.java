package com.mycompany.rhosapp3.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customer")
public interface CustomerServiceInterface {
	
	@GET
    @Path("/count")
    @Produces(MediaType.APPLICATION_JSON)
    
    public Response count();
	
	@GET
	@Path("/all/{pageNum}")
	@Produces({MediaType.APPLICATION_JSON})
	public Response findCustomersPage(@PathParam("pageNum") Integer pageNum);
}
