package Oops_Assignment;
import java.util.ArrayList;
 
public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary) {
        return salary;
    }
    
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries) {
        int total = 0;
        for (int employeeSalary : employeeSalaries) {
            total += employeeSalary;
        }
        return total;
    }
    public static void main(String[] args) {
        ArrayList<Integer> employeeSalaries = new ArrayList<>();
        Assignment2Q2 employee1 = new Manager();
        employeeSalaries.add(employee1.getSalary(10000));
        Assignment2Q2 employee2 = new Labour();
        employeeSalaries.add(employee2.getSalary(10000));
        int total = employee1.totalEmployeesSalary(employeeSalaries);
        System.out.println("Total salary of all employees: " + total);
    }
}

class Manager extends Assignment2Q2 {
    // Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary + incentive;
    }
}

class Labour extends Assignment2Q2 {
    //Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary + overtime;
    }
}

