package com.johnny.designpatterns.pizzastore.simplefactory;

import com.johnny.designpatterns.pizzastore.pizza.CheesePizza;
import com.johnny.designpatterns.pizzastore.pizza.GreekPizza;
import com.johnny.designpatterns.pizzastore.pizza.PepperPizza;
import com.johnny.designpatterns.pizzastore.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
