package com.mycompany.rhosapp3.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;


import com.mycompany.rhosapp3.dto.CustomersDTO;
import com.mycompany.rhosapp3.service.CustomerService;

public class CustomerLazyDataModel extends LazyDataModel<CustomersDTO> 
{	
	private static final long serialVersionUID = 551614594141174353L;
	
	public CustomerLazyDataModel(){	
		CustomerService cs = new CustomerService();
        this.setRowCount(cs.count());
    }
    
    public List<CustomersDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters)
    {
    	CustomerService cs = new CustomerService(); 
        return cs.getAll(first / 10, pageSize);
    }

}
