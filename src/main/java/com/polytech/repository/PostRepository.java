package com.polytech.repository;

import com.polytech.business.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CODING on 13/03/2017.
 */
public class PostRepository {




    List<Post> db = new ArrayList<Post>();
    public PostRepository(){

    }
    public void save(Post post){
       db.add(post);
    }

    public List<Post> fetchAll(){
        return db;
    }
}
