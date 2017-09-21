/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rkusch
 */
public class RestaurantTipCalculator implements TipCalculator {
    private double tipPercent;
    private double billAmt;

    public double getTipPercent() {
        return tipPercent;
    }

    public RestaurantTipCalculator(double billAmt, double tipPercent) {
        this.billAmt = billAmt;
        this.tipPercent = tipPercent;
    }
    
    

    public void setTipPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }
    
    @Override
    public double calcTip() {
        return tipPercent * billAmt;   
    }

}
