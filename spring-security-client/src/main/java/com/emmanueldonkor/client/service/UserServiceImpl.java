package com.emmanueldonkor.client.service;

import com.emmanueldonkor.client.entity.User;
import com.emmanueldonkor.client.model.UserModel;
import com.emmanueldonkor.client.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepository;
  @Override
  public User registerUser(UserModel userModel){
    User user = new User();
    user.setEmail(userModel.getEmail());
    user.setFirstName(userModel.getFirstName());
    user.setLastName(userModel.getLastName());
    user.setRole("USER");
    user.setPassword((userModel.getPassword()));
    return null;
  }
}
