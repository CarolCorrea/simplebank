package br.fatea.simplebank.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.fatea.simplebank.model.domains.CreditCard;

public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {
	public CreditCard findOneByNumber(String number);

}
