package com.nutrisqproject.Project01.controller.dto;

import com.nutrisqproject.Project01.model.Comment;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
public class PostDto {
    private long id;
    private String title;
    private String content;
    private LocalDateTime created;
}
