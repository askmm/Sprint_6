package com.example.test.feline;

import com.example.Feline;
import org.junit.Test;

import static com.example.test.Config.CATS_FAMILY;
import static org.junit.Assert.assertEquals;

public class GetFamilyTest {
    @Test
    public void getFamilyTestWithoutParams(){
        Feline feline = new Feline();
        assertEquals("Семейство должно быть \""+ CATS_FAMILY +"\"",
                CATS_FAMILY,
                feline.getFamily());
    }
}
