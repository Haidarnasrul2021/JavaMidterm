package design;


import java.util.*;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     **/
    public static void main(String[] args) {
        EmployeeInfo employee1 = new EmployeeInfo(100, "12345 maven road, IL, 0978");
        EmployeeInfo employee2 = new EmployeeInfo("Josh", 102, "345 nower street, CO, 7875", 'M');
        EmployeeInfo employee3 = new EmployeeInfo("Ash", "PROD", 104, "11734 brown street, NJ, 0809", "USA Citizen");

        employee1.assignDepartment();
        employee2.benefitLayout();
        employee3.holidayBonus();

//		//resident status
//		employee1.setResidentStatus("USA Citizen");
//		System.out.println(employee1.getResidentStatus());
//		employee2.setResidentStatus("USA Citizen");
//		System.out.println(employee2.getResidentStatus());
//		employee3.setResidentStatus("Resident");
//		System.out.println(employee3.getResidentStatus());
//		employee4.setResidentStatus("H1V");
//		System.out.println(employee4.getResidentStatus());
//		employee5.setResidentStatus("USA Citizen");
//		System.out.println(employee5.getResidentStatus());
//		employee6.setResidentStatus("H1V");
//		System.out.println(employee6.getResidentStatus());

        System.out.println(employee1.calculateSalary(3456.67));
        System.out.println(employee2.calculateSalary(2345.10));
        System.out.println(employee3.calculateSalary(6789.0));


        EmployeeInfo.calculateEmployeeBonus(10, 10, 56789);
        EmployeeInfo.calculateEmployeeBonus(7, 4, 67898);
        EmployeeInfo.calculateEmployeeBonus(3, 1, 55679);


        System.out.println("*****EMPLOYEE 1****");
        //employee 1- bonus and pension
        employee1.setEmployeePoints(10);
        employee1.setEmployeeSalary(56789);
        EmployeeInfo.calculateEmployeeBonus(employee1.getEmployeePoints(), 10, employee1.getEmployeeSalary());
        EmployeeInfo.calculateEmployeePension(employee1.getEmployeeSalary());

        System.out.println("*****EMPLOYEE 2****");
        //employee 2- bonus and pension
        employee2.setEmployeePoints(7);
        employee2.setEmployeeSalary(67898);
        EmployeeInfo.calculateEmployeeBonus(employee2.getEmployeePoints(), 4, employee2.getEmployeeSalary());
        EmployeeInfo.calculateEmployeePension(employee2.getEmployeeSalary());


        System.out.println("*****EMPLOYEE 3****");
        //employee 3- bonus and pension
        employee3.setEmployeePoints(6);
        employee3.setEmployeeSalary(55679);
        EmployeeInfo.calculateEmployeeBonus(employee3.getEmployeePoints(), 1, employee2.getEmployeeSalary());
        EmployeeInfo.calculateEmployeePension(employee3.getEmployeeSalary());


        List<EmployeeInfo> lists = new ArrayList<>();
        lists.add(employee1);
        lists.add(employee2);
        lists.add(employee3);
        Iterator<EmployeeInfo> iterate = lists.iterator();
        while (iterate.hasNext()) {
            EmployeeInfo empInfo = iterate.next();
            System.out.println(empInfo.name + " , " + empInfo.employeePoints + " , " + empInfo.employeeSalary + " , " + empInfo.residentStatus + " , " + empInfo.employeeId);

            //Store employee data in database
            List<String> employees = new ArrayList<>(lists.size());
            for (EmployeeInfo employee : lists) {
                employees.add(employee.name);
                employees.add(employee.residentStatus);
                employees.add(String.valueOf(employee.employeePoints));
                employees.add(String.valueOf(employee.employeeSalary));
                employees.add(String.valueOf(employee.employeeId));

            }
            // ConnectToSqlDB.insertDataFromArrayListToSqlTable(employees, "employee_table", "data");

            //read from the database
            try {
                //  ConnectToSqlDB.readDataBase("employee_table","data");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}