package com.emmutua.content_calender.repository;

import com.emmutua.content_calender.model.Content;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {

    List<Content> findAllByTitleContains(String keyword);
}
