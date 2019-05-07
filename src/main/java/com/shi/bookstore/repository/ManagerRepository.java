package com.shi.bookstore.repository;

import com.shi.bookstore.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @auther shiTu
 * @date 2019/4/22 15:51
 */
public interface ManagerRepository extends JpaRepository<Manager,Long> {
      /*登录*/
      @Query("select manager from Manager manager where manager.name=?1 and manager.password=?2")
      Manager findByPasswordAndName(String name,String password);
      /*注册,判断是否已经注册*/
      @Query("select manager from Manager manager where manager.name=?1")
      Manager findByName(String name);
//      @Query("select manager from Manager manager where manager.name=?1 and manager.password=?2")
//      Manager findByName(String name);
}
