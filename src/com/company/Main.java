package com.company;

public class Main {

    public static void main(String[] args) {
        HeartRate hr = new HeartRate("Hassan","Tahir",20,06,2000);
        String DOB=hr.DOB();
        int age=hr.Age();
        int hRate=hr.MaxHeartRate();
        String tRate=hr.getTargetHeartRate();

        System.out.println("Name: "+hr.getFname()+" "+hr.getLname());
        System.out.println("Age: "+age);
        System.out.println("Max HeartRate: "+hRate);
        System.out.println("Average Heart Rate(50-80): "+tRate);


    }

}
