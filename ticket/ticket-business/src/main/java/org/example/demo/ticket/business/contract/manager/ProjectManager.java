package org.example.demo.ticket.business.contract.manager;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

/**
 * Created by tsironneau on 03/08/2019.
 * <p>
 * ticket-spring
 */
public interface ProjectManager {
    Projet getProjet(Integer pId) throws NotFoundException;

    List<Projet> getListProjet();
}
