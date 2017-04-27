package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Modules> modules;
    TextView tvYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView)this.findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        modules = new ArrayList<Modules>();

        if (year.equalsIgnoreCase("year 1")) {
            modules.add(new Modules("C105", true));
            modules.add(new Modules("C111", false));
            modules.add(new Modules("C207", true));
            modules.add(new Modules("C208", true));
            modules.add(new Modules("C227", false));
            modules.add(new Modules("C293", false));
        } else if(year.equalsIgnoreCase("year 2")){
            modules.add(new Modules("C202", false));
            modules.add(new Modules("C203", true));
            modules.add(new Modules("C235", false));
            modules.add(new Modules("C273", true));
            modules.add(new Modules("C308", true));
            modules.add(new Modules("C346", true));
            modules.add(new Modules("C348", true));
            modules.add(new Modules("C352", false));
        } else if(year.equalsIgnoreCase("year 3")) {
            modules.add(new Modules("C302", true));
            modules.add(new Modules("C347", true));
            modules.add(new Modules("C349", true));
        }
        aa = new ModuleAdapter(this, R.layout.row, modules);
        lv.setAdapter(aa);
    }



}
