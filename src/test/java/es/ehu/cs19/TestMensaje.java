package es.ehu.cs19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMensaje
{
    @Test
    public void testHelloWorld() {
        assertEquals("Hello_world", Mensaje.getMsg());
    }

    @Test
    public void testNumber() {
        assertEquals(7, Mensaje.getNumber());
    }
    
}