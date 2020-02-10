/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserRepository
 * Author:   25610
 * Date:     2020/2/8 19:14
 * Description: User 用户仓库类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_vue_report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.fusheng.springboot_vue_report.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
