package com.example.zhang.myhome;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int pos=getIntent().getIntExtra("pos",-1);
        //Toast.makeText(this, ""+pos,Toast.LENGTH_LONG).show();

        PropertyItem item=MainActivity.propertyList.get(pos);
        SliderLayout sliderShow=(SliderLayout) findViewById(R.id.slider);
        for(int i=0;i<3;i++){
            TextSliderView textSliderView=new TextSliderView(this);
            switch (i){
                case 0:
                    textSliderView.description(item.name)
                            .image("http://static.tumblr.com/7f29ffaf86b50f900abb60ef7021edfe/izmj1iu/Q5Inz03u3/tumblr_static_70kt88zhd0so4g84koowgwow.png");
                    break;
                case 1:
                    textSliderView.description(item.category)
                            .image(item.image2);
                    break;
                case 2:
                    textSliderView.description(item.size)
                            .image(item.image3);
                    break;
            }
            sliderShow.addSlider(textSliderView);
        }

    }
}
