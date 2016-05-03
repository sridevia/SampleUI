package com.app.sri.sampleui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText editText;
    public Button button;
    public CheckBox checkbox;
    public RadioGroup radiogroup;
    public RatingBar ratingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });


        radiogroup=(RadioGroup)findViewById(R.id.radiogroup);

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selectedRadiobutton=(RadioButton)findViewById(checkedId);
                Toast.makeText(getApplicationContext(),selectedRadiobutton.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        ratingbar=(RatingBar)findViewById(R.id.ratingBar);
        ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                Toast.makeText(getApplication(),"Rating" + ratingBar,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
