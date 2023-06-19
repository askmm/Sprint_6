package com.example.test.feline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.example.test.Config.PREDATOR;
import static junit.framework.TestCase.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class EatMeatTest {

    @Spy
    Feline feline;

    @Test
    public void EatMeatReturnsArray() throws Exception {
        assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void EatMeatUsesGetFood() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline,
                Mockito.times(1)).getFood(PREDATOR);
    }
}
