package com.polytech.repository;

import com.polytech.business.Post;

import java.util.List;

/**
 * Created by CODING on 13/03/2017.
 */
public interface PostRepository {

    void save(Post post);

    List<Post> fetchAll();
}
