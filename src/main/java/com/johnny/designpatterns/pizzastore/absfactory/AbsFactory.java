package com.johnny.designpatterns.pizzastore.absfactory;

import com.johnny.designpatterns.pizzastore.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
