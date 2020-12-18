package com.belajar;

import java.util.Scanner;

public class coratcoret {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        input.nextLine();
        String a = input.nextLine();
        String b = input.nextLine();
        char c1 = a.charAt(0);
        char c2 = b.charAt(0);
        int convert1 = c1;
        int convert2 =c2;
        convert1=convert1+x;
        convert2=convert2+x;
        c1=(char)convert1;
        c2=(char)convert2;
        System.out.println(c1);
        System.out.println(c2);
    }
}
