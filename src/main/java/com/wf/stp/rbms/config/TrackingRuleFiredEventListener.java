package com.wf.stp.rbms.config;

import org.drools.core.WorkingMemory;
import org.drools.core.event.AfterActivationFiredEvent;
import org.drools.core.event.DefaultAgendaEventListener;
import org.kie.api.definition.rule.Rule;
import org.kie.api.event.rule.AfterMatchFiredEvent;

import java.util.ArrayList;
import java.util.List;

public class TrackingRuleFiredEventListener extends DefaultAgendaEventListener {

    private List<String> activationList = new ArrayList<String>();

    @Override
    public void afterMatchFired(AfterMatchFiredEvent event) {
        Rule rule = event.getMatch().getRule();
        String ruleName = rule.getName();
        activationList.add(ruleName);
        System.out.println("Rule fired: " + ruleName);
    }

    public boolean isRuleFired(String ruleName) {
        for (String rule : activationList) {
            if (ruleName.equalsIgnoreCase(rule)) {
                return true;
            }
        }
        return false;
    }

    public void reset() {
        activationList.clear();
    }

    public final List<String> getActivationList() {
        return activationList;
    }
}
