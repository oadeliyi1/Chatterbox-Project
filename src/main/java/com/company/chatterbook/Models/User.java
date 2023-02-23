package com.company.chatterbook.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String name;


    private List<ChatterPost> chatterPosts= new ArrayList<>();


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public List<ChatterPost> getChatterPosts() {
        return chatterPosts;
    }

    public void setChatterPosts(List<ChatterPost> chatterPosts) {
        this.chatterPosts = chatterPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) && chatterPosts.equals(user.chatterPosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, chatterPosts);
    }

}
