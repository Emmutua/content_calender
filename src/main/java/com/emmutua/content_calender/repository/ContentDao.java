package com.emmutua.content_calender.repository;

import com.emmutua.content_calender.model.Content;

import java.util.List;
import java.util.Optional;

//insert, delete, select, optional
public interface ContentDao {
    List<Content> selectContent();
    Integer insertContent(Content content);
    Integer deleteContent(Integer id);

    Optional<Content> selectContentById(Integer id);
}
