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

public class FCurrency extends Fragment {
    Spinner spin1;
    EditText editText;
    TextView INR,USD,EUR,JPY,GBP,AUD,CAD;
    Button button;
    DecimalFormat df = new DecimalFormat("0.000");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_f_currency, container, false);
        spin1=view.findViewById(R.id.spin1);
        editText = view.findViewById(R.id.value1);
        button = view.findViewById(R.id.button);
        INR = view.findViewById(R.id.INR1);
        USD = view.findViewById(R.id.USD);
        EUR = view.findViewById(R.id.EUR);
        JPY = view.findViewById(R.id.JPY);
        GBP = view.findViewById(R.id.GBP);
        AUD = view.findViewById(R.id.AUD);
        CAD = view.findViewById(R.id.CAD);
        String[] list = {"INR", "USD", "EUR", "JPY", "GBP", "AUD", "CAD"};
        ArrayAdapter<String> length = new ArrayAdapter<>(this.getActivity(), android.R.layout.simple_spinner_item,list);
        spin1.setAdapter(length);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(editText.getText().toString())){
                    Toast.makeText(view.getContext(), "Enter a Value please", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double I,U,E,J,G,A,C;
                    Double Value = Double.parseDouble(editText.getText().toString());
                    if (spin1.getSelectedItem() == "INR") {
                        I = Value;
                        U = Value * 0.012;
                        E = Value*0.011;
                        J = Value*1.65;
                        G = Value*0.010;
                        A = Value*0.018;
                        C = Value *0.017;
                        INR.setText(df.format(I));
                        USD.setText(df.format(U));
                        EUR.setText(df.format(E));
                        JPY.setText(df.format(J));
                        GBP.setText(df.format(G));
                        AUD.setText(df.format(A));
                        CAD.setText(df.format(C));
                    }
                    if (spin1.getSelectedItem() == "USD") {   //Meter
                        I = Value*81.96;
                        U = Value;
                        E = Value*0.94;
                        J = Value*135;
                        G = Value*0.83;
                        A = Value*1.52;
                        C = Value*1.39;
                        INR.setText(df.format(I));
                        USD.setText(df.format(U));
                        EUR.setText(df.format(E));
                        JPY.setText(df.format(J));
                        GBP.setText(df.format(G));
                        AUD.setText(df.format(A));
                        CAD.setText(df.format(C));
                    }
                    if (spin1.getSelectedItem() == "EUR") {   //MilliMeter
                        I = Value*87.40;
                        U = Value*1.07;
                        E = Value;
                        J = Value*143.87;
                        G = Value*0.89;
                        A = Value*1.62;
                        C = Value*1.47;
                        INR.setText(df.format(I));
                        USD.setText(df.format(U));
                        EUR.setText(df.format(E));
                        JPY.setText(df.format(J));
                        GBP.setText(df.format(G));
                        AUD.setText(df.format(A));
                        CAD.setText(df.format(C));
                    }
                    if (spin1.getSelectedItem() == "JPY") {   //KiloMeter
                        I = Value*0.61;
                        U = Value*0.0074;
                        E = Value*0.0070;
                        J = Value;
                        G = Value*0.0062;
                        A = Value*0.011;
                        C = Value*0.010;
                        INR.setText(df.format(I));
                        USD.setText(df.format(U));
                        EUR.setText(df.format(E));
                        JPY.setText(df.format(J));
                        GBP.setText(df.format(G));
                        AUD.setText(df.format(A));
                        CAD.setText(df.format(C));
                    }
                    if (spin1.getSelectedItem() == "GBP") {   //Yd
                        I = Value*98.70;
                        U = Value*1.20;
                        E = Value*1.13;
                        J = Value*162.58;
                        G = Value;
                        A = Value*1.83;
                        C = Value*1.66;
                        INR.setText(df.format(I));
                        USD.setText(df.format(U));
                        EUR.setText(df.format(E));
                        JPY.setText(df.format(J));
                        GBP.setText(df.format(G));
                        AUD.setText(df.format(A));
                        CAD.setText(df.format(C));
                    }
                    if (spin1.getSelectedItem() == "AUD") {   //NIN
                        I = Value*53.94;
                        U = Value*0.66;
                        E = Value*0.62;
                        J = Value*88.86;
                        G = Value*0.55;
                        A = Value;
                        C = Value*0.91;
                        INR.setText(df.format(I));
                        USD.setText(df.format(U));
                        EUR.setText(df.format(E));
                        JPY.setText(df.format(J));
                        GBP.setText(df.format(G));
                        AUD.setText(df.format(A));
                        CAD.setText(df.format(C));
                    }
                    if (spin1.getSelectedItem() == "CAD") {   //ft
                        I = Value*59.18;
                        U = Value*0.72;
                        E = Value*0.68;
                        J = Value*97.40;
                        G = Value*0.60;
                        A = Value*1.10;
                        C = Value;
                        INR.setText(df.format(I));
                        USD.setText(df.format(U));
                        EUR.setText(df.format(E));
                        JPY.setText(df.format(J));
                        GBP.setText(df.format(G));
                        AUD.setText(df.format(A));
                        CAD.setText(df.format(C));
                    }

                    Toast.makeText(view.getContext(), "Thanks For using this app", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}