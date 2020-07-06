package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsWithStringToLeftReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("String[]"));
    }

    @Test
    public void bracketsWithStringToRightReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]String"));
    }

    @Test
    public void bracketsSeparatedByStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[String]"));
    }

    @Test
    public void multipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("String"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void twoLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void twoRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }


}
