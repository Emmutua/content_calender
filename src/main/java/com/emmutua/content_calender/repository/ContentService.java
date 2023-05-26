package com.emmutua.content_calender.repository;


import com.emmutua.content_calender.model.Content;
import com.emmutua.content_calender.model.Status;
import com.emmutua.content_calender.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

//keep collection of the pieces of content in memory
@Service
public class ContentService {
    private final ContentDao contentDao;

    public ContentService(ContentDao contentDao) {
        this.contentDao = contentDao;
    }

    public List<Content> findAll() {
        return contentDao.selectContent();
    }

    public Optional<Content> findById(Integer id) {
        return contentDao.selectContentById(id);
    }


    public void save(Content content) {
        contentDao.insertContent(content);
    }

    public void delete(Integer id){
        contentDao.deleteContent(id);
    }

    public boolean contentExists(Integer id) {
        return contentDao.selectContentById(id).stream().filter(c -> c.id().equals(id)).count() == 1;
    }
}


