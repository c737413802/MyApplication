package com.example.chen.myapplication.Fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.chen.myapplication.MainActivity;
import com.example.chen.myapplication.R;
import com.example.chen.myapplication.UserActivity;

/**
 * Created by chen on 2017/10/5.
 */

public class MainFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        return view;
    }
    LinearLayout linearLayout_userInfo;

    @Override
    public void onStart() {
        super.onStart();
    linearLayout_userInfo=getView().findViewById(R.id.userInfo);
        linearLayout_userInfo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), UserActivity.class);
                startActivity(intent);
            }
        });
    }
}
