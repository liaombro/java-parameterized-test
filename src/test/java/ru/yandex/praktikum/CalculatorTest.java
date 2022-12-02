package ru.yandex.praktikum;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculatorTest {

    private int a;
    private int b;
    private int expected;

    public CalculatorTest(int a, int b, int expected) {
        this.a=a;
        this.b=b;
        this.expected=expected;
    }


    @Parameterized.Parameters
    public static Object[][] getTestData(){
        Object[][] data =  {
                {1,2,3},
                {1,3,4},
                {1,4,5},
                {1,5,6},
                {1,6,7},
                {1,7,8},
                {10,7,17},
                {11,7,18},
                {12,7,19},
                {13,7,20},
        };
        return data;
    }

@Test
    public void test1(){
    Calculator calc = new Calculator();
    int s = calc.sum(a,b);
    assertEquals(expected,s);
}

}
