package Service;

import Models.Group;

public interface GroupService  {
    void addGroup(Group newGroup);
    Group [] getAllGroup();
    void delete (long groupId);
     Group findById(long groupId);
     void findByGroupName(String groupName);

}
