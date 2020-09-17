package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_hello,btn_bye,btn_ok;
    TextView titleText;
    EditText loadUrl;
    WebView webber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webber = findViewById(R.id.webber);
        webber.setWebViewClient(new WebViewClient());
        webber.loadUrl("https://javabog.dk");

        loadUrl = findViewById(R.id.weburl);

        btn_bye = findViewById(R.id.goodbye_btn);
        btn_bye.setOnClickListener(this);

        btn_ok = findViewById(R.id.ok_btn);
        btn_ok.setOnClickListener(this);

        btn_hello = findViewById(R.id.hello_btn);
        btn_hello.setOnClickListener(this);

        titleText = findViewById(R.id.title);


    }
    @Override
    public void onClick(View view){
        if (view == btn_bye){
            titleText.setText("Good bye ^^");
        }
        if (view == btn_hello){
            titleText.setText("Hello ^^");
        }
        if (view == btn_ok){
            webber.loadUrl(String.valueOf(loadUrl.getText()));
        }
    }
}