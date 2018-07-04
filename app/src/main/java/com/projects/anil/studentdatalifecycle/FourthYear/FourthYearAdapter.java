package com.projects.anil.studentdatalifecycle.FourthYear;

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

public class FourthYearAdapter extends ArrayAdapter<FourthYear>

    {
        private Activity context;
        private List<FourthYear> detailsList;
        private ArrayList<FourthYear> details1;
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

    public FourthYearAdapter(@NonNull Activity context, List<FourthYear> detailsList){
        super(context, R.layout.fourthyearadapter,detailsList);
        this.context=context;
        this.detailsList=detailsList;
        details1=new ArrayList<FourthYear>();
        details1.addAll(detailsList);
    }

        @Override
        public View getView(final int position, final View convertView, ViewGroup parent){
        LayoutInflater layoutInflater=context.getLayoutInflater();
        View listviewitem=layoutInflater.inflate(R.layout.fourthyearadapter,null,true);
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



            etSem1B=listviewitem.findViewById(R.id.etsem1Backlogs);
            etSem1S=listviewitem.findViewById(R.id.etsem1scored);

            etSem2B=listviewitem.findViewById(R.id.etsem2Backlogs);
            etSem2S=listviewitem.findViewById(R.id.etsem2scored);

            etTotalB=listviewitem.findViewById(R.id.etTotalBacklogs);
            etTotalS=listviewitem.findViewById(R.id.etTotalscored);

            etPercentage=listviewitem.findViewById(R.id.etTotalPercentage);


            etEng1I.setText(detailsList.get(position).getVlsiI());
            etEng1E.setText(detailsList.get(position).getVlsiE());
            etEng1C.setText(detailsList.get(position).getVlsiC());

            etM1I.setText(detailsList.get(position).getCnI());
            etM1E.setText(detailsList.get(position).getCnE());
            etM1C.setText(detailsList.get(position).getCnC());

            etM2I.setText(detailsList.get(position).getDipI());
            etM2E.setText(detailsList.get(position).getDipE());
            etM2C.setText(detailsList.get(position).getDipC());

            etEpI.setText(detailsList.get(position).getCaoI());
            etEpE.setText(detailsList.get(position).getCaoE());
            etEpC.setText(detailsList.get(position).getCaoC());

            etPEI.setText(detailsList.get(position).getRsI());
            etPEE.setText(detailsList.get(position).getRsE());
            etPEC.setText(detailsList.get(position).getRsC());

            etEDI.setText(detailsList.get(position).getOcI());
            etEDE.setText(detailsList.get(position).getOcE());
            etEDC.setText(detailsList.get(position).getOcC());

            etECSLabI.setText(detailsList.get(position).getVlsiLabI());
            etECSLabE.setText(detailsList.get(position).getVlsiLabE());
            etECSLabC.setText(detailsList.get(position).getVlsiLabC());

            etEpLabI.setText(detailsList.get(position).getMweLabI());
            etEplabE.setText(detailsList.get(position).getMweLabE());
            etEpLabC.setText(detailsList.get(position).getMweLabC());




            etEng2I.setText(detailsList.get(position).getCmcI());
            etEng2E.setText(detailsList.get(position).getCmcE());
            etEng2C.setText(detailsList.get(position).getCmcC());

            etM3I.setText(detailsList.get(position).getEmiI());
            etM3E.setText(detailsList.get(position).getEmiE());
            etM3C.setText(detailsList.get(position).getEmiC());

            etEcI.setText(detailsList.get(position).getScI());
            etEcE.setText(detailsList.get(position).getScE());
            etEcC.setText(detailsList.get(position).getScC());

            etEmI.setText(detailsList.get(position).getLpisdI());
            etEmE.setText(detailsList.get(position).getLpisdE());
            etEmC.setText(detailsList.get(position).getLpisdC());

            etCpI.setText(detailsList.get(position).getProjectI());
            etCpE.setText(detailsList.get(position).getProjectE());
            etCpC.setText(detailsList.get(position).getProjectC());


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
