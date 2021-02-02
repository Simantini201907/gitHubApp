package com.example.gmgithubconnect;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface CommitApi {
    @GET("users/rachitiitr/repos")
    Single<List<RepoModel>> get_repo_names(); //Returns list of repos



}
