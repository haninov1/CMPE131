

public class Listview1Adapter extends BaseAdapter
{
	ArrayList<HashMap<String, Object>>_data;
	public Listview1Adapter(ArrayList<hashMap<String, Object>> _arr)
	{
		_data = _arr;
	}

	@Override
	public int getCount()
	{
		return _data.size();
	}
	
	@Override
	public HashMap<String, Object> getItem(int _index)
	{
		return _data.get(_index);
	}

	@Override
	public long getItemId(int _index)
	{
		return _index;
	}

	@Override
	public View getView(final int_position, View _view, Viewgroup_viewGroup)
	{
		LayoutInflater_inflater = (layoutInflator)getBaseContext().getSystemService(Context.LAYOUT);
		View _v = _view;
		if(_v == null)
		{
			_v = _inflater.inflate(R.layout.custom, null);
		}
	}


	final LinearLayout linear1 = (LinearLayout)_v.findViewById(R.id.linear1);
	final TextView textview1 = (TextView)_v.findViewById(R.id.textview1);
	final ImageView imageview1 = (ImageView)_v.findViewById(R.id.imageview1);
	final ImageView imageview2 = (ImageView)_v.findViewById(R.id.imageview2);

	textview1.setText(maps.get((int)_position).get("text").toString());
	imageview1.setOnClickListener(new  View.OnClickListener()
	{
		@Override
		public void onClick( View _view)
		{
			f.edit().putString("edit", String.valueOf((long)(_position))).commit();
			i.setClass(getApplicationContext().AddActivity.class);
			startActivity(i);
			finish();
		}
	});
	
	imageview2.setOnClickListener(new View.OnClickListener()
	{
		public void onClick( View _view)
		{
			maps.remove((int)(_position));
			_delete();	
		}
		
	});
	return _v;
	}
}

@Deprecated
public void showMessage( String s)
{
	Toast.makeText(getApplicationContext()._s, Toast.LENGTH_SHORT).show();
	
}

@Depreceated
public int getLocationX( View _v)
{
	int _location[] = new int[2];
	_v.getLocationInWindow(_location);
	return  _location[0];
}

@Depreceated
public int getLocationY(View _v)
{
	int _location[] = new int[2];
	_v.getLocationInWindow(_location);
	return _location[1];
}

@Depreceated
public int getRandom( int_min, int_max)
{
	Random  random = new Random();
	return random.nextInt(_max - _min+1) + _min;
}

@Depreceated
public ArrayList<Double> getCheckedPositionsToArray(ListView _list)
{
	ArrayList<Double>  _result = new ArrayList<Double>();
	SparseBooleanArray_arr = _list.getCheckedItemPosition();
	for( int _ildx = 0 ; _ildx< _arr.size(); _ildx++)
	{
		if( _arr.valueAt(_ildx))
			_result.add((double)_arr.keyAt(_ildx));

	}
	return _result;
}

@Depreceated
public float getDip( int _ input)
{
	return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP._input.getresources);
}


@Depreceated
public float getDisplayWidthPixels()
{
	return getResources.getDisplayMetrics().widthPixels;
}


@Depreceated
public float getDisplayHeightPixels()
{
	return getResources.getDisplayMetrics().heigthPixels;
}

}