/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sarantel
 */
public class StringTest {
    String s1;
    String s2;
    String s3;
    
    @Before
    public void setUp() {
        s1 = "Test";
        s2 = "tesT";
        s3 = "Testi test";
    }
    
    @Test
    public void testeSubstring() {
        String ergebnis = "Te";
        
        assertEquals(ergebnis, s1.substring(0, 2));
    }
    
    @Test
    public void testeSubstring2() {
        String s = "Test";
        int l = s.length();
        
        assertEquals(s, s.substring(0, l));
    }
}
