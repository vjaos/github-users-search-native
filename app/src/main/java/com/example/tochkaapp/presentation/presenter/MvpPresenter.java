package com.example.tochkaapp.presentation.presenter;

import com.example.tochkaapp.presentation.view.MvpView;

public interface MvpPresenter<V extends MvpView> {
    void attachView(V mvpView);

    void detachView();
}
