//package io.oasp.gastronomy.restaurant.staffmanagement.dataaccess.impl.dao;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.inject.Inject;
//import javax.inject.Named;
//
//import io.oasp.gastronomy.restaurant.staffmanagement.dataaccess.api.StaffMemberEntity;
//import io.oasp.gastronomy.restaurant.staffmanagement.dataaccess.api.dao.StaffMemberDao;
//
//@Named
//public abstract class StaffMemberDaoImpl implements StaffMemberDao {
//
//	@Inject
//	private StaffMemberDao staffMemberDao;
//
//	@Override
//	public Iterable<StaffMemberEntity> readAllEntities() {
//		return this.staffMemberDao.findAll();
//	}
//
//	@Override
//	public Optional<StaffMemberEntity> readOne(Long id) {
//		return this.staffMemberDao.findById(id);
//	}
//
//	@Override
//	public StaffMemberEntity readOneByLogin(String login) {
//		Iterable<StaffMemberEntity> entities = this.staffMemberDao.findAll();
//		for (StaffMemberEntity entity : entities) {
//			String logintemp = entity.getLogin();
//			if (logintemp.equals(login)) {
//				return entity;
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public StaffMemberEntity saveOne(StaffMemberEntity entity) {
//		return this.staffMemberDao.save(entity);
//	}
//
//	@Override
//	public Iterable<StaffMemberEntity> deleteOne(Long id) {
//		this.staffMemberDao.deleteById(id);
//		return this.staffMemberDao.findAll();
//	}
//
//	@Override
//	public StaffMemberEntity updateOne(Long id, StaffMemberEntity entity) {
//		List<StaffMemberEntity> entities = (List<StaffMemberEntity>) this.staffMemberDao.findAll();
//		Optional<StaffMemberEntity> optionalEntity = entities.stream().filter(x -> x.getId().equals(id)).findAny();
//		StaffMemberEntity oldEntity = optionalEntity.get();
//		oldEntity.setFirstName(entity.getFirstName());
//		oldEntity.setLastName(entity.getLastName());
//		oldEntity.setLogin(entity.getLogin());
//		return oldEntity;
//	}
//
//}
