package com.wf.stp.rbms.router;

import com.wf.stp.rbms.dto.dto.UpoDto;

public interface RuleService {
    public boolean verify(UpoDto upoIn);

    public default UpoDto applyTransformation(UpoDto upoIn) {
        return upoIn;
    }

    public int getPriority();
}
