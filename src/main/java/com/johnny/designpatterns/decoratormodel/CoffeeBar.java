package com.johnny.designpatterns.decoratormodel;

import com.johnny.designpatterns.decoratormodel.coffee.Decaf;
import com.johnny.designpatterns.decoratormodel.coffee.LongBlack;
import com.johnny.designpatterns.decoratormodel.decorator.Chocolate;
import com.johnny.designpatterns.decoratormodel.decorator.Milk;

public class CoffeeBar {


	public static void main(String[] args) {
		
		Drink order;
		order=new Decaf();
		System.out.println("order1 price:"+order.cost());
		System.out.println("order1 desc:"+order.getDescription());
		
		System.out.println("****************");
		order=new LongBlack();
		order=new Milk(order);
		order=new Chocolate(order);
		order=new Chocolate(order);
		System.out.println("order2 price:"+order.cost());
		System.out.println("order2 desc:"+order.getDescription());
		
	}


}
