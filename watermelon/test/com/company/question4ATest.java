package com.company;

import junit.framework.TestCase;

public class question4ATest extends TestCase {

    public void testWeight() {
        int[] arr ={-1,1,9,4,6,99,100,8};
        String[] sta ={"The weight should be between 1 and 100","no","no","yes","yes","no","yes","yes"};
        question4A test =new question4A();
        for(int i=0; i<arr.length;i++){
            assertEquals(sta[i],test.weight(arr[i]));
        }
    }
}
