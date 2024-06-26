package com.blogapp.service.impl;

import com.blogapp.dto.PostDto;
import com.blogapp.entity.Post;
import com.blogapp.repository.PostReopsitory;

import com.blogapp.services.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostReopsitory postReopsitory;

    public PostServiceImpl(PostReopsitory postReopsitory) {
        this.postReopsitory = postReopsitory;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescripation(postDto.getDescripation());
        post.setContent(postDto.getContent());
        Post savePost = postReopsitory.save(post);

        PostDto dto = new PostDto();
        dto.setId(savePost.getId());
        dto.setDescripation(savePost.getDescripation());
        dto.setContent(savePost.getContent());
        return dto;
    }
}
