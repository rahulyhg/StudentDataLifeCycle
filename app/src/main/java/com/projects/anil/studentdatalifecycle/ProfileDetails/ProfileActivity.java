package com.projects.anil.studentdatalifecycle.ProfileDetails;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.projects.anil.studentdatalifecycle.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProfileActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference myRef;
    EditText etName,etParent,etRoll,etAadhar,etEmailS,etDOB,etPrimaryNum,etSecondaryNum,etParentPrimary,etParentSecondary;
    EditText etTempAdd,etPerAdd,etGoal,etAmbition;
    String name,parent,roll,aadhar,emailS,dob,primaryNum,secondaryNum,parentPrimary;
    String parentsecondary,tempAdd,perAdd,goal,ambition;
    Button btnSubmit;
    ProgressDialog progressDialog;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Student Profile");
         database = FirebaseDatabase.getInstance();
         myRef = database.getReference("Profile");
         progressDialog=new ProgressDialog(this);
         spinner=findViewById(R.id.spinnerRoll);
         etName=findViewById(R.id.etName);
         etParent=findViewById(R.id.etParent);
         etAadhar=findViewById(R.id.etAadhar);
         etEmailS=findViewById(R.id.etEmail);
         etDOB=findViewById(R.id.etDob);
         etPrimaryNum=findViewById(R.id.etMobile1);
         etSecondaryNum=findViewById(R.id.etMobile2);
         etParentPrimary=findViewById(R.id.etparentMobile1);
         etParentSecondary=findViewById(R.id.etparentMobile2);
         etTempAdd=findViewById(R.id.etTempAddress);
         etPerAdd=findViewById(R.id.etPermAddress);
         etGoal=findViewById(R.id.etGoal);
         etAmbition=findViewById(R.id.etAmbition);
         btnSubmit=findViewById(R.id.btnsubmit);
         btnSubmit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 save();
                 progressDialog.dismiss();
             }
         });



    }
    private boolean isValidEmail(String Emailid) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(Emailid);
        return matcher.matches();
    }
    public boolean isValidNumber(String num)
    {
        if (num.length()==10) {
            return true;
        }
        return false;
    }
    public boolean isValidPassword(String pass) {
        if (pass.length() >= 6) {
            return true;
        }
        return false;
    }
    public boolean isValidPincode(String pin) {
        if (pin.length() == 6) {
            return true;
        }
        return false;
    }


    public void save(){

        name=etName.getText().toString().trim();
        parent=etParent.getText().toString().trim();
        roll=spinner.getSelectedItem().toString().trim();
        aadhar=etAadhar.getText().toString().trim();
        emailS=etEmailS.getText().toString().trim();
        dob=etDOB.getText().toString().trim();
        primaryNum=etPrimaryNum.getText().toString().trim();
        secondaryNum=etSecondaryNum.getText().toString().trim();
        parentPrimary=etParentPrimary.getText().toString().trim();
        parentsecondary=etParentSecondary.getText().toString().trim();
        tempAdd=etTempAdd.getText().toString().trim();
        perAdd=etPerAdd.getText().toString().trim();
        goal=etGoal.getText().toString().trim();
        ambition=etAmbition.getText().toString().trim();

        String id = myRef.push().getKey();
        ProfileModal profileModal = new ProfileModal(id, name, parent, roll, aadhar, emailS, dob, primaryNum, secondaryNum, parentPrimary, parentsecondary, tempAdd, perAdd, goal, ambition);
        myRef.child(id).setValue(profileModal);
        progressDialog.setMessage("Please Wait");
        progressDialog.show();

       /* if (!name.isEmpty() && !parent.isEmpty() && aadhar.isEmpty() &&
                !emailS.isEmpty() && !dob.isEmpty() && !primaryNum.isEmpty() && !secondaryNum.isEmpty() &&
                !parentPrimary.isEmpty() && !parentsecondary.isEmpty() && !tempAdd.isEmpty() &&
           !perAdd.isEmpty() && !goal.isEmpty() && !ambition.isEmpty()){


            *//*if (!roll.equals("Select Registration Number")) {



            }else {
                Toast.makeText(getApplicationContext(),"Please Select Registration Number",Toast.LENGTH_SHORT).show();

            }*//*
        }
        else {

            Toast.makeText(getApplicationContext(),"Please Enter All Details",Toast.LENGTH_SHORT).show();
        }*/



    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case android.R.id.home:
                onBackPressed();

                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
