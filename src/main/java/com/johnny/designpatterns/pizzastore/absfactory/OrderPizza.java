package com.johnny.designpatterns.pizzastore.absfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.johnny.designpatterns.pizzastore.pizza.CheesePizza;
import com.johnny.designpatterns.pizzastore.pizza.GreekPizza;
import com.johnny.designpatterns.pizzastore.pizza.PepperPizza;
import com.johnny.designpatterns.pizzastore.pizza.Pizza;

public class OrderPizza {
	AbsFactory mFactory;

	public OrderPizza(AbsFactory mFactory) {

		setFactory(mFactory);
	}

	public void setFactory(AbsFactory mFactory) {
		Pizza pizza = null;
		String ordertype;

		this.mFactory = mFactory;

		do {
			ordertype = gettype();
			pizza = mFactory.CreatePizza(ordertype);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}

		} while (true);

	}

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
