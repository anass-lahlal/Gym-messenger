package khaled.torjman.com.gymessenger;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class AfterSignUpActivity extends AppCompatActivity {

    private static final int PICK_IMAGE = 100;
    CircleImageView mCircleImageView;
    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_sign_up);

        mCircleImageView = findViewById(R.id.pic);
    }

    public void goToMain(View view) {


        Intent i = new Intent(AfterSignUpActivity.this,MainView.class);
        startActivity(i);
        finish();
    }

    public void changePhoto(View view)
    {
        openGallery();
    }

    private void openGallery()
    {

        Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(i,PICK_IMAGE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK && requestCode== PICK_IMAGE)
        {
            imageUri = data.getData();
            mCircleImageView.setImageURI(imageUri);

        }
    }
}
