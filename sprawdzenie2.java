package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sprawdzenie2 {

    public static List sprawdz(int wiersze, int kolumny){
        boolean weryfikacja;
        int [] tab;
        List<int[]> tabList = new ArrayList<>();
        List<int[]> powtorka = new ArrayList<>();

        for (int j = 0; j <wiersze; j++) {


            for (int i = 0; i < kolumny; i++) {
                weryfikacja=true;
                tab = new int[2];
                tab[0] = j;
                tab[1] = i;
                if(tabList.size()==0){
                    tabList.add(tab);

                }
                for (int[] t : tabList) {
                    {
                        if (t[0] == j && t[1] == i) {
                            weryfikacja=false;
                            powtorka.add(tab);
                            break;
                        }
                    }

                } if(weryfikacja){
                    tabList.add(tab);
                }
            }
        }
        return powtorka;
    }
}
