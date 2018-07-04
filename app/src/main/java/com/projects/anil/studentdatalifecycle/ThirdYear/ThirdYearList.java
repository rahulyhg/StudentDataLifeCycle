package com.projects.anil.studentdatalifecycle.ThirdYear;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.projects.anil.studentdatalifecycle.R;

import java.util.ArrayList;
import java.util.List;

public class ThirdYearList extends AppCompatActivity {
    Spinner spinner;
    private List<ThirdYear> eventItemList=new ArrayList<>();
    ListView listView;
    DatabaseReference myRef;
    String group;
    ThirdYearAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Third Year Results");
        myRef = FirebaseDatabase.getInstance().getReference("Third Year");
        listView=findViewById(R.id.liststudent);
        spinner=findViewById(R.id.spinnerRoll);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, final int i, long l) {
                group=spinner.getSelectedItem().toString().trim();

                Query query = myRef.orderByChild("rollNumber").equalTo(group);
                query.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        eventItemList.clear();
                        if (dataSnapshot.exists() || i==0) {
                            // dataSnapshot is the "issue" node with all children with id 0
                            for (DataSnapshot issue : dataSnapshot.getChildren()) {
                                // do something with the individual "issues"
                                ThirdYear details=issue.getValue(ThirdYear.class);
                                eventItemList.add(details);
                            }
                            adapter=new ThirdYearAdapter(ThirdYearList.this,eventItemList);
                            listView.setAdapter(adapter);
                        }
                        else{
                            Toast.makeText(ThirdYearList.this, "No Result Found", Toast.LENGTH_SHORT).show();
                            listView.setAdapter(null);
                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


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
