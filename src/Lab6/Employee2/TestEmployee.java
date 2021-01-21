package Lab6.Employee2;

import javax.swing.JOptionPane;

public class TestEmployee {
    public static void main(String args[]) {
        String output = "Employees before instantiation: " + Employee.getCount(); // prove that count is 0
        // create two Employees; count should be 2
        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Jones");
        // prove that count is 2 after creating two Employees
        output += "\n\nEmployees after instantiation: " + "\n e1.getCount(): " + e1.getCount() + "\n e2.getCount(): "
                + e2.getCount() + "\n Employee.getCount(): " + Employee.getCount();
        // get names of Employees
        output += "\n\nEmployee 1: " + e1.getFirstName() + " " + e1.getLastName() + "\nEmployee 2: " + e2.getFirstName()
                + " " + e2.getLastName();
        // decrement reference count for each Employee object; in this
        // example, there is only one reference to each Employee, so these
        // statements mark each Employee object for garbage collection
        e1 = null;
        e2 = null;
        System.gc(); // suggest call to garbage collector
        // show Employee count after calling garbage collector; count
        // displayed may be 0, 1 or 2 based on whether garbage collector
        // executes immediately and number of Employee objects collected
        output += "\n\nEmployees after System.gc(): " + Employee.getCount();
        System.out.println("Static Members");
        System.out.println(output);
    }
}
