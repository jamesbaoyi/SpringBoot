package cn.baoyi.controller;

import cn.baoyi.entity.User;
import cn.baoyi.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Administrator
 * @Description:
 * @Date: Created in 20:40 2017/6/24
 * @Modified By:
 */
@RestController

public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserRepository userRepository;

    @PostMapping()
    private User addUser(User user) {
        return userRepository.save(user);
    }
}
