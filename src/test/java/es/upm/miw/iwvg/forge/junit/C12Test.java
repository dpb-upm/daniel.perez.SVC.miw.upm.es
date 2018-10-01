package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C12Test {

    private C12 c12;

    @BeforeEach
    void before() {
        this.c12 = new C12();
    }

    @Test
    void testMA() {
        assertEquals("mA", this.c12.mA());
    }
}
