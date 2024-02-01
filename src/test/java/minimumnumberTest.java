import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class minimumnumberTest
{
    @Test
    public void checkSmallArraySize()
    {
        assertEquals(1, minimumNumber(new int[]{3,1,2}));
        assertEquals(2, minimumNumber(new int[]{5,2}));
        assertEquals(1, minimumNumber(new int[]{1,1,1}));
    }
    @Test
    public void checkLargerArraySize()
    {
        assertEquals(2, minimumNumber(new int[]{2,12,8,4,6}));
        assertEquals(6, minimumNumber(new int[]{50,39,49,6,17,28}));
    }

    public static int minimumNumber(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}