
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0798727
 */
public class Main {
    
    
    public static void main(String[] args) {
        
    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a wholesale cost: ");
        double wholesaleCost = keyboard.nextDouble();
        
        System.out.println("Enter a markup percentage as a decimal: ");
        double markupPercentage = keyboard.nextDouble();
        
        double retailCost = calculateRetail(wholesaleCost, markupPercentage);
        
        System.out.println("The retail cost is: " + retailCost);
                
        
    }
    public static double calculateRetail(double wholeSaleCost, double markupPercentage){
        //double markupAmount = wholeSaleCost * markupPercentage;
        
        //double retailAmount = wholeSaleCost + markupAmount;
        
        //return retailAmount;
        
        return wholeSaleCost + (wholeSaleCost * markupPercentage);
    }
  
    }

