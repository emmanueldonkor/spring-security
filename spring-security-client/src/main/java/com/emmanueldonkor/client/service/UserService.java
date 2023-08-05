package com.emmanueldonkor.client.service;

import com.emmanueldonkor.client.entity.User;
import com.emmanueldonkor.client.model.UserModel;

public interface UserService {
  User registerUser(UserModel userModel);
}
