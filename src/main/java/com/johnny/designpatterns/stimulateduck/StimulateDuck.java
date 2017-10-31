package com.johnny.designpatterns.stimulateduck;

import com.johnny.designpatterns.stimulateduck.duck.GreenHeadDuck;
import com.johnny.designpatterns.stimulateduck.duck.RedHeadDuck;

public class StimulateDuck {

	public static void main(String[] args) {

		GreenHeadDuck mGreenHeadDuck = new GreenHeadDuck();
		RedHeadDuck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.Quack();
		mGreenHeadDuck.swim();

		mRedHeadDuck.display();
		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();
	}
}
