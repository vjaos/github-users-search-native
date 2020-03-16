package com.example.tochkaapp.data;

import com.example.tochkaapp.data.remote.model.User;

import java.util.List;

import rx.Observable;

public interface UserService {
    Observable<List<User>> searchUser(String searchQuery);
}
