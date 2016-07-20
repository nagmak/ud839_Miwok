/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer miwokColorsAudio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Colors
        final ArrayList<Word> colorWords = new ArrayList<Word>();
        colorWords.add(new Word("weṭeṭṭi", "red", R.drawable.color_red, R.raw.color_red));
        colorWords.add(new Word("chokokki", "green", R.drawable.color_green, R.raw.color_green));
        colorWords.add(new Word("ṭakaakki", "brown", R.drawable.color_brown, R.raw.color_brown));
        colorWords.add(new Word("ṭopoppi", "gray", R.drawable.color_gray, R.raw.color_gray));
        colorWords.add(new Word("kululli", "black", R.drawable.color_black, R.raw.color_black));
        colorWords.add(new Word("kelelli", "white", R.drawable.color_white, R.raw.color_white));
        colorWords.add(new Word("ṭopiisә", "dusty yellow", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colorWords.add(new Word("chiwiiṭә", "mustard yellow", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        WordAdapter colorAdapter = new WordAdapter (this, colorWords, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(colorAdapter);

        // Audio
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                miwokColorsAudio = MediaPlayer.create(ColorsActivity.this, colorWords.get(position).getAudioResourceID());
                miwokColorsAudio.start();
            }
        });
    }
}
