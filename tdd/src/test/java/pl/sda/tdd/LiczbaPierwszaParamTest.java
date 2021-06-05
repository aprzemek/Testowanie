package pl.sda.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LiczbaPierwszaParamTest {

    private int liczba;
    private boolean czyPierwsza;

    public LiczbaPierwszaParamTest(int liczba, boolean czyPierwsza) {
        this.liczba = liczba;
        this.czyPierwsza = czyPierwsza;

    }


    @Test
    public void czyLiczbaPierwsza(){
        assertEquals(czyPierwsza,LiczbaPierwsza.czyLiczbaPierwsza(liczba));
    }
    @Parameterized.Parameters(name = "[{index}]: liczba {0} jest pierwsza? {1}")
    public static Collection<Object[]> dataProvider(){
        return Arrays.asList(new Object[][]{
                {3, true},
                {-3, false},
                {0, false},
                {4, false},
                {8, false},
                {10,false},
                {9, false},
                {11, true},
                {15, false},
                {38, false},
                {1, false}
        });
    }
}
