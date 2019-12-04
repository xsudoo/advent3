package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


public class App
{
    public static void main( String[] args )
    {
        int high =34;
        String[] strings = new String[high];
        Arrays.fill(strings, "....................................................................................................");
        int[] singelpoints = new int[2];
       // HashSet<int[]> points = new HashSet<int[]>();
        List<int[]> points = new ArrayList<>();
        int iteration =0;
        while (iteration <2){
        int nrString =high-2;
        int doTablicy = nrString;
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
                    singelpoints = new int[2];
                    singelpoints[1] = j;
                    singelpoints[0] = i;
                    points.add(singelpoints);
                } else
                    nowy.append(".");
                if (j == 1 && i == nrCharu) {

                }

            }
            strings[nrString] = nowy.toString();
            nrString--;
        }
        iteration++;
            }//Rysowanie
            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i]);
            }
        for (int [] t:points
             ) {
            System.out.println(t[0]+" "+t[1]);

        }



      //  interpretacjaWejscia();

      //  test.sprawdz(nrCharu,doTablicy);

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
