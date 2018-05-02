package com.example.user.jhotel_android_derni;
import com.example.user.jhotel_android_derni.*;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText emailInput = (EditText) findViewById(R.id.email);
        final EditText passInput = (EditText) findViewById(R.id.password);
        final EditText nameInput = (EditText) findViewById(R.id.full_name);
        final Button buttonRegis = (Button) findViewById(R.id.register);


        buttonRegis.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View V) {
                final String email = emailInput.getText().toString();
                final String password = passInput.getText().toString();
                final String name = nameInput.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String> () {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonResponse = new JSONObject(response);
                            if(jsonResponse!=null) {
                                AlertDialog.Builder builder=new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Registration Success")
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                            builder.setMessage("Registration Failed.")
                                    .create()
                                    .show();
                        }

                    }


                };
                RegisterRequest registerRequest = new RegisterRequest(name,email,password,responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });
    }


}
