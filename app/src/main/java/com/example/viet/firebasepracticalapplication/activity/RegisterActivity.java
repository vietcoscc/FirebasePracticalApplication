package com.example.viet.firebasepracticalapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.viet.firebasepracticalapplication.AccountManager;
import com.example.viet.firebasepracticalapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.edtUserName)
    EditText edtUserName;
    @BindView(R.id.edtPassword)
    EditText edtPassword;
    @BindView(R.id.btnCancel)
    Button btnCancel;
    @BindView(R.id.btnRegister)
    Button btnRegister;
    private AccountManager mAccountManager = AccountManager.getsInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        initViews();
    }

    private void initViews() {
        btnCancel.setOnClickListener(this);
        btnRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCancel:
                finish();
                break;
            case R.id.btnRegister:
                String email = edtUserName.getText().toString();
                String password = edtPassword.getText().toString();
                mAccountManager.signUp(email, password, this);
                break;
        }
    }


}
