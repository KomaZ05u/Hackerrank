import java.io.*;
import java.util.*;

//https://www.hackerrank.com/contests/uap-tif-d/challenges/magang-pt-kai

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if(x==0){
            System.out.println("Kereta tidak bisa dibuat jika tidak ada lokomotif");
        }else{
            input.nextLine();
            String s = input.nextLine();
            switch (s){
                case "rotate":
                    System.out.printf("1 ");
                    while (x>1){
                        System.out.printf("%d ",x);
                        x--;
                    }
                    break;
                case "detach":
                    int detach = input.nextInt();
                    if(detach>x){
                        System.out.println("Gerbong kereta tidak ada");
                        for (int i =1 ; i<=x; i++){
                            System.out.printf("%d ",i);
                        }
                    }else{
                        if(detach==1){
                            System.out.println("Lokomotif tidak bisa dilepas");
                        }else{
                            for(int i=1; i<detach; i++){
                                System.out.printf("%d ",i);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }
}
