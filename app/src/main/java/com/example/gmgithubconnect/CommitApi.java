package com.example.gmgithubconnect;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface CommitApi {
  //  @GET("users/rachitiitr/repos")
   // Single<List<RepoModel>> get_repo_names(); //Returns list of repos

  @GET()
  Single<List<RepoModel>> get_repo_names(@Url String url); //Returns list of repos

  @GET()
  Single<List<CommitModel>> get_repo_commit(@Url String url);//Returns commits of repos


}
