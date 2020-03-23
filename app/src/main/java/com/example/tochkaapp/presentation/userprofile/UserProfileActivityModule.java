package com.example.tochkaapp.presentation.userprofile;

import androidx.lifecycle.ViewModelProvider;

import com.example.tochkaapp.ViewModelProviderFactory;
import com.example.tochkaapp.data.GithubServiceRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class UserProfileActivityModule {

    @Provides
    UserProfileActivityViewModel provideUserProfileActivityViewModel(GithubServiceRepository repository) {
        return new UserProfileActivityViewModel(repository);
    }

    @Provides
    ViewModelProvider.Factory provideUserProfileActivityViewModelProvider(UserProfileActivityViewModel userProfileActivityViewModel) {
        return new ViewModelProviderFactory<>(userProfileActivityViewModel);
    }
}
