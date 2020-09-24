
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
public class PaintJobEstimator {
    public static void main(String[] args) {
       
        //collect dimensions (length and width) from user
        Scanner keyboard = new Scanner(System.in);
        double length = keyboard.nextDouble();
        double width = keyboard.nextDouble();
        System.out.println("Enter a length: ");
        System.out.println("Enter a width: ");
        //calculate square footage
        double squareFootage = calculateSqFootage(length, width);
        //calculate cost of drywall
        double drywallCost = calculateDrywallCost(double squareFootage);
        //calculate tax for drywall cost
        double totalWithTax = calculateCostofTax(squareFootage);
        //display costs to the user
        
    }
    public static double calculateSqFootage(double length, double width){
        return length * width;
    }
    
    public static double calculateDrywallCost(double squareFootage){
       // Since drywall is $16 for 48 sqft it is 0.33 per sqft
        final double DRYWALL_COST_PER_SQ_FOOT = 0.33;
        
        return DRYWALL_COST_PER_SQ_FOOT * squareFootage;
    }
    
    public static double calculateCostofTax(double cost){
        final double taxRate = .09;
        double tax = cost * taxRate;
        double totalWithTax = tax + cost;
        return totalWithTax;
        
    }
}
