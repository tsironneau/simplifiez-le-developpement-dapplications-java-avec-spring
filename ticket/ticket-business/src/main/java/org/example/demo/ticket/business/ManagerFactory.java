package org.example.demo.ticket.business;

import org.example.demo.ticket.business.contract.manager.ProjectManager;
import org.example.demo.ticket.business.manager.TicketManager;

/**
 * Created by tsironneau on 03/08/2019.
 * <p>
 * ticket-spring
 */
public class ManagerFactory {

    private ProjectManager _projectManager;
    private TicketManager _ticketManager;

    public ManagerFactory(ProjectManager projectManager, TicketManager ticketManager) {
        _projectManager = projectManager;
        _ticketManager = ticketManager;
    }

    public ProjectManager getProjectManager(){
        return _projectManager;
    }

    public TicketManager getTicketManager() {
        return _ticketManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        _projectManager = projectManager;
    }

    public void setTicketManager(TicketManager ticketManager) {
        _ticketManager = ticketManager;
    }
}
