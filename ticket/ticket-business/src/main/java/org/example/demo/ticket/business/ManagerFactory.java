package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjectManager;
import org.example.demo.ticket.business.manager.TicketManager;

/**
 * Created by tsironneau on 03/08/2019.
 * <p>
 * ticket-spring
 */
public class ManagerFactory {

    public ProjectManager getProjectManager(){
        return new ProjectManager();
    }

}
