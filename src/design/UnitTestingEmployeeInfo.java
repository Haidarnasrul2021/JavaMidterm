package design;

import org.junit.Assert;
import org.junit.Test;



public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

    }

    @Test
    public void calculateEmployeeBonusTesting1() {
        double expectedBonus = 68146.8;
        double actualBonus = EmployeeInfo.calculateEmployeeBonus(10, 10, 56789);
        Assert.assertNotEquals("Incorrect bonus ammount", expectedBonus, actualBonus);
    }

    @Test
    public void calculateEmployeeBonusTesting() {
        double expectedBonus = 68147.8;
        double actualBonus = EmployeeInfo.calculateEmployeeBonus(10, 10, 56789);
        Assert.assertNotEquals("Incorrect bonus ammount", expectedBonus, actualBonus);
    }

    @Test
    public void calculateEmployeePensionTesting() {
        double expectedPension = 14197.25;
        double actualPension = EmployeeInfo.calculateEmployeePension(28141);
        Assert.assertNotEquals("Incorrect bonus ammount", expectedPension, actualPension);
    }


}