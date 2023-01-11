package com.wf.stp.rbms.listener.service.account;

import com.wf.stp.rbms.dto.dto.UpoDto;
import com.wf.stp.rbms.router.RuleService;
import com.wf.stp.rbms.service.UpoDroolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        String agendaGroup = upoIn.getPmtInf().getComWellsfargoEpdUpoAvroPmtInf().getDbtrAgt().getComWellsfargoEpdUpoAvroDbtrAgt().getFinInstnId2().getComWellsfargoEpdUpoAvroFinInstnId2().getBicfi();
        UpoDto upoOut = upoDroolsService.getTransformedUpo(upoIn, Optional.of(agendaGroup));
        return upoOut;
    }

    @Override
    public int getPriority() {
        return 1;
    }

}
