package io.oasp.gastronomy.restaurant.staffmanagement.service.impl;

import java.lang.invoke.MethodHandles;

import javax.inject.Inject;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.oasp.gastronomy.restaurant.staffmanagement.common.exception.ResourceNotFoundException;
import io.oasp.gastronomy.restaurant.staffmanagement.logic.api.StaffManagement;
import io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto;
import io.oasp.gastronomy.restaurant.staffmanagement.service.api.StaffManagementService;

@RestController
public class StaffManagementServiceImpl implements StaffManagementService {

	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Inject
	StaffManagement staffManagement;

	@RequestMapping(value = "/members", method = RequestMethod.GET)
	public Iterable<StaffMemberEto> readAllStaffMembers() {
		LOG.info("Showing all staff members!");
		return this.staffManagement.findAllStaffMembers();
	}

	@RequestMapping(value = "/members/{id}", method = RequestMethod.GET)
	public StaffMemberEto readOneStaffMember(@PathVariable Long id) {
		LOG.info("Showing one staff member!");
		if (!this.staffManagement.findStaffMemberById(id).equals(null)) {
			return this.staffManagement.findStaffMemberById(id);
		} else {
			throw new ResourceNotFoundException("Could not find the desired resource");
		}

	}

	@RequestMapping(value = "/members/login")
	public StaffMemberEto readOneStaffMemberByLogin(@RequestParam(value = "login", required = false) String login) {
		LOG.info("Showing one staff member with its login!");
		if (!this.staffManagement.findStaffMemberByLogin(login).equals(null)) {
			return this.staffManagement.findStaffMemberByLogin(login);
		} else {
			throw new ResourceNotFoundException("Could not find the desired resource");
		}
	}

	@RequestMapping(value = "/members", method = RequestMethod.POST)
	public StaffMemberEto saveOneStaffMember(@Valid @RequestBody StaffMemberEto eto) {
		LOG.info("Saving one staff member in the database!");
		return this.staffManagement.saveStaffMember(eto);
	}

	@RequestMapping(value = "/members/{id}")
	public Iterable<StaffMemberEto> deleteOneStaffMember(@PathVariable Long id) {
		LOG.info("deleting one staff member!");
		return this.staffManagement.deleteStaffMember(id);
	}

}
