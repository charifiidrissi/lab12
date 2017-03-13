package com.polytech.view;

import com.polytech.business.Post;
import com.polytech.business.PublicationService;
import com.polytech.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by CODING on 13/03/2017.
 */
public class MainForBean {


    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(ApplicationConfig.class);
       PublicationService publicationService= applicationContext.getBean(PublicationService.class);



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
