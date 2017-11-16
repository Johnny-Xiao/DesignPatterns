package com.johnny.designpatterns.pizzastore.method;

import com.johnny.designpatterns.pizzastore.pizza.CheesePizza;
import com.johnny.designpatterns.pizzastore.pizza.GreekPizza;
import com.johnny.designpatterns.pizzastore.pizza.NYCheesePizza;
import com.johnny.designpatterns.pizzastore.pizza.NYPepperPizza;
import com.johnny.designpatterns.pizzastore.pizza.PepperPizza;
import com.johnny.designpatterns.pizzastore.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
