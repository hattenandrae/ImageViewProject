package com.example.imageviewproject;



import java.security.PublicKey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void ChurchCross(View C) {
//		Making string object for button click!!! 
		String crossClick = "Jermiah 29:11   For I know the plans I have for you, declares the LORD, plans to prosper you and not to harm you, plans to give you hope and a future. "; 

//		Segue the put extra to the next page!!!
		Intent newintent = new Intent(MainActivity.this,MessageactivityMainActivity.class);
		newintent.putExtra("Christ1", crossClick);
		
		startActivity(newintent);
		
	}
	public void CrossLove(View L) {
//		Making string object for button click!!! 
		String crossClick = "1 Cor 13:4-8    Love is patient, love is kind. It does not envy, it does not boast, it is not proud. It is not rude, it is not self-seeking, it is not easily angered, it keeps no record of wrongs.  Love does not delight in evil but rejoices with the truth.  It always protects, always trusts, always hopes, always perseveres.  LOVE NEVER FAIL. But where there are prophecies, they will cease; where there are tongues, they will be stilled; where there is knowledge, it will pass away.";
//		Segue the put extra to the next page!!!
		Intent newintent = new Intent(MainActivity.this,MessageactivityMainActivity.class);
		newintent.putExtra("Christ1", crossClick);
		
		startActivity(newintent);
	}
	
	public void CrossBelieve(View B) {
//		Making string object for button click!!! 
		String crossClick = "Matthew 21:22 NIV If you believe, you will receive whatever you ask for in prayer.";
////		Segue the put extra to the next page!!!
		Intent newintent = new Intent(MainActivity.this,MessageactivityMainActivity.class);
		newintent.putExtra("Christ1", crossClick);
		
		startActivity(newintent);
	}
	
	public void crossTrust(View T) {
		
	
//	Making string object for button click!!! 
	String crossClick =  "Joshua 1:9   Have I not commanded you? Be strong and courageous. Do not be afraid, do not be discouraged, for the Lord your God will be with you wherever you go.";
//	Segue the put extra to the next page!!!
	Intent newintent = new Intent(MainActivity.this,MessageactivityMainActivity.class);
	newintent.putExtra("Christ1", crossClick);
	
	startActivity(newintent);
}

		public void crossGodFirst(View GF) {
//			Making string object for button click!!! 
			String crossClick = "Proverb 3:6 In everything you do, put God first, and he will direct you and crown your efforts with success.";
////			Segue the put extra to the next page!!!
			Intent newintent = new Intent(MainActivity.this,MessageactivityMainActivity.class);
			newintent.putExtra("Christ1", crossClick);
			
			startActivity(newintent);
			
		}
		
		public void crossPraiseGod(View PG) {
//			Making string object for button click!!! 
			String crossClick = "Deuteronomy 8:10    When you have eaten and are satisfied, praise the Lord your God for the good land he has given you.";
//			Segue the put extra to the next page!!!
			Intent newintent = new Intent(MainActivity.this,MessageactivityMainActivity.class);
			newintent.putExtra("Christ1", crossClick);
			
			startActivity(newintent);
		}
		
		public void crossPrayer(View P) {
//			Making string object for button click!!! 
			String crossClick = "Psalm 6:9    The Lord has heard my cry for mercy the Lord accepts my prayer.";
//			Segue the put extra to the next page!!!
			Intent newintent = new Intent(MainActivity.this,MessageactivityMainActivity.class);
			newintent.putExtra("Christ1", crossClick);
			
			startActivity(newintent);
		}
		
		public void crossHope(View H) {
//			Making string object for button click!!! 
			String crossClick = "Deuteronomy 31:6   Be strong and courageous. Do not fear or be in dread of them, for it is the Lord your God who goes with you. He will not leave you or forsake you.";
//			Segue the put extra to the next page!!!
			Intent newintent = new Intent(MainActivity.this,MessageactivityMainActivity.class);
			newintent.putExtra("Christ1", crossClick);
			
			startActivity(newintent);
		}
		
		public void crossFaith(View F) {		
//			Making string object for button click!!! 
			String crossClick = "Mark 11:22   Have faith in God,” Jesus answered.";
//			Segue the put extra to the next page!!!
			Intent newintent = new Intent(MainActivity.this,MessageactivityMainActivity.class);
			newintent.putExtra("Christ1", crossClick);
			
			startActivity(newintent);
			
		}
}
