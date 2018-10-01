package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C32Test {

    private C32 c32;

    @BeforeEach
    void before() {
        this.c32 = new C32();
    }

    @Test
    void testMA() {
        assertEquals("mA", this.c32.mA());
    }
}
