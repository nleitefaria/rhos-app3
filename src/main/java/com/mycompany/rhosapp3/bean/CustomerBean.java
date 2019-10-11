package com.mycompany.rhosapp3.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.LazyDataModel;


import com.mycompany.rhosapp3.dto.CustomersDTO;
import com.mycompany.rhosapp3.model.CustomerLazyDataModel;

@ManagedBean
@RequestScoped
public class CustomerBean {
	
	CustomerLazyDataModel dataModel = new CustomerLazyDataModel();

    public LazyDataModel<CustomersDTO> getModel(){
        return dataModel;
    }

}
