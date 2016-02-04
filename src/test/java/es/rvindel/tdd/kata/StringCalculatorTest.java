package es.rvindel.tdd.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StringCalculatorTest {

    private StringCalculator sut;
    private StringSplitter stringSplitter;

    @Before
    public void setUp() {
        stringSplitter = mock(StringSplitter.class);
        sut = new StringCalculator(stringSplitter);
    }

    @Test
    public void shouldReturnZeroWhenAddIsInvokedWithAnEmptyString() {
        when(stringSplitter.split("")).thenReturn(new int[] {});
        assertThat(0, equalTo(sut.add("")));
    }

    @Test
    public void shouldReturnNumberWhenAddIsInvokedWithASingleNumberString() {
        when(stringSplitter.split("5")).thenReturn(new int[] {5});
        assertThat(5, equalTo(sut.add("5")));
    }

    @Test
    public void shouldReturnSumWhenAddIsInvokedWithTwoNumbersSeparatedByComaString() {
        when(stringSplitter.split("3,4")).thenReturn(new int[] {3, 4});
        assertThat(7, equalTo(sut.add("3,4")));
    }

    @Test
    public void shouldReturnSumWhenAddIsInvokedWithMoreThanTwoNumbersSeparatedByComaString() {
        when(stringSplitter.split("3,4,5,6,7")).thenReturn(new int[] {3, 4, 5, 6, 7});
        assertThat(25, equalTo(sut.add("3,4,5,6,7")));
    }

    @Test
    public void shouldReturnSumWhenAddIsInvokedWithMoreThanTwoNumbersSeparatedByComaOrReturnCharacterString() {
        when(stringSplitter.split("3,4\n5,6\n7")).thenReturn(new int[] {3, 4, 5, 6, 7});
        assertThat(25, equalTo(sut.add("3,4\n5,6\n7")));
    }
}
