
import org.etsntesla.it.math.Point;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@Disabled
public class PointTest {

    static Point A,B;
    double res;

    @BeforeAll
    static void initAll(){
        A = new Point(3.0d,4.0d);
        B = new Point(3.0d,6.0d);
    }

    @AfterEach
    void rezultatTesta(){
        System.out.println("Rezultat testa je:" + res);
    }




    @Test
    @DisplayName("test1")
    void test1(){
       res=A.radius();
       assertEquals(5.0d,res, "Formula za rastojanje je netacna");

    }


    @Test
    @DisplayName("test2")
    void test2(){
        res=A.distance(B);
        assertEquals(2.0d,res, "Formula za rastojanje je netacna");
    }

    @Test
    @DisplayName("test3")
    void test3(){
        res=A.distance(3,6);
        assertEquals(2.0d,res, "Formula za rastojanje je netacna");
    }

}
