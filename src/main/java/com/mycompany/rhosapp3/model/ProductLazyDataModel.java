package com.mycompany.rhosapp3.model;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.mycompany.rhosapp3.dto.ProductsDTO;
import com.mycompany.rhosapp3.service.ProductService;

public class ProductLazyDataModel extends LazyDataModel<ProductsDTO> 
{	

	private static final long serialVersionUID = 1L;

	public ProductLazyDataModel(){	
		ProductService s = new ProductService();
        this.setRowCount(s.count());
    }
    
    public List<ProductsDTO> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters)
    {
    	ProductService s = new ProductService();
        return s.getAll(first / 10, pageSize);
    }

}
