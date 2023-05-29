package com.emmutua.content_calender.repository;

import com.emmutua.content_calender.model.Content;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {

    List<Content> findAllByTitleContains(String keyword);
}
