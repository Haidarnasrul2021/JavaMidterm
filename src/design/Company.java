
package design;

public abstract class Company {
    public final String companyObjective = "We Strive to do better and be better";
    public String companyAddress;

    public Company(String companyAddress) {
        this.companyAddress = companyAddress;

    }

    public void IRS() {
        System.out.println("IRS FROM 1120 is used to report corporate income taxes");
    }

    public static void employeeIRSFileIno() {
        System.out.println("Employee file 1040 or 1040A depending on status");
    }

    public static void franchiseTaxBoard() {
        System.out.println("Handles personal and corporate income and franchise taxes");
    }

    public abstract void companyDescription();

}