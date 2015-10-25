package com.jetbrains.navigation;

import junit.framework.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static com.jetbrains.navigation.NavigateToTest.*;
import static java.lang.Math.sqrt;
import static junit.framework.Assert.assertEquals;

public class NavigateToTestTest {
    @Test
    public void testFastInvSqrt() {
        BigDecimal slow = new BigDecimal(1 / sqrt(2));
        BigDecimal fast = new BigDecimal(fastInvSqrt(2));
        MathContext mc = new MathContext(3);
        
        assertEquals(slow.round(mc), fast.round(mc));
    }
}
