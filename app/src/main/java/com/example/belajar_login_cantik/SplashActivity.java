package com.example.belajar_login_cantik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    ImageView Logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //input logo
        Logo= (ImageView) findViewById(R.id.logoSplash);

        Animation anim = AnimationUtils.loadAnimation(this,R.anim.fadein);

        Logo.startAnimation(anim);

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
