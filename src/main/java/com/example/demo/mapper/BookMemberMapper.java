package com.example.demo.mapper;

import com.example.demo.entity.BookMember;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

/**
 * zhwu @ tmindtech.com on 2021/3/4.
 */
public interface BookMemberMapper extends Mapper<BookMember> {
    @Select("SELECT * FROM book_member LIMIT 1")
    BookMember getAll();
}
