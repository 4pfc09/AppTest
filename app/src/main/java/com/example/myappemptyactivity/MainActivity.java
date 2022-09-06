package com.example.myappemptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnLogin;
    EditText editTextUsername;
    EditText editTextPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnLogin = findViewById(R.id.btnLogin);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPass = findViewById(R.id.editTextPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUsername.getText().toString();
                String pass = editTextPass.getText().toString();

                if (validate(view)) {
                    Intent intent = new Intent(view.getContext(), OptionsActivity.class);
                    view.getContext().startActivity(intent);
                }
            }
        });
    }

    private boolean validate(View view) {
        return validateUserName(view)
                &&
                validatePass(view);
    }

    private boolean validateUserName(View view) {
        boolean isValid = false;
        if (TextUtils.isEmpty(editTextUsername.getText().toString()))
            showToast(view.getContext(), getString(R.string.editTextUserEmptyText));
        else{
            isValid= true;
        }
        return isValid;

    }

    private boolean validatePass(View view) {
        boolean isValid = false;
        if (TextUtils.isEmpty(editTextPass.getText().toString())) {
            showToast(view.getContext(), getString(R.string.editTextPassErrorText));
        }
        else{
            isValid=true;
        }
        return isValid;
    }

    private void showToast(Context context, String message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();
    }


}