package com.inertfaceopp.tnsif;

public class NestedDemo implements NestedInterface, NestedInterface.Innerinterface {

    @Override
    public void calArea() {
        System.out.println("Outer Interface");
    }

    @Override
    public void print() {
        System.out.println("Inner interface");
    }

    public static void main(String[] args) {
        NestedDemo demo = new NestedDemo();
        demo.calArea();
        demo.print();
    }
}
