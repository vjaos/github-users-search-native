package com.example.tochkaapp.injection.component;

import android.app.Application;

import com.example.tochkaapp.TochkaApp;
import com.example.tochkaapp.injection.builder.ActivityBuilder;
import com.example.tochkaapp.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(TochkaApp app);
}
