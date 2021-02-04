package com.example.gmgithubconnect;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommitModel {

    @SerializedName("sha")
    @Expose
    public String commit_id;

    @SerializedName("commit")
    @Expose
    public Commit commit;

    public String getCommit_id() {
        return commit_id;
    }

    public void setCommit_id(String commit_id) {
        this.commit_id = commit_id;
    }

    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    @Override
    public String toString() {
        return "CommitModel{" +
                "commit_id='" + commit_id + '\'' +
                ", commit=" + commit +
                '}';
    }
}
