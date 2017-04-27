package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Modules> {

    private ArrayList<Modules> modules;
    private Context context;
    private TextView tvModulesCodes;
    private ImageView ivProgramming;

    public ModuleAdapter(Context context, int resource, ArrayList<Modules> objects) {
        super(context, resource, objects);
        modules = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent,false);

        ivProgramming = (ImageView)rowView.findViewById(R.id.ivProg);
        tvModulesCodes = (TextView)rowView.findViewById(R.id.tvModulesCode);

        Modules currentModules = modules.get(position);

        tvModulesCodes.setText(currentModules.getModulesCode());

        if(currentModules.isProg()) {
            ivProgramming.setImageResource(R.drawable.prog);
        } else  {
            ivProgramming.setImageResource(R.drawable.nonprog);
        }
        return rowView;
    }

}
