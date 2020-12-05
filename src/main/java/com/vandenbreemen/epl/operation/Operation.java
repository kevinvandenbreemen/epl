package com.vandenbreemen.epl.operation;

import com.vandenbreemen.epl.system.System;

/**
 * An operation in the system.  Operations always act on inputs of type double.  Their putput
 * is later stored
 */
public interface Operation {

    void perform(System system, double... input);

}
