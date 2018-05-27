package com.example.ramzy2.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.content.Intent;

public class suggestTip_Activity extends AppCompatActivity {
    private EditText rateExperience;
    private Button suggest;
    private Button back;
    private Button reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggest_tip);
        rateExperience = (EditText) findViewById(R.id.rateExperience);
        suggest = (Button) findViewById(R.id.suggest);
        back = (Button) findViewById(R.id.back);
        reset = (Button) findViewById(R.id.reset);

        suggest.setOnClickListener((View.OnClickListener) this);
        back.setOnClickListener((View.OnClickListener) this);
        reset.setOnClickListener((View.OnClickListener) this);

    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.suggest:
                suggestTip();
                startActivity(new Intent(suggestTip_Activity.this,suggestTip_Activity.class));
                break;
            case R.id.back:
                startActivity(new Intent(suggestTip_Activity.this, MainActivity.class));
                break;
            case R.id.reset:
                startActivity(new Intent(suggestTip_Activity.this,suggestTip_Activity.class));
                break;
            default:

        }
    }

    private void suggestTip(){
        // tip = 10+(2*rateExperience)
    }
}
