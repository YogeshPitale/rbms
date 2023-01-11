package com.wf.stp.rbms.listener.service.credit;

import com.wf.stp.rbms.dto.dto.UpoDto;
import com.wf.stp.rbms.router.RuleService;
import org.springframework.stereotype.Service;

@Service
public class CreditService implements RuleService {

    @Override
    public boolean verify(UpoDto upoIn) {
        return false;
    }

    @Override
    public UpoDto applyTransformation(UpoDto upoIn) {
        return upoIn;
    }

}
