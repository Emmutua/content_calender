package com.emmutua.content_calender.repository;

import com.emmutua.content_calender.model.Content;
import com.emmutua.content_calender.model.Status;
import com.emmutua.content_calender.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//keep collection of the pieces of content in memory
@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    ContentCollectionRepository() {

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(
                        c ->
                                c.id().equals(id))
                                 .findFirst();
    }



    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    @PostConstruct
    public void init(){
        Content content = new Content(
                1,
                "MyFirstBlogPOst",
                "MyFirstBlogPost",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                ""
        );
        Content d = new Content(
                2,
                "MyFirstBlogPOst",
                "MyFirstBlogPost",
                Status.IN_PROGRESS,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                ""
        );
        contentList.add(content);
        contentList.add(d);
    }

    public boolean contentExists(Integer id) {
        return contentList.stream().filter(
                c ->
                        c.id().equals(id)).count() == 1;
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }
}

