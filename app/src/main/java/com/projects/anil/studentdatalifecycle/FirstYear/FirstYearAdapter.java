package com.projects.anil.studentdatalifecycle.FirstYear;

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

public class FirstYearAdapter extends ArrayAdapter<FirstYear>

    {
        private Activity context;
        private List<FirstYear> detailsList;
        private ArrayList<FirstYear> details1;
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

    public FirstYearAdapter(@NonNull Activity context, List<FirstYear> detailsList){
        super(context, R.layout.firstyearadapter,detailsList);
        this.context=context;
        this.detailsList=detailsList;
        details1=new ArrayList<FirstYear>();
        details1.addAll(detailsList);
    }

        @Override
        public View getView(final int position, final View convertView, ViewGroup parent){
        LayoutInflater layoutInflater=context.getLayoutInflater();
        View listviewitem=layoutInflater.inflate(R.layout.firstyearadapter,null,true);
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

            etWsI=listviewitem.findViewById(R.id.etWorkshopInternal);
            etWsE=listviewitem.findViewById(R.id.etWorkshopExternal);
            etWsC=listviewitem.findViewById(R.id.etWorkshopCredits);



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

            etECSLab2I=listviewitem.findViewById(R.id.etEcslab2Internal);
            etECSLab2E=listviewitem.findViewById(R.id.etEcslab2External);
            etECSLab2C=listviewitem.findViewById(R.id.etEcslab2Credits);

            etEcLabI=listviewitem.findViewById(R.id.etEclabInternal);
            etEclabE=listviewitem.findViewById(R.id.etEclabExternal);
            etEcLabC=listviewitem.findViewById(R.id.etEclabCredits);

            etcpLabI=listviewitem.findViewById(R.id.etCplabInternal);
            etcplabE=listviewitem.findViewById(R.id.etCplabExternal);
            etcpLabC=listviewitem.findViewById(R.id.etCplabCredits);

            etSem1B=listviewitem.findViewById(R.id.etsem1Backlogs);
            etSem1S=listviewitem.findViewById(R.id.etsem1scored);

            etSem2B=listviewitem.findViewById(R.id.etsem2Backlogs);
            etSem2S=listviewitem.findViewById(R.id.etsem2scored);

            etTotalB=listviewitem.findViewById(R.id.etTotalBacklogs);
            etTotalS=listviewitem.findViewById(R.id.etTotalscored);

            etPercentage=listviewitem.findViewById(R.id.etTotalPercentage);


            //Get the Data
            etEng1I.setText(detailsList.get(position).getEng1I());
            etEng1E.setText(detailsList.get(position).getEng1E());
            etEng1C.setText(detailsList.get(position).getEng1C());

            etM1I.setText(detailsList.get(position).getM1I());
            etM1E.setText(detailsList.get(position).getM1E());
            etM1C.setText(detailsList.get(position).getM1C());

            etM2I.setText(detailsList.get(position).getM2I());
            etM2E.setText(detailsList.get(position).getM2E());
            etM2C.setText(detailsList.get(position).getM2C());

            etEpI.setText(detailsList.get(position).getEpI());
            etEpE.setText(detailsList.get(position).getEpE());
            etEpC.setText(detailsList.get(position).getEpC());

            etPEI.setText(detailsList.get(position).getpEI());
            etPEE.setText(detailsList.get(position).getpEE());
            etPEC.setText(detailsList.get(position).getpEC());

            etEDI.setText(detailsList.get(position).geteDI());
            etEDE.setText(detailsList.get(position).geteDE());
            etEDC.setText(detailsList.get(position).geteDC());

            etECSLabI.setText(detailsList.get(position).geteCSLabI());
            etECSLabE.setText(detailsList.get(position).geteCSLabE());
            etECSLabC.setText(detailsList.get(position).geteCSLabC());

            etEpLabI.setText(detailsList.get(position).getEpLabI());
            etEplabE.setText(detailsList.get(position).getEplabE());
            etEpLabC.setText(detailsList.get(position).getEpLabC());

            etWsI.setText(detailsList.get(position).getWsI());
            etWsE.setText(detailsList.get(position).getWsE());
            etWsC.setText(detailsList.get(position).getWsC());



            etEng2I.setText(detailsList.get(position).getEng2I());
            etEng2E.setText(detailsList.get(position).getEng2E());
            etEng2C.setText(detailsList.get(position).getEng2C());

            etM3I.setText(detailsList.get(position).getM3I());
            etM3E.setText(detailsList.get(position).getM3E());
            etM3C.setText(detailsList.get(position).getM3C());

            etEcI.setText(detailsList.get(position).getEcI());
            etEcE.setText(detailsList.get(position).getEcE());
            etEcC.setText(detailsList.get(position).getEcC());

            etEmI.setText(detailsList.get(position).getEmI());
            etEmE.setText(detailsList.get(position).getEmE());
            etEmC.setText(detailsList.get(position).getEmC());

            etCpI.setText(detailsList.get(position).getCprI());
            etCpE.setText(detailsList.get(position).getCprE());
            etCpC.setText(detailsList.get(position).getCprC());

            etNaI.setText(detailsList.get(position).getNaI());
            etNaE.setText(detailsList.get(position).getNaE());
            etNaC.setText(detailsList.get(position).getNaC());

            etECSLab2I.setText(detailsList.get(position).geteCSLab2I());
            etECSLab2E.setText(detailsList.get(position).geteCSLab2E());
            etECSLab2C.setText(detailsList.get(position).geteCSLab2C());

            etEcLabI.setText(detailsList.get(position).getEcLabI());
            etEclabE.setText(detailsList.get(position).getEclabE());
            etEcLabC.setText(detailsList.get(position).getEcLabC());

            etcpLabI.setText(detailsList.get(position).getCpLabI());
            etcplabE.setText(detailsList.get(position).getCplabE());
            etcpLabC.setText(detailsList.get(position).getCpLabC());

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
