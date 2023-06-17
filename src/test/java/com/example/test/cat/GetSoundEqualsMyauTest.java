package com.example.test.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static com.example.test.Config.CAT_SAYS;

import static junit.framework.TestCase.assertEquals;

public class GetSoundEqualsMyauTest {
    Feline feline = new Feline();
    @Test
    public void getSoundEqualsMyau(){
        Cat cat = new Cat(feline);
        assertEquals("Кошка говорит \"" + CAT_SAYS + "\"",
                CAT_SAYS,
                cat.getSound());
    }
}
