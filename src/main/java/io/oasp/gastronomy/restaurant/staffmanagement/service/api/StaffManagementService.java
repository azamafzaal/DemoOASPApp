package io.oasp.gastronomy.restaurant.staffmanagement.service.api;

import org.springframework.stereotype.Service;

import io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto;

@Service
public interface StaffManagementService {

	Iterable<StaffMemberEto> readAllStaffMembers();

	StaffMemberEto readOneStaffMember(Long id);

	StaffMemberEto readOneStaffMemberByLogin(String login);

	StaffMemberEto saveOneStaffMember(StaffMemberEto eto);

	Iterable<StaffMemberEto> deleteOneStaffMember(Long id);

}
