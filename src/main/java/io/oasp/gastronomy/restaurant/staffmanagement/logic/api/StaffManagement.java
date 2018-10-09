package io.oasp.gastronomy.restaurant.staffmanagement.logic.api;

import io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto;

public interface StaffManagement {

	Iterable<StaffMemberEto> findAllStaffMembers();

	StaffMemberEto findStaffMemberById(Long id);

	StaffMemberEto findStaffMemberByLogin(String login);

	StaffMemberEto saveStaffMember(StaffMemberEto eto);

	Iterable<StaffMemberEto> deleteStaffMember(Long id);

}
