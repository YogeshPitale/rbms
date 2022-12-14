package com.wf.stp.rbms.listener.service.debit;

import com.wf.stp.rbms.dto.upo.Upo;
import com.wf.stp.rbms.router.RuleService;
import org.springframework.stereotype.Service;

@Service
public class DebitService implements RuleService {

    @Override
    public boolean verify(Upo upoIn) {
        return true;
    }

    @Override
    public Upo applyTransformation(Upo upoIn) {
        return upoIn;
    }

    @Override
    public int getPriority() {
        return 2;
    }

}
