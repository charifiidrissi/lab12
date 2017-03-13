package com.polytech.business;

import java.util.List;

/**
 * Created by CODING on 13/03/2017.
 */
public interface PublicationService {
    void post(Post post);

    List<Post> fetchAll();
}
