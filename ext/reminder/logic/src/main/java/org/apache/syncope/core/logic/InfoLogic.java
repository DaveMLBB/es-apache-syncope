package org.apache.syncope.core.logic;

import org.apache.syncope.common.lib.to.Info;
import org.springframework.stereotype.Component;

@Component
public class InfoLogic {

    public Info getInfo() {
        return new Info(
                0
                , "operation successful");
    }
}
