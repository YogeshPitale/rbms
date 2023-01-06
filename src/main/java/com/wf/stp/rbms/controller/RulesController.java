package com.wf.stp.rbms.controller;

import com.wf.stp.rbms.dto.upo.Upo;
import com.wf.stp.rbms.listener.service.ServiceRouter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/api/v1")
public class RulesController {

    @Autowired
    ServiceRouter serviceRouter;

    @PostMapping("/applyRules")
    public ResponseEntity<Upo> applyRules(@RequestBody Upo upoIn) throws Exception {
        Upo upoOut = serviceRouter.applySanitization(upoIn);
        return new ResponseEntity<>(upoOut, HttpStatus.OK);
    }
}
