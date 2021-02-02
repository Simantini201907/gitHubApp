package com.example.gmgithubconnect;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class CommitListService {
    private static final String BASE_URL = "https://api.github.com";
    private CommitApi repo_api;
    public CommitListService() {
        repo_api = new Retrofit.Builder()
                   .baseUrl(BASE_URL)
                   .addConverterFactory(GsonConverterFactory.create())
                   .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                   .build()
                   .create(CommitApi.class);
    }

    public Single<List<RepoModel>> getRepos() {
      return repo_api.get_repo_names();
    }

    //Create more functions to call more URLS.
}
