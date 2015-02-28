package br.fatea.simplebank.model.propertyeditors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.fatea.simplebank.model.repositories.SystemRoleRepository;

@Component
public class SystemRolePropertyEditor extends PropertyEditorSupport {
	
	@Autowired private SystemRoleRepository repository;
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			long id = Long.parseLong(text);
			setValue(repository.findOne(id));
		} catch(Exception ex) {
			throw new IllegalArgumentException("Invalid System Role ID");
		}
	}
}
