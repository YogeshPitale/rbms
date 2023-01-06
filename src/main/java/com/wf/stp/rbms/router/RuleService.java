package com.wf.stp.rbms.router;

import com.wf.stp.rbms.dto.upo.Upo;
import com.wf.stp.rbms.exception.RbmsException;

public interface RuleService {
    public boolean verify(Upo upoIn) throws Exception;

    public default Upo applyTransformation(Upo upoIn) throws RbmsException {
        return upoIn;
    }

    public int getPriority();
}
