/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuenkuan
 */
public class P4Q1 {
    
    public static void main (String[] agrs){
        
        Employee emp = new Employee("Adrian", 1000.00);
        Employee emp2 = new Employee("Charles");
        emp2.setSalary(3000.00);

        System.out.println("Salary is : " + emp.getSalary());
        emp.raiseSalary(8.0);
        System.out.println("Salary raise of 8% is : " + emp.getSalary());

        //(c)
        if(emp.getSalary()>emp2.getSalary()){
            System.out.println(emp.getSalary());
            
        }
        else{
            System.out.println(emp2.getName() + " " + emp2.getSalary());
        }
        
        System.out.println("Total : " + emp.getSalary() + " + " + emp2.getSalary() + " = " + (emp.getSalary() + emp2.getSalary()) );
    }
    
}

