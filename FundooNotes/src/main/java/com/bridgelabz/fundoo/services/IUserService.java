package com.bridgelabz.fundoo.services;

import com.bridgelabz.fundoo.user.dto.UserDTO;

public interface IUserService
{
	public void saveUser(UserDTO userDTO);
	public boolean isUserAlreadyPresent(UserDTO userDTO);
}
