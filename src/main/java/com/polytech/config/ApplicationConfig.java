package com.polytech.config;

import com.polytech.business.Post;
import com.polytech.business.PublicationService;
import com.polytech.business.PublicationServiceImp;
import com.polytech.repository.PostRepository;
import com.polytech.repository.PostRepositoryImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by CODING on 13/03/2017.
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public PostRepository postRepository() {
        return new PostRepositoryImp();
    }

    @Bean
    public PublicationService publicationService(PostRepository postRepository) {
        return new PublicationServiceImp(postRepository);
    }

}
