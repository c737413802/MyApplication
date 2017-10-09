package com.example.chen.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.SaveCallback;
import com.example.chen.myapplication.Fragment.CenterFragment;
import com.example.chen.myapplication.Fragment.MainFragment;
import com.example.chen.myapplication.Fragment.OrderFragment;
import com.example.chen.myapplication.Fragment.UserFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private LinearLayout linearLayout_userInfo;
    private MainFragment mainFragment;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getFragmentManager().beginTransaction().replace(R.id.content,mainFragment).commit();

                    return true;
                case R.id.navigation_dashboard:
                    getFragmentManager().beginTransaction().replace(R.id.content,new OrderFragment()).commit();
                    return true;
                case R.id.navigation_notifications:
                    getFragmentManager().beginTransaction().replace(R.id.content,new UserFragment()).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextMessage = (TextView) findViewById(R.id.message);
        mainFragment=new MainFragment();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.content,mainFragment);
        fragmentTransaction.commit();

//       linearLayout_userInfo=(LinearLayout) mainFragment.getView().findViewById(R.id.userInfo);
//        linearLayout_userInfo.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(MainActivity.this,UserActivity.class);
//                startActivity(intent);
//            }
//        });
        AVOSCloud.initialize(this,"b5th4IkHplV5LynPkndSa82x-gzGzoHsz","YmnEOksb4qID5iBFajjJ3ybG");



    }


}
