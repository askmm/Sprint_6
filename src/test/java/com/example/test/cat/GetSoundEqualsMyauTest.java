package com.example.test.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.test.Config.CAT_SAYS;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GetSoundEqualsMyauTest {
    @Mock
    Feline feline;
    @Test
    public void getSoundEqualsMyau(){
        Cat cat = new Cat(feline);
        assertEquals("Кошка говорит \"" + CAT_SAYS + "\"",
                CAT_SAYS,
                cat.getSound());
    }
}
