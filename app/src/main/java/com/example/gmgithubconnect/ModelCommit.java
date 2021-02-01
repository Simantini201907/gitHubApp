package com.example.gmgithubconnect;

public class ModelCommit {
    public String commit_author;
    public String commit_id;
    public String  commit_message;


    public ModelCommit(String commit_author, String commit_id, String commit_message) {
        this.commit_author = commit_author;
        this.commit_id = commit_id;
        this.commit_message = commit_message;
    }

    public String getCommit_author() {
        return commit_author;
    }

    public void setCommit_author(String commit_author) {
        this.commit_author = commit_author;
    }

    public String getCommit_id() {
        return commit_id;
    }

    public void setCommit_id(String commit_id) {
        this.commit_id = commit_id;
    }

    public String getCommit_message() {
        return commit_message;
    }

    public void setCommit_message(String commit_message) {
        this.commit_message = commit_message;
    }
}
