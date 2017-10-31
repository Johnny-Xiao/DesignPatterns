package com.johnny.designpatterns.stimulateduck;

import com.johnny.designpatterns.stimulateduck.duck.Duck;
import com.johnny.designpatterns.stimulateduck.duck.GreenHeadDuck;
import com.johnny.designpatterns.stimulateduck.duck.RedHeadDuck;
import com.johnny.designpatterns.stimulateduck.flybehavior.NoFlyBehavior;
import com.johnny.designpatterns.stimulateduck.quackbehavior.NoQuackBehavior;

public class StimulateDuck {

	public static void main(String[] args) {

		Duck mGreenHeadDuck = new GreenHeadDuck();
		Duck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.Fly();
		mGreenHeadDuck.Quack();
		mGreenHeadDuck.swim();

		mRedHeadDuck.display();
		mRedHeadDuck.Fly();
		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();
		mRedHeadDuck.display();
		mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
		mRedHeadDuck.Fly();
		mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
		mRedHeadDuck.Quack();
	}
}
