package com.johnny.designpatterns.stimulateduck.duck;

import com.johnny.designpatterns.stimulateduck.flybehavior.GoodFlyBehavior;
import com.johnny.designpatterns.stimulateduck.quackbehavior.GaGaQuackBehavior;

public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		mFlyBehavior = new GoodFlyBehavior();
		mQuackBehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**GreenHead**");
	}

}