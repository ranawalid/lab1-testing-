package com.company;

public class problem2 {
    public String isIdle (int n, int [][] coordinates){
        int sum_x=0;
        int sum_y=0;
        int sum_z=0;
        //checking the n limits
        if(n<1 || n>100) {
            System.out.println("n must be between 1 and 100");
            return "n must be between 1 and 100";
        }
        else{
              for(int i=0; i<n;i++){
                  for(int k=0; k<3;k++) {
                      if (coordinates[i][k] > -99 && coordinates[i][k] < 101) {
                          sum_x = sum_x + coordinates[i][0];
                          sum_x = sum_x + coordinates[i][1];
                          sum_x = sum_x + coordinates[i][2];
                      } else {
                          System.out.println("The coordinates must be between -100 and 100");
                          return "The coordinates must be between -100 and 100";
                      }

                  }

        }
        if(sum_x ==0 && sum_y==0 &&sum_z ==0 ){
            System.out.println("yes");
            return "yes";

        }
        else
            System.out.println("no");
            return "no";


    }}
}
