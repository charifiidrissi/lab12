package com.polytech.business;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CODING on 13/03/2017.
 */
public class Post {

    private String content;
    public Post(String s) {
        content =s;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
