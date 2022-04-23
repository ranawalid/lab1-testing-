package com.company;

public class question4A {
    public String weight(int w){
        if (w <=0 || w > 100 )
        {
              System.out.println("The weight should be between 1 and 100");
            return "The weight should be between 1 and 100";
        }
         else if (w>2 && w%2==0){
            System.out.println("yes");
            return "yes";
        }
        else
            System.out.println("no");
            return "no";
    }
}
