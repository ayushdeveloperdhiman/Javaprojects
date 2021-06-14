package com.ayush;

public class SomeClass {
    private static int classCounter=0;
    public final int instanceNumber;
    private final String Name;

    public SomeClass(String name) {
        this.Name=name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name+" created, instance is "+instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
