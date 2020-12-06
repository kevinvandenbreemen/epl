package com.vandenbreemen.epl.system;

import com.vandenbreemen.epl.operation.Operation;

public class Clear implements Operation {

    @Override
    public void perform(System system, double... input) {
        system.getMemory().clearResult();
    }
}
