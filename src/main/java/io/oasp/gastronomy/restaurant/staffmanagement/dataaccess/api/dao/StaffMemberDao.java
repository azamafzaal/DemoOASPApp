package io.oasp.gastronomy.restaurant.staffmanagement.dataaccess.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.oasp.gastronomy.restaurant.staffmanagement.dataaccess.api.StaffMemberEntity;

@Repository
public interface StaffMemberDao extends CrudRepository<StaffMemberEntity, Long> {

	StaffMemberEntity readOneByLogin(String login);

}
