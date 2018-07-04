package com.projects.anil.studentdatalifecycle.ProfileDetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;

import com.projects.anil.studentdatalifecycle.R;

public class ProfileListActivity extends AppCompatActivity {
EditText etName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Student Profile");

        etName=(EditText)findViewById(R.id.etName);
        etName.setText("suresh");
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
