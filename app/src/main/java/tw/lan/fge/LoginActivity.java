package tw.lan.fge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.function.LongToIntFunction;

public class LoginActivity extends AppCompatActivity {

    private EditText edEmail, edPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final Button btnLogin = (Button) findViewById(R.id.btn_login);
        final FirebaseAuth auth = FirebaseAuth.getInstance();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "OK", Toast.LENGTH_LONG).show();
            }
        });
    }
}
