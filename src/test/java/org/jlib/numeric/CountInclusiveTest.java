package org.jlib.numeric;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.jlib.numeric.Numeric.countInclusive;

public class CountInclusiveTest {
    @Test
    void from0To0() {
        assertThat(countInclusive(0, 0))
                .isEqualTo(1);
    }

    @Test
    void from1To1() {
        assertThat(countInclusive(1, 1))
                .isEqualTo(1);
    }

    @Test
    void fromMinus1ToMinus1() {
        assertThat(countInclusive(-1, -1))
                .isEqualTo(1);
    }

    @Test
    void fromMinus1To1() {
        assertThat(countInclusive(-1, 1))
                .isEqualTo(3);
    }

    @Test
    @SuppressWarnings("ResultOfMethodCallIgnored")
    void from1ToMinus1() {
        assertThatThrownBy(() -> countInclusive(1, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("-1 = maximum < minimum = 1");
    }

}
