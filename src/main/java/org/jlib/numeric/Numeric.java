/*
 * jlib - Open Source Java Library
 *
 *     www.jlib.org
 *
 *
 *     Copyright 2005-2018 Igor Akkerman
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.jlib.numeric;

import lombok.experimental.UtilityClass;

/**
 * Utility providing numerical operations.
 *
 * @author Igor Akkerman
 */
@UtilityClass
public final class Numeric {

    /**
     * Returns the number of numbers between a minimum and a maximum number, both inclusive.
     *
     * @param minimum
     *        integer specifying the minimum number
     *
     * @param maximum
     *        integer specifying the maximum number
     *
     * @return {@code maximum - minimum + 1}
     *
     * @throws IllegalArgumentException
     *         if {@code maximum < minimum}
     */
    public static int countInclusive(final int minimum, final int maximum) {
        if (maximum < minimum)
            throw new IllegalArgumentException(maximum + " = maximum < minimum = " + minimum);

        return maximum - minimum + 1;
    }

    /**
     * Verifies whether the specified integer is even.
     *
     * @param number
     *        integer to verify
     *
     * @return {@code true} if {@code number} is even; {@code false} if
     *         {@code number} is odd
     */
    public static boolean isEven(final int number) {
        return (number & 1) == 0;
    }

    /**
     * Verifies whether the specified integer is odd.
     *
     * @param number
     *        integer to verify
     *
     * @return {@code true} if {@code number} is odd; {@code false} if
     *         {@code number} is even
     */
    public static boolean isOdd(final int number) {
        return (number & 1) == 1;
    }
}
