package com.johnny.designpatterns.decoratormodel.coffeebar.decorator;

import com.johnny.designpatterns.decoratormodel.coffeebar.Drink;

public  class Decorator extends Drink {
	private Drink Obj;

	public Decorator(Drink Obj){
		this.Obj=Obj;
	};
	
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		
		return super.getPrice()+Obj.cost();
	}

	@Override
	public String getDescription()
	{
		return super.description+"-"+super.getPrice()+"&&"+Obj.getDescription();
	}
	
	}
