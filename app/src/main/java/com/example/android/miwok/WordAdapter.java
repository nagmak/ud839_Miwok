package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nagma on 07.16.16.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceID;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceID){
        super(context, 0, words);
        this.mColorResourceID = colorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Gets the current set of translation words at this index
        Word currentWord = getItem(position);

        // Returns miwok word onto the user screen
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokWord());

        // Returns default english word onto the user screen
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultWord());

        ImageView miwokImageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()){
            miwokImageView.setImageResource(currentWord.getImageResourceID());
            miwokImageView.setVisibility(View.VISIBLE);
        }
        else{

            miwokImageView.setVisibility(View.GONE);
        }

        // Colors
        View textViewContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        textViewContainer.setBackgroundColor(color);

        return listItemView;
    }
}
