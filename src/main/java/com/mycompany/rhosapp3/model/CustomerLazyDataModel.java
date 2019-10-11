package com.mycompany.rhosapp3.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;


import com.mycompany.rhosapp3.dto.CustomersDTO;
import com.mycompany.rhosapp3.service.CustomerService;

public class CustomerLazyDataModel extends LazyDataModel<CustomersDTO> {
	
	
	private static final long serialVersionUID = 551614594141174353L;
	
	public CustomerLazyDataModel(){	
		
		CustomerService cs = new CustomerService();
		
		System.out.println("--------- "+this+" -----------------");
        this.setRowCount(cs.getEmployeeTotalCount());
    }
    
	
    public List<CustomersDTO> load(int first, int pageSize, String sortField,
                               SortOrder sortOrder, Map<String, Object> filters) {
    	
    	CustomerService cs = new CustomerService();
    	System.out.println("ICI");
    	
    	System.out.println(first);
    	System.out.println(pageSize);

        List<CustomersDTO> list = cs.getEmployeeList(first / 10, pageSize);
        
        
        for(CustomersDTO c : list)
        {
        	System.out.println(c.getId());
        }
        
        
        
        return list;
    }

}
