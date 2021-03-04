package com.example.demo.controller;

import com.example.demo.entity.BookMember;
import com.example.demo.mapper.BookMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * zhwu @ tmindtech.com on 2021/3/4.
 */
@RestController
public class BookMemberController {
    @Autowired
    private BookMemberMapper mapper;

    @GetMapping
    public void getAll() {
        BookMember member = mapper.selectByPrimaryKey(11852);
        System.out.println(member);
        BookMember all = mapper.getAll();
        System.err.println(all);
    }
}
