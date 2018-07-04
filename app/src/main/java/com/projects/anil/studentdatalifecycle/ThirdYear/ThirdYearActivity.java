package com.projects.anil.studentdatalifecycle.ThirdYear;

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

public class ThirdYearActivity extends AppCompatActivity {

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

    Button btnSubmit;
    ProgressDialog progressDialog;
    Spinner spinner;
    String rollNumber;
    String  pdcI,pdcE,pdcC;
    String  licaI,licaE,licaC;
    String  csI,csE,csC;
    String  dsdI,dsdE,dsdC;
    String  awpI,awpE,awpC;
    String  pdclabI,pdclabE,pdclabC;
    String  licalabI,licalabE,licalabC;
    String  dsdLabI,dsdlabE,dsdLabC;
    String  iprI,iprE,iprC;

    String seminarI,seminarE,seminarC;
    String mpmcI,mpmcE,mpmcC;
    String dspI,dspE,dspC;
    String dcI,dcE,dcC;
    String meI,meE,meC;
    String bmeI,bmeE,bmeC;
    String mpmclabI,mpmclabE,mpmclabC;
    String dcLabI,dclabE,dcLabC;
    String dspLabI,dsplabE,dspLabC;

    String sem1B,sem1S,sem2B,sem2S,totalB,totlaS,totalPercentage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_year);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Third Year");

        progressDialog=new ProgressDialog(this);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Third Year");
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

        btnSubmit=findViewById(R.id.btnsubmit3);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
                progressDialog.dismiss();
                Toast.makeText(ThirdYearActivity.this, "Added Successfully", Toast.LENGTH_SHORT).show();

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
        pdcI=etEng1I.getText().toString().trim();
        pdcE=etEng1E.getText().toString().trim();
        pdcC=etEng1C.getText().toString().trim();

        licaI=etM1I.getText().toString().trim();
        licaE=etM1E.getText().toString().trim();
        licaC=etM1C.getText().toString().trim();

        csI=etM2I.getText().toString().trim();
        csE=etM2E.getText().toString().trim();
        csC=etM2C.getText().toString().trim();

        dsdI=etEpI.getText().toString().trim();
        dsdE=etEpE.getText().toString().trim();
        dsdC=etEpC.getText().toString().trim();

        awpI=etPEI.getText().toString().trim();
        awpE=etPEE.getText().toString().trim();
        awpC=etPEC.getText().toString().trim();

        pdclabI=etEDI.getText().toString().trim();
        pdclabE=etEDE.getText().toString().trim();
        pdclabC=etEDC.getText().toString().trim();

        licalabI=etECSLabI.getText().toString().trim();
        licalabE=etECSLabE.getText().toString().trim();
        licalabC=etECSLabC.getText().toString().trim();

        dsdLabI=etEpLabI.getText().toString().trim();
        dsdlabE=etEplabE.getText().toString().trim();
        dsdLabC=etEpLabC.getText().toString().trim();

        iprI=etWsI.getText().toString().trim();
        iprE=etWsE.getText().toString().trim();
        iprC=etWsC.getText().toString().trim();

        seminarI=etEng2I.getText().toString().trim();
        seminarE=etEng2E.getText().toString().trim();
        seminarC=etEng2C.getText().toString().trim();

        mpmcI=etM3I.getText().toString().trim();
        mpmcE=etM3E.getText().toString().trim();
        mpmcC=etM3C.getText().toString().trim();

        dspI=etEcI.getText().toString().trim();
        dspE=etEcE.getText().toString().trim();
        dspC=etEcC.getText().toString().trim();

        dcI=etEmI.getText().toString().trim();
        dcE=etEmE.getText().toString().trim();
        dcC=etEmC.getText().toString().trim();

        meI=etCpI.getText().toString().trim();
        meE=etCpE.getText().toString().trim();
        meC=etCpC.getText().toString().trim();

        bmeI=etNaI.getText().toString().trim();
        bmeE=etNaE.getText().toString().trim();
        bmeC=etNaC.getText().toString().trim();

        mpmclabI=etECSLab2I.getText().toString().trim();
        mpmclabE=etECSLab2E.getText().toString().trim();
        mpmclabC=etECSLab2C.getText().toString().trim();

        dcLabI=etEcLabI.getText().toString().trim();
        dclabE=etEclabE.getText().toString().trim();
        dcLabC=etEcLabC.getText().toString().trim();

        dspLabI=etcpLabI.getText().toString().trim();
        dsplabE=etcplabE.getText().toString().trim();
        dspLabC=etcpLabC.getText().toString().trim();

        sem1B=etSem1B.getText().toString().trim();
        sem1S=etSem1S.getText().toString().trim();
        sem2B=etSem2B.getText().toString().trim();
        sem2S=etSem2S.getText().toString().trim();

        totalB=etTotalB.getText().toString().trim();
        totlaS=etTotalS.getText().toString().trim();
        totalPercentage=etPercentage.getText().toString().trim();


        ThirdYear details = new ThirdYear( id,rollNumber,pdcI,pdcE,pdcC,
          licaI,licaE,licaC,
          csI,csE,csC,
          dsdI,dsdE,dsdC,
          awpI,awpE,awpC,
          pdclabI,pdclabE,pdclabC,
          licalabI,licalabE,licalabC,
          dsdLabI,dsdlabE,dsdLabC,
          iprI,iprE,iprC,
         seminarI,seminarE,seminarC,
         mpmcI,mpmcE,mpmcC,
         dspI,dspE,dspC,
         dcI,dcE,dcC,
         meI,meE,meC,
         bmeI,bmeE,bmeC,
         mpmclabI,mpmclabE,mpmclabC,
         dcLabI,dclabE,dcLabC,
         dspLabI,dsplabE,dspLabC,
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
