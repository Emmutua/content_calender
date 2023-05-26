package com.emmutua.content_calender.controller;

import com.emmutua.content_calender.model.Content;
import com.emmutua.content_calender.repository.ContentRepository;
import com.emmutua.content_calender.repository.ContentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/content")
@CrossOrigin
public class ContentController {
    private final ContentService contentService;
private final ContentRepository repository;
    public ContentController(ContentService contentService, ContentRepository repository) {
        this.contentService = contentService;
        this.repository = repository;
    }

    @GetMapping("")
    public List<Content> findAll() {
        return contentService.findAll();
    }

    @GetMapping("/{id}")
    public Content findById(@PathVariable Integer id) {
        return contentService.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content Not found"));
    }

    @GetMapping("/filter/{keyword}")
    public List<Content> findByTitle(@PathVariable String keyword){
        return repository.findAllByTitleContains(keyword);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@Valid @RequestBody Content content) {
        contentService.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Content content, @PathVariable Integer id) {
        if (!contentService.contentExists(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found");
        }
        contentService.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        if (!contentService.contentExists(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
contentService.delete(id);
    }
}

