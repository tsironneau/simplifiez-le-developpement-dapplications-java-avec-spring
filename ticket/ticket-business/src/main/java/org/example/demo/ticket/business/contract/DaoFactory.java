package org.example.demo.ticket.business.contract;

import org.example.demo.ticket.consumer.impl.dao.contract.ProjectDao;
import org.example.demo.ticket.consumer.impl.dao.contract.TicketDao;

/**
 * Created by tsironneau on 04/08/2019.
 * <p>
 * ticket-spring
 */
public interface DaoFactory {
    ProjectDao getProjectDao();

    TicketDao getTicketDao();
}
