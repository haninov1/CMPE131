package com.my.newproject;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.content.Intent;
import android.net.Uri;
import android.content.SharedPreferences;

public class ViewActivity extends Activity{

	private double n = 0;
	
	private ArrayList<HashMap<String, Object>> maps = new ArrayList<>();
	
	private TextView textview1;
	private ListView listview1;

	private Intent i = new Intent();
	private sharedPreferences f;
	@Override
	protected void onCreate(Bundle_savedInstanceState)
	{
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.view);
		initialize();
		initializeLogic();
	}

	private void initialize()
	{
		textview1 = (TextView)findViewByld(R.id.textview1);
		listview1 = (ListView)findViewByld(R.id.listview1);
		f = getSharedPreferences("f", Activity.MODE_PRIVATE);
	
	}

	private void initializeLogic()
	{
		textview1.setText(f.getString("date", ""));
		maps.clear();
		n = 0;
		while(true)
		{
			if(f.getString("date", "").concat(String.valueOf((long)(n))),"").equals(""))
				break;
			else
			{
				{
					HashMap<String, Object>_item = new HashMap<>();
					_item.put("text", f.getString("date", "").concat(String.valueOf((long)(n))),"");
					maps.add(_item);
				}
				n++;
			}
		}
		listview1.setAdapter(new ListVistview1Adapter(maps));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
	}

	@Override
	protected void_delete()
	{
		n = 0;
		for( int_repeat11 = 0; _repeat11 <(int)(maps.size()); _repeat11++)
		{
			f.edit().putString(f.getString("date","").concat.valueOf((long)(n))), maps.get((int)n);
			n++;
		}

		f.edit().remove(f.getString("date", "").concat(String.valueOf((long)(n)))).commit();
		listview1.setAdapter(new Listview1Adapter(maps));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
	}
}
