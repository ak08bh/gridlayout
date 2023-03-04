package com.example.gridrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
 RecyclerView gridRecycle;

 ArrayList<User> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridRecycle=findViewById(R.id.gridRecycle);

        gridRecycle.setLayoutManager(new GridLayoutManager(this,2));

        arrayList.add(new User(R.drawable.google,"Google","4,14,00,00,000"));
        arrayList.add(new User(R.drawable.whatsapp,"Whatsapp","71,00,00,000 "));
        arrayList.add(new User(R.drawable.instagram,"Instagram","6,65,00,00,000 "));
        arrayList.add(new User(R.drawable.linkedin,"Linkedln","1,19,00,00,000"));
        arrayList.add(new User(R.drawable.facebook,"Facebook","6,23,00,00,000"));
        arrayList.add(new User(R.drawable.snapchat,"Snapchat","12,90,00,00"));
        arrayList.add(new User(R.drawable.pinterest,"Pinterest","39,60,00,000 "));
        arrayList.add(new User(R.drawable.skype,"Skype","5,15,00,000"));
        arrayList.add(new User(R.drawable.uber,"Uber","5,91,00,000"));

        GridAdapter gridAdapter=new GridAdapter(this,arrayList);
        gridRecycle.setAdapter(gridAdapter);
    }
}