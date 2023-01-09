package com.wf.stp.rbms.listener.service.account;

import com.wf.stp.rbms.dto.upo.Upo;
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
    public boolean verify(Upo upoIn) {
        if (upoIn.getWfPmtOrdrPrcg().getComWellsfargoEpdUpoAvroWfPmtOrdrPrcg().getPmtRail().getString().equals("CEO")) {
            return true;
        }
        return false;
    }

    @Override
    public Upo applyTransformation(Upo upoIn) {
        String agendaGroup = upoIn.getPmtInf().getComWellsfargoEpdUpoAvroPmtInf().getDbtrAgt().getComWellsfargoEpdUpoAvroDbtrAgt().getFinInstnId2().getComWellsfargoEpdUpoAvroFinInstnId2().getBicfi();
        Upo upoOut = upoDroolsService.getTransformedUpo(upoIn, Optional.of(agendaGroup));
        return upoOut;
    }

    @Override
    public int getPriority() {
        return 1;
    }

}
