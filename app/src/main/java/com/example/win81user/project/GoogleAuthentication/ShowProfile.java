/*
package com.example.win81user.project.GoogleAuthentication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.win81user.project.R;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.google.android.gms.wearable.DataMap.TAG;

*
 * Created by Win81 User on 25/10/2559.



public class ShowProfile extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener{
    ImageView imageProfile;
    TextView textViewName, textViewEmail, textViewGender;
    String textName, textEmail, textGender, userImageUrl;
    private Intent data;
    GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
  */
/*  GoogleSignInAccount acct = result.getSignInAccount();
    String personName = acct.getDisplayName();
    String personGivenName = acct.getGivenName();
    String personFamilyName = acct.getFamilyName();
    String personEmail = acct.getEmail();
    String personId = acct.getId();
    Uri personPhoto = acct.getPhotoUrl();*//*


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("dddddddddddddddddddddddd","ddddddddddddddddddddddddddddd"+acct);

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        }


    private void initview(){
        textViewName = (TextView) findViewById(R.id.textViewNameValue);
        textViewEmail = (TextView) findViewById(R.id.textViewEmailValue);
        textViewGender = (TextView) findViewById(R.id.textViewGenderValue);
        imageProfile = (ImageView) findViewById(R.id.imageView1);

    }
    private void showprofile(){
        textViewEmail.setText(personEmail);
        textViewName.setText(personName);





    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Log.d(TAG, "onConnectionFailed:" + connectionResult);
    }

    }

*/

