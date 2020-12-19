import java.io.*;
import java.util.*;

//https://www.hackerrank.com/contests/uap-tif-d/challenges/benben-mendapat-nama

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String s = input.nextLine(); //rambenaben
        int length = s.length();
        int i=0;
        String s2;
        int poin=0;
        int hasil=0;

        while(i<length){
            while(i<length){
                s2 = s.substring(i,i+1);
                if (s2.equals("b")){
                    poin++;
                    break;
                }
                i++;
            }
            while(i<length){
                s2= s.substring(i,i+1);
                if (s2.equals("e")){
                    poin++;
                    break;
                }
                i++;
            }
            while(i<length){
                s2= s.substring(i,i+1);
                if (s2.equals("n")){
                    poin++;
                    break;
                }
                i++;
            }
        }
//        System.out.println(poin); //6
        while (poin>=6){
            poin=poin-6;
            hasil=hasil+1;
        }
        System.out.println(hasil); //1
    }
}
