package com.ctbarbanza.gupyou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ctbarbanza.gupyou.mockup.UserController;
import com.ctbarbanza.gupyou.models.User;
import com.ctbarbanza.gupyou.screens.listener.TextChangedListener;
import com.orhanobut.hawk.Hawk;



public class PerfilUsuarioActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_perfil_usuario);

        if (Hawk.contains("user")){
            user = Hawk.get("user");
        }

        DbController.get(user.uid);

        setText();

        updateProfileData();
    }




    private void setText(){


        Button btnSave = findViewById(R.id.act_perfil_usuario_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbController.saveUser(user);
                UserController.init().saveCurrentUser(user);
            }
        });


        EditText btnInstagram = findViewById(R.id.nick);
        EditText btnFacebook  =  findViewById(R.id.txtFca);
        EditText btnLinkedin  =  findViewById(R.id.linkedin);
        EditText btnTwitter   =  findViewById(R.id.twitter);
        EditText btnSnapchat  =  findViewById(R.id.snapchat);
        EditText btnTwitch    =  findViewById(R.id.twitch);
        EditText btnTiktok    =  findViewById(R.id.tiktok);
        EditText btnTinder    =  findViewById(R.id.tinder);
        EditText btnYoutube    = findViewById(R.id.youtube);

        Log.d("Perfil", user.instagram);

        if(this.user.instagram !=null){
            btnInstagram.setText(""+this.user.instagram);
        }

        if(this.user.facebook !=null){
            btnFacebook.setText(""+this.user.facebook);
        }

        if(this.user.linkedin !=null){
            btnLinkedin.setText(""+this.user.linkedin);        }

        if(this.user.twitter !=null){
            btnTwitter.setText(""+this.user.twitter);        }

        if(this.user.snapchat !=null){
            btnSnapchat.setText(""+this.user.snapchat);        }

        if(this.user.twitch !=null){
            btnTwitch.setText(""+this.user.twitch);        }

        if(this.user.tiktok !=null){

            btnTiktok.setText(""+this.user.tiktok);        }

        if(this.user.tinder !=null){
            btnTinder.setText(""+this.user.tinder);
        }

        if(this.user.google !=null){
            btnYoutube.setText(""+this.user.google);
        }










        btnInstagram.addTextChangedListener( new TextChangedListener<EditText>(btnInstagram) {
            @Override
            public void onTextChanged(EditText target, Editable s) {
                String valor = target.getText().toString();
                user.instagram = valor;
            }
        });

        String valor = btnInstagram.getText().toString();
        btnInstagram.setText(""+this.user.instagram);

        btnFacebook.addTextChangedListener( new TextChangedListener<EditText>(btnFacebook) {
            @Override
            public void onTextChanged(EditText target, Editable s) {
                String valor = target.getText().toString();
                user.facebook = valor;
            }
        });

        String valor1 = btnFacebook.getText().toString();
        btnFacebook.setText(""+this.user.facebook);

        btnLinkedin.addTextChangedListener( new TextChangedListener<EditText>(btnLinkedin) {
            @Override
            public void onTextChanged(EditText target, Editable s) {
                String valor = target.getText().toString();
                user.linkedin = valor;
            }
        });

        String valor2 = btnLinkedin.getText().toString();
        btnLinkedin.setText(""+this.user.linkedin);

        btnTwitter.addTextChangedListener( new TextChangedListener<EditText>(btnTwitter) {
            @Override
            public void onTextChanged(EditText target, Editable s) {
                String valor = target.getText().toString();
                user.twitter = valor;
            }
        });

        String valor3 = btnTwitter.getText().toString();
        btnTwitter.setText(""+this.user.twitter);

        btnSnapchat.addTextChangedListener( new TextChangedListener<EditText>(btnSnapchat) {
            @Override
            public void onTextChanged(EditText target, Editable s) {
                String valor = target.getText().toString();
                user.snapchat = valor;
            }
        });

        String valor5 = btnSnapchat.getText().toString();
        btnSnapchat.setText(""+this.user.snapchat);

        btnTwitch.addTextChangedListener( new TextChangedListener<EditText>(btnTwitch) {
            @Override
            public void onTextChanged(EditText target, Editable s) {
                String valor = target.getText().toString();
                user.twitch = valor;
            }
        });

        String valor6 = btnTwitch.getText().toString();
        btnTwitch.setText(""+this.user.twitch);

        btnTiktok.addTextChangedListener( new TextChangedListener<EditText>(btnTiktok) {
            @Override
            public void onTextChanged(EditText target, Editable s) {
                String valor = target.getText().toString();
                user.tiktok = valor;
            }
        });

        String valor7 = btnTiktok.getText().toString();
        btnTiktok.setText(""+this.user.tiktok);

        btnTinder.addTextChangedListener( new TextChangedListener<EditText>(btnTinder) {
            @Override
            public void onTextChanged(EditText target, Editable s) {
                String valor = target.getText().toString();
                user.tinder = valor;
            }
        });

        String valor8 = btnTinder.getText().toString();
        btnTinder.setText(""+this.user.tinder);

        btnYoutube.addTextChangedListener( new TextChangedListener<EditText>(btnYoutube) {
            @Override
            public void onTextChanged(EditText target, Editable s) {
                String valor = target.getText().toString();
                user.google = valor;
            }
        });



    }


    private void updateProfileData() {

        User nUser = new User();
        nUser.uid       = this.user.uid;
        nUser.instagram = this.user.instagram;
        nUser.facebook  = this.user.facebook;
        nUser.google    = this.user.google;
        nUser.linkedin  = this.user.linkedin;
        nUser.snapchat  = this.user.snapchat;
        nUser.tiktok    = this.user.tiktok;
        nUser.twitch    = this.user.twitch;
        nUser.tinder    = this.user.tinder;
        nUser.twitter   = this.user.twitter;
        nUser.img       = this.user.img;
        nUser.name      = this.user.name;
        nUser.nick      = this.user.nick;

        DbController.saveUser(nUser);

    }
}
