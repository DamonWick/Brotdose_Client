package xyz.xaidworkz.www.project_naman_n_piyush.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import xyz.xaidworkz.www.project_naman_n_piyush.R;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnOkay;
    private TextView tvUs;
    private ImageView ivPra;
    private ImageView ivNam;
    private ImageView ivPiy;
    private TextView tvAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        tvAbout = (TextView) findViewById(R.id.tvAbout);
        ivPiy = (ImageView) findViewById(R.id.ivPiy);
        ivNam = (ImageView) findViewById(R.id.ivNam);
        ivPra = (ImageView) findViewById(R.id.ivPra);
        tvUs = (TextView) findViewById(R.id.tvUs);
        btnOkay = (Button) findViewById(R.id.btnOkay);
        btnOkay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent okay=new Intent(AboutActivity.this,HomeActivity.class);
        startActivity(okay);


    }
}
