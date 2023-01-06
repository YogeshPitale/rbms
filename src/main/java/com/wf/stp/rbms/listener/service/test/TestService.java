package com.wf.stp.rbms.listener.service.test;

import com.wf.stp.rbms.dto.upo.Upo;
import com.wf.stp.rbms.exception.RbmsException;
import com.wf.stp.rbms.exception.SystemErrors;
import com.wf.stp.rbms.router.RuleService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements RuleService {
    @Override
    public boolean verify(Upo upoIn) throws Exception {
        if (upoIn.getSplmtryData().getComWellsfargoEpdUpoAvroSplmtryData().getSplmtrydataWires().getComWellsfargoEpdUpoAvroSplmtryDataWIRES().getfREFnum() != null) {
            if (upoIn.getSplmtryData().getComWellsfargoEpdUpoAvroSplmtryData().getSplmtrydataWires().getComWellsfargoEpdUpoAvroSplmtryDataWIRES().getfREFnum().getString().equals("GW00000005920951")) {
                return true;
            }
        } else {
            throw new RbmsException(SystemErrors.FIELD_IS_NULL);
        }
        return false;
    }

    @Override
    public Upo applyTransformation(Upo upoIn) {
        return upoIn;
    }

    @Override
    public int getPriority() {
        return 4;
    }
}
