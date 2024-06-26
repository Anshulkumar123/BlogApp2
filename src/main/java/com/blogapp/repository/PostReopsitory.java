package com.blogapp.repository;

import com.blogapp.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostReopsitory extends JpaRepository<Post, Long> {
}

