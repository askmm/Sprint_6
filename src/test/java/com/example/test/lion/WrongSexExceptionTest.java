package com.example.test.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static com.example.test.Config.SEX_UNKNOWN;

public class WrongSexExceptionTest {
    @Test(expected = Exception.class)
    public void WrongSexThrowsException() throws Exception{
        Lion lion = new Lion(SEX_UNKNOWN, new Feline());
    }

}
