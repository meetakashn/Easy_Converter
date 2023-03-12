package com.example.easyconverter;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class FWeight extends Fragment {

    Spinner spin1;
    EditText editText;
    TextView MG1, CG1, DG1, GM1, HM1, KM1, TON1;
    Button button,clear;
    DecimalFormat df = new DecimalFormat("0.0000000");
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_f_weight, container, false);
        spin1=view.findViewById(R.id.spin1);
        editText = view.findViewById(R.id.value1);
        button = view.findViewById(R.id.button);
        clear = view.findViewById(R.id.clear);
        MG1 = view.findViewById(R.id.MG1);
        CG1 = view.findViewById(R.id.CG1);
        DG1 = view.findViewById(R.id.DG1);
        GM1 = view.findViewById(R.id.GM1);
        HM1 = view.findViewById(R.id.HM1);
        KM1 = view.findViewById(R.id.KM1);
        TON1 = view.findViewById(R.id.TON);
        String[] list = {"Milligram", "Centigram", "Decigram", "Gram", "Hectogram", "Kilogram", "Ton"};
        ArrayAdapter<String> length = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_spinner_item,list);
        spin1.setAdapter(length);
        button.setOnClickListener(v -> {
            if(TextUtils.isEmpty(editText.getText().toString())){
                Toast.makeText(view.getContext(), "Enter a Value please", Toast.LENGTH_SHORT).show();
            }
            else {
                Double MG,CG,DG,GM,HM, KM, TON;
                Double Value = Double.valueOf((editText.getText().toString()));
                if (spin1.getSelectedItem() == "Milligram") {
                    MG = Value;
                    CG = Value/10;
                    DG = (double) (Value/100);
                    GM = Value / 1000;
                    HM = Value / 100000;
                    KM= Value / 1000000;
                    TON = Value / 1000000000;
                    MG1.setText(df.format(MG));
                    CG1.setText(df.format(CG));
                    DG1.setText(df.format(DG));
                    GM1.setText(df.format(GM));
                    HM1.setText(df.format(HM));
                    KM1.setText(df.format(KM));
                    TON1.setText(df.format(TON));
                }
                if (spin1.getSelectedItem() == "Centigram") {   //Meter
                    MG = Value*10;
                    CG = Value;
                    DG = Value/10;
                    GM = Value / 100;
                    HM = Value / 1000;
                    KM= Value / 100000;
                    TON = Value / 100000000;
                    MG1.setText(df.format(MG));
                    CG1.setText(df.format(CG));
                    DG1.setText(df.format(DG));
                    GM1.setText(df.format(GM));
                    HM1.setText(df.format(HM));
                    KM1.setText(df.format(KM));
                    TON1.setText(df.format(TON));
                }
                if (spin1.getSelectedItem() == "Decigram") {   //MilliMeter
                    MG = Value*100;
                    CG = Value*10;
                    DG = Value;
                    GM = Value / 10;
                    HM = Value / 1000;
                    KM= Value / 10000;
                    TON = Value / 10000000;
                    MG1.setText(df.format(MG));
                    CG1.setText(df.format(CG));
                    DG1.setText(df.format(DG));
                    GM1.setText(df.format(GM));
                    HM1.setText(df.format(HM));
                    KM1.setText(df.format(KM));
                    TON1.setText(df.format(TON));
                }
                if (spin1.getSelectedItem() == "Gram") {   //KiloMeter
                    MG = Value*1000;
                    CG = Value*100;
                    DG = Value*10;
                    GM = Value;
                    HM = Value / 100;
                    KM= Value / 1000;
                    TON = Value / 907200;
                    MG1.setText(df.format(MG));
                    CG1.setText(df.format(CG));
                    DG1.setText(df.format(DG));
                    GM1.setText(df.format(GM));
                    HM1.setText(df.format(HM));
                    KM1.setText(df.format(KM));
                    TON1.setText(df.format(TON));
                }
                if (spin1.getSelectedItem() == "Hectogram") {   //Yd
                    MG = Value*100000;
                    CG = Value*10000;
                    DG = Value*1000;
                    GM = Value * 100;
                    HM = Value;
                    KM= Value / 10;
                    TON = Value / 9072;
                    MG1.setText(df.format(MG));
                    CG1.setText(df.format(CG));
                    DG1.setText(df.format(DG));
                    GM1.setText(df.format(GM));
                    HM1.setText(df.format(HM));
                    KM1.setText(df.format(KM));
                    TON1.setText(df.format(TON));
                }
                if (spin1.getSelectedItem() == "Kilogram") {   //NIN
                    MG = Value/1000000;
                    CG = Value/100000;
                    DG = Value/10000;
                    GM = Value / 1000;
                    HM = Value*10;
                    KM= Value;
                    TON = Value/907.2;
                    MG1.setText(df.format(MG));
                    CG1.setText(df.format(CG));
                    DG1.setText(df.format(DG));
                    GM1.setText(df.format(GM));
                    HM1.setText(df.format(HM));
                    KM1.setText(df.format(KM));
                    TON1.setText(df.format(TON));
                }
                if (spin1.getSelectedItem() == "TON") {   //ft
                    MG = Value*907184740;
                    CG = Value*90718474;
                    DG = Value*9071847.4;
                    GM = Value *907184.74;
                    HM = Value * 9072;
                    KM= Value *907.2;
                    TON = Value;
                    MG1.setText(df.format(MG));
                    CG1.setText(df.format(CG));
                    DG1.setText(df.format(DG));
                    GM1.setText(df.format(GM));
                    HM1.setText(df.format(HM));
                    KM1.setText(df.format(KM));
                    TON1.setText(df.format(TON));
                }
                Toast.makeText(view.getContext(), "Thanks For using this app", Toast.LENGTH_SHORT).show();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.getText().clear();
            }
        });
        return view;

    }

}
