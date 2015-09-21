package dip.lab1.student.solution1;

public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;

    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    @Override
    public final double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    public final double getAnnualBonus() {
        return annualBonus;
    }

    public final void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public final void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
}
