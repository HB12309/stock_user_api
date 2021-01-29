package cn.ebing.stock.user.api.service;

import cn.ebing.stock.user.api.domain.response.UserResponse;

public interface UserService {
	UserResponse getById(Long id);
}
