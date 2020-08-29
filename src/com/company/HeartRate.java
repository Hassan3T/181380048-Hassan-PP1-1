package com.company;

public class HeartRate {
    private String fname;
    private String lname;
    private int bDay, bMonth, bYear;

    public HeartRate(String fname,String lname,int bDay,int bMonth, int bYear){
        this.fname=fname;
        this.lname=lname;
        this.bDay=bDay;
        this.bMonth=bMonth;
        this.bYear=bYear;

    }


    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setbDay(int bDay) {
        this.bDay = bDay;
    }

    public void setbMonth(int bMonth) {
        this.bMonth = bMonth;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getbDay() {
        return bDay;
    }

    public int getbMonth() {
        return bMonth;
    }

    public int getbYear() {
        return bYear;
    }

    public String DOB(){
        return String.format("DD-MM-YYYY", bDay, bMonth, bYear);
    }
    public int Age(){
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - bYear;
    }
    public int MaxHeartRate(){

        return 220 - Age();
    }
    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f",
                MaxHeartRate() * 0.5, MaxHeartRate() * 0.85);
    }
}

