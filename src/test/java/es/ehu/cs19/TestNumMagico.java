package es.ehu.cs19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class TestNumMagico
{
    @Test
    public void testNum() 
    {
        assertEquals(10, NumMagico.getNum());
    }
    
}