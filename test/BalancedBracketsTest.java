package test;

import org.junit.Test;
import main.BalancedBrackets;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here 1
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

// checking brackets at beginning 2
    @Test
    public void bracketsUpFront() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]test"));
    }
    //  checking brackets at back 3
    @Test
    public void bracketsUpBack() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test[]"));
    }

// brackets in correct order 4
    @Test
    public void correctOrder() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

// multiple sets of brackets are acceptable 5
    @Test
    public void manyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[test]]]]"));
    }

// brackets out of order is wrong 6
//    @Test
//    public void wrongOrder(expect ) {
//        assertFalse(BalancedBrackets.hasBalancedBrackets("]test["));
//    }
// many brackets works too 7
    @Test
    public void multipleBracketPairsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test] test [test] [test test test.]"));
    }
    // fails multiple brackets at front  8
    @Test
    public void tooManyFront() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[test]"));
    }
    // fails multiple brackets at rear 9
    @Test
    public void tooManyRear() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test]]]]"));
    }
    // fails one brackets at rear 10
    @Test
    public void oneBack() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    // fails one brackets at front 11
    @Test
    public void oneFront() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    // fails bracket in middle
    @Test
    public void oneMiddle() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("te]st"));
    }
}
