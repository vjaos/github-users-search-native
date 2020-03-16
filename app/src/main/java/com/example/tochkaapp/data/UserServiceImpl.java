package com.example.tochkaapp.data;

import com.example.tochkaapp.data.remote.GitHubRestRepository;
import com.example.tochkaapp.data.remote.model.User;

import java.util.List;

import rx.Observable;

public class UserServiceImpl implements UserService {
    private GitHubRestRepository gitHubRestRepository;

    public UserServiceImpl(GitHubRestRepository gitHubRestRepository) {
        this.gitHubRestRepository = gitHubRestRepository;
    }

    @Override
    public Observable<List<User>> searchUser(String searchQuery) {
        return null;
    }
}
