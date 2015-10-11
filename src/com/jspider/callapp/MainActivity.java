package com.jspider.callapp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.drm.DrmStore.Action;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends Activity {
ListView callapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callapp=(ListView) findViewById(R.id.CallListView);
        String[] s={"priyhans","Rajesh Ranjan","Sachin Raj","Pranav","Avinash","Awnish"};
        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,s);
        callapp.setAdapter(adapter);
    callapp.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			Intent intent=new Intent(Intent.ACTION_CALL);
			switch (arg2) {
			case 0:
				//new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:"+"9755059171"));
				startActivity(intent);
			case 1:
				new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:"+"123456789"));
				startActivity(intent);
				break;
			case 2:
				new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:"+"987456321"));
				startActivity(intent);
				break;
			case 3:
				new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:"+"123654987"));
				startActivity(intent);
				break;
			case 4:
				new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:"+"5522336699"));
				startActivity(intent);
				break;
			case 5:
				new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:"+"123123123"));
				startActivity(intent);
				break;
			
			default:
				break;
			}
			
		}
	});
    }


    public static void emergency(int a)
    {
    	
    }
    
}
