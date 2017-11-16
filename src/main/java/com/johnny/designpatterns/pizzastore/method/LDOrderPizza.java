package com.johnny.designpatterns.pizzastore.method;

import com.johnny.designpatterns.pizzastore.pizza.CheesePizza;
import com.johnny.designpatterns.pizzastore.pizza.GreekPizza;
import com.johnny.designpatterns.pizzastore.pizza.LDCheesePizza;
import com.johnny.designpatterns.pizzastore.pizza.LDPepperPizza;
import com.johnny.designpatterns.pizzastore.pizza.PepperPizza;
import com.johnny.designpatterns.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
