package com.vandenbreemen.epl.system;

import java.util.Optional;

/**
 * Memory of the system
 */
public class Memory {

    private Double result;

    public Optional<Double> getResult() {
        return Optional.ofNullable(result);
    }

    public void setResult(double result) {
        this.result = result;
    }
}
