package com.example.a19501151_trananhkhoa_androidexam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSignin;
    private TextView txtEmail, txtPassword;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignin = findViewById(R.id.btnSignin);
        txtEmail = findViewById(R.id.txtEmailSignin);
        txtPassword = findViewById(R.id.txtPasswordSignin);
        mAuth = FirebaseAuth.getInstance();

        btnSignin.setOnClickListener(v -> {
            checkSignIn();
        });
    }

    private void checkSignIn() {
        String email = txtEmail.getText().toString();
        String password = txtPassword.getText().toString();

        if(email.isEmpty()) {
            txtEmail.setError("Email không được rỗng !");
            txtEmail.requestFocus();
        }
        else if(password.isEmpty()) {
            txtPassword.setError("Mật khẩu không được rỗng !");
            txtPassword.requestFocus();
        }
        else {
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()) {
                        Toast.makeText(MainActivity.this, "Đăng nhập thành công !", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, ListBussinessScreen.class));
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Error: " + task.getException(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}