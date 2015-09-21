/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Nicholas
 */
public class TipService {
    private TipCalculator tipCalc;
    public TipService() {
    }

    public TipService(TipCalculator tipCalc) {
        this.tipCalc = tipCalc;
    }

    public TipCalculator getTipCalc() {
        return tipCalc;
    }

    public void setTipCalc(TipCalculator tipCalc) {
        this.tipCalc = tipCalc;
    }
    
    public double getTip(){
        return tipCalc.getBill();
    }
}
