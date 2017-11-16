package com.johnny.designpatterns.pizzastore.absfactory;

import com.johnny.designpatterns.pizzastore.pizza.LDCheesePizza;
import com.johnny.designpatterns.pizzastore.pizza.LDPepperPizza;
import com.johnny.designpatterns.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
