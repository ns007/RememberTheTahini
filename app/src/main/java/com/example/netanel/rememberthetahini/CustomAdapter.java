package com.example.netanel.rememberthetahini;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by netanel on 03/11/2015.
 */
public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, ArrayList<String> tasks) {
        super(context,R.layout.listitem_tasks ,tasks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater tasksInflater = LayoutInflater.from(getContext());
        View customView = tasksInflater.inflate(R.layout.listitem_tasks, parent, false);

        String singleTask = getItem(position);
        TextView myTask = (TextView)customView.findViewById(R.id.ItemDesc);
        Button doneButton = (Button)customView.findViewById(R.id.btnDone);

        myTask.setText(singleTask);
        doneButton.setText("DONE");
        return customView;
    }
}
