package com.mycompany.rhosapp3;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloWorldBacking {
	
	@Inject
	HelloWorldManager hwm;
	
    
	private String name;
    private String greet;
    
    public void greetPerson() {
        this.greet = hwm.sayHi() + "" + this.name + " !";
    }
    
    public String getGreet() {
        return greet;
    }
    
    public void setGreet(String greet) {
        this.greet = greet;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}