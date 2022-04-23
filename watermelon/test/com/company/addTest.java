package com.company;

import junit.framework.TestCase;

public class addTest extends TestCase {

    public void testAddnum() {
        add test = new add();
        assertEquals(3,test.addnum(2,2));
    }
}