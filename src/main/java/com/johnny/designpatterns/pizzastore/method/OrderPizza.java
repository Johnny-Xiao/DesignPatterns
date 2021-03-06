package com.johnny.designpatterns.pizzastore.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.johnny.designpatterns.pizzastore.pizza.CheesePizza;
import com.johnny.designpatterns.pizzastore.pizza.ChinesePizza;
import com.johnny.designpatterns.pizzastore.pizza.GreekPizza;
import com.johnny.designpatterns.pizzastore.pizza.PepperPizza;
import com.johnny.designpatterns.pizzastore.pizza.Pizza;

public abstract class OrderPizza {

	public OrderPizza() {
		Pizza pizza = null;
		String ordertype;

		do {
			ordertype = gettype();
			pizza = createPizza(ordertype);

			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		} while (true);
	}

	abstract Pizza createPizza(String ordertype);

	private String gettype() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("input pizza type:");
			String str = strin.readLine();

			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
