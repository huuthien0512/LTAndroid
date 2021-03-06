package com.example.notemanagersystem.ui.status;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.notemanagersystem.R;
import com.example.notemanagersystem.ui.status.Status;

import java.util.List;

public class StatusAdapter extends ArrayAdapter<Status> {

    private Context mContext;
    int mResource;

    public StatusAdapter(@NonNull Context context, int resource, @NonNull List<Status> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getName();
        String date = getItem(position).getCreateDate();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.name_RowStatus);
        TextView tvDate = (TextView) convertView.findViewById(R.id.date_RowStatus);

        tvName.setText("Name: " + name);
        tvDate.setText("Created Date: " + date);

        return convertView;
    }



}
