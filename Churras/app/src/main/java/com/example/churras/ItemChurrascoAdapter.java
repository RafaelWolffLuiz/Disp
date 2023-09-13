package com.example.churras;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemChurrascoAdapter extends ArrayAdapter<ItemChurrasco> {
    Context mContext;
    int mResource;
    public ItemChurrascoAdapter(@NonNull Context context, int resource, @NonNull List<ItemChurrasco> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;




    }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            //Inflar o Layout
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);

    return convertView;
        //return super.getView(position, convertView, parent);
    }
}
