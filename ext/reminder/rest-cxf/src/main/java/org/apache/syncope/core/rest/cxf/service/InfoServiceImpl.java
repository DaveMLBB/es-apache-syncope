package org.apache.syncope.core.rest.cxf.service;


import org.apache.syncope.common.lib.to.Info;
import org.apache.syncope.common.rest.api.service.ReminderService;
import org.apache.syncope.core.logic.InfoLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl extends  AbstractServiceImpl implements ReminderService {

    @Autowired
    private InfoLogic infoLogic;
    @Override
    public Info getInfo() {
        return infoLogic.getInfo();
    }
}
