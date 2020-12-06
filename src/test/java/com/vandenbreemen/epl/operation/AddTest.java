package com.vandenbreemen.epl.operation;

import com.vandenbreemen.epl.system.System;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AddTest {

    private Add add;
    private System system;

    @BeforeEach
    public void setup() {
        add = new Add();
        system = new System();
    }

    @Test
    public void shouldStoreResultOfAddition() {
        add.perform(system, 1., 2.);
        assertEquals(3.0, system.getMemory().getResult().get());
    }

    @Test
    public void shouldAddToExistingValueInStorageIfPrsent() {
        system.getMemory().setResult(1.0);
        add.perform(system, 1.0);
        assertEquals(2.0, system.getMemory().getResult().get());
    }

    @Test
    public void shouldAddLastResultToItselfIfNoArgument() {
        system.getMemory().setResult(1.0);
        add.perform(system);
        assertEquals(2.0, system.getMemory().getResult().get());
    }

    @Test
    public void shouldDoNothingIfNoResultInMemoryAndNoArguments() {
        add.perform(system);
        assertFalse(system.getMemory().getResult().isPresent());
    }

}