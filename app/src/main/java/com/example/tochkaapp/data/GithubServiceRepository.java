package com.example.tochkaapp.data;


import com.example.tochkaapp.data.model.GithubResponse;
import com.example.tochkaapp.data.model.User;
import com.example.tochkaapp.data.remote.GithubService;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;


@Singleton
public class GithubServiceRepository {
    private final static int USERS_PER_PAGE = 30;
    private final GithubService mGithubService;

    @Inject
    public GithubServiceRepository(GithubService githubService) {
        this.mGithubService = githubService;
    }

    public Observable<GithubResponse> searchUser(String stringQuery) {
        return mGithubService.searchUsers(stringQuery, 1, USERS_PER_PAGE);
    }

    /**
     * Method load additional amount of data for
     * infinity Scroll Recycler Viw
     *
     * @param searchQuery for searching
     * @param page        to be loaded
     * @return {@link GithubResponse}
     */
    public Observable<GithubResponse> loadNextPageUserData(String searchQuery, int page) {
        return mGithubService.searchUsers(searchQuery, page, USERS_PER_PAGE);
    }

    public Observable<User> getUserProfile(String userLogin) {
        return mGithubService.getUser(userLogin);
    }
}
