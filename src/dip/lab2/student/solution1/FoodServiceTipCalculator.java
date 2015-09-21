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

    /**
     *
     * @return tip depending on the set serviceQuality
     */
    @Override
    public final double getTip() {
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

    /**
     *
     * @param billAmt set the bill amount
     */
    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    /**
     *
     * @param q set the service quality
     */
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    /**
     *
     * @return the service quality
     */
    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    /**
     *
     * @return the cost of the bill
     */
    public final double getBill() {
        return bill;
    }

    /**
     * 
     * @return the min bill value
     */
    public final double getMinBill() {
        return minBill;
    }

    /**
     *
     * @param minBill sets the min bill value
     */
    public final void setMinBill(double minBill) {
        this.minBill = minBill;
    }

    /**
     *
     * @return the error message for bill value entry
     */
    public final String getBILL_ENTRY_ERR() {
        return BILL_ENTRY_ERR;
    }

    /**
     *
     * @return the good rate value
     */
    public final double getGoodRate() {
        return goodRate;
    }

    /**
     *
     * @param goodRate sets the good rate value to what is passed in
     */
    public final void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    /**
     *
     * @return the fair rate value
     */
    public final double getFairRate() {
        return fairRate;
    }

    /**
     *
     * @param fairRate sets the fair rate value to what is passed
     */
    public final void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    /**
     *
     * @return the poor rate value
     */
    public final double getPoorRate() {
        return poorRate;
    }

    /**
     *
     * @param poorRate sets the poor rate value
     */
    public final void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }

}
