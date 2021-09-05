package design;

import java.util.Scanner;

public class EmployeeInfo extends Company implements Employee {

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     */
    static String companyName;
    int employeeSalary;
    String name;
    private String employeeDepartment;
    int employeeId;
    int employeePoints;
    static int employeePerformance;
    private char gender;
    String residentStatus;


    //encapsulation
    public String getResidentStatus() {
        return residentStatus;
    }

    public void setResidentStatus(String residentStatus) {
        this.residentStatus = residentStatus;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        EmployeeInfo.companyName = companyName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeePoints() {
        return employeePoints;
    }

    public void setEmployeePoints(int employeePoints) {
        this.employeePoints = employeePoints;
    }

    public static int getEmployeePerformance() {
        return employeePerformance;
    }

    public static void setEmployeePerformance(int employeePerformance) {
        EmployeeInfo.employeePerformance = employeePerformance;
    }




    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */


    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */

    //using super keyword
    public EmployeeInfo(int employeeId, String companyAddress) {
        super(companyAddress);
        this.employeeId = employeeId;

    }

    public EmployeeInfo(String name, int employeeId, String companyAddress, char gender) {
        super(companyAddress);
        this.name = name;
        this.employeeId = employeeId;
        this.gender = gender;
    }

    public EmployeeInfo(String name, String employeeDepartment, int employeeId, String companyAddress, String residentStatus) {
        super(companyAddress);
        this.name = name;
        this.employeeDepartment = employeeDepartment;
        this.employeeId = employeeId;
        this.residentStatus = residentStatus;
    }

    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public static double calculateEmployeeBonus(int employeePerformance, int numberOfYearsWithCompany, int employeeSalary) {
        double total = 0;
        if (numberOfYearsWithCompany >= 5 && employeePerformance >= 10) {
            total = employeeSalary * .1 * 12;
        } else if (numberOfYearsWithCompany >= 4 && employeePerformance >= 8) {
            total = employeeSalary * .08 * 12;
        } else if (numberOfYearsWithCompany >= 3 && employeePerformance >= 6) {
            total = employeeSalary * .06 * 12;
        } else if (numberOfYearsWithCompany < 2 && employeePerformance >= 5) {
            total = employeeSalary * .04 * 12;
        } else if (numberOfYearsWithCompany == 2 && employeePerformance >= 4) {
            total = employeeSalary * .02 * 12;
        } else {
            total = 0;
            System.out.println("WARNING: Increase performance or you will be fired!");
        }
        System.out.println("Employee Bonus: " + total);
        return total;
    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public static double calculateEmployeePension(int employeeSalary) {
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
        //Calculate pension
        String startYr = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
        String currentYr = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedTodaysDate.length());
        int numberOfYearsWithCompany = Integer.parseInt(currentYr) - Integer.parseInt(startYr);
        if (numberOfYearsWithCompany >= 10) {
            total = employeeSalary * .5;
            System.out.println("Pension: "+total);
        } else if (numberOfYearsWithCompany == 9) {
            total = employeeSalary * .45;
            System.out.println("Pension: "+total);
        } else if (numberOfYearsWithCompany == 8) {
            total = employeeSalary * .4;
            System.out.println("Pension: "+total);
        } else if (numberOfYearsWithCompany == 7) {
            total = employeeSalary * .35;
            System.out.println("Pension: "+total);
        } else if (numberOfYearsWithCompany == 6) {
            total = employeeSalary * .3;
            System.out.println("Pension: "+total);
        } else if (numberOfYearsWithCompany == 5) {
            total = employeeSalary * .25;
            System.out.println("Pension: "+total);
        } else if (numberOfYearsWithCompany == 4) {
            total = employeeSalary * .2;
            System.out.println("Pension: "+total);
        } else if (numberOfYearsWithCompany == 3) {
            total = employeeSalary * .15;
            System.out.println("Pension: "+total);
        } else if (numberOfYearsWithCompany == 2) {
            total = employeeSalary * .1;
            System.out.println("Pension: "+total);
        } else if (numberOfYearsWithCompany == 1) {
            total = employeeSalary * .05;
            System.out.println("Pension: "+total);
        } else {
            total = 0;
            System.out.println("You did not work enough to acquire pension");
        }
        return total;
    }

    //methods from the implemented class
    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {
        System.out.println("Department: DEV");
    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    //rewriting the method in child class
    public double calculateSalary(double monthSalary){
        double yearSalary = monthSalary*12;
        return yearSalary;
    }


    @Override
    public void benefitLayout() {
        System.out.println("Employee recieve Medical insurance, life insurance, retirement plans, and disability insurance");

    }

    @Override
    public void holidayBonus() {
        System.out.println("Employee will recieve 10% bonus each holiday");
    }

    @Override
    public void employeeAllowance() {
        System.out.println("employee will recieve $150 every month for gas");
    }

    @Override
    public void employeeRetirement() {
        System.out.println("Employee can apply for 401K and recieve a additonal $1000");

    }

    //method from the abstract class
    @Override
    public void companyDescription() {
        System.out.println("IT Tech- We're humans & IT experts");
    }


    private static class DateConversion {

        public DateConversion(Months months) {

        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}