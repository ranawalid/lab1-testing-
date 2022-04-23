package com.company;

import junit.framework.TestCase;

public class problem2Test extends TestCase {

    public void testIsIdle() {
        int[][] array_1 ={ {1,2,3},{-1,-2,-3}};
        int[][] array_2 ={ {1,2,3},{1,2,3}};
        int[][] array_3 ={ {1,2,3},{1,200,3}};
        int[][] array_4 ={ {1,-300,3},{1,2,3}};
        int[][] array_5 ={ {4,1,7},{-2,4,-1},{1,-5,-3}};
        int[][] array_6 ={ {3,-1,7},{-5,2,-4},{2,-1,-3}};

        problem2 test = new problem2();
       assertEquals("n must be between 1 and 100",test.isIdle(0,array_1));
        assertEquals("yes",test.isIdle(2,array_1));
        assertEquals("no",test.isIdle(2,array_2));
        assertEquals("The coordinates must be between -100 and 100",test.isIdle(2,array_3)); 
        assertEquals("The coordinates must be between -100 and 100",test.isIdle(2,array_4));
        assertEquals("no",test.isIdle(3,array_5));
        assertEquals("yes",test.isIdle(3,array_6));


    }


}