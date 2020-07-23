/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuenkuan
 */
public class Car {
    
    private String plateNo;
    private int year;
    private String color;
   

    public Car(String plateNo,String color,int year) {
        this.plateNo = plateNo;
        this.year = year;
        this.color = color;
       
    }
    
    public String toString(){
        
       return String.format("%-11s%-10s%-10d", this.plateNo,this.color, this.year);
    }
    
}
