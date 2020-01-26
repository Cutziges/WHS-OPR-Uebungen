/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 *
 * @author sarantel
 */
public class Streams {
    /*
    // Aufgabe 1)
    // Originalcode
    */
    public static List<String> m(Collection<String> woerter) {
        List<String> ergebnis = new ArrayList<>();
       
        for(String wort : woerter) {
            if (wort.length() >= 5) {
                String s = wort.substring(wort.length() / 2);
                if (s.charAt(0) >= 'a') {
                    ergebnis.add(s.toUpperCase());
                }
            }
        }
        
        return ergebnis;
    }
    
     public static List<String> m2(Collection<String> woerter) {
        List<String> ergebnis = new ArrayList<>();
       
        woerter.stream()
                .filter((wort) -> (wort.length() >= 5))
                .map((wort) -> wort.substring(wort.length() / 2))
                .filter((s) -> (s.charAt(0) >= 'a'))
                .forEachOrdered((s) -> {
            ergebnis.add(s.toUpperCase());
        });
        
        return ergebnis;
    }
    
    /**
     * Eigener Code mit Stream.
     * @param woerter übergebene Wortliste
     * @return modifizierte Wortliste
     */
    public static List<String> mbesser(Collection<String> woerter) {
        return woerter.stream()
                .filter(wort -> wort.length() >= 5)
                .map(wort -> wort.substring(wort.length() / 2))
                .filter(wort -> wort.charAt(0) >= 'a')
                .map(wort -> wort.toUpperCase())
                .collect(Collectors.toList());
    }

    
    /**
     * Test von allem.
     * @param args wird nicht genutzt
     */
    public static void main(String[] args) {
        ArrayList<String> w = new ArrayList<>();
        w.add("Hallo");
        w.add("dies");
        w.add("ist");
        w.add("ein");
        w.add("wilder");
        w.add("Testitest");
        
        ArrayList<String> ergebnis = new ArrayList<>();
        
        System.out.println(m(w));
        System.out.println(mbesser(w));
    }
}
