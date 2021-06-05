package pl.sda.tdd;

public class LiczbaPierwsza {
    public static boolean czyLiczbaPierwsza(int liczba) {
        if (liczba <=1){
            return false;
        }
        for (int i = 2; i <= liczba/2; i++) {
            if (liczba%i==0){
                return false;
            }
        }
        return true;
    }
}
