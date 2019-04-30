package com.example.sampledragger2.component;

import android.content.Context;
import com.example.sampledragger2.MyApplication;
import com.example.sampledragger2.module.ContextModule;
import com.example.sampledragger2.module.RetrofitModule;
import com.example.sampledragger2.network.RetrofitNetworkInterface;
import com.example.sampledragger2.qualifier.ApplicationContext;
import com.example.sampledragger2.scopes.ApplicationScope;
import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {


    public RetrofitNetworkInterface getRetrofitNetworkInterface();


    @ApplicationContext
    public Context getContext();

    public void injectApplication(MyApplication myApplication);

}
