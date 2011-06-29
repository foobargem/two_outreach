package net.bzpalm.two;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
		TabHost tabHost = this.getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		intent = new Intent().setClass(this, BlankPaperActivity.class);
		spec = tabHost.newTabSpec("BlankPaper");
		spec.setIndicator(getString(R.string.tab_indicator_blank_paper));
		spec.setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, AcceptancePrayerActivity.class);
		spec = tabHost.newTabSpec("AcceptancePrayer");
		spec.setIndicator(getString(R.string.tab_indicator_acceptance_prayer));
		spec.setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, AssuranceQuestionActivity.class);
		spec = tabHost.newTabSpec("AssuranceQuestion");
		spec.setIndicator(getString(R.string.tab_indicator_assurance_question));
		spec.setContent(intent);
		tabHost.addTab(spec);

    }
}