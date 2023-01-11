package com.wf.stp.rbms.listener.service.debit;

import com.wf.stp.rbms.dto.dto.UpoDto;
import com.wf.stp.rbms.router.RuleService;
import org.springframework.stereotype.Service;

@Service
public class DebitService implements RuleService {

    @Override
    public boolean verify(UpoDto upoIn) {
        return true;
    }

    @Override
    public UpoDto applyTransformation(UpoDto upoIn) {
        return upoIn;
    }

}
