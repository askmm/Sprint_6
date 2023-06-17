package com.example.test.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static com.example.test.Config.FEMALE;
import static com.example.test.Config.MALE;
import static junit.framework.TestCase.assertEquals;


@RunWith(Parameterized.class)
public class DoesHaveManeTest {
    public String sex;
    public boolean hasMane;
    Feline feline = new Feline();

    public DoesHaveManeTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getParams(){
        return new Object[][] {
                {MALE, true},
                {FEMALE, false},
                };

    }

    @Test
    public void doesHaveMainTestOnSexParameterized() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(hasMane, lion.doesHaveMane());
    }
}
