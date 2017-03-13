package com.polytech.view;

import com.polytech.business.Post;
import com.polytech.business.PublicationService;
import com.polytech.business.PublicationServiceImp;
import com.polytech.repository.PostRepository;
import com.polytech.repository.PostRepositoryImp;

/**
 * Created by CODING on 13/03/2017.
 */
public class Main {
    //first Commit
    public static void main(String[] args) {

        System.out.println("Coucou Moi !!!");

        PostRepository postRepo = new PostRepositoryImp();
        PublicationService publicationService = new PublicationServiceImp(postRepo);
        Post post = new Post("Coucou Moi");
        Post post2 = new Post("Coucou Moi 2");


        // List<Post> posts = publicationService.fetchAll();

        //  System.out.println(posts);


        publicationService.post(post);
        publicationService.post(post2);

        System.out.println("---------");
        System.out.println(publicationService.fetchAll());


    }
}
