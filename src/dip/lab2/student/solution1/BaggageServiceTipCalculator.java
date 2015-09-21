package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator{
    private double minBill = 0.00;
    private double maxBill = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error";
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private double bill;
    private double baseTipPerBag;
    private int bagCount;
   
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
        bill = baseTipPerBag * bagCount;
    }

    /**
     *
     * @return the tip based on service quality
     */
    @Override
    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        return tip;
    }

    /**
     *
     * @param q sets the service rating with waht is passed
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
     * @return the amount of bags
     */
    public final int getBagCount() {
        return bagCount;
    }

    /**
     *
     * @param bagCount sets the amount of bags with what is passed
     */
    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    /**
     *
     * @return the base amount of tip per bag
     */
    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    /**
     *
     * @param baseTipPerBag set the base tip per bag with amount passed
     */
    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    /**
     *
     * @return the bill amount
     */
    public final double getBill() {
        return bill;
    }

    /**
     *
     * @param bill sets the bill amount with what is passed
     */
    public final void setBill(double bill) {
        this.bill = bill;
    }

    /**
     *
     * @return the min bill amount
     */
    public final double getMinBill() {
        return minBill;
    }

    /**
     *
     * @param minBill sets the min bill amount with what is passed
     */
    public final void setMinBill(double minBill) {
        this.minBill = minBill;
    }

    /**
     *
     * @return the max bill amount
     */
    public final double getMaxBill() {
        return maxBill;
    }

    /**
     *
     * @param maxBill sets the max bill amount with what is passed
     */
    public final void setMaxBill(double maxBill) {
        this.maxBill = maxBill;
    }

    /**
     *
     * @return the good rate amount
     */
    public final double getGoodRate() {
        return goodRate;
    }

    /**
     *
     * @param goodRate sets the good rate amount
     */
    public final void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    /**
     *
     * @return the fair rate amount
     */
    public final double getFairRate() {
        return fairRate;
    }

    /**
     *
     * @param fairRate sets the fair rate amount
     */
    public final void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    /**
     *
     * @return the poor rate amount
     */
    public final double getPoorRate() {
        return poorRate;
    }

    /**
     *
     * @param poorRate sets the poor rate amount with what is passed
     */
    public final void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }
    

}
