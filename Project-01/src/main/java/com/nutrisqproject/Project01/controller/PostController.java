package com.nutrisqproject.Project01.controller;

import com.nutrisqproject.Project01.controller.dto.PostDto;
import com.nutrisqproject.Project01.model.Post;
import com.nutrisqproject.Project01.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    public List<PostDto> getPosts(@RequestParam(required = false) Integer page) {
        int pageNumber = page != null && page >= 0 ? page : 0;
        return PostDtoMapper.mapToPostDtos(postService.getPosts(pageNumber));
    }

    @GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable long id) {

        return postService.getSinglePost(id);
    }
}
