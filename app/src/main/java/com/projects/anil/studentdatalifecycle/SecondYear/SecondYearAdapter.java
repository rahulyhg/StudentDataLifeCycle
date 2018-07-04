package com.projects.anil.studentdatalifecycle.SecondYear;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import com.projects.anil.studentdatalifecycle.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 3/14/2018.
 */

public class SecondYearAdapter extends ArrayAdapter<SecondYear>

    {
        private Activity context;
        private List<SecondYear> detailsList;
        private ArrayList<SecondYear> details1;
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

    public SecondYearAdapter(@NonNull Activity context, List<SecondYear> detailsList){
        super(context, R.layout.secondyearadapter,detailsList);
        this.context=context;
        this.detailsList=detailsList;
        details1=new ArrayList<SecondYear>();
        details1.addAll(detailsList);
    }

        @Override
        public View getView(final int position, final View convertView, ViewGroup parent){
        LayoutInflater layoutInflater=context.getLayoutInflater();
        View listviewitem=layoutInflater.inflate(R.layout.secondyearadapter,null,true);
            etEng1I=listviewitem.findViewById(R.id.etEng1Internal);
            etEng1E=listviewitem.findViewById(R.id.etEng1External);
            etEng1C=listviewitem.findViewById(R.id.etEng1Credits);

            etM1I=listviewitem.findViewById(R.id.etM1Internal);
            etM1E=listviewitem.findViewById(R.id.etM1External);
            etM1C=listviewitem.findViewById(R.id.etM1Credits);

            etM2I=listviewitem.findViewById(R.id.etM2Internal);
            etM2E=listviewitem.findViewById(R.id.etM2External);
            etM2C=listviewitem.findViewById(R.id.etM2Credits);

            etEpI=listviewitem.findViewById(R.id.etEPInternal);
            etEpE=listviewitem.findViewById(R.id.etEPExternal);
            etEpC=listviewitem.findViewById(R.id.etEPCredits);

            etPEI=listviewitem.findViewById(R.id.etPEHVInternal);
            etPEE=listviewitem.findViewById(R.id.etPEHVExternal);
            etPEC=listviewitem.findViewById(R.id.etPEHVCredits);

            etEDI=listviewitem.findViewById(R.id.etEDInternal);
            etEDE=listviewitem.findViewById(R.id.etEDExternal);
            etEDC=listviewitem.findViewById(R.id.etEDCredits);

            etECSLabI=listviewitem.findViewById(R.id.etEcslabInternal);
            etECSLabE=listviewitem.findViewById(R.id.etEcslabExternal);
            etECSLabC=listviewitem.findViewById(R.id.etEcslabCredits);

            etEpLabI=listviewitem.findViewById(R.id.etEplabInternal);
            etEplabE=listviewitem.findViewById(R.id.etEplabExternal);
            etEpLabC=listviewitem.findViewById(R.id.etEplabCredits);

            etEng2I=listviewitem.findViewById(R.id.etEng2Internal);
            etEng2E=listviewitem.findViewById(R.id.etEng2External);
            etEng2C=listviewitem.findViewById(R.id.etEng2Credits);

            etM3I=listviewitem.findViewById(R.id.etM3Internal);
            etM3E=listviewitem.findViewById(R.id.etM3External);
            etM3C=listviewitem.findViewById(R.id.etM3Credits);

            etEcI=listviewitem.findViewById(R.id.etECInternal);
            etEcE=listviewitem.findViewById(R.id.etECExternal);
            etEcC=listviewitem.findViewById(R.id.etECCredits);

            etEmI=listviewitem.findViewById(R.id.etEMInternal);
            etEmE=listviewitem.findViewById(R.id.etEMExternal);
            etEmC=listviewitem.findViewById(R.id.etEMCredits);

            etCpI=listviewitem.findViewById(R.id.etCPInternal);
            etCpE=listviewitem.findViewById(R.id.etCPExternal);
            etCpC=listviewitem.findViewById(R.id.etCPCredits);

            etNaI=listviewitem.findViewById(R.id.etNAInternal);
            etNaE=listviewitem.findViewById(R.id.etNAExternal);
            etNaC=listviewitem.findViewById(R.id.etNACredits);



            etEcLabI=listviewitem.findViewById(R.id.etEclabInternal);
            etEclabE=listviewitem.findViewById(R.id.etEclabExternal);
            etEcLabC=listviewitem.findViewById(R.id.etEclabCredits);



            etSem1B=listviewitem.findViewById(R.id.etsem1Backlogs);
            etSem1S=listviewitem.findViewById(R.id.etsem1scored);

            etSem2B=listviewitem.findViewById(R.id.etsem2Backlogs);
            etSem2S=listviewitem.findViewById(R.id.etsem2scored);

            etTotalB=listviewitem.findViewById(R.id.etTotalBacklogs);
            etTotalS=listviewitem.findViewById(R.id.etTotalscored);

            etPercentage=listviewitem.findViewById(R.id.etTotalPercentage);

            etEng1I.setText(detailsList.get(position).getMefaI());
            etEng1E.setText(detailsList.get(position).getMefaE());
            etEng1C.setText(detailsList.get(position).getMefaC());

            etM1I.setText(detailsList.get(position).getEdcI());
            etM1E.setText(detailsList.get(position).getEdcE());
            etM1C.setText(detailsList.get(position).getEdcC());

            etM2I.setText(detailsList.get(position).getDsI());
            etM2E.setText(detailsList.get(position).getDsE());
            etM2C.setText(detailsList.get(position).getDsC());

            etEpI.setText(detailsList.get(position).getEsI());
            etEpE.setText(detailsList.get(position).getEsE());
            etEpC.setText(detailsList.get(position).getEsC());

            etPEI.setText(detailsList.get(position).getSandsI());
            etPEE.setText(detailsList.get(position).getSandsE());
            etPEC.setText(detailsList.get(position).getSandsC());

            etEDI.setText(detailsList.get(position).getEtI());
            etEDE.setText(detailsList.get(position).getEtE());
            etEDC.setText(detailsList.get(position).getEtC());

            etECSLabI.setText(detailsList.get(position).getEdcLabI());
            etECSLabE.setText(detailsList.get(position).getEdcLabE());
            etECSLabC.setText(detailsList.get(position).getEdcLabC());

            etEpLabI.setText(detailsList.get(position).getNandEtLabI());
            etEplabE.setText(detailsList.get(position).getNandEtLabE());
            etEpLabC.setText(detailsList.get(position).getNandEtLabC());





            etEng2I.setText(detailsList.get(position).getEcaI());
            etEng2E.setText(detailsList.get(position).getEcaE());
            etEng2C.setText(detailsList.get(position).getEcaC());

            etM3I.setText(detailsList.get(position).getMsI());
            etM3E.setText(detailsList.get(position).getMsE());
            etM3C.setText(detailsList.get(position).getMsC());

            etEcI.setText(detailsList.get(position).getRvspI());
            etEcE.setText(detailsList.get(position).getRvspE());
            etEcC.setText(detailsList.get(position).getRvspC());

            etEmI.setText(detailsList.get(position).getEmtlI());
            etEmE.setText(detailsList.get(position).getEmtlE());
            etEmC.setText(detailsList.get(position).getEmtlC());

            etCpI.setText(detailsList.get(position).getAcI());
            etCpE.setText(detailsList.get(position).getAcE());
            etCpC.setText(detailsList.get(position).getAcC());

            etNaI.setText(detailsList.get(position).getEcaLabI());
            etNaE.setText(detailsList.get(position).getEcaLabE());
            etNaC.setText(detailsList.get(position).getEcaLabC());



            etEcLabI.setText(detailsList.get(position).getAcLabI());
            etEclabE.setText(detailsList.get(position).getAclabE());
            etEcLabC.setText(detailsList.get(position).getAcLabC());



            etSem1B.setText(detailsList.get(position).getSem1B());
            etSem1S.setText(detailsList.get(position).getSem1S());

            etSem2B.setText(detailsList.get(position).getSem2B());
            etSem2S.setText(detailsList.get(position).getSem2S());

            etTotalB.setText(detailsList.get(position).getTotalB());
            etTotalS.setText(detailsList.get(position).getTotlaS());

            etPercentage.setText(detailsList.get(position).getTotalPercentage());


            return listviewitem;

    }
}
