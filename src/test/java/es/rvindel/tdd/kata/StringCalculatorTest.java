package es.rvindel.tdd.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {

    private StringCalculator sut;

    @Before
    public void setUp() {
        sut = new StringCalculator();
    }

    @Test
    public void shouldReturnZeroWhenAddIsInvokedWithAnEmptyString() {
        assertThat(0, equalTo(sut.add("")));
    }

    @Test
    public void shouldReturnNumberWhenAddIsInvokedWithASingleNumberString() {
        assertThat(5, equalTo(sut.add("5")));
    }

    @Test
    public void shouldReturnSumWhenAddIsInvokedWithTwoNumbersSeparatedByComaString() {
        assertThat(7, equalTo(sut.add("3,4")));
    }

    @Test
    public void shouldReturnSumWhenAddIsInvokedWithMoreThanTwoNumbersSeparatedByComaString() {
        assertThat(25, equalTo(sut.add("3,4,5,6,7")));
    }
}
