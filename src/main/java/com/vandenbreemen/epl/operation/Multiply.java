package com.vandenbreemen.epl.operation;

import com.vandenbreemen.epl.system.System;
import org.apache.commons.lang3.ArrayUtils;

public class Multiply implements Operation {

    @Override
    public void perform(System system, double... input) {
        if(ArrayUtils.isEmpty(input)) {
            system.getMemory().getResult().ifPresent(currentResult -> {
                system.getMemory().setResult(currentResult * currentResult);
            });
            return;
        }

        double product = system.getMemory().getResult().isPresent() ?
                system.getMemory().getResult().get() : 1.0;

        for(double v : input) {
            product *= v;
        }
        system.getMemory().setResult(product);
    }
}
