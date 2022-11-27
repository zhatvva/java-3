package service.impl;

import dao.DAOProvider;
import dao.UsersBaseDAO;
import model.User;
import service.UserBaseService;

public class UserBaseServiceImpl implements UserBaseService {

    public UserBaseServiceImpl() {
    }

    @Override
    public void addUser(User user) {
        UsersBaseDAO usersBaseDAO;

        usersBaseDAO = DAOProvider.getInstance().getUsersBaseDAO();
        usersBaseDAO.getUsers().put(user.getUsername(), user);
        usersBaseDAO.writeUsersToXml();
    }

}
