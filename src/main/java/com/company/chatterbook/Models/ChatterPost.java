package com.company.chatterbook.Models;

import java.util.Objects;

public class ChatterPost {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatterPost that = (ChatterPost) o;
        return text.equals(that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    public ChatterPost(String text) {
        this.text = text;
    }
}
