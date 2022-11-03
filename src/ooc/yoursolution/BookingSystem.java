/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author wandw
 */
public class BookingSystem implements BookingSystemInterface {

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        String title = in.readLine();
        String cars = "";
        
        RentACarInterface car = new RentACar();
        
        while(title != null){
            //System.out.println(title);
            cars = in.readLine();
            System.out.println(cars);
            //System.out.println(content);
            
//            FeedItem item = new FeedItem(title, content);
//            feed.addItem(item);
            
            
        }

        
        return car;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
