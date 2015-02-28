package br.fatea.simplebank.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.fatea.simplebank.exceptions.NoSystemUserFoundException;
import br.fatea.simplebank.model.domains.SystemUser;
import br.fatea.simplebank.model.repositories.SystemUserRepository;

@Service
public class SystemUserService {
	
	@Autowired private SystemUserRepository repository;
	@Autowired private BCryptPasswordEncoder encoder;
	@Transactional
	public void save(SystemUser user) {
		user.setPassword(encoder.encode(user.getPassword()));
		repository.save(user);
	}
	
	@Transactional
	public void update(Long id, SystemUser user) {
		SystemUser persistedUser = find(id);
		persistedUser.setUsername(user.getUsername());
		persistedUser.setPassword(encoder.encode(user.getPassword()));
		persistedUser.setRoles(user.getRoles());
	}
	
	@Transactional
	public void delete(Long id) {
		SystemUser user = find(id);
		repository.delete(user);
	}
	
	public SystemUser find(Long id) {
		SystemUser user = repository.findOne(id);
		if (user==null) throw new NoSystemUserFoundException();
		return user;
	}
	
	public Iterable<SystemUser> findAll() {
		return repository.findAll();
	}
}
