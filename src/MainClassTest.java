import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        //String substring1 = "Hello";
        //String substring2 = "Hello";

        if (class_string.contains("Hello")||class_string.contains("hello"))
        {
            System.out.println("есть приветствие");
        } else {
            System.out.println("нет приветствия");
        }

    }
}

