package com.example.sampledragger2.module;

import android.content.Context;
import com.example.sampledragger2.qualifier.ApplicationContext;
import com.example.sampledragger2.scopes.ApplicationScope;
import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }


    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context provideContext() {
        return context;
    }
}
