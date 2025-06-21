/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cinemaandtheatremanagementsystem;
import com.github.javafaker.Faker;
import ui.MainFrame.MainFrame;

/**
 *
 * @author ushakeshravya
 */
public class CinemaAndTheatreManagementSystem {

    public static void main(String[] args) {
        
        
        Faker faker = new Faker();
        System.out.println("Hello World! " + faker.name().firstName());
    }
}
