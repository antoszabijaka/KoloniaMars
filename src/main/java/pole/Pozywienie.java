package pole;

public class Pozywienie extends Pole {
    private int iloscPozywienia;
    public Pozywienie (int wspX, int wspY, int iloscPozywienia) {
        super(wspX, wspY);
        this.iloscPozywienia = iloscPozywienia;
    }
    public int zmniejszIloscPozywienia()
    {
        return iloscPozywienia-1;
    }

}
