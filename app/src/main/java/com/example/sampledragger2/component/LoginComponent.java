package com.example.sampledragger2.component;


import com.example.sampledragger2.LoginActivity;
import com.example.sampledragger2.scopes.ActivityScope;
import dagger.Component;

@ActivityScope
@Component(dependencies = ApplicationComponent.class)
public interface LoginComponent {

    void injectLoginActivity(LoginActivity loginActivity);
}
