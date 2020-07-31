import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {
    Problem03 countSub = new Problem03();
    @Test public void testCount1() {
        String str = "abcc";
        int k = 2;
        String expected = "Input: str =\"abcc\",K = 2\n" + "Output: 2";
        String actual = countSub.countSubstring(str, k);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCount2() {
        String input = "aabab";
        int k = 3;
        String expected = "Input: str =\"aabab\",K = 3\n" + "Output: 0";
        Assert.assertEquals(expected, countSub.countSubstring(input, k));
    }

}
