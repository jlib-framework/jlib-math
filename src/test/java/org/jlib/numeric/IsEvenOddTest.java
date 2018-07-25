package org.jlib.numeric;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.jlib.numeric.Numeric.isEven;
import static org.jlib.numeric.Numeric.isOdd;

class IsEvenOddTest {

    @Test
    void isEvenZero() {
        assertThat(isEven(0))
                .isTrue();
    }

    @Test
    void isEvenMinus2() {
        assertThat(isEven(-2))
                .isTrue();
    }

    @Test
    void isEvenMinus1() {
        assertThat(isEven(-1))
                .isFalse();
    }

    @Test
    void isEven1() {
        assertThat(isEven(1))
                .isFalse();
    }

    @Test
    void isEven2() {
        assertThat(isEven(2))
                .isTrue();
    }
    @Test
    void isOddZero() {
        assertThat(isOdd(0))
                .isFalse();
    }

    @Test
    void isOddMinus2() {
        assertThat(isOdd(-2))
                .isFalse();
    }

    @Test
    void isOddMinus1() {
        assertThat(isOdd(-1))
                .isTrue();
    }

    @Test
    void isOdd1() {
        assertThat(isOdd(1))
                .isTrue();
    }

    @Test
    void isOdd2() {
        assertThat(isOdd(2))
                .isFalse();
    }
}
