package boletin2_08;

import java.util.Scanner;

public class Boletin2_08 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        double b100, b20, b5, m1, Total;
        System.out.println("Introduce billetes de 100 €");
        b100=teclado.nextFloat();
        System.out.println("Introduce billetes de 20 €");
        b20=teclado.nextFloat();
        System.out.println("Introduce billetes de 5 €");
        b5=teclado.nextFloat();
        System.out.println("Introduce monedas de 1 €");
        m1=teclado.nextFloat();
        Total= b100*100+b20*20+b5*5+m1;
        System.out.println("El total introducido son "+Total+" €");
    }
    
}
