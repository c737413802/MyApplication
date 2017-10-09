package com.example.chen.myapplication.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVQuery;
import com.example.chen.myapplication.FindData;
import com.example.chen.myapplication.R;

/**
 * Created by chen on 2017/10/5.
 */

public class PatientFragment extends Fragment  {


    ArrayAdapter<String> adapter;
    public  interface OnNewItemAddListenter{
        public void newItemAdded(String content);
    }
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_patient,container,false);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        //要显示的数据

        String[] strs = {"基神","B神","翔神","曹神","J神"};
        //创建ArrayAdapter
         adapter = new ArrayAdapter<String>
                (getActivity(),android.R.layout.simple_expandable_list_item_1,strs);
        //获取ListView对象，通过调用setAdapter方法为ListView设置Adapter设置适配器
        ListView list_test = (ListView) getView().findViewById(R.id.patientList);
        list_test.setAdapter(adapter);


    }

    public void newItemAdded(String content) {
        adapter.add(content);
        adapter.notifyDataSetChanged();
    }
}
