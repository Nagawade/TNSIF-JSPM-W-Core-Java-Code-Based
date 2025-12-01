package com.tnsif.daysix.statickeyword;

public class Staticdemo {
    private int roll_no;
    private int section;
    private static int sr_no;  // static variable declared

    // Static block to initialize static variables
    static {
        sr_no = 200;
    }

    // Constructor
    Staticdemo() {
        roll_no++;
        section++;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Staticdemo [roll_no=" + roll_no + ", section=" + section + ", sr_no=" + sr_no + "]";
    }


    // Static method to display static info
    static void display() {
        System.out.println("Within static block");
        System.out.println("Serial no :" + sr_no);
    }
}
