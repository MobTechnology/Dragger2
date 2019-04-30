package com.example.sampledragger2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.example.sampledragger2.component.ApplicationComponent;
import com.example.sampledragger2.component.DaggerLoginComponent;
import com.example.sampledragger2.component.LoginComponent;
import com.example.sampledragger2.module.LoginActivityModule;
import com.example.sampledragger2.network.GetUserData;
import com.example.sampledragger2.network.RetrofitNetworkInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import javax.inject.Inject;

public class LoginActivity extends Activity {

    LoginComponent loginComponent;

    @Inject
    public RetrofitNetworkInterface retrofitNetworkInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApplicationComponent applicationComponent = MyApplication.get(this).getApplicationComponent();


        loginComponent = DaggerLoginComponent.builder()
                .applicationComponent(applicationComponent).build();

        loginComponent.injectLoginActivity(this);


        retrofitNetworkInterface.getUserData().enqueue(new Callback<GetUserData>() {
            @Override
            public void onResponse(Call<GetUserData> call, Response<GetUserData> response) {
                String getData = response.body().getData().getFirstName();

                Log.d("response", "response hellooo"+getData);
            }

            @Override
            public void onFailure(Call<GetUserData> call, Throwable t) {

            }
        });

    }
}

