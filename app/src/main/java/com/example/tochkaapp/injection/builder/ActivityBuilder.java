package com.example.tochkaapp.injection.builder;

import com.example.tochkaapp.presentation.main.MainActivity;
import com.example.tochkaapp.presentation.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    abstract MainActivity bindMainActivity();

}
