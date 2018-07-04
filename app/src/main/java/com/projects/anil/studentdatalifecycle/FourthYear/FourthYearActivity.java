package com.projects.anil.studentdatalifecycle.FourthYear;

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

public class FourthYearActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference myRef;

    EditText etEng1I,etEng1E,etEng1C;
    EditText etM1I,etM1E,etM1C;
    EditText etM2I,etM2E,etM2C;
    EditText etEpI,etEpE,etEpC;
    EditText etPEI,etPEE,etPEC;
    EditText etEDI,etEDE,etEDC;
    EditText etECSLabI,etECSLabE,etECSLabC;
    EditText etEpLabI,etEplabE,etEpLabC;

    EditText etEng2I,etEng2E,etEng2C;
    EditText etM3I,etM3E,etM3C;
    EditText etEcI,etEcE,etEcC;
    EditText etEmI,etEmE,etEmC;
    EditText etCpI,etCpE,etCpC;



    EditText etSem1B,etSem1S,etSem2B,etSem2S;
    EditText etTotalB,etTotalS,etPercentage;
    Spinner spinner;
    Button btnSubmit;
    ProgressDialog progressDialog;
    String rollNumber;
    String  vlsiI,vlsiE,vlsiC;
    String  cnI,cnE,cnC;
    String  dipI,dipE,dipC;
    String  caoI,caoE,caoC;
    String  rsI,rsE,rsC;
    String  ocI,ocE,ocC;
    String  vlsiLabI,vlsiLabE,vlsiLabC;
    String  mweLabI,mweLabE,mweLabC;


    String cmcI,cmcE,cmcC;
    String emiI,emiE,emiC;
    String scI,scE,scC;
    String lpisdI,lpisdE,lpisdC;
    String projectI,projectE,projectC;


    String sem1B,sem1S,sem2B,sem2S,totalB,totlaS,totalPercentage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_year);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Fourth Year");
        progressDialog=new ProgressDialog(this);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Fourth Year");
        spinner=findViewById(R.id.spinnerRoll);
        etEng1I=findViewById(R.id.etEng1Internal);
        etEng1E=findViewById(R.id.etEng1External);
        etEng1C=findViewById(R.id.etEng1Credits);

        etM1I=findViewById(R.id.etM1Internal);
        etM1E=findViewById(R.id.etM1External);
        etM1C=findViewById(R.id.etM1Credits);

        etM2I=findViewById(R.id.etM2Internal);
        etM2E=findViewById(R.id.etM2External);
        etM2C=findViewById(R.id.etM2Credits);

        etEpI=findViewById(R.id.etEPInternal);
        etEpE=findViewById(R.id.etEPExternal);
        etEpC=findViewById(R.id.etEPCredits);

        etPEI=findViewById(R.id.etPEHVInternal);
        etPEE=findViewById(R.id.etPEHVExternal);
        etPEC=findViewById(R.id.etPEHVCredits);

        etEDI=findViewById(R.id.etEDInternal);
        etEDE=findViewById(R.id.etEDExternal);
        etEDC=findViewById(R.id.etEDCredits);

        etECSLabI=findViewById(R.id.etEcslabInternal);
        etECSLabE=findViewById(R.id.etEcslabExternal);
        etECSLabC=findViewById(R.id.etEcslabCredits);

        etEpLabI=findViewById(R.id.etEplabInternal);
        etEplabE=findViewById(R.id.etEplabExternal);
        etEpLabC=findViewById(R.id.etEplabCredits);


        etEng2I=findViewById(R.id.etEng2Internal);
        etEng2E=findViewById(R.id.etEng2External);
        etEng2C=findViewById(R.id.etEng2Credits);

        etM3I=findViewById(R.id.etM3Internal);
        etM3E=findViewById(R.id.etM3External);
        etM3C=findViewById(R.id.etM3Credits);

        etEcI=findViewById(R.id.etECInternal);
        etEcE=findViewById(R.id.etECExternal);
        etEcC=findViewById(R.id.etECCredits);

        etEmI=findViewById(R.id.etEMInternal);
        etEmE=findViewById(R.id.etEMExternal);
        etEmC=findViewById(R.id.etEMCredits);

        etCpI=findViewById(R.id.etCPInternal);
        etCpE=findViewById(R.id.etCPExternal);
        etCpC=findViewById(R.id.etCPCredits);



        etSem1B=findViewById(R.id.etsem1Backlogs);
        etSem1S=findViewById(R.id.etsem1scored);

        etSem2B=findViewById(R.id.etsem2Backlogs);
        etSem2S=findViewById(R.id.etsem2scored);

        etTotalB=findViewById(R.id.etTotalBacklogs);
        etTotalS=findViewById(R.id.etTotalscored);

        etPercentage=findViewById(R.id.etTotalPercentage);

        btnSubmit=findViewById(R.id.btnsubmit4);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
                progressDialog.dismiss();
                Toast.makeText(FourthYearActivity.this, "Added Successfully", Toast.LENGTH_SHORT).show();

                etEng1I.setText("");etEng1E.setText("");etEng1C.setText("");
                etM1I.setText("");etM1E.setText("");etM1C.setText("");
                etM2I.setText("");etM2E.setText("");etM2C.setText("");
                etEpI.setText("");etEpE.setText("");etEpC.setText("");
                etPEI.setText("");etPEE.setText("");etPEC.setText("");
                etEDI.setText("");etEDE.setText("");etEDC.setText("");
                etECSLabI.setText("");etECSLabE.setText("");etECSLabC.setText("");
                etEpLabI.setText("");etEplabE.setText("");etEpLabC.setText("");

                etEng2I.setText("");etEng2E.setText("");etEng2C.setText("");
                etM3I.setText("");etM3E.setText("");etM3C.setText("");
                etEcI.setText("");etEcE.setText("");etEcC.setText("");
                etEmI.setText("");etEmE.setText("");etEmC.setText("");
                etCpI.setText("");etCpE.setText("");etCpC.setText("");

                etSem1B.setText("");etSem1S.setText("");etSem2B.setText("");etSem2S.setText("");
                etTotalB.setText("");etTotalS.setText("");etPercentage.setText("");
            }
        });


    }
    public void save(){
        String id = myRef.push().getKey();
        rollNumber=spinner.getSelectedItem().toString().trim();
        vlsiI=etEng1I.getText().toString().trim();
        vlsiE=etEng1E.getText().toString().trim();
        vlsiC=etEng1C.getText().toString().trim();

        cnI=etM1I.getText().toString().trim();
        cnE=etM1E.getText().toString().trim();
        cnC=etM1C.getText().toString().trim();

        dipI=etM2I.getText().toString().trim();
        dipE=etM2E.getText().toString().trim();
        dipC=etM2C.getText().toString().trim();

        caoI=etEpI.getText().toString().trim();
        caoE=etEpE.getText().toString().trim();
        caoC=etEpC.getText().toString().trim();

        rsI=etPEI.getText().toString().trim();
        rsE=etPEE.getText().toString().trim();
        rsC=etPEC.getText().toString().trim();

        ocI=etEDI.getText().toString().trim();
        ocE=etEDE.getText().toString().trim();
        ocC=etEDC.getText().toString().trim();

        vlsiLabI=etECSLabI.getText().toString().trim();
        vlsiLabE=etECSLabE.getText().toString().trim();
        vlsiLabC=etECSLabC.getText().toString().trim();

        mweLabI=etEpLabI.getText().toString().trim();
        mweLabE=etEplabE.getText().toString().trim();
        mweLabC=etEpLabC.getText().toString().trim();


        cmcI=etEng2I.getText().toString().trim();
        cmcE=etEng2E.getText().toString().trim();
        cmcC=etEng2C.getText().toString().trim();

        emiI=etM3I.getText().toString().trim();
        emiE=etM3E.getText().toString().trim();
        emiC=etM3C.getText().toString().trim();

        scI=etEcI.getText().toString().trim();
        scE=etEcE.getText().toString().trim();
        scC=etEcC.getText().toString().trim();

        lpisdI=etEmI.getText().toString().trim();
        lpisdE=etEmE.getText().toString().trim();
        lpisdC=etEmC.getText().toString().trim();

        projectI=etCpI.getText().toString().trim();
        projectE=etCpE.getText().toString().trim();
        projectC=etCpC.getText().toString().trim();



        sem1B=etSem1B.getText().toString().trim();
        sem1S=etSem1S.getText().toString().trim();
        sem2B=etSem2B.getText().toString().trim();
        sem2S=etSem2S.getText().toString().trim();

        totalB=etTotalB.getText().toString().trim();
        totlaS=etTotalS.getText().toString().trim();
        totalPercentage=etPercentage.getText().toString().trim();


        FourthYear details = new FourthYear(id,rollNumber,vlsiI,vlsiE,vlsiC,
          cnI,cnE,cnC,
          dipI,dipE,dipC,
          caoI,caoE,caoC,
          rsI,rsE,rsC,
          ocI,ocE,ocC,
          vlsiLabI,vlsiLabE,vlsiLabC,
          mweLabI,mweLabE,mweLabC,
         cmcI,cmcE,cmcC,
         emiI,emiE,emiC,
         scI,scE,scC,
         lpisdI,lpisdE,lpisdC,
         projectI,projectE,projectC,
         sem1B,sem1S,sem2B,sem2S,totalB,totlaS,totalPercentage);

        myRef.child(id).setValue(details);
        progressDialog.setMessage("Please Wait");
        progressDialog.show();
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
