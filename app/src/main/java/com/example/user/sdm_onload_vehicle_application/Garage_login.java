package com.example.user.sdm_onload_vehicle_application;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Garage_login extends AppCompatActivity
{

    Button button1,button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_login);


        button1=(Button)findViewById(R.id.activity_main_loginButton_garegegg);
        button2=(Button)findViewById(R.id.garage_new_account);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplication(),MainActivity_garage.class);
                startActivity(intent);
                finish();
            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplication(),Create_new_account_Garage.class);
                startActivity(intent);
                finish();
            }
        });

    }


}


