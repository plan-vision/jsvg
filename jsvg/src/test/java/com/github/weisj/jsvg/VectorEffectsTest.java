/*
 * MIT License
 *
 * Copyright (c) 2022 Jannis Weis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */
package com.github.weisj.jsvg;

import static com.github.weisj.jsvg.ReferenceTest.render;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class VectorEffectsTest {

    @Test
    void simpleEffects() {
        assertDoesNotThrow(() -> render("vectorEffect/before.svg"));
        assertDoesNotThrow(() -> render("vectorEffect/none.svg"));
        assertDoesNotThrow(() -> render("vectorEffect/nonScalingSize.svg"));
        assertDoesNotThrow(() -> render("vectorEffect/nonRotation.svg"));
        assertDoesNotThrow(() -> render("vectorEffect/fixedPosition.svg"));
    }

    @Test
    void combinedEffects() {
        assertDoesNotThrow(() -> render("vectorEffect/nonScalingSizeNonRotation.svg"));
        assertDoesNotThrow(() -> render("vectorEffect/nonScalingSizeFixedPosition.svg"));
        assertDoesNotThrow(() -> render("vectorEffect/nonRotationFixedPosition.svg"));
        assertDoesNotThrow(() -> render("vectorEffect/nonScalingSizeNonRotationFixedPosition.svg"));
    }

    @Test
    void nonScalingStroke() {
        assertDoesNotThrow(() -> render("vectorEffect/nonScalingStroke.svg"));
    }
}
