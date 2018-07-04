package com.projects.anil.studentdatalifecycle.FirstYear;

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

public class FirstYearActivity extends AppCompatActivity {
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
    EditText etWsI,etWsE,etWsC;

    EditText etEng2I,etEng2E,etEng2C;
    EditText etM3I,etM3E,etM3C;
    EditText etEcI,etEcE,etEcC;
    EditText etEmI,etEmE,etEmC;
    EditText etCpI,etCpE,etCpC;
    EditText etNaI,etNaE,etNaC;
    EditText etECSLab2I,etECSLab2E,etECSLab2C;
    EditText etEcLabI,etEclabE,etEcLabC;
    EditText etcpLabI,etcplabE,etcpLabC;


    EditText etSem1B,etSem1S,etSem2B,etSem2S;
    EditText etTotalB,etTotalS,etPercentage;
    Spinner spinner;
    Button btnSubmit;
    ProgressDialog progressDialog;
    String rollNumber;
     String  Eng1I,Eng1E,Eng1C;
     String  M1I,M1E,M1C;
     String  M2I,M2E,M2C;
     String  EpI,EpE,EpC;
     String  PEI,PEE,PEC;
     String  EDI,EDE,EDC;
     String  ECSLabI,ECSLabE,ECSLabC;
     String  EpLabI,EplabE,EpLabC;
     String  WsI,WsE,WsC;

     String Eng2I,Eng2E,Eng2C;
     String M3I,M3E,M3C;
     String EcI,EcE,EcC;
     String EmI,EmE,EmC;
     String CprI,CprE,CprC;
     String NaI,NaE,NaC;
     String ECSLab2I,ECSLab2E,ECSLab2C;
     String EcLabI,EclabE,EcLabC;
     String cpLabI,cplabE,cpLabC;

     String sem1B,sem1S,sem2B,sem2S,totalB,totlaS,totalPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("First Year");
        progressDialog=new ProgressDialog(this);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("First Year");
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

        etWsI=findViewById(R.id.etWorkshopInternal);
        etWsE=findViewById(R.id.etWorkshopExternal);
        etWsC=findViewById(R.id.etWorkshopCredits);



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

        etNaI=findViewById(R.id.etNAInternal);
        etNaE=findViewById(R.id.etNAExternal);
        etNaC=findViewById(R.id.etNACredits);

        etECSLab2I=findViewById(R.id.etEcslab2Internal);
        etECSLab2E=findViewById(R.id.etEcslab2External);
        etECSLab2C=findViewById(R.id.etEcslab2Credits);

        etEcLabI=findViewById(R.id.etEclabInternal);
        etEclabE=findViewById(R.id.etEclabExternal);
        etEcLabC=findViewById(R.id.etEclabCredits);

        etcpLabI=findViewById(R.id.etCplabInternal);
        etcplabE=findViewById(R.id.etCplabExternal);
        etcpLabC=findViewById(R.id.etCplabCredits);

        etSem1B=findViewById(R.id.etsem1Backlogs);
        etSem1S=findViewById(R.id.etsem1scored);

        etSem2B=findViewById(R.id.etsem2Backlogs);
        etSem2S=findViewById(R.id.etsem2scored);

        etTotalB=findViewById(R.id.etTotalBacklogs);
        etTotalS=findViewById(R.id.etTotalscored);

        etPercentage=findViewById(R.id.etTotalPercentage);

        btnSubmit=findViewById(R.id.btnSubmit1);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
                progressDialog.dismiss();
                Toast.makeText(FirstYearActivity.this, "Added Successfully", Toast.LENGTH_SHORT).show();
                 etEng1I.setText("");etEng1E.setText("");etEng1C.setText("");
                 etM1I.setText("");etM1E.setText("");etM1C.setText("");
                 etM2I.setText("");etM2E.setText("");etM2C.setText("");
                 etEpI.setText("");etEpE.setText("");etEpC.setText("");
                 etPEI.setText("");etPEE.setText("");etPEC.setText("");
                 etEDI.setText("");etEDE.setText("");etEDC.setText("");
                 etECSLabI.setText("");etECSLabE.setText("");etECSLabC.setText("");
                 etEpLabI.setText("");etEplabE.setText("");etEpLabC.setText("");
                 etWsI.setText("");etWsE.setText("");etWsC.setText("");

                 etEng2I.setText("");etEng2E.setText("");etEng2C.setText("");
                 etM3I.setText("");etM3E.setText("");etM3C.setText("");
                 etEcI.setText("");etEcE.setText("");etEcC.setText("");
                 etEmI.setText("");etEmE.setText("");etEmC.setText("");
                 etCpI.setText("");etCpE.setText("");etCpC.setText("");
                 etNaI.setText("");etNaE.setText("");etNaC.setText("");
                 etECSLab2I.setText("");etECSLab2E.setText("");etECSLab2C.setText("");
                 etEcLabI.setText("");etEclabE.setText("");etEcLabC.setText("");
                 etcpLabI.setText("");etcplabE.setText("");etcpLabC.setText("");

                 etSem1B.setText("");etSem1S.setText("");etSem2B.setText("");etSem2S.setText("");
                 etTotalB.setText("");etTotalS.setText("");etPercentage.setText("");

            }
        });





    }
    public void save(){
        String id = myRef.push().getKey();
        rollNumber=spinner.getSelectedItem().toString().trim();
        Eng1I=etEng1I.getText().toString().trim();
        Eng1E=etEng1E.getText().toString().trim();
        Eng1C=etEng1C.getText().toString().trim();

        M1I=etM1I.getText().toString().trim();
        M1E=etM1E.getText().toString().trim();
        M1C=etM1C.getText().toString().trim();

        M2I=etM2I.getText().toString().trim();
        M2E=etM2E.getText().toString().trim();
        M2C=etM2C.getText().toString().trim();

        EpI=etEpI.getText().toString().trim();
        EpE=etEpE.getText().toString().trim();
        EpC=etEpC.getText().toString().trim();

        PEI=etPEI.getText().toString().trim();
        PEE=etPEE.getText().toString().trim();
        PEC=etPEC.getText().toString().trim();

        EDI=etEDI.getText().toString().trim();
        EDE=etEDE.getText().toString().trim();
        EDC=etEDC.getText().toString().trim();

        ECSLabI=etECSLabI.getText().toString().trim();
        ECSLabE=etECSLabE.getText().toString().trim();
        ECSLabC=etECSLabC.getText().toString().trim();

        EpLabI=etEpLabI.getText().toString().trim();
        EplabE=etEplabE.getText().toString().trim();
        EpLabC=etEpLabC.getText().toString().trim();

        WsI=etWsI.getText().toString().trim();
        WsE=etWsE.getText().toString().trim();
        WsC=etWsC.getText().toString().trim();

        Eng2I=etEng2I.getText().toString().trim();
        Eng2E=etEng2E.getText().toString().trim();
        Eng2C=etEng2C.getText().toString().trim();

        M3I=etM3I.getText().toString().trim();
        M3E=etM3E.getText().toString().trim();
        M3C=etM3C.getText().toString().trim();

        EcI=etEcI.getText().toString().trim();
        EcE=etEcE.getText().toString().trim();
        EcC=etEcC.getText().toString().trim();

        EmI=etEmI.getText().toString().trim();
        EmE=etEmE.getText().toString().trim();
        EmC=etEmC.getText().toString().trim();

        CprI=etCpI.getText().toString().trim();
        CprE=etCpE.getText().toString().trim();
        CprC=etCpC.getText().toString().trim();

        NaI=etNaI.getText().toString().trim();
        NaE=etNaE.getText().toString().trim();
        NaC=etNaC.getText().toString().trim();

        ECSLab2I=etECSLab2I.getText().toString().trim();
        ECSLab2E=etECSLab2E.getText().toString().trim();
        ECSLab2C=etECSLab2C.getText().toString().trim();

        EcLabI=etEcLabI.getText().toString().trim();
        EclabE=etEclabE.getText().toString().trim();
        EcLabC=etEcLabC.getText().toString().trim();

        cpLabI=etcpLabI.getText().toString().trim();
        cplabE=etcplabE.getText().toString().trim();
        cpLabC=etcpLabC.getText().toString().trim();

        sem1B=etSem1B.getText().toString().trim();
        sem1S=etSem1S.getText().toString().trim();
        sem2B=etSem2B.getText().toString().trim();
        sem2S=etSem2S.getText().toString().trim();

        totalB=etTotalB.getText().toString().trim();
        totlaS=etTotalS.getText().toString().trim();
        totalPercentage=etPercentage.getText().toString().trim();


        FirstYear details = new FirstYear( id,rollNumber, Eng1I,Eng1E,Eng1C, M1I,M1E,M1C,
          M2I,M2E,M2C,
          EpI,EpE,EpC,
          PEI,PEE,PEC,
          EDI,EDE,EDC,
          ECSLabI,ECSLabE,ECSLabC,
          EpLabI,EplabE,EpLabC,
          WsI,WsE,WsC,
          Eng2I,Eng2E,Eng2C,
          M3I,M3E,M3C,
          EcI,EcE,EcC,
          EmI,EmE,EmC,
          CprI,CprE,CprC,
          NaI,NaE,NaC,
          ECSLab2I,ECSLab2E,ECSLab2C,
          EcLabI,EclabE,EcLabC,cpLabI,cplabE,cpLabC,sem1B,sem1S,sem2B,sem2S,totalB,totlaS,totalPercentage);

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
