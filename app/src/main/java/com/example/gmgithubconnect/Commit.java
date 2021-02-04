package com.example.gmgithubconnect;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Commit {
    @SerializedName("message")
    @Expose
    public String message;

    @SerializedName("author")
    @Expose
    public Author author;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "message='" + message + '\'' +
                ", author=" + author +
                '}';
    }
}
