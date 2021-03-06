package cn.ebing.stock.user.api.controller;

import cn.ebing.stock.user.api.domain.response.UserResponse;
import cn.ebing.stock.user.api.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UserController {

	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@ResponseBody
	@GetMapping("/{userId}")
	public UserResponse getById(
			@PathVariable Long userId
	) {
		return userService.getById(userId);
	}
}