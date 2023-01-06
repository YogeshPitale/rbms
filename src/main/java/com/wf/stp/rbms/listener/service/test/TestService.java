package com.wf.stp.rbms.listener.service.test;

import com.wf.stp.rbms.dto.dto.UpoDto;
import com.wf.stp.rbms.router.RuleService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements RuleService {
    @Override
    public boolean verify(UpoDto upoIn) {
        if (upoIn.getSplmtryData().getComWellsfargoEpdUpoAvroSplmtryData().getSplmtrydataWires().getComWellsfargoEpdUpoAvroSplmtryDataWIRES().getfREFnum() != null && upoIn.getSplmtryData().getComWellsfargoEpdUpoAvroSplmtryData().getSplmtrydataWires().getComWellsfargoEpdUpoAvroSplmtryDataWIRES().getfREFnum().getString().equals("GW00000005920951")) {
            return true;
        }
        return true;
    }

    @Override
    public UpoDto applyTransformation(UpoDto upoIn) {
        return upoIn;
    }

    @Override
    public int getPriority() {
        return 0;
    }
}
