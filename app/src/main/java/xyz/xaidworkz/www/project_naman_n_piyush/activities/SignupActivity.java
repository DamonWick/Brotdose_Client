package xyz.xaidworkz.www.project_naman_n_piyush.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import xyz.xaidworkz.www.project_naman_n_piyush.R;


public class SignupActivity extends AppCompatActivity {

    private TextView tvDetail;
    private EditText etName;
    private EditText etEmail;
    private EditText etPassword;
    private EditText etContact;
    private EditText etAd1;
    private EditText etAd2;
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        tvDetail = (TextView) findViewById(R.id.tvDetail);
        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etName);
        etPassword = (EditText) findViewById(R.id.etName);
        etContact = (EditText) findViewById(R.id.etName);
        etAd1 = (EditText) findViewById(R.id.etName);
        etAd2 = (EditText) findViewById(R.id.etName);
        btnSignup = (Button) findViewById(R.id.btnSignup);

    }
}
