/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rkusch
 */
public class TipService {
    private TipCalculator calc;

    public TipCalculator getCalc() {
        return calc;
    }

    public void setCalc(TipCalculator calc) {
        this.calc = calc;
    }

    public TipService(TipCalculator calc) {
        this.calc = calc;
    }
    
    
    public double calcTip() {
        return calc.calcTip();
    }
}
