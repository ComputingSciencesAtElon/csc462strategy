/*
 * RubberDuck.java version 1.0 Sep 4, 2015
 *
 * Copyright (c) 2015 Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.strategy;

public class RubberDuck extends Duck {

  public RubberDuck() {
    super();
    setFlyBehavior(new FlyNoWay());
    setQuackBehavior(new Squeak());
  }

  @Override
  public String display() {
    String result = "I'm a Rubber Duck";
    System.out.println(result);
    return result;
  }

}
