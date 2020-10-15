package com.example.clase1410;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        findViewById(R.id.btn_hola).setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
            Intent ir= new Intent(this, MainActivity.class);
            startActivity(ir);
            finish();
    }
}