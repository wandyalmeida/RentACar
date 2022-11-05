/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author wandw
 */
public class RentACar implements RentACarInterface {

    //intiailzing the string that are going to be used in this class
    private Make make;
    private List<CarInterface>cars;
    private String name;
    private int numCar;

    
    RentACar(Make make, String name, int numCar, List<CarInterface>cars) {
        this.make = make;
        this.name = name;
        this.numCar = numCar;
        this.cars = cars;
        
       
 }
    
    @Override
    public List<CarInterface> getCars(){
        return cars;
    }
    //setter 
    @Override
    public void setCars(List<CarInterface> cars){
        this.cars=cars;
    }
    //getting name
    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

   
    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
       throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getNumberOfCars() {
        return cars.size();
      
    }
 }

   
   