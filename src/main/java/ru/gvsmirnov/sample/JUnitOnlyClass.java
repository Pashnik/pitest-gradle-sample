package ru.gvsmirnov.sample;

/**
 * @author Gleb Smirnov <me@gvsmirnov.ru>
 */
public class JUnitOnlyClass {
    public static int doSomeMath(int a, int b) {
        return SampleJavaClass.doSomeMath(a, b) - a - b + a + b;
    }
}
