package pl.sda.tdd;

public class RownanieKwadratowe {

    public static String znajdzPierwiastki(int a, int b, int c) {
        int delta = b*b - 4*a*c;
        int x1, x2;

        if (delta<0) {
            return "-";
        } else if (delta==0) {
            return String.valueOf(-b/(2*a));
        } else {
            x1 = (int) ((-b-Math.sqrt(delta))/(2*a));
            x2 = (int) ((-b+Math.sqrt(delta))/(2*a));
        }
        return String.format("%s %s", x1, x2);
    }
}





