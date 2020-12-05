package com.vandenbreemen.epl.system;

/**
 * System environment in which operations are being performed
 */
public class System {

    private Memory memory;

    public System() {
        this.memory = new Memory();
    }

    public Memory getMemory() {
        return memory;
    }
}
