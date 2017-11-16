package com.johnny.designpatterns.adaptermode.adapter;

import com.johnny.designpatterns.adaptermode.duck.Duck;
import com.johnny.designpatterns.adaptermode.turkey.WildTurkey;

public class TurkeyAdapter2 extends WildTurkey implements Duck {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		super.gobble();
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
		super.fly();
		super.fly();
	}
}
