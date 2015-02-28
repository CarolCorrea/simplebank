package br.fatea.simplebank.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.fatea.simplebank.model.domains.SystemRole;

@Repository
public interface SystemRoleRepository extends CrudRepository<SystemRole, Long> {
}
