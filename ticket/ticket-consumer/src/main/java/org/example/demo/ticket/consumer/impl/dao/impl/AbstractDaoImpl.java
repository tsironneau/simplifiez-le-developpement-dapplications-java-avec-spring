package org.example.demo.ticket.consumer.impl.dao.impl;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

/**
 * Created by tsironneau on 17/08/2019.
 * <p>
 * ticket-spring
 */
public abstract class AbstractDaoImpl {

    @Inject
    @Named("dataSourceTicket")
    private DataSource _dataSource;

    public DataSource getDataSource() {
        return _dataSource;
    }
}
