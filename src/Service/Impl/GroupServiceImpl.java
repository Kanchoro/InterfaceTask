package Service.Impl;

import DAO.Impl.GroupsDaoImpl;
import Models.Group;
import Service.GroupService;

public class GroupServiceImpl implements GroupService {

    private final GroupsDaoImpl groupDao;

    public GroupServiceImpl(GroupsDaoImpl groupDao) {
        this.groupDao = groupDao;
    }

    @Override
    public void addGroup(Group newGroup) {
        groupDao.addGroup(newGroup);
    }

    @Override
    public Group[] getAllGroup() {
        return groupDao.getAllGroup();
    }

    @Override
    public void delete(long groupId) {
        groupDao.delete(groupId);
    }

    @Override
    public Group findById(long groupId) {
        return groupDao.findById(groupId);
    }

    @Override
    public void findByGroupName(String groupName) {
        groupDao.findByGroupName(groupName);
    }

}
