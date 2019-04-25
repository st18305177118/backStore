package com.shi.bookstore.repository;

import com.shi.bookstore.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther shiTu
 * @date 2019/4/22 15:51
 */
public interface ManagerRepository extends JpaRepository<Manager,Long> {

//    boolean login(String name, String password);
      Manager getByPasswordAndName(String name,String password);

    //    /*
//    * 登录
//    */
//    @Query("select * from tb_manager where name =?1 and password =?2")
//    public Manager findByManagerNameAndPwd(String name,String password);
//
//    /*
//    * 注册
//    */
//    @Query("select * from tb_manager where name = ?1")
//    public Manager findByManagerName(String name);
//
//    /*查询全部*/
//    List<Manager> findAll();


}
