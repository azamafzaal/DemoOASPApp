package io.oasp.gastronomy.restaurant.staffmanagement.logic.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.springframework.stereotype.Component;

import io.oasp.gastronomy.restaurant.staffmanagement.dataaccess.api.StaffMemberEntity;
import io.oasp.gastronomy.restaurant.staffmanagement.dataaccess.api.dao.StaffMemberDao;
import io.oasp.gastronomy.restaurant.staffmanagement.logic.api.StaffManagement;
import io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto;

@Component
public class StaffManagementImpl implements StaffManagement {

	@Inject
	private StaffMemberDao staffMemberDao;

	@Inject
	private Mapper mapper;

	@Override
	public Iterable<StaffMemberEto> findAllStaffMembers() {
		List<StaffMemberEntity> entities = (List<StaffMemberEntity>) this.staffMemberDao.findAll();
		Iterable<StaffMemberEto> etos = entities.stream().map(x -> mapToTransferObject(x)).collect(Collectors.toList());
		return etos;
	}

	@Override
	public StaffMemberEto findStaffMemberById(Long id) {
		Optional<StaffMemberEntity> optional = this.staffMemberDao.findById(id);
		StaffMemberEntity entity = optional.get();
		return mapToTransferObject(entity);
	}

	// TODO: Implementation for this method not available
	@Override
	public StaffMemberEto findStaffMemberByLogin(String login) {
		StaffMemberEntity entity = this.staffMemberDao.readOneByLogin(login);
		return mapToTransferObject(entity);
	}

	@Override
	public StaffMemberEto saveStaffMember(StaffMemberEto eto) {
		StaffMemberEntity entity = mapToEntity(eto);
		this.staffMemberDao.save(entity);
		return mapToTransferObject(entity);
	}

	@Override
	public Iterable<StaffMemberEto> deleteStaffMember(Long id) {
		this.staffMemberDao.deleteById(id);
		List<StaffMemberEntity> entities = (List<StaffMemberEntity>) this.staffMemberDao.findAll();
		Iterable<StaffMemberEto> etos = entities.stream().map(x -> mapToTransferObject(x)).collect(Collectors.toList());
		return etos;
	}

	private StaffMemberEto mapToTransferObject(StaffMemberEntity entity) {
		return this.mapper.map(entity, StaffMemberEto.class);
	}

	private StaffMemberEntity mapToEntity(StaffMemberEto eto) {
		return this.mapper.map(eto, StaffMemberEntity.class);
	}

}
