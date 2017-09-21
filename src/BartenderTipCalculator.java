/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rkusch
 */
public class BartenderTipCalculator implements TipCalculator {
    private int drinkQty;
    private double tipPerDrink;

    public double getDrinkQty() {
        return drinkQty;
    }

    public void setDrinkQty(int drinkQty) {
        this.drinkQty = drinkQty;
    }

    public double getTipPerDrink() {
        return tipPerDrink;
    }

    public void setTipPerDrink(double tipPerDrink) {
        this.tipPerDrink = tipPerDrink;
    }

    public BartenderTipCalculator(int drinkQty, double tipPerDrink) {
        this.drinkQty = drinkQty;
        this.tipPerDrink = tipPerDrink;
    }
    
    @Override
    public double calcTip() {
        return drinkQty * tipPerDrink;   
    }
}
