package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.ManagerFactory;

/**
 * Created by tsironneau on 03/08/2019.
 * <p>
 * ticket-spring
 */
public abstract class AbstractResource {

    private static ManagerFactory s_managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return s_managerFactory;
    }

    public static void setManagerFactory(ManagerFactory managerFactory) {
        s_managerFactory = managerFactory;
    }
}
