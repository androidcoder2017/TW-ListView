package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15056112 on 27/4/2017.
 */

public class Modules {
    private String modulesCode;
    private boolean prog;

    public Modules(String modulesCode, boolean prog) {
        this.modulesCode = modulesCode;
        this.prog = prog;

    }

    public String getModulesCode(){
        return modulesCode;
    }


    public boolean isProg(){
        return prog;
    }
}
