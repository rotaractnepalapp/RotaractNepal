package com.rotaractnepalapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.rengwuxian.materialedittext.MaterialEditText;

public class SignInSignUp extends AppCompatActivity {

    private MaterialEditText edtNewUserName, edtNewUserPassword, edtNewUserEmailID, edtNewUserRIDistrictNo;
    private MaterialEditText edtUserName, edtUserPassword;
    private Button btnSignUp, btnSignIn;

    FirebaseDatabase database;
    DatabaseReference users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_sign_up);

        database = FirebaseDatabase.getInstance();
        users = database.getReference("Users");

        edtUserName = (MaterialEditText) findViewById(R.id.edtUserName);
        edtNewUserName = (MaterialEditText) findViewById(R.id.edtUserPassword);

        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenedSignUpAlertDialog();
            }
        });
    }

    private void OpenedSignUpAlertDialog() {
        AlertDialog.Builder signup = new AlertDialog.Builder(SignInSignUp.this);
        signup.setTitle("Registration");
        signup.setMessage("Please fill full Information");

        LayoutInflater inflater = this.getLayoutInflater();
        View sign_up_layout = inflater.inflate(R.layout.singup_layout,null);

        edtNewUserName = (MaterialEditText) sign_up_layout.findViewById(R.id.edtNewUserName);
        edtNewUserPassword = (MaterialEditText) sign_up_layout.findViewById(R.id.edtNewUserPassword);
        edtNewUserEmailID = (MaterialEditText) sign_up_layout.findViewById(R.id.edtNewUserEmailID);
        edtNewUserRIDistrictNo = (MaterialEditText) sign_up_layout.findViewById(R.id.edtNewUserRIDistrictNo);

        signup.setView(sign_up_layout);
    }
}
