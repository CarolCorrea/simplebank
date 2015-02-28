package br.fatea.simplebank.controllers.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.fatea.simplebank.model.domains.SystemRole;
import br.fatea.simplebank.model.domains.SystemUser;
import br.fatea.simplebank.model.propertyeditors.SystemRolePropertyEditor;
import br.fatea.simplebank.model.services.SystemUserService;

@Controller
@RequestMapping("/users")
public class SystemUserController {

	@Autowired
	private SystemRolePropertyEditor systemRolePropertyEditor;
	
	@Autowired
	private SystemUserService systemUserService;

	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
	public String index() {
		return "users/index";
	}

	@RequestMapping(value = "/refresh.html", method = RequestMethod.GET)
	public String listUsers(Model model) {
		model.addAttribute("users", systemUserService.findAll());
		return "users/_table";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<SystemUser> find(@PathVariable Long id) {
		SystemUser systemUser = systemUserService.find(id);
		return new ResponseEntity<>(systemUser, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<String> update(@PathVariable Long id,
			@ModelAttribute @Valid SystemUser systemUser,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			String errorMessage = bindingResult.getFieldError()
					.getDefaultMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
		systemUserService.update(id, systemUser);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> save(
			@ModelAttribute @Valid SystemUser systemUser,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			String errorMessage = bindingResult.getFieldError()
					.getDefaultMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
		systemUserService.save(systemUser);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<SystemUser> delete(@PathVariable Long id) {
		systemUserService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(SystemRole.class, systemRolePropertyEditor);
	}
}
