package com.example.tochkaapp.data.remote;

import com.example.tochkaapp.data.remote.model.User;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface GitHubRestRepository {

    @GET("/users/{username}")
    Observable<User> getUser(@Path("username") String username);
}
