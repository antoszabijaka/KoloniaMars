package pole;

public class Woda extends Pole {
    private int iloscWody;
    public Woda (int wspX, int wspY, int iloscWody)
    {
        super(wspX,wspY);
        this.iloscWody=iloscWody;
    }
    public int zmniejszIloscWody()
    {
        return iloscWody-1;
    }
}