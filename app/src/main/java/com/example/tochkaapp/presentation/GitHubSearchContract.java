package com.example.tochkaapp.presentation;

import com.example.tochkaapp.data.remote.model.User;
import com.example.tochkaapp.presentation.presenter.MvpPresenter;
import com.example.tochkaapp.presentation.view.MvpView;

import java.util.List;

public interface GitHubSearchContract {

    interface View extends MvpView {
        void showErrorMessage(String message);

        void showSearchResult(List<User> users);

        void showLoading();

        void hidLoading();
    }


    interface Presenter extends MvpPresenter<View> {
        void search(String name);
    }
}
