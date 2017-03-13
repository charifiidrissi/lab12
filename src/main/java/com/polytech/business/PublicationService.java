package com.polytech.business;

import com.polytech.repository.PostRepository;
import com.polytech.repository.PostRepositoryImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CODING on 13/03/2017.
 */
public class PublicationService {
     private PostRepository postRepository ;
    private List<Post> db = new ArrayList<Post>();

    public PublicationService(PostRepository postRepo)
    {
        postRepository = postRepo;
    }



    public void post(Post post) {
        postRepository.save(post);

    }



    public List<Post> fetchAll() {

    return postRepository.fetchAll();
    }
}
