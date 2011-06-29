package net.bzpalm.two;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class BlankPaperActivity extends Activity {

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blank_paper);
        
        WebView webView = (WebView) findViewById(R.id.blank_paper_webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/html/white_paper.html");

        
        
        
        
    }

}
