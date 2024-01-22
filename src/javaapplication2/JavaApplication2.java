/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Saad Khan
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("JHello");
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char[] reverse = new char[word.length()];
        
        for(int i=0;i<word.length();i++)
        {
        reverse[i] = word.charAt(i);
        }
        
    }
    
}
