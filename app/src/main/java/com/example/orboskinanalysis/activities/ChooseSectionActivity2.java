package com.example.orboskinanalysis.activities;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.orboskinanalysis.R;

public class ChooseSectionActivity2 extends BaseActivity
{
    TextView face,eyes,lips;
    String choiceSelected =null;
    ImageButton back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_section2);
        init();

    }
    public void init()
    {
        face = findViewById(R.id.choose_face);
        eyes = findViewById(R.id.choose_eyes);
        lips = findViewById(R.id.choose_lips);
        back = findViewById(R.id.back_button);
    }
    public void onClick(View view)
    {
        int id = view.getId();
        if (id == R.id.choose_face)
        {
            face.setSelected(!face.isSelected());
            choiceSelected = null;
            eyes.setSelected(false);
            lips.setSelected(false);
            if (face.isSelected())
            {
                choiceSelected = "Face";


            }
        }
        else if(id == R.id.choose_eyes)
        {
            eyes.setSelected(!eyes.isSelected());
            choiceSelected = null;
            face.setSelected(false);
            lips.setSelected(false);
            if (eyes.isSelected())
            {
                choiceSelected = "Eyes";
            }

        }
        else if (id == R.id.choose_lips)
        {
            lips.setSelected(!lips.isSelected());
            choiceSelected = null;
            face.setSelected(false);
            eyes.setSelected(false);
            if (lips.isSelected())
            {
                choiceSelected = "Lips";

            }
        }
        else if (id == R.id.back_button)
        {
            Intent i  = new Intent(ChooseSectionActivity2.this,ChooseSectionActivity.class);
            startActivity(i);
        }

        if (choiceSelected != null)
        {
            Intent i  = new Intent(ChooseSectionActivity2.this,MakeUpActivity.class);
            startActivity(i);
        }
        else
        {

        }




    }


}
