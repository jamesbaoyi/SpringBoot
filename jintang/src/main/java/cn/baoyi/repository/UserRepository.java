package cn.baoyi.repository;

import cn.baoyi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:Administrator
 * @Description:
 * @Date: Created in 19:45 2017/6/28
 * @Modified By:
 */
public interface UserRepository extends JpaRepository<User, String> {


}
