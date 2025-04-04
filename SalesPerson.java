public class SalesPerson extends Employee {
    
    private double commissionPercentage;

    //Constructor
    public SalesPerson(String name, double salary, int age, double commissionPercentage) {
        super(name, age, salary);

        this.commissionPercentage = commissionPercentage;  
    }

    public double getCommissionPercentage() {   
        return this.commissionPercentage;
    }

    public void raiseCommission() {
        if (this.commissionPercentage < .30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }

}
