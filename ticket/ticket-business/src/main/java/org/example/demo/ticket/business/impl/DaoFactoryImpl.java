package org.example.demo.ticket.business.impl;

import org.example.demo.ticket.consumer.impl.dao.contract.ProjectDao;
import org.example.demo.ticket.consumer.impl.dao.contract.TicketDao;

/**
 * Created by tsironneau on 04/08/2019.
 * <p>
 * ticket-spring
 */
public class DaoFactoryImpl implements org.example.demo.ticket.business.contract.DaoFactory {

    private ProjectDao _projectDao;
    private TicketDao _ticketDao;

    @Override
    public ProjectDao getProjectDao() {
        return _projectDao;
    }

    public void setProjectDao(ProjectDao projectDao) {
        _projectDao = projectDao;
    }

    @Override
    public TicketDao getTicketDao() {
        return _ticketDao;
    }

    public void setTicketDao(TicketDao ticketDao) {
        _ticketDao = ticketDao;
    }
}
