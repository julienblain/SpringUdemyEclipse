package org.easystudy.spring.DAO;

import java.util.List;

import org.easystudy.spring.model.User;

public interface AppDAO {
	public List<User> listUsers();
}
