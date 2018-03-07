package khaled.torjman.com.gymessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public void doRegister(View view) {
        Intent i = new Intent(RegistrationActivity.this,AfterSignUpActivity.class);
        startActivity(i);
        finish();
    }

    public void doRegisterGoogle(View view) {

    }

    public void doRegisterFacebook(View view) {
    }
}
