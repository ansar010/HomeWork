package com.bridgelabz.fundoo.services;

import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.bridgelabz.fundoo.repository.IUserRepository;
import com.bridgelabz.fundoo.user.dto.UserDTO;
import com.bridgelabz.fundoo.user.model.User;

@Service("userService")
public class ImpUserService implements IUserService 
{
	@Autowired
	BCryptPasswordEncoder bCryptEncoder;
	IUserRepository userRepository;
	ModelMapper modelMapper;
	
	@Override
	public void saveUser(UserDTO userDTO) {
		userDTO.setPassword(bCryptEncoder.encode(userDTO.getPassword()));
		User user = modelMapper.map(userDTO, User.class);
		userRepository.save(user);
	}

	@Override
	public boolean isUserAlreadyPresent(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return false;
	}

}
