package com.company;

public class CPUTimer {
    int ic;
    double cpi;
    double cps;
    double spi;
    public CPUTimer(int ic, double cpi, double cps ){
        this.ic=ic;
        this.cpi=cpi;
        this.cps=cps;
    }
    public CPUTimer(int i, double ic){

    }
    // returns the instruction count as stored in the object
    int getIC(){
        return ic;
    }
    // returns the seconds per instruction as stored in the object
    double getSPI(){

        return spi;
    }
    // returns the seconds per program
    double getSec(){

        return spi;
    }




}
