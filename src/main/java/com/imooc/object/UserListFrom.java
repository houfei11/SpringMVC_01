package com.imooc.object;

import java.util.List;

public class UserListFrom {

    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "UserListFrom{" +
                "userList=" + userList +
                '}';
    }
}
