package com.example.orboskinanalysis.activities;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.example.orboskinanalysis.R;
import com.example.orboskinanalysis.activities.utils.Data;
import java.util.ArrayList;
import java.util.List;

public class MakeUpActivity extends BaseActivity
{
    Spinner brandSpinner,featureSpinner;
    int selectedItem = -1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_up);
        init();

    }
    public void init()
    {
        Window  window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.primary_color));

        brandSpinner = findViewById(R.id.brand_spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(MakeUpActivity.this, R.layout.custom_spinner_list,getResources().getStringArray(R.array.brand_list))
        {
//            @Override
//            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//                View v = null;
//                v = super.getDropDownView(position, null, parent);
//                // If this is the selected item position
//                if (position == selectedItem) {
//                    v.setBackgroundColor(getResources().getColor(R.color.secondary_color));
//                }
//                else {
//
//                }
//                return v;
//            }
        };
        arrayAdapter.setDropDownViewResource(R.layout.custom_spinner_list);
        brandSpinner.setAdapter(arrayAdapter);
        brandSpinner.setSelection(-1);

        featureSpinner = findViewById(R.id.feature_spinner);
        ArrayAdapter arrayAdapter1 = new ArrayAdapter(MakeUpActivity.this,R.layout.custom_spinner_list,getResources().getStringArray(R.array.feature_list));
        arrayAdapter1.setDropDownViewResource(R.layout.custom_spinner_list);
        featureSpinner.setAdapter(arrayAdapter1);
        featureSpinner.setSelection(-1);

        LinearLayout populate_features = findViewById(R.id.populate_feature_list);

        List<Data> dataList = new ArrayList<>();

        dataList.add(new Data("face_irmg","Blush"));
        dataList.add(new Data("face_img","Lipstick"));
        dataList.add(new Data("face_img","EyeShadow"));
        dataList.add(new Data("face_img","EyeLiner"));
        dataList.add(new Data("face_img","EyeLash"));
        dataList.add(new Data("face_img","Foundation"));

        for (int i=0; i < dataList.size();i++)
        {
            LayoutInflater layoutInflater  = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.row_make_up_feature,populate_features,false);
            ImageView imageView = view.findViewById(R.id.makeup_feature_img_view);
            TextView textView = view.findViewById(R.id.makeup_feature_text_view);
            Data data = dataList.get(i);
            int imageId = getResources().getIdentifier(data.getFeatureImage(),"drawable",getPackageName());
            imageView.setImageResource(imageId);
            textView.setText(data.getFeatureName());
            populate_features.addView(view);

        }

    }



}
