package com.vandenbreemen.epl.operation;

import com.vandenbreemen.epl.system.System;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Optional;

public class Add implements Operation {

    @Override
    public void perform(System system, double... input) {
        double sum = 0.0;

        Optional<Double> lastResultOpt = system.getMemory().getResult();
        if(lastResultOpt.isPresent()) {
            sum += lastResultOpt.get();
        } else if (ArrayUtils.isEmpty(input)) {
            return;
        }

        if(ArrayUtils.isEmpty(input)) {
            sum += sum;
        }
        else {
            for (double i : input) {
                sum += i;
            }
        }

        system.getMemory().setResult(sum);
    }
}
