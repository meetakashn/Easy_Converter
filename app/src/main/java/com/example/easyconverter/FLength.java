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

public class FLength extends Fragment {
    Spinner spin1;
    EditText editText;
    TextView M1, MM1, CM1, YD1, KM1, IN1, FT1;
    Button button,clear;
    DecimalFormat df = new DecimalFormat("0.00000");
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_f_length, container, false);
        spin1=view.findViewById(R.id.spin1);
        editText = view.findViewById(R.id.value1);
        button = view.findViewById(R.id.button);
        clear=view.findViewById(R.id.clear);
        M1 = view.findViewById(R.id.M1);
        MM1 = view.findViewById(R.id.MM1);
        CM1 = view.findViewById(R.id.CM1);
        YD1 = view.findViewById(R.id.YD1);
        KM1 = view.findViewById(R.id.KM1);
        IN1 = view.findViewById(R.id.IN1);
        FT1 = view.findViewById(R.id.FT1);
        String[] list = {"MilliMeter", "CentiMeter", "Meter", "KiloMeter", "Inch", "Feet", "Yard"};
        ArrayAdapter<String> length = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_spinner_item,list);
        spin1.setAdapter(length);
        button.setOnClickListener(v -> {
            if(TextUtils.isEmpty(editText.getText().toString())){
                Toast.makeText(view.getContext(), "Enter a Value please", Toast.LENGTH_SHORT).show();
            }
            else {
                Double M, CM, YD, IN, KM, MM, FT;
                double Value = Double.parseDouble(editText.getText().toString());
                if (spin1.getSelectedItem() == "CentiMeter") {
                    M = Value / 100;
                    MM = Value * 10;
                    CM = Value;
                    YD = Value / 91.44;
                    KM = Value / 100000;
                    IN = Value / 2.54;
                    FT = Value / 30.48;
                    M1.setText(df.format(M));
                    MM1.setText(df.format(MM));
                    CM1.setText(String.format("%s ", CM));
                    YD1.setText(df.format(YD));
                    KM1.setText(df.format(KM));
                    IN1.setText(df.format(IN));
                    FT1.setText(df.format(FT));
                }
                if (spin1.getSelectedItem() == "Meter") {   //Meter
                    M = Value;
                    MM = Value * 1000;
                    CM = Value * 100;
                    YD = Value * 1.094;
                    KM = Value / 1000;
                    IN = Value * 39.37;
                    FT = Value * 3.281;
                    M1.setText(String.format("%s ", M));
                    MM1.setText(df.format(MM));
                    CM1.setText(df.format(CM));
                    YD1.setText(df.format(YD));
                    KM1.setText(df.format(KM));
                    IN1.setText(df.format(IN));
                    FT1.setText(df.format(FT));
                }
                if (spin1.getSelectedItem() == "MilliMeter") {   //MilliMeter
                    M = Value / 1000;
                    MM = Value;
                    CM = Value / 10;
                    YD = Value / 914.4;
                    KM = Value / 1000000;
                    IN = Value / 25.4;
                    FT = Value / 304.8;
                    M1.setText(df.format(M));
                    MM1.setText(String.format("%s ", MM));
                    CM1.setText(df.format(CM));
                    YD1.setText(df.format(YD));
                    KM1.setText(df.format(KM));
                    IN1.setText(df.format(IN));
                    FT1.setText(df.format(FT));
                }
                if (spin1.getSelectedItem() == "KiloMeter") {   //KiloMeter
                    M = Value * 1000; //
                    MM = Value * 1000000;//
                    CM = Value * 100000;//
                    YD = Value * 1093.613298;//
                    KM = Value;
                    IN = Value * 39370;
                    FT = Value * 3281;
                    M1.setText(df.format(M));
                    MM1.setText(df.format(MM));
                    CM1.setText(df.format(CM));
                    YD1.setText(df.format(YD));
                    KM1.setText(String.format("%s", KM));
                    IN1.setText(df.format(IN));
                    FT1.setText(df.format(FT));
                }
                if (spin1.getSelectedItem() == "Yard") {   //Yd
                    M = Value / 1.094; //
                    MM = Value * 914.4;//
                    CM = Value * 91.44;//
                    YD = Value;//
                    KM = Value / 1094;
                    IN = Value * 36;
                    FT = Value * 3;
                    M1.setText(df.format(M));
                    MM1.setText(df.format(MM));
                    CM1.setText(df.format(CM));
                    YD1.setText(String.format("%s ", YD));
                    KM1.setText(df.format(KM));
                    IN1.setText(df.format(IN));
                    FT1.setText(df.format(FT));
                }
                if (spin1.getSelectedItem() == "Inch") {   //NIN
                    M = Value / 39.37;
                    MM = Value * 25.4;
                    CM = Value * 2.54;
                    YD = Value / 36;
                    KM = Value / 39370;
                    IN = Value;
                    FT = Value / 12;
                    M1.setText(df.format(M));
                    MM1.setText(df.format(MM));
                    CM1.setText(df.format(CM));
                    YD1.setText(df.format(YD));
                    KM1.setText(df.format(KM));
                    IN1.setText(String.format("%s ", IN));
                    FT1.setText(df.format(FT));
                }
                if (spin1.getSelectedItem() == "Feet") {   //ft
                    M = Value / 3.281;
                    MM = Value * 304.8;
                    CM = Value * 30.48;
                    YD = Value / 3;
                    KM = Value / 3281;
                    IN = Value * 12;
                    FT = Value;
                    M1.setText(df.format(M));
                    MM1.setText(df.format(MM));
                    CM1.setText(df.format(CM));
                    YD1.setText(df.format(YD));
                    KM1.setText(df.format(KM));
                    IN1.setText(df.format(IN));
                    FT1.setText(String.format("%s ", FT));
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
