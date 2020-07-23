/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuenkuan
 */
public class Registration {
    
    private static int count = 1001;
    private int regNo;
    private CarType carType;
    private Owner owner;
    private Car car;

    public Registration(Car car, CarType carType, Owner owner) {
        
        this.owner = owner;
        this.car = car;
        this.carType = carType;
        this.regNo = count;
        count ++;
        
    }
        
    public static int getCount(){
        return count;
    }
    
    public String toString(){
        return String.format("%-2d %s %s %s",regNo, owner.toString(), car.toString(), carType.toString());
    }
}
