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

    /**
     *
     * @return tipCalc
     */
    public final TipCalculator getTipCalc() {
        return tipCalc;
    }

    /**
     *sets tipCalc to what is passed in
     * @param tipCalc
     */
    public final void setTipCalc(TipCalculator tipCalc) {
        this.tipCalc = tipCalc;
    }
    
    /**
     *
     * @return tip using the set tipCalc
     */
    public final double getTip(){
        return tipCalc.getTip();
    }
}
