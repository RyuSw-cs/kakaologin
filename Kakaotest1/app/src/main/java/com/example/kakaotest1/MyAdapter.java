package com.example.kakaotest1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MainHolder>implements View.OnClickListener {

    private String[] main_text, main_text2;
    private Button b1;
    MainHolder mainHolder;

    // 생성자
    public MyAdapter(String[] main_text, String[] main_text2, Button b1){
        this.main_text = main_text;
        this.main_text2 = main_text2;
        this.b1 = b1;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),"머로 추가할까", Toast.LENGTH_SHORT).show();
    }

    //여기에 아이템의 변수를 만들어주세요
    public static class MainHolder extends RecyclerView.ViewHolder{
        public TextView main_text, main_text2;
        public Button b1;
        public MainHolder(View view){
            super(view);
            //아이템의 레이아웃에대한 id를 찾아야함.
            this.main_text = view.findViewById(R.id.textView5);
            this.main_text2 = view.findViewById(R.id.textView6);
            this.b1 = view.findViewById(R.id.button);
        }
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View holderView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        mainHolder = new MainHolder(holderView);
        return mainHolder;
    }

    //여기에 내용을 만드세요
    @Override
    public void onBindViewHolder(@NonNull MainHolder mainHolder, int i) {
        mainHolder.main_text.setText(this.main_text[i]);
        mainHolder.main_text2.setText(this.main_text2[i]);
        mainHolder.b1.setOnClickListener(this);
    }

    //몇개 반환?
    @Override
    public int getItemCount() {
        return main_text.length;
    }
}