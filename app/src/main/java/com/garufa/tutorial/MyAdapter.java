package com.garufa.tutorial;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jason on 11/9/2014.
 */
public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.row_layout2, parent, false);

        String book = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);

        theTextView.setText(book);

        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView1);

        theImageView.setImageResource(R.drawable.baseball);

        return theView;

    }
}
