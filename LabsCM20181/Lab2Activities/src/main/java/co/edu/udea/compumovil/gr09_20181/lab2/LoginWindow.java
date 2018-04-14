package co.edu.udea.compumovil.gr09_20181.lab2;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import OpenHelper.SQLite_OpenHelper;

public class LoginWindow extends AppCompatActivity {

    TextView doRegister;
    Button btnLogin;

    SQLite_OpenHelper helper = new SQLite_OpenHelper(this, "BD", null, 1 );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_window);

        doRegister = (TextView)findViewById(R.id.txtRegistrarse);


        doRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), UserRegister.class);
                startActivity(i);
            }
        });

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txtMail = (EditText)findViewById(R.id.txtMail);
                EditText txtPass = (EditText)findViewById(R.id.txtPass);

                Cursor cursor = helper.consultarUsuPass(txtMail.getText().toString(), txtPass.getText().toString());
                if (cursor.getCount() > 0){
                    Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), Restaurant.class);
                    startActivity(i);
                 }else{
                    Toast.makeText(getApplicationContext(), "Usuario Y/O password incorrectos", Toast.LENGTH_LONG).show();
                }

                txtMail.setText("");
                txtPass.setText("");
                txtMail.findFocus();
            }
        });
    }

    public void onClick(View view) {
        Intent click1 = new Intent(this, UserRegister.class);
        startActivity(click1);
        finish();
    }
}
