package com.belajar;

import java.util.Scanner;

public class coratcoret {
    static void showAllData(){
        System.out.println("Garuda Indonesia | Jakarta | 13:00 | 1 |");
        System.out.println("Sriwijaya Air | Surabaya | 09:00 | 2 |");
        System.out.println("Batik Air | Manado | 09:30 | 3 |");
        System.out.println("Air Asia | Yogyakarta | 11:00 | 4 |");
        System.out.println("Lion Air | Tangerang | 12:00 | 2 |");
        System.out.println("Wings Air | Jakarta | 09:30 | 5 |");
    }

    // lengkapi method showAirlineAndHeading
    static void showAirlineAndHeading() {
        System.out.println("Garuda Indonesia | Jakarta |");
        System.out.println("Sriwijaya Air | Surabaya |");
        System.out.println("Batik Air | Manado |");
        System.out.println("Air Asia | Yogyakarta |");
        System.out.println("Lion Air | Tangerang |");
        System.out.println("Wings Air | Jakarta |");
    }

    // lengkapi method showAirlineAndHour
    static void showAirlineAndHour() {
        System.out.println("Garuda Indonesia | 13:00 |");
        System.out.println("Sriwijaya Air | 09:00 |");
        System.out.println("Batik Air | 09:30 |");
        System.out.println("Air Asia | 11:00 |");
        System.out.println("Lion Air | 12:00 |");
        System.out.println("Wings Air | 09:30 |");
    }

    // lengkapi method showAirlineBasedOnHour
    static void showAirlineBasedOnHour(String t) {
        switch (t){
            case "09:00":
                System.out.println("Sriwijaya Air | Surabaya | 09:00 | 2 |");
                break;
            case "09:30":
                System.out.println("Batik Air | Manado | 09:30 | 3 |");
                System.out.println("Wings Air | Jakarta | 09:30 | 5 |");
                break;
            case "11:00":
                System.out.println("Air Asia | Yogyakarta | 11:00 | 4 |");
                break;
            case "12:00":
                System.out.println("Lion Air | Tangerang | 12:00 | 2 |");
                break;
            case "13:00":
                System.out.println("Garuda Indonesia | Jakarta | 13:00 | 1 |");
                break;
            default:
                System.out.println("");
                break;
        }
    }

    // lengkapi method main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        switch (x){
            case 1:
                showAllData();
                break;
            case 2:
                showAirlineAndHeading();
                break;
            case 3:
                showAirlineAndHour();
                break;
            case 4:
                input.nextLine();
                String t = input.nextLine();
                showAirlineBasedOnHour(t);
                break;
            default:
                System.out.println("Inputan tidak valid");
        }
    }
}
