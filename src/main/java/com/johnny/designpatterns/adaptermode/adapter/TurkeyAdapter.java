package com.johnny.designpatterns.adaptermode.adapter;

import com.johnny.designpatterns.adaptermode.duck.Duck;
import com.johnny.designpatterns.adaptermode.turkey.Turkey;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey)
	{
		this.turkey=turkey;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			turkey.fly();
		}
	}

}
