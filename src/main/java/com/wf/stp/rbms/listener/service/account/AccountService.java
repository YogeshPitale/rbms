package com.wf.stp.rbms.listener.service.account;

import com.wf.stp.rbms.dto.dto.UpoDto;
import com.wf.stp.rbms.router.RuleService;
import com.wf.stp.rbms.service.UpoDroolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements RuleService {

    @Autowired
    private UpoDroolsService upoDroolsService;

    @Override
    public boolean verify(UpoDto upoIn) {
        if (upoIn.getWfPmtOrdrPrcg().getComWellsfargoEpdUpoAvroWfPmtOrdrPrcg().getPmtRail().getString().equals("CEO")) {
            return true;
        }
        return false;
    }

    @Override
    public UpoDto applyTransformation(UpoDto upoIn) {
        UpoDto upoOut = upoDroolsService.getTransformedUpo(upoIn);
        return upoIn;
    }

    @Override
    public int getPriority() {
        return 1;
    }

}
