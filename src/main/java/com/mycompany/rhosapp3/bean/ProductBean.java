package com.mycompany.rhosapp3.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.LazyDataModel;

import com.mycompany.rhosapp3.dto.ProductsDTO;
import com.mycompany.rhosapp3.model.ProductLazyDataModel;

@ManagedBean
@RequestScoped
public class ProductBean {
	
	ProductLazyDataModel dataModel = new ProductLazyDataModel();

    public LazyDataModel<ProductsDTO> getModel(){
        return dataModel;
    }

}
