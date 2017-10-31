package com.johnny.designpatterns.stimulateduck.duck;

import com.johnny.designpatterns.stimulateduck.flybehavior.FlyBehavior;
import com.johnny.designpatterns.stimulateduck.quackbehavior.QuackBehavior;

public abstract class Duck {

	FlyBehavior mFlyBehavior;
	QuackBehavior mQuackBehavior;

	public Duck() {

	}

	public void Fly() {
		mFlyBehavior.fly();
	}

	public void Quack() {
		mQuackBehavior.quack();
	}

	public abstract void display();

	public void SetQuackBehavoir(QuackBehavior qb) {
		mQuackBehavior = qb;
	}

	public void SetFlyBehavoir(FlyBehavior fb) {
		mFlyBehavior = fb;
	}

	public void swim() {
		System.out.println("~~im swim~~");
	}
}
