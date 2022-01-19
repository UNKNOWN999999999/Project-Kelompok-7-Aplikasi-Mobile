package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

        private EditText etusername, etpassword;
        private String username, password;
        private String URL = "http://192.168.1.8:80/API/login.php";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            username = password = "";
            etusername = findViewById(R.id.etusername);
            etpassword = findViewById(R.id.etpassword);
        }

        public void login(View view) {
            username = etusername.getText().toString().trim();
            password = etpassword.getText().toString().trim();
            if(!username.equals("") && !password.equals("")){
                StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("res", response);
                        if (response.equals("success")) {
                            Intent intent = new Intent(MainActivity.this, Home.class);
                            startActivity(intent);
                            finish();
                        } else if (response.equals("failure")) {
                            Toast.makeText(MainActivity.this, "Invalid Login Id/Password", Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.toString().trim(), Toast.LENGTH_SHORT).show();
                    }
                }){
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> data = new HashMap<>();
                        data.put("username", username);
                        data.put("password", password);
                        return data;
                    }
                };
                RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
                requestQueue.add(stringRequest);
            }else{
                Toast.makeText(this, "Fields can not be empty!", Toast.LENGTH_SHORT).show();
            }
        }

        public void register(View view) {
            Intent intent = new Intent(this, Register.class);
            startActivity(intent);
            finish();
        }
    }