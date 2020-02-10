/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserHandler
 * Author:   25610
 * Date:     2020/2/8 19:31
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_vue_report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.springboot_vue_report.entity.User;
import xyz.fusheng.springboot_vue_report.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<User> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        PageRequest request1 = PageRequest.of(page, size);
        return userRepository.findAll(request1);
    }

    @PostMapping("/save")
    public String save(@RequestBody User user) {
        User result = userRepository.save(user);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userRepository.findById(id).get();
    }

    @PutMapping("/update")
    public String update(@RequestBody User user) {
        User result = userRepository.save(user);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteByID(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }


}
