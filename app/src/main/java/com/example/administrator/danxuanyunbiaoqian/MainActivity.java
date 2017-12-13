package com.example.administrator.danxuanyunbiaoqian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> list = new ArrayList<String>();
        list.add("施工");
        list.add("服务");
        list.add("设计");
        list.add("监理");
        list.add("其他");


        ChoiceGroup choiceGroup = (ChoiceGroup)findViewById(R.id.choiceGroup);
        choiceGroup.setColumn(3);//设置列数
        choiceGroup.setValues(list);//设置记录列表
        choiceGroup.setView(this);//设置视图
        choiceGroup.setInitChecked(0);//设置最初默认被选按钮
        choiceGroup.getCurrentValue();//获取当前被选择的按钮值
    }
}
