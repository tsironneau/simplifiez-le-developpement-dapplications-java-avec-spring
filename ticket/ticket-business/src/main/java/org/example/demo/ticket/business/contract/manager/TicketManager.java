package org.example.demo.ticket.business.contract.manager;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

import java.util.List;

/**
 * Created by tsironneau on 03/08/2019.
 * <p>
 * ticket-spring
 */
public interface TicketManager {
    Ticket getTicket(Long pNumero) throws NotFoundException;

    List<Ticket> getListTicket(RechercheTicket pRechercheTicket);

    int getCountTicket(RechercheTicket pRechercheTicket);
}
