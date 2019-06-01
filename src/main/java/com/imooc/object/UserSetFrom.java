package com.imooc.object;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserSetFrom {
    private Set<User> users;

    private UserSetFrom(){
        users = new LinkedHashSet<User>();
        users.add(new User());
        users.add(new User());
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserSetFrom{" +
                "users=" + users +
                '}';
    }
}
