package com.example.mylab;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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

public class Register extends AppCompatActivity {

    private EditText etnama, etnohp, etemail, etusername, etpassword;
    private TextView tvStatus;
    private Button btn_register;
    private String URL = "http://192.168.1.8/API/register.php";
    private String nama, no_hp, email, username, password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etnama = findViewById(R.id.etnama);
        etnohp = findViewById(R.id.etnohp);
        etemail = findViewById(R.id.etemail);
        etusername = findViewById(R.id.etusername);
        etpassword = findViewById(R.id.etpassword);
        tvStatus = findViewById(R.id.tvStatus);
        nama = no_hp = email = username = password = "";
    }

    public void save(View view) {
        nama = etnama.getText().toString().trim();
        no_hp = etnohp.getText().toString().trim();
        email = etemail.getText().toString().trim();
        username = etusername.getText().toString().trim();
        password = etpassword.getText().toString().trim();
        if(!nama.equals("") && !no_hp.equals("") && !email.equals("") && !username.equals("") && !password.equals("")){
            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>()
            {
                @Override
                public void onResponse(String response) {
                    if (response.equals("success")) {
                        tvStatus.setText("Successfully registered.");
                        btn_register.setClickable(false);
                    } else if (response.equals("failure")) {
                        tvStatus.setText("Something went wrong!");
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse (VolleyError error) {
                    Toast.makeText(getApplicationContext(), error.toString().trim(), Toast.LENGTH_SHORT).show();
                }
            }){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> data = new HashMap<>();
                    data.put("nama", nama);
                    data.put("no_hp", no_hp);
                    data.put("email", email);
                    data.put("username", username);
                    data.put("password", password);
                    return data;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
            requestQueue.add(stringRequest);
        }
    }

    public void login(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}