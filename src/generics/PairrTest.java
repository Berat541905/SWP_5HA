package generics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PairrTest {

    @Test
    public void testGetters() {
        Pairr pair = new Pairr<>("Test", 123);
        Assert.assertEquals(pair.getFirst(), "Test");
        Assert.assertEquals(pair.getSecond(), Integer.valueOf(123));
    }

    @Test
    public void testSwap() {
        Pairr pair = new Pairr<>("A", 1);
        Pairr swapped = pair.swap();
        Assert.assertEquals(swapped.getFirst(), Integer.valueOf(1));
        Assert.assertEquals(swapped.getSecond(), "A");
    }
}
