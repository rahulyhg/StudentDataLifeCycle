package com.projects.anil.studentdatalifecycle.ThirdYear;

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

public class ThirdYearAdapter extends ArrayAdapter<ThirdYear>

    {
        private Activity context;
        private List<ThirdYear> detailsList;
        private ArrayList<ThirdYear> details1;
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

    public ThirdYearAdapter(@NonNull Activity context, List<ThirdYear> detailsList){
        super(context, R.layout.thirdyearadapter,detailsList);
        this.context=context;
        this.detailsList=detailsList;
        details1=new ArrayList<ThirdYear>();
        details1.addAll(detailsList);
    }

        @Override
        public View getView(final int position, final View convertView, ViewGroup parent){
        LayoutInflater layoutInflater=context.getLayoutInflater();
        View listviewitem=layoutInflater.inflate(R.layout.thirdyearadapter,null,true);
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


            etEng1I.setText(detailsList.get(position).getPdcI());
            etEng1E.setText(detailsList.get(position).getPdcE());
            etEng1C.setText(detailsList.get(position).getPdcC());

            etM1I.setText(detailsList.get(position).getLicaI());
            etM1E.setText(detailsList.get(position).getLicaE());
            etM1C.setText(detailsList.get(position).getLicaC());

            etM2I.setText(detailsList.get(position).getCsI());
            etM2E.setText(detailsList.get(position).getCsE());
            etM2C.setText(detailsList.get(position).getCsC());

            etEpI.setText(detailsList.get(position).getDsdI());
            etEpE.setText(detailsList.get(position).getDsdE());
            etEpC.setText(detailsList.get(position).getDsdC());

            etPEI.setText(detailsList.get(position).getAwpI());
            etPEE.setText(detailsList.get(position).getAwpE());
            etPEC.setText(detailsList.get(position).getAwpC());

            etEDI.setText(detailsList.get(position).getPdclabI());
            etEDE.setText(detailsList.get(position).getPdclabE());
            etEDC.setText(detailsList.get(position).getPdclabC());

            etECSLabI.setText(detailsList.get(position).getLicalabI());
            etECSLabE.setText(detailsList.get(position).getLicalabE());
            etECSLabC.setText(detailsList.get(position).getLicalabC());

            etEpLabI.setText(detailsList.get(position).getDsdLabI());
            etEplabE.setText(detailsList.get(position).getDsdlabE());
            etEpLabC.setText(detailsList.get(position).getDsdLabC());

            etWsI.setText(detailsList.get(position).getIprI());
            etWsE.setText(detailsList.get(position).getIprE());
            etWsC.setText(detailsList.get(position).getIprC());



            etEng2I.setText(detailsList.get(position).getSeminarI());
            etEng2E.setText(detailsList.get(position).getSeminarE());
            etEng2C.setText(detailsList.get(position).getSeminarC());

            etM3I.setText(detailsList.get(position).getMpmcI());
            etM3E.setText(detailsList.get(position).getMpmcE());
            etM3C.setText(detailsList.get(position).getMpmcC());

            etEcI.setText(detailsList.get(position).getDspI());
            etEcE.setText(detailsList.get(position).getDspE());
            etEcC.setText(detailsList.get(position).getDspC());

            etEmI.setText(detailsList.get(position).getDcI());
            etEmE.setText(detailsList.get(position).getDcE());
            etEmC.setText(detailsList.get(position).getDcC());

            etCpI.setText(detailsList.get(position).getMeI());
            etCpE.setText(detailsList.get(position).getMeE());
            etCpC.setText(detailsList.get(position).getMeC());

            etNaI.setText(detailsList.get(position).getBmeI());
            etNaE.setText(detailsList.get(position).getBmeE());
            etNaC.setText(detailsList.get(position).getBmeC());

            etECSLab2I.setText(detailsList.get(position).getMpmclabI());
            etECSLab2E.setText(detailsList.get(position).getMpmclabE());
            etECSLab2C.setText(detailsList.get(position).getMpmclabC());

            etEcLabI.setText(detailsList.get(position).getDcLabI());
            etEclabE.setText(detailsList.get(position).getDclabE());
            etEcLabC.setText(detailsList.get(position).getDcLabC());

            etcpLabI.setText(detailsList.get(position).getDspLabI());
            etcplabE.setText(detailsList.get(position).getDsplabE());
            etcpLabC.setText(detailsList.get(position).getDspLabC());

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
