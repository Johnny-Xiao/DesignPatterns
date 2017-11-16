package com.johnny.designpatterns.decoratormodel.coffee;

import com.johnny.designpatterns.decoratormodel.coffeebar.Drink;

public  class Coffee extends Drink {

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	
}
