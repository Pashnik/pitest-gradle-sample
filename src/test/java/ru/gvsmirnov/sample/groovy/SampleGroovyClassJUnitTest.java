package ru.gvsmirnov.sample.groovy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.gvsmirnov.sample.groovy.SampleGroovyClass.doSomeMath;

public class SampleGroovyClassJUnitTest {

    @Test
    public void testMath() {
        final int expected = 0;

        for(int a = -5; a <= 5; a ++) {
            for(int b = -5; b <= 5; b ++) {
                assertEquals(expected, doSomeMath(a, b));
            }
        }
    }

}
