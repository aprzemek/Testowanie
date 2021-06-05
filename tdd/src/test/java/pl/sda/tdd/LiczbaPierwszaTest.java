package pl.sda.tdd;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LiczbaPierwszaTest {

    @Test
    public void trzyJestLiczbaPierwsza(){
    assertTrue(LiczbaPierwsza.czyLiczbaPierwsza(3));

    }

    @Test
    public void minusTrzyNieJestLiczbaPierwsza(){
        assertFalse(LiczbaPierwsza.czyLiczbaPierwsza(-3));
    }

    @Test
    public void zeroNieJestLiczbaPierwsza(){
        assertFalse(LiczbaPierwsza.czyLiczbaPierwsza(0));
    }

    @Test
    public void osiemNieJestLiczbaPirwsza(){
        assertFalse(LiczbaPierwsza.czyLiczbaPierwsza(8));

    }
    @Test
    public void pietnascieNieJestLiczbaPierwsza(){
        assertFalse(LiczbaPierwsza.czyLiczbaPierwsza(15));
    }

    @Test
    public void czterdziesciJednenJestLiczbaPierwsza(){
        assertTrue(LiczbaPierwsza.czyLiczbaPierwsza(41));
    }
    @Test
    public void trzydziesciOsiemJestLiczbaPierwsza(){
        assertFalse(LiczbaPierwsza.czyLiczbaPierwsza(38));
    }
    @Test
    public void jedenNieJestLiczbaPierwsza(){
        assertFalse(LiczbaPierwsza.czyLiczbaPierwsza(1));
    }
    @Test
    public void czteryNieJestLiczbaPierwsza(){
        assertFalse(LiczbaPierwsza.czyLiczbaPierwsza(4));
    }

}
