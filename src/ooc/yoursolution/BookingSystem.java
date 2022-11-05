/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;

/**
 *
 * @author wandw
 */
public class BookingSystem implements BookingSystemInterface {

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        
        //Start variables 
        List<CarInterface> cars = new ArrayList<>();//to store cars data in arraylist
        String list, name;
        name = in.readLine();
        RentACarInterface rentACarInterface = null;
        int numCar = 0;
        //apply while loop to read each line in fine
        while ((list = in.readLine()) != null) {
            //split method to get required answers
            String[] subs = list.split(":");
            Make make = Make.valueOf(subs[0]);//spliting make and show the names of the cars
            double rate = Double.parseDouble(subs[1]);//spliting rate and show the price
            numCar = Integer.parseInt(subs[2]);//spliting numCar and show how many car is on the list

            Car car = new Car(make, rate, numCar);//requires a class in Car.java

            cars.add(car);//car obj added
            rentACarInterface = new RentACar(make, name, numCar, cars);
               
        }
        return rentACarInterface;
//     
        }
}

