package problem1221;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1221Test {

    Solution1221 solution1221;

    @Before
    public void setting() {
        solution1221 = new Solution1221();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1221.balancedStringSplit("RLRRLLRLRL"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1221.balancedStringSplit("RLRRRLLRLL"));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1221.balancedStringSplit("LLLLRRRR"));
    }
}