package com.joshuafranklinjava.recyclerviewapp.recyclerviewapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends Activity {

  private TextView name, description, rating;
  private Bundle extras;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_details);

    extras = getIntent().getExtras();

    name = (TextView)findViewById(R.id.dNameId);
    description = (TextView)findViewById(R.id.dDescriptionId);
    rating = (TextView)findViewById(R.id.dratingId);

    if (extras != null){
      name.setText(extras.getString("name"));
      description.setText(extras.getString("description"));
      rating.setText(extras.getString("rating"));
    }
  }
}
