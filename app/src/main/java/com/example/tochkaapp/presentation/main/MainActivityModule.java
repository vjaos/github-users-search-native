package com.example.tochkaapp.presentation.main;

import androidx.lifecycle.ViewModelProvider;

import com.example.tochkaapp.ViewModelProviderFactory;
import com.example.tochkaapp.data.GithubServiceRepository;

import dagger.Module;
import dagger.Provides;

/**
 * Dependency injection module for MainActivity
 *
 * @author Osipov Vyacheslav
 * @see MainActivity
 * @see MainActivityViewModel
 * @see GithubServiceRepository
 */
@Module
public class MainActivityModule {

    @Provides
    MainActivityViewModel provideMainActivityViewModel(GithubServiceRepository repository) {
        return new MainActivityViewModel(repository);
    }

    @Provides
    ViewModelProvider.Factory provideMainActivityViewModelProvider(MainActivityViewModel mainActivityViewModel) {
        return new ViewModelProviderFactory<>(mainActivityViewModel);
    }

}
