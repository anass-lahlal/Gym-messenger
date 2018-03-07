package khaled.torjman.com.gymessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class LoginActivity extends AppCompatActivity {

    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public void toRegister(View view)
    {
        // Open the registration activity

        Intent regiter = new Intent(LoginActivity.this,RegistrationActivity.class);
        startActivity(regiter);


    }

    public void onLogin(View view)
    {
        // Check the existence of inserted info in FireBase
        // If true, Login successful

        if(check)
        {
            Intent main = new Intent(LoginActivity.this,MainView.class);
            startActivity(main);
            finish();

        }
    }

    public void facebookLogin(View view)
    {
        // Check the existence of inserted info in FireBase
        // If true, Login successful



        // Redirect to MainView

        if(check)
        {
            Intent main = new Intent(LoginActivity.this,MainView.class);
            startActivity(main);
            finish();

        }

    }

    public void googleLogin(View view)
    {
        // Check the existence of inserted info in FireBase
        // If true, Login successful




        // Redirect to MainView

        if(check)
        {
            Intent main = new Intent(LoginActivity.this,MainView.class);
            startActivity(main);
            finish();

        }

    }
}
