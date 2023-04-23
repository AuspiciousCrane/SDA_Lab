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
public class HealthyMealBuilder extends MealBuilder {

    @Override
    public void buildEntree() {
        theMeal.setEntree("chicken sandwich");
    }

    @Override
    public void buildSide() {
        theMeal.setSide("carrot sticks");
    }

    @Override
    public void buildDrink() {
        theMeal.setDrink("diet cola");
    }
}
