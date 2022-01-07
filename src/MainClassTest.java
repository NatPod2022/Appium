import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetLocalNumber()
    {
        int k=this.getLocalNumber();
        if (k==14) {
            System.out.println("Верное значение");
        } else {
            System.out.println("Неверное значение.Требуется проверка");
        }
    }
}
