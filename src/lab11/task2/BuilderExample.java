/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11.task2;

/**
 *
 * @author boonjv
 */
/** A driver class for building some value meals 
 *
 * @author Jerod Weinman
 */
public class BuilderExample {

  
  /**
   * A program that creates a cook and uses it with various meal builders
   * to construct meals.
   *
   * @param args unused command-line arguments
   */
  public static void main(String[] args) {

    Cook cook = new Cook();
    Meal meal;

    BurgerMealBuilder burgerBuilder = new BurgerMealBuilder();
    HealthyMealBuilder healthyBuilder = new HealthyMealBuilder();

    //set burger builder
    cook.setMealBuilder (burgerBuilder);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);

    //set healthy meal builder
    cook.setMealBuilder (healthyBuilder);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);

    //set healthy meal builder
    cook.setMealBuilder (healthyBuilder);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);

    //set burger builder
    cook.setMealBuilder (burgerBuilder);

    cook.constructMeal();
    meal = cook.getMeal();

    System.out.println("Order up! A " + meal);
  }
}