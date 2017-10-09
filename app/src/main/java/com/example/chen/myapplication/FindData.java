package com.example.chen.myapplication;

import android.util.Log;

import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVQuery;

import java.io.Console;

/**
 * Created by chen on 2017/10/8.
 */

public class FindData {

    public AVQuery<AVObject> ModDept(){
        AVQuery<AVObject> query = new AVQuery<>("ModDept");

        return query;
    }
}
