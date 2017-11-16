package com.johnny.designpatterns.pizzastore.absfactory;

import com.johnny.designpatterns.pizzastore.pizza.NYCheesePizza;
import com.johnny.designpatterns.pizzastore.pizza.NYPepperPizza;
import com.johnny.designpatterns.pizzastore.pizza.Pizza;

public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
