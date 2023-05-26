package com.emmutua.content_calender.repository;

import com.emmutua.content_calender.model.Content;

import java.util.List;
import java.util.Optional;

//insert, delete, select, optional
public interface ContentDao {
    List<Content> selectContent();
    int insertContent(Content content);
    int deleteContent(int id);

    Optional<Content> selectContentById(int id);
}
