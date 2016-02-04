package es.rvindel.tdd.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class StringSplitterTest {

    private StringSplitter sut;

    @Before
    public void setUp() {
        sut = new CoreStringSplitter();
    }

    @Test
    public void shouldReturnEmptyArrayWhenSplitIsInvokedWithEmptyString() {
        assertThat(new int[] {}, equalTo(sut.split("")));
    }

    @Test
    public void shouldReturnArrayWithSameOneNumberWhenSplitIsInvokedWithASingleNumberString() {
        assertThat(new int[] {1}, equalTo(sut.split("1")));
    }

    @Test
    public void shouldReturnArrayWithSameTwoNumbersWhenSplitIsInvokedWithTwoNumbersSeparatedByComaString() {
        assertThat(new int[] {1, 2}, equalTo(sut.split("1,2")));
    }

    @Test
    public void shouldReturnArrayWithSameNumbersWhenSplitIsInvokedWithMoreThanTwoNumbersSeparatedByComaString() {
        assertThat(new int[] {1, 2, 3, 4, 5}, equalTo(sut.split("1,2,3,4,5")));
    }

    @Test
    public void shouldReturnArrayWithSameNumbersWhenSplitIsInvokedWithMoreThanTwoNumbersSeparatedByComaOrReturnCharacterString() {
        assertThat(new int[] {1, 2, 3, 4, 5}, equalTo(sut.split("1,2\n3,4\n5")));
    }
}