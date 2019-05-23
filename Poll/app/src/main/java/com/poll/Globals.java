package com.poll;

import android.app.Application;

/**
 * Created by user on 6/16/2018.
 */

public class Globals extends Application {



    private String ques;


    public String getData2()
    {
        return this.ques;
    }

    public void setData2(String f){
        this.ques=f;
    }




}
