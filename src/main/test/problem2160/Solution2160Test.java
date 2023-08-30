package problem2160;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2160Test {

    Solution2160 solution2160;

    @Before
    public void setting() {
        solution2160 = new Solution2160();
    }

    @Test
    public void minSum() {

        assertEquals(52, solution2160.minSum("2932"));

    }
}