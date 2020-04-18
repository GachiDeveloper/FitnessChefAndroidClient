package com.example.fitnesschef;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {

    private static final String BASE_MESSAGE = "Адиос Джентельмены, увидимся в: ";
    private static final String ADDRESS = "http://86.57.147.165:8888";

    private Button buttonMn;
    private Button buttonTu;
    private Button buttonWd;
    private Button buttonTh;
    private Button buttonFr;
    private Button buttonSt;
    private Button buttonSn;

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        buttonMn = findViewById(R.id.Btn_Mn);
        buttonTu = findViewById(R.id.Btn_Tu);
        buttonWd = findViewById(R.id.Btn_Wd);
        buttonTh = findViewById(R.id.Btn_Th);
        buttonFr = findViewById(R.id.Btn_Fr);
        buttonSt = findViewById(R.id.Btn_Sa);
        buttonSn = findViewById(R.id.Btn_Sun);

        webView = findViewById(R.id.Web_ElementCat);
        Button[] buttons = {buttonMn, buttonTu, buttonWd, buttonTh, buttonFr, buttonSt, buttonSn};

        for (final Button button : buttons) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //updateMessage(button.getText());
                }
            });
        }
        Button catBtn = findViewById(R.id.catBtn);
        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    changeCat();
            }
        });
    }

    private void changeCat()   {
        webView.loadUrl(ADDRESS);
    }

}
