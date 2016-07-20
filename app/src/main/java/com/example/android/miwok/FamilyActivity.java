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

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer miwokFamilyAudio;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Family members
        final ArrayList<Word> familyWords =  new ArrayList<Word>();
        familyWords.add(new Word("әpә", "father", R.drawable.family_father, R.raw.family_father));
        familyWords.add(new Word("әṭa", "mother", R.drawable.family_mother, R.raw.family_mother));
        familyWords.add(new Word("angsi", "son", R.drawable.family_son, R.raw.family_son));
        familyWords.add(new Word("tune", "daughter", R.drawable.family_daughter, R.raw.family_daughter));
        familyWords.add(new Word("taachi", "older brother", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyWords.add(new Word("chalitti", "younger brother", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyWords.add(new Word("teṭe", "older sister", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyWords.add(new Word("kolliti", "younger sister", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyWords.add(new Word("ama", "grandmother", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyWords.add(new Word("paapa", "grandfather", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter familyAdapter = new WordAdapter(this, familyWords, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(familyAdapter);

        // Audio
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releaseMediaPlayer();
                miwokFamilyAudio = MediaPlayer.create(FamilyActivity.this, familyWords.get(position).getAudioResourceID());
                miwokFamilyAudio.start();

                // Clean up resources
                miwokFamilyAudio.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    private void releaseMediaPlayer(){
        if (miwokFamilyAudio != null){
            miwokFamilyAudio.release();
            miwokFamilyAudio = null;
        }
    }
}
