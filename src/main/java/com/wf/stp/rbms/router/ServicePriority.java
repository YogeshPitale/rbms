package com.wf.stp.rbms.router;

import java.util.Map;
import java.util.TreeMap;

public enum ServicePriority {
    CREDITSERVICE(2, "com.wf.stp.rbms.listener.service.credit.CreditService"),
    DEBITSERVICE(1, "com.wf.stp.rbms.listener.service.debit.DebitService"),
    ACCOUNTSERVICE(3, "com.wf.stp.rbms.listener.service.account.AccountService"),
    TESTSERVICE(4, "com.wf.stp.rbms.listener.service.test.TestService");

    private String service;
    private int priority;

    private static final Map<Integer, String> SERVICE_PRIORITY_MAP = new TreeMap<>();

    static {
        for (ServicePriority servicePriority : values()) {
            SERVICE_PRIORITY_MAP.put(servicePriority.priority, servicePriority.service);
        }
    }

    public static Map<Integer, String> getServicePriorityMap() {
        return new TreeMap<>(SERVICE_PRIORITY_MAP);
    }

    ServicePriority(int priority, String service) {
        this.priority = priority;
        this.service = service;
    }
}
