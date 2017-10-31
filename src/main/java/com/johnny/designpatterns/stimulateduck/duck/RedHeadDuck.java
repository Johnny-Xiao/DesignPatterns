package com.johnny.designpatterns.stimulateduck.duck;

import com.johnny.designpatterns.stimulateduck.flybehavior.BadFlyBehavior;
import com.johnny.designpatterns.stimulateduck.quackbehavior.GeGeQuackBehavior;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		mFlyBehavior = new BadFlyBehavior();
		mQuackBehavior = new GeGeQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**RedHead**");
	}

}
