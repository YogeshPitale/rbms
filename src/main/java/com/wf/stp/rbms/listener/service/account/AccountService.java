package com.wf.stp.rbms.listener.service.account;

import com.wf.stp.rbms.dto.upo.Upo;
import com.wf.stp.rbms.exception.RbmsException;
import com.wf.stp.rbms.exception.SystemErrors;
import com.wf.stp.rbms.router.RuleService;
import com.wf.stp.rbms.service.UpoDroolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements RuleService {

    @Autowired
    private UpoDroolsService upoDroolsService;

    @Override
    public boolean verify(Upo upoIn) throws RbmsException {
        if (upoIn.getWfPmtOrdrPrcg().getComWellsfargoEpdUpoAvroWfPmtOrdrPrcg().getPmtRail() != null) {
            if (upoIn.getWfPmtOrdrPrcg().getComWellsfargoEpdUpoAvroWfPmtOrdrPrcg().getPmtRail().getString().equals("CEO")) {
                return true;
            }
        } else {
            throw new RbmsException(SystemErrors.FIELD_IS_NULL);
        }

        return false;
    }

    @Override
    public Upo applyTransformation(Upo upoIn) {
        Upo upoOut = upoDroolsService.getTransformedUpo(upoIn);
        return upoOut;
    }

    @Override
    public int getPriority() {
        return 1;
    }

}
