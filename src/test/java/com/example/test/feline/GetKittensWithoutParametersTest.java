package com.example.test.feline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.test.Config.NUMBER_OF_KITTENS;

@RunWith(MockitoJUnitRunner.class)
public class GetKittensWithoutParametersTest {
    @Spy
    Feline feline;

    @Test
    public void GetKittensUsesParameterizedFunction(){
        feline.getKittens();
        Mockito.verify(feline,
                Mockito.times(1)).getKittens(NUMBER_OF_KITTENS);
    }

}
