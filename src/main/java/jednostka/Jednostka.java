package jednostka;

import mapa.Mapa;
import pole.Pole;
import java.util.Random;

public abstract class Jednostka implements IJednostka {

    public int[]tablica = {0,0,0,0};
    public Pole lokalizacja;
    private Random generator = new Random();
    public String imie;
    public int poziomZdrowia;
    public double poziomWytrzymalosci;
    public int poziomGlodu;
    public Jednostka(int poziomZdrowia, int poziomWytrzymalosci, int poziomGlodu, Pole lokalizacja, String imie)
    {
        this.imie=imie;
        this.lokalizacja=lokalizacja;
        this.poziomZdrowia=poziomZdrowia;
        this.poziomWytrzymalosci=poziomWytrzymalosci;
        this.poziomGlodu=poziomGlodu;
    }
    public int zwiekszZdrowie()
    {
        return poziomZdrowia+10;
    }
    public int zmniejszZdrowie() { return poziomZdrowia-20; }
    public double zwiekszWytrzymalosc()
    {
        return poziomWytrzymalosci+10;
    }
    public int zwiekszGlod()
    {
        return poziomGlodu+20;
    }
    public int zmniejszGlod()
    {
        return poziomGlodu-10;
    }
    public double zmniejszWytrzymalosc(double odleglosc)
    {
        return poziomWytrzymalosci - odleglosc;
    }
    public double obliczOdleglosc(Jednostka jednostka)
    {
        double odleglosc;
        odleglosc = Math.sqrt(Math.pow((jednostka.tablica[2]-jednostka.tablica[0]),2)+Math.pow((jednostka.tablica[3]-jednostka.tablica[1]),2));
        return odleglosc;
    }
    public boolean czyDobraOdlegosc(double odleglosc, Mapa mapa)
    {
        //Jesli odleglosc wynosi wiecej niz maksymalna odleglosc miedzy 2 polami na mapie (liczonej ze wzoru na odleglosc dwoch punktow)
        //pomnozona przez 0.7 wtedy funkcja zwraca falsz (za duza odleglosc)
        if(odleglosc<=0.7*Math.sqrt((Math.pow(mapa.dlugosc,2)+Math.pow(mapa.szerokosc,2))))
            return true;
        else return false;
    }
    public Pole pobierzNowaLokalizacje(Pole[][]tablicaPol,int dlugosc, int szerokosc)
    {
        int i=generator.nextInt(szerokosc);
        tablica[2]=i;
        int j=generator.nextInt(dlugosc);
        tablica[3]=j;
        return tablicaPol[i][j];
    }
    public double odlegloscDziecka(Dorosly dorosly, Dziecko dziecko)
    {
        double odlegloscDziecka=0;
        return odlegloscDziecka;
    }

}
