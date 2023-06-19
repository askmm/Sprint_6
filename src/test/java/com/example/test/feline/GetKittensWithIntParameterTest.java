package com.example.test.feline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static com.example.test.Config.NUMBER_OF_KITTENS;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetKittensWithIntParameterTest {

    private final int kittensNumber;

    public GetKittensWithIntParameterTest(Integer kittensNumber) {
        this.kittensNumber = kittensNumber;
    }

    @Parameterized.Parameters
    public static Object[][] getParams(){
        return new Object[][] {
                {NUMBER_OF_KITTENS},
                {0},
                {-1},
                {Integer.MAX_VALUE},
                {Integer.MIN_VALUE},
        };
    }

    @Test
    public void getKittensWithIntParametersEqualsItself(){
        Feline feline = new Feline();
        assertEquals(kittensNumber, feline.getKittens(kittensNumber));
    }
}
