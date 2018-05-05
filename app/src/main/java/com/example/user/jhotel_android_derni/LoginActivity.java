package com.example.user.jhotel_android_derni;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText emailInput = (EditText) findViewById(R.id.email_input);
        final EditText passInput = (EditText) findViewById(R.id.password_input);
        final Button loginButton = (Button) findViewById(R.id.login);
        final TextView registerClickable = (TextView) findViewById(R.id.register_here);

        loginButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = emailInput.getText().toString();
                final String password = passInput.getText().toString();
                Response.Listener<String> responseListener = new Response.Listener<String> () {
                    @Override
                    public void onResponse(String response) {
                        try{
                            JSONObject jsonResponse = new JSONObject(response);
                            if(jsonResponse!=null) {
                                AlertDialog builder = new AlertDialog.Builder(LoginActivity.this).create();
                                //AlertDialog test = new AlertDialog.Builder(LoginActivity.this).create();
                                builder.setMessage("Login Success");
                                builder.show();
                                //builder.wait(1200);
                                //builder.dismiss();
                                //launchIntent();
                            }
                        } catch (JSONException e) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                            builder.setMessage("Login Failed.").create().show();
                        }
                    }
                };
                LoginRequest loginRequest = new LoginRequest(email,password,responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);

            }
        });

        registerClickable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regisInt = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(regisInt);
            }
        });
    }

    /*
    private void launchIntent() {
        Intent it = new Intent(LoginActivity.this, MainActivity.class);
        it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(it);
    }*/
}

