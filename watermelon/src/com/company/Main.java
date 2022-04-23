package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
         Scanner in =  new Scanner(System.in);
         int w ;
        System.out.println("Please enter the weight of the watermelon ");
         w=in.nextInt();
         if (w>2 && w%2==0){
             System.out.println("Yes");
         }
         else
                    System.out.println("No");
    }
}
