package com.projects.anil.studentdatalifecycle;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends Activity {
     FirebaseAuth mAuth;
     EditText em,ps;
     FirebaseAuth.AuthStateListener authStateListener;
     ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        mAuth = FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);

        authStateListener=new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser()!=null){
                    startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                }

            }
        };
        em=findViewById(R.id.etEmailLogin);
        ps=findViewById(R.id.etPasswordLogin);
        Button button=(Button)findViewById(R.id.btnSignIn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
            }
        });
    }
    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(authStateListener);


    }
    private boolean isValidEmail(String Emailid) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(Emailid);
        return matcher.matches();
    }
    public void next(){
        String email=em.getText().toString().trim();
        if (!isValidEmail(email)) {
            em.setError("Invalid Email");
        }
        String password=ps.getText().toString().trim();
        if(TextUtils.isEmpty(email))
        {
            if ((TextUtils.isEmpty(password)))
                Toast.makeText(this,"Please Enter Email and Password",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(email))
        {
            Toast.makeText(this,"Please Enter Email",Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password))
        {
            Toast.makeText(this,"Plesse Enter Password",Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("Please Wait");
        progressDialog.show();
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(!task.isSuccessful()){
                            progressDialog.dismiss();
                            Toast.makeText(LoginActivity.this,"Please Enter Valid Email/Password",Toast.LENGTH_SHORT).show();

                        }
                        else {
                            progressDialog.dismiss();
                            finish();
                            startActivity(new Intent(getApplicationContext(),HomeActivity.class));

                        }

                    }
                });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(LoginActivity.this);
        } else {
            builder = new AlertDialog.Builder(LoginActivity.this);
        }
        builder.setTitle("Confirm Exit ")
                .setMessage("Do you want to exit app?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
