package pl.sda.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
    public class RownanieKwadratoweParamTest {

    private int a, b, c;
    private String wynik;

    public RownanieKwadratoweParamTest(int a, int b, int c, String wynik) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.wynik = wynik;
    }

    @Parameterized.Parameters(name = "[{index}]: a = {0}, b = {1}, c = {2}, rozwiązania: {3}")
    public static Collection<Object[]> dataProvider(){
        return Arrays.asList(new Object[][]{
                {1,2,3,"-"},
                {1,2,1,"-1"},
                {1,-5,6,"2 3"}
        });
    }

    @Test
    public void obliczPierwiastki() {
        assertEquals(wynik, RownanieKwadratowe.znajdzPierwiastki(a, b, c));
    }


}