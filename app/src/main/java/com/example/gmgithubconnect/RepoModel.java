package com.example.gmgithubconnect;

import com.google.gson.annotations.SerializedName;

public class RepoModel {
    @SerializedName("name")
    public String repoName;

    public RepoModel(String repoName) {
        this.repoName = repoName;
    }
}
