import org.junit.Test;
import static org.junit.Assert.*;


/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {


    @Test
    public void test_is_triangle_1() {
        assertTrue(Demo.isTriangle(3,4,5));
    }
    @Test
    public void test_is_triangle_2() {
        assertTrue(Demo.isTriangle(3,3,3));
    }
    @Test
    public void test_is_triangle_3() {
        assertTrue(Demo.isTriangle(5,12,13));
    }


}
