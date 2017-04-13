package com.example.adacher.shrinkquizz;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class PartyFragment extends Fragment {


    public PartyFragment() {
        // Required empty public constructor
    }


    public static PartyFragment newInstance() {
        return new PartyFragment();


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_party, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        final RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.partyRg);

        Button button = (Button) view.findViewById(R.id.partyBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = radioGroup.getCheckedRadioButtonId();

                if (id != -1) {

                    RadioButton radioButton = (RadioButton) radioGroup.findViewById(id);
                    String answer = radioButton.getText().toString();
                    Toast.makeText(getContext(), answer, Toast.LENGTH_SHORT).show();


                } else {

                    Toast.makeText(getContext(), "Debes marcar una opciòn", Toast.LENGTH_SHORT).show();
                    
                }



            }
        });


    }


}
