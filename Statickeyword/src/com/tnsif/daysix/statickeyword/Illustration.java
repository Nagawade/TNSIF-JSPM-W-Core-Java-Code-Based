package com.tnsif.daysix.statickeyword;

public class Illustration {
    public static void main(String[] args) {
        // Call static method directly using class name
        Staticdemo.display();

        
        Employee.display(); 
        
        Employee e1 = new Employee();
        
        e1.setEmp_id(1);
        e1.setName("Mauli");
        
        e1.getEmp_id();
        
        e1.getName();   
        
    }
}
