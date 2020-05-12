package jednostka;
import pole.Pole;

public interface IJednostka {

    Pole pobierzNowaLokalizacje(Pole[][]tablicaPol,int dlugosc, int szerokosc);
    int zmniejszGlod();
    int zwiekszGlod();
    double zwiekszWytrzymalosc();
    double zmniejszWytrzymalosc(double odleglosc);
    int zwiekszZdrowie();
    int zmniejszZdrowie();}