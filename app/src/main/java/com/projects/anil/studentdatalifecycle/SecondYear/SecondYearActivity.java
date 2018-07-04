package com.projects.anil.studentdatalifecycle.SecondYear;

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

public class SecondYearActivity extends AppCompatActivity {
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
    EditText etNaI,etNaE,etNaC;
    EditText etEcLabI,etEclabE,etEcLabC;

    EditText etSem1B,etSem1S,etSem2B,etSem2S;
    EditText etTotalB,etTotalS,etPercentage;

    Button btnSubmit;
    ProgressDialog progressDialog;

    String  mefaI,mefaE,mefaC;
    String  edcI,edcE,edcC;
    String  dsI,dsE,dsC;
    String  esI,esE,esC;
    String  sandsI,sandsE,sandsC;
    String  etI,etE,etC;
    String  edcLabI,edcLabE,edcLabC;
    String  nandEtLabI,nandEtLabE,nandEtLabC;

    String ecaI,ecaE,ecaC;
    String msI,msE,msC;
    String rvspI,rvspE,rvspC;
    String emtlI,emtlE,emtlC;
    String acI,acE,acC;
    String ecaLabI,ecaLabE,ecaLabC;
    String acLabI,aclabE,acLabC;

    String sem1B,sem1S,sem2B,sem2S,totalB,totlaS,totalPercentage;
    FirebaseDatabase database;
    DatabaseReference myRef;
    Spinner spinner;
    String rollNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_year);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Second Year");
        progressDialog=new ProgressDialog(this);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Second Year");
        etEng1I=findViewById(R.id.etEng1Internal);
        etEng1E=findViewById(R.id.etEng1External);
        etEng1C=findViewById(R.id.etEng1Credits);
        spinner=findViewById(R.id.spinnerRoll);
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

        etNaI=findViewById(R.id.etNAInternal);
        etNaE=findViewById(R.id.etNAExternal);
        etNaC=findViewById(R.id.etNACredits);

        etEcLabI=findViewById(R.id.etEclabInternal);
        etEclabE=findViewById(R.id.etEclabExternal);
        etEcLabC=findViewById(R.id.etEclabCredits);


        etSem1B=findViewById(R.id.etsem1Backlogs);
        etSem1S=findViewById(R.id.etsem1scored);

        etSem2B=findViewById(R.id.etsem2Backlogs);
        etSem2S=findViewById(R.id.etsem2scored);

        etTotalB=findViewById(R.id.etTotalBacklogs);
        etTotalS=findViewById(R.id.etTotalscored);

        etPercentage=findViewById(R.id.etTotalPercentage);

        btnSubmit=findViewById(R.id.btnSubmit2);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
                progressDialog.dismiss();
                Toast.makeText(SecondYearActivity.this, "Added Successfully", Toast.LENGTH_SHORT).show();
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
                etNaI.setText("");etNaE.setText("");etNaC.setText("");
                etEcLabI.setText("");etEclabE.setText("");etEcLabC.setText("");

                etSem1B.setText("");etSem1S.setText("");etSem2B.setText("");etSem2S.setText("");
                etTotalB.setText("");etTotalS.setText("");etPercentage.setText("");
            }
        });

    }
    public void save(){
        String id = myRef.push().getKey();
        rollNumber=spinner.getSelectedItem().toString().trim();
        mefaI=etEng1I.getText().toString().trim();
        mefaE=etEng1E.getText().toString().trim();
        mefaC=etEng1C.getText().toString().trim();

        edcI=etM1I.getText().toString().trim();
        edcE=etM1E.getText().toString().trim();
        edcC=etM1C.getText().toString().trim();

        dsI=etM2I.getText().toString().trim();
        dsE=etM2E.getText().toString().trim();
        dsC=etM2C.getText().toString().trim();

        esI=etEpI.getText().toString().trim();
        esE=etEpE.getText().toString().trim();
        esC=etEpC.getText().toString().trim();

        sandsI=etPEI.getText().toString().trim();
        sandsE=etPEE.getText().toString().trim();
        sandsC=etPEC.getText().toString().trim();

        etI=etEDI.getText().toString().trim();
        etE=etEDE.getText().toString().trim();
        etC=etEDC.getText().toString().trim();

        edcLabI=etECSLabI.getText().toString().trim();
        edcLabE=etECSLabE.getText().toString().trim();
        edcLabC=etECSLabC.getText().toString().trim();

        nandEtLabI=etEpLabI.getText().toString().trim();
        nandEtLabE=etEplabE.getText().toString().trim();
        nandEtLabC=etEpLabC.getText().toString().trim();


        ecaI=etEng2I.getText().toString().trim();
        ecaE=etEng2E.getText().toString().trim();
        ecaC=etEng2C.getText().toString().trim();

        msI=etM3I.getText().toString().trim();
        msE=etM3E.getText().toString().trim();
        msC=etM3C.getText().toString().trim();

        rvspI=etEcI.getText().toString().trim();
        rvspE=etEcE.getText().toString().trim();
        rvspC=etEcC.getText().toString().trim();

        emtlI=etEmI.getText().toString().trim();
        emtlE=etEmE.getText().toString().trim();
        emtlC=etEmC.getText().toString().trim();

        acI=etCpI.getText().toString().trim();
        acE=etCpE.getText().toString().trim();
        acC=etCpC.getText().toString().trim();

        ecaLabI=etNaI.getText().toString().trim();
        ecaLabE=etNaE.getText().toString().trim();
        ecaLabC=etNaC.getText().toString().trim();



        acLabI=etEcLabI.getText().toString().trim();
        aclabE=etEclabE.getText().toString().trim();
        acLabC=etEcLabC.getText().toString().trim();


        sem1B=etSem1B.getText().toString().trim();
        sem1S=etSem1S.getText().toString().trim();
        sem2B=etSem2B.getText().toString().trim();
        sem2S=etSem2S.getText().toString().trim();

        totalB=etTotalB.getText().toString().trim();
        totlaS=etTotalS.getText().toString().trim();
        totalPercentage=etPercentage.getText().toString().trim();


        SecondYear details = new SecondYear( id, rollNumber, mefaI,mefaE,mefaC,
          edcI,edcE,edcC,
          dsI,dsE,dsC,
          esI,esE,esC,
          sandsI,sandsE,sandsC,
          etI,etE,etC,
          edcLabI,edcLabE,edcLabC,
          nandEtLabI,nandEtLabE,nandEtLabC,
         ecaI,ecaE,ecaC,
         msI,msE,msC,
         rvspI,rvspE,rvspC,
         emtlI,emtlE,emtlC,
         acI,acE,acC,
         ecaLabI,ecaLabE,ecaLabC,
         acLabI,aclabE,acLabC,

         sem1B,sem1S,sem2B,sem2S,totalB,totlaS,totalPercentage );

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
