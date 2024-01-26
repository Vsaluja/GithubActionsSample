package com.nscc.fullstk.actionsdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActionsdemoApplicationTest {

    @Test
    void sum() {
        ActionsdemoApplication actionsDemo = new ActionsdemoApplication();
       int retValue = actionsDemo.sum(1, 1);

       assertEquals(2, retValue);
    }
}