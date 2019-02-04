package com.bridgelabz.fundoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.fundoo.user.dto.UserDTO;
import com.bridgelabz.fundoo.user.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
	public User findByEmail(UserDTO userDTO);

}
