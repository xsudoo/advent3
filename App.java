package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class App
{
    public static void main( String[] args )
    {
        int high =100;
        String[] strings = new String[100];
        Arrays.fill(strings, "....................................................................................................");
        List<Integer> singelpoints = new ArrayList<>();
        HashSet<List<Integer>> points = new HashSet<>();
       // List<List<Integer>> points = new ArrayList<>();
        int iterator=1;
        while (iterator<3) {
        int nrString =97;
        int nrCharu=3;
        char replace = '|';

            for (int j = nrString; j > 0; j--) {
                if (j == 1) {
                    replace = 'X';
                }
                String zmiana = strings[nrString];
                StringBuilder nowy = new StringBuilder();
                for (int i = 0; i < zmiana.length(); i++) {
                    if (i == nrCharu) {
                        nowy.append(replace);
                        singelpoints.add(j);
                        singelpoints.add(nrCharu);
                        points.add(singelpoints);
                    } else
                        nowy.append(".");
                    if (j == 1 && i == nrCharu) {
                    }
                }
                strings[nrString] = nowy.toString();
                nrString--;

            }
            /*for (int i = 0; i < strings.length; i++) {
                //     System.out.println(strings[i]);
            }*/
            iterator++;
        }
        System.out.println(points.size());
        interpretacjaWejscia();

    }
    public static void interpretacjaWejscia (){
        String wejscie = "U45";
        String kierunek="";
        String cyfra="";

        for (int i = 0; i <wejscie.length(); i++) {
            if(i==0){
                kierunek =""+ wejscie.charAt(i);
            }else cyfra=""+wejscie.charAt(i);

        }
        System.out.println("kirunek "+ kierunek +" CYfra = "+cyfra);
    }
}
