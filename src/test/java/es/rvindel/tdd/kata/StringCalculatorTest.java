package es.rvindel.tdd.kata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroWhenAddIsInvokedWithAnEmptyString() {
        final StringCalculator sut = new StringCalculator();
        assertThat(0, equalTo(sut.add("")));
    }

    @Test
    public void shouldReturnNumberWhenAddIsInvokedWithASingleNumberString() {
        final StringCalculator sut = new StringCalculator();
        assertThat(5, equalTo(sut.add("5")));
    }
}
