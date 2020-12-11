package com.belajar;

import java.util.Scanner;

public class lembur {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hp = input.nextInt();
        int n = input.nextInt();
        input.nextLine();
        for (int i=0; i<n; i++){
            String attack = input.nextLine();
            if (attack.equals("Kick")){
                hp=tendang(hp);
            }else{
                hp=pukul(hp);
            }
        }
        if(hp<=0){
            System.out.println("Monster mati");
        }else{
            System.out.println(hp);
        }
    }
    static int tendang(int a){
        int darah=a;
        darah=(darah-(darah*10/100));
        return darah;
    }
    static int pukul(int a){
        int darah=a;
        darah = (darah-30);
        return darah;
    }
}
