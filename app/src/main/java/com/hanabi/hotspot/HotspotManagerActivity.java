package com.hanabi.hotspot;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HotspotManagerActivity extends AppCompatActivity {

    private WifiHotSpotCreator hotspotCreator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotspot_manager);

        hotspotCreator = new WifiHotSpotCreator(this);

        Button btn_connector = (Button)findViewById(R.id.btn_connect);
        if (btn_connector != null) {
            btn_connector.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    hotspotCreator.open();
                }
            });
        }

        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            getSupportActionBar().hide();
        }
    }
}
