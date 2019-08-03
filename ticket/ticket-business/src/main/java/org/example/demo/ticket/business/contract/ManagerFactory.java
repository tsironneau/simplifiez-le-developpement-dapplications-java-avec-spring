package org.example.demo.ticket.business.contract;

import org.example.demo.ticket.business.contract.manager.ProjectManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

/**
 * Created by tsironneau on 03/08/2019.
 * <p>
 * ticket-spring
 */
public interface ManagerFactory {
    ProjectManager getProjectManager();

    TicketManager getTicketManager();
}
