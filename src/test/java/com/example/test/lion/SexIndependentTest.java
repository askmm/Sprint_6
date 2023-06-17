package com.example.test.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static com.example.test.Config.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SexIndependentTest {
    @Mock
    Feline feline;
    public String sex;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    public SexIndependentTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getParams(){
        return new Object[][]{
                {MALE},
                {FEMALE},
        };
    }

    @Test
    public void getKittensWithoutParams() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void getKittensEqualsOne() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(NUMBER_OF_KITTENS);
        assertEquals("У львов 1 котенок", lion.getKittens(), NUMBER_OF_KITTENS);
    }

    @Test
    public void getFoodWithoutParams() throws Exception{
        Lion lion = new Lion(sex, feline);
        lion.getFood();
        Mockito.verify(feline,
                Mockito.times(1)).getFood(PREDATOR);
    }
}
