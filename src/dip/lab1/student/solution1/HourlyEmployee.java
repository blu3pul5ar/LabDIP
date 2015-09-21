package dip.lab1.student.solution1;

public class HourlyEmployee implements Employee {
    // This class needs properties that the Salaried class does not
    private double hourlyRate;
    private double totalHrsForYear;
    
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
    @Override
    public final double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }
    
    public final double getHourlyRate() {
        return hourlyRate;
    }

    public final void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public final void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }    
}
