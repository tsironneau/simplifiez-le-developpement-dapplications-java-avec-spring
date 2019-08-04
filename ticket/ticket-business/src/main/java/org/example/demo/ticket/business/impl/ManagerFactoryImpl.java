package org.example.demo.ticket.business.impl;

import org.example.demo.ticket.business.contract.ManagerFactory;
import org.example.demo.ticket.business.contract.manager.ProjectManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

/**
 * Created by tsironneau on 03/08/2019.
 * <p>
 * ticket-spring
 */
public class ManagerFactoryImpl implements ManagerFactory {

    private final ProjectManager _projectManager;
    private final TicketManager _ticketManager;

    public ManagerFactoryImpl(ProjectManager projectManager, TicketManager ticketManager) {
        _projectManager = projectManager;
        _ticketManager = ticketManager;
    }

    @Override
    public ProjectManager getProjectManager(){
        return _projectManager;
    }

    @Override
    public TicketManager getTicketManager() {
        return _ticketManager;
    }

}
