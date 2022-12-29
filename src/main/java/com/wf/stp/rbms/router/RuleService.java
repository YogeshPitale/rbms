package com.wf.stp.rbms.router;

import com.wf.stp.rbms.dto.upo.Upo;

public interface RuleService {
    public boolean verify(Upo upoIn);

    public default Upo applyTransformation(Upo upoIn) {
        return upoIn;
    }

    public int getPriority();
}
