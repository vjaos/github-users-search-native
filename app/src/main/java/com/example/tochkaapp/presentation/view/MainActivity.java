package com.example.tochkaapp.presentation.view;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tochkaapp.data.remote.model.User;
import com.example.tochkaapp.presentation.GitHubSearchContract;

import java.util.List;

public class MainActivity extends AppCompatActivity implements GitHubSearchContract.View {
    @Override
    public void showErrorMessage(String message) {

    }

    @Override
    public void showSearchResult(List<User> users) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hidLoading() {

    }
}
