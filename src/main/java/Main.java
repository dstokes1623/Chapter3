/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class Main {

    public static void main(String[] args) {
        
        String letterGrade = "B";
        
        switch (letterGrade) {
            case "A":
                System.out.println("Your grade was between 90-100");
                break;
            case "B":
                System.out.println("Your grade was between 80-90");
                break;
            case "C":
                System.out.println("Your grade was between 70-80");
                break;
            case "D":
                System.out.println("Your grade was between 60-70");
                break;
            case "F":
                System.out.println("Your grade was below 60");
                break;
            default:
                System.out.println("We don't recognize this grade");
        
        }
            
   }
