package com.johnny.designpatterns.decoratormodel.decorator;

import com.johnny.designpatterns.decoratormodel.coffeebar.Drink;

public class Milk extends Decorator {

	public Milk(Drink Obj) {		
		super(Obj);
		// TODO Auto-generated constructor stub
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}

}

