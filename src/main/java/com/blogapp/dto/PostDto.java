package com.blogapp.dto;

import lombok.Data;

@Data
public class PostDto {
    private long id;
    private String title;
    private String descripation;
    private String content;
}
