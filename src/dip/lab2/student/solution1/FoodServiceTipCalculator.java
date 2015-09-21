package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator{
    private double minBill = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error";
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

    private double bill;
   
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public double getBill() {
        return bill;
    }

    public double getMinBill() {
        return minBill;
    }

    public void setMinBill(double minBill) {
        this.minBill = minBill;
    }

    public String getBILL_ENTRY_ERR() {
        return BILL_ENTRY_ERR;
    }


    public double getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    public double getFairRate() {
        return fairRate;
    }

    public void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    public double getPoorRate() {
        return poorRate;
    }

    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }

}
