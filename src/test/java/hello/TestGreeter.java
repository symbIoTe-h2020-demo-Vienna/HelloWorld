import static org.junit.Assert.assertEquals;
import org.junit.Test;
import hello.Greeter;

public class TestGreeter {

    @Test
    public void testFavoriteNumber() {
        Greeter tester = new Greeter(); // Greeter is tested

        // assert statements
    	System.out.println(tester.sayHello());
        assertEquals("Favorite Number should be 13", 13, tester.sayFavoriteNumber());

    }
}