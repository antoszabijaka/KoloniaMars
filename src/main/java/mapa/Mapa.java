package mapa;

import pole.*;

import java.util.Random;

public class Mapa implements IMapa {
    public int dlugosc=7;
    public int szerokosc=7;

    public Pole[][] tablicaPol = new Pole[dlugosc][szerokosc];
    public int[][]tablica = new int[dlugosc][szerokosc];
    public Mapa()
    {

    }
    @Override
    public void losujkofiguracje(int[][] tablica) {
        {
            Random generator = new Random();
            for (int i=0;i<dlugosc;i++)
                for (int j=0;j<szerokosc;j++)
                {
                    tablica[i][j]=generator.nextInt(4);
                }
        }
    }
    @Override
    public void rozmiescpola(Pole[][] tablicaPol) {
        { for(int i=0;i<dlugosc;i++)
            for(int j=0;j<szerokosc;j++)
            {
                if(tablica[i][j]==0)
                    tablicaPol[i][j] = new Schronienie(i, j);
                else if(tablica[i][j]==1)
                    tablicaPol[i][j] = new Pozywienie(i,j,10);
                else if(tablica[i][j]==2)
                    tablicaPol[i][j] = new Skaly(i,j);
                else if(tablica[i][j]==3)
                    tablicaPol[i][j] = new Woda(i,j,10);
            }
        }
    }
}
