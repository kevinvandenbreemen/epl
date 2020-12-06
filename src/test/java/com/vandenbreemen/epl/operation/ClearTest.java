package com.vandenbreemen.epl.operation;

import com.vandenbreemen.epl.system.Clear;
import com.vandenbreemen.epl.system.System;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ClearTest {

    private Clear clear;
    private System system;

    @BeforeEach
    public void setup() {
        this.clear = new Clear();
        this.system = new System();
    }

    @Test
    public void shouldClearCurrentStorage() {
        system.getMemory().setResult(10.0);
        clear.perform(system);
        assertFalse(system.getMemory().getResult().isPresent());
    }

}
