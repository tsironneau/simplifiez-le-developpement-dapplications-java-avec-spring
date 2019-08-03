package org.example.demo.ticket.webapp.listener;

import org.example.demo.ticket.business.contract.ManagerFactory;
import org.example.demo.ticket.business.impl.ManagerFactoryImpl;
import org.example.demo.ticket.business.impl.manager.ProjectManagerImpl;
import org.example.demo.ticket.business.impl.manager.TicketManagerImpl;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by tsironneau on 03/08/2019.
 * <p>
 * ticket-spring
 */
public class DependencyInjectionListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        final ManagerFactory managerFactory = new ManagerFactoryImpl(
                new ProjectManagerImpl(),
                new TicketManagerImpl()
        );
        AbstractResource.setManagerFactory(managerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
