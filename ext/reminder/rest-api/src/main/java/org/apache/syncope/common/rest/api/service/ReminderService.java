package org.apache.syncope.common.rest.api.service;

import org.apache.syncope.common.lib.to.Info;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("users/self/response")
public interface ReminderService extends JAXRSService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Info getInfo();

}
