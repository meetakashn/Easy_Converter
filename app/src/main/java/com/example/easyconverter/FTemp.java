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


public class FTemp extends Fragment {
    Spinner spin1;
    EditText editText;
    TextView CL1,FH1,KL1,RE1,RA1;
    Button button;
    DecimalFormat df = new DecimalFormat("0.000");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_f_temp, container, false);
        spin1=view.findViewById(R.id.spin1);
        editText = view.findViewById(R.id.value1);
        button = view.findViewById(R.id.button);
        CL1 = view.findViewById(R.id.CL1);
        FH1 = view.findViewById(R.id.FH1);
        KL1 = view.findViewById(R.id.KL1);
        RE1 = view.findViewById(R.id.RE1);
        RA1 = view.findViewById(R.id.RA1);
        String[] list = {"Celsius", "Fahrenheit", "Kelvin", "Reaumur", "Rankine"};
        ArrayAdapter<String> length = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_spinner_item,list);
        spin1.setAdapter(length);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(editText.getText().toString())){
                    Toast.makeText(view.getContext(), "Enter a Value please", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double CL,KL,FH,RE,RA;
                    Double Value =Double.parseDouble(editText.getText().toString());
                    if (spin1.getSelectedItem() == "Celsius") {
                        CL = Value;
                        FH = (Value*(9/5))+32;
                        KL = (Value+273.15);
                        RE = (Value*4)/5;
                        RA = ((Value+273.15)*1.8);
                        CL1.setText(df.format(CL));
                        KL1.setText(df.format(KL));
                        FH1.setText(df.format(FH));
                        RE1.setText(df.format(RE));
                        RA1.setText(df.format(RA));
                    }
                    if (spin1.getSelectedItem() == "Fahrenheit") {   //Meter
                        CL = (Value-32)*5/9;
                        FH = Value;
                        KL = (Value+459.67)*5/9;
                        RE = (Value-32)*4/9;
                        RA = (Value+459.67);
                        CL1.setText(df.format(CL));
                        KL1.setText(df.format(KL));
                        FH1.setText(df.format(FH));
                        RE1.setText(df.format(RE));
                        RA1.setText(df.format(RA));
                    }
                    if (spin1.getSelectedItem() == "Kelvin") {   //MilliMeter
                        CL =(Value-273.15);
                        FH = ((Value-273.15)*(9/5)+32);
                        KL = Value;
                        RE = ((Value-273.15)*0.8);
                        RA = (Value*1.8);
                        CL1.setText(df.format(CL));
                        KL1.setText(df.format(KL));
                        FH1.setText(df.format(FH));
                        RE1.setText(df.format(RE));
                        RA1.setText(df.format(RA));
                    }
                    if (spin1.getSelectedItem() == "Reaumur") {   //KiloMeter
                        CL = (Value*1.25);
                        FH = (Value*2.25)+32;
                        KL = (Value+459.67)*5/9;
                        RE = Value;
                        RA = (((Value*2.25)+32)+459.67);
                        CL1.setText(df.format(CL));
                        KL1.setText(df.format(KL));
                        FH1.setText(df.format(FH));
                        RE1.setText(df.format(RE));
                        RA1.setText(df.format(RA));
                    }
                    if (spin1.getSelectedItem() == "Rankine") {   //Yd
                        CL = (( Value - 32 - 459.67)/1.8);
                        FH =  (Value- 459.67);
                        KL = (Value / 1.8);
                        RE = (( Value- 32 - 459.67) / 2.25);
                        RA = Value;
                        CL1.setText(df.format(CL));
                        KL1.setText(df.format(KL));
                        FH1.setText(df.format(FH));
                        RE1.setText(df.format(RE));
                        RA1.setText(df.format(RA));
                    }
                    Toast.makeText(view.getContext(), "Thanks For using this app", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;

    }
}