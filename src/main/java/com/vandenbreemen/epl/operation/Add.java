package com.vandenbreemen.epl.operation;

import com.vandenbreemen.epl.system.System;

import java.util.Optional;

public class Add implements Operation {

    @Override
    public void perform(System system, double... input) {
        double sum = 0.0;

        Optional<Double> lastResultOpt = system.getMemory().getResult();
        if(lastResultOpt.isPresent()) {
            sum += lastResultOpt.get();
        } else if (input == null || input.length == 0) {
            return;
        }

        if(input == null || input.length == 0) {
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
