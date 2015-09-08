/*
 * MallardDuck.java version 1.0 Sep 4, 2015
 *
 * Copyright (c) 2015 Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.strategy;

public class MallardDuck extends Duck implements Quackable, Flyable {

  public MallardDuck() {
    super();
  }

  @Override
  public String display() {
    String result = "I'm a real Mallard Duck";
    System.out.println(result);
    return result;
  }

  @Override
  public String fly() {
    String result = "I can fly";
    System.out.println(result);
    return result;
  }

  @Override
  public String quack() {
    String result = "Quack, Quack";
    System.out.println(result);
    return result;
  }

}
