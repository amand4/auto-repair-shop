package br.edu.utfpr.autorepairshop.model.repository;

import br.edu.utfpr.autorepairshop.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
