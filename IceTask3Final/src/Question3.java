/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aadim
 */
public class Question3 {
     public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int result = greatestCommonDivisor(a, b);
        System.out.println("The greatest common divisor is: " + result);
    }

    public static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
}
