package Lab6.Employee;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Employee is empty : " + employee.toString());
        System.out.println("Enter employe id :");
        employee.setEmpId(scan.nextInt());
        System.out.println("Enter employe name :");
        employee.setEmpName(scan.next());
        System.out.println("Enter employe salary :");
        employee.setEmpSalary(scan.nextDouble());
        System.out.println("Enter employe time in :");
        employee.setEmpTimeIn(scan.next());
        System.out.println("Enter employe time out :");
        employee.setEmpTimeOut(scan.next());
        System.out.println("Employee data : " + employee.toString());
    }
}