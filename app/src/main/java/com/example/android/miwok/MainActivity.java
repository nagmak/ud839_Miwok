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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbersTextView = (TextView) findViewById(R.id.numbers);

        if (numbersTextView != null){
            // set a click listener on the numbers text view
            numbersTextView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view){
                    Intent getNumbersCategory = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(getNumbersCategory);
                }

            });
        }

        TextView familyTextView = (TextView) findViewById(R.id.family);

        if (familyTextView != null){
            familyTextView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view){
                    Intent getFamilyMembers = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(getFamilyMembers);
                }

            });
        }

        TextView colorsTextView = (TextView) findViewById(R.id.colors);

        if (colorsTextView != null){
            colorsTextView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view){
                    Intent getColors = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(getColors);
                }

            });
        }

        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);

        if (phrasesTextView != null){
            phrasesTextView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view){
                    Intent getPhrases = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(getPhrases);
                }

            });
        }
    }

}
