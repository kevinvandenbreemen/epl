package com.vandenbreemen.epl.operation;

import com.vandenbreemen.epl.system.System;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {

    private Multiply multiply;
    private System system;

    @BeforeEach
    public void setup() {
        this.multiply = new Multiply();
        this.system = new System();
    }

    @Test
    public void shouldMultiplyValues() {
        multiply.perform(system, 2.0, 3.0);
        assertEquals(6.0, system.getMemory().getResult().get());
    }

    @Test
    public void shouldTreatNoArgsAsMultiplyCurrentValueByItself() {
        system.getMemory().setResult(2.0);
        multiply.perform(system);
        assertEquals(4.0, system.getMemory().getResult().get());
    }

    @Test
    public void shouldMultiplyArgumentsByCurrentProduct() {
        system.getMemory().setResult(2.0);
        multiply.perform(system, 10.0);
        assertEquals(20.0, system.getMemory().getResult().get());
    }

    @Test
    public void shouldDoNothingIfNoArgsAndNoMemory() {
        multiply.perform(system);
        assertFalse(system.getMemory().getResult().isPresent());
    }

}