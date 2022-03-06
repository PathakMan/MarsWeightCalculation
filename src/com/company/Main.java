package com.company;

public class Main {

    public static void main(String[] args) {

            float earthweightPathak;
            float marsweightPathak;
            double marsweightInDoublePathak;
          int marsWeightInIntPathak;

            earthweightPathak  =  70;
            marsweightPathak = (earthweightPathak * 0.38F);
            System.out.println(earthweightPathak + " kg on Earth is " + marsweightPathak + " kg on Mars ");

            marsweightInDoublePathak = marsweightPathak;
          System.out.println("Kilograms on Mars after converting to double "+ marsweightInDoublePathak);System.out.printf("kilograms on mars displayed to four decimal places: %.4f %n", marsweightInDoublePathak);

            marsWeightInIntPathak = (int)marsweightInDoublePathak;
            System.out.println("kilograms on mars when casted to interger "+ marsWeightInIntPathak);

            char a = (char)marsWeightInIntPathak;
            System.out.println("The ASCII table equivalent of marsWeightInInt is: " + a);

            int exampleofMathOnChar = a * a;
            System.out.println("An example of a mathematical operation on the char type " + exampleofMathOnChar);
    }
}
