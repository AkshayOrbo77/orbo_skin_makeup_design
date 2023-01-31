package com.example.orboskinanalysis.activities;
import static com.example.orboskinanalysis.activities.BaseActivity.showToast;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import com.example.orboskinanalysis.R;

public class ChooseSectionActivity extends BaseActivity
{

    TextView hair,skin,makeup;
    String choiceSelected = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_section);
        init();
    }
    public void init()
    {
        hair = findViewById(R.id.choose_hair);
        skin = findViewById(R.id.choose_skin);
        makeup = findViewById(R.id.choose_makeup);
    }
    public void onClick(View view)
    {
            int id = view.getId();
            if (id == R.id.choose_hair)
            {
                hair.setSelected(!hair.isSelected());
                choiceSelected = null;
                skin.setSelected(false);
                makeup.setSelected(false);
                if (hair.isSelected())
                {
                    choiceSelected = getString(R.string.choose_hair);
                }
            }
            else if(id == R.id.choose_skin)
            {
                skin.setSelected(!skin.isSelected());
                choiceSelected = null;
                hair.setSelected(false);
                makeup.setSelected(false);
                if (skin.isSelected())
                {
                    choiceSelected = "Skin";
                }

            }
            else if (id == R.id.choose_makeup)
            {
                makeup.setSelected(!makeup.isSelected());
                choiceSelected = null;
                hair.setSelected(false);
                skin.setSelected(false);
                if (makeup.isSelected())
                {
                    choiceSelected = "Makeup";
                }
            }

            if (choiceSelected != null)
            {
                Intent i = new Intent(ChooseSectionActivity.this,ChooseSectionActivity2.class);
                startActivity(i);
            }
            else
            {
                showToast(ChooseSectionActivity.this,"Please Select Option ");
            }

    }


}
