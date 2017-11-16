package com.johnny.designpatterns.adaptermode;

import com.johnny.designpatterns.adaptermode.adapter.TurkeyAdapter2;
import com.johnny.designpatterns.adaptermode.duck.Duck;
import com.johnny.designpatterns.adaptermode.duck.GreenHeadDuck;
import com.johnny.designpatterns.adaptermode.turkey.WildTurkey;



public class MainTest {
	public static void main(String[] args) {
		GreenHeadDuck duck=new GreenHeadDuck();
		
		WildTurkey turkey=new WildTurkey();
		
		Duck duck2turkeyAdapter=new TurkeyAdapter2();
		turkey.gobble();
		turkey.fly();
		duck.quack();
		duck.fly();
		duck2turkeyAdapter.quack();
		duck2turkeyAdapter.fly();
		
	
	}
}
