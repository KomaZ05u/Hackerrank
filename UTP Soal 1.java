package com.belajar;

import java.util.Scanner;

public class coratcoret {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String nama = input.nextLine();
        double r = input.nextDouble();
        String nama2 = nama.toUpperCase();
        if(r>0 && r<=500){
            System.out.println("Hasil perhitungan "+nama2+ " adalah:");
            double keliling,luas;
            keliling = 2*3.14 * r;
            luas = 3.14*r*r;
            System.out.printf("Keliling = %.2f\n",keliling);
            System.out.printf("Luas = %.2f\n",luas);
        }else{
            System.out.println("Hasil perhitungan "+nama2+ " adalah:");
            System.out.println("Keliling = 0.00");
            System.out.println("Luas = 0.00");
        }
    }
}
