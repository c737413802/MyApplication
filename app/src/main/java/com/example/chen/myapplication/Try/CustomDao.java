package com.example.chen.myapplication.Try;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen on 2017/10/4.
 */

public class CustomDao {
    public List<Custom> findCusttomers() {
        //查找数据库
        List<Custom> ret=new ArrayList<Custom>();
        ret.add(new Custom("张三","23"));
        ret.add(new Custom("张shi","25"));
        return ret;
    }
}
