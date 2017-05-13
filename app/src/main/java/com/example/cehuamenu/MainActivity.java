package com.example.cehuamenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private XCSlideMenu xcSlideMenu;
    private TextView btnSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.allmenu);
        xcSlideMenu = (XCSlideMenu) findViewById(R.id.slideMenu);
        btnSwitch = (TextView)findViewById(R.id.btnSwitch);
        btnSwitch.setClickable(true);
        btnSwitch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                xcSlideMenu.switchMenu();
            }
        });

    }


}
