package com.example.demodragdroplistview;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

public class SimpleAdapter extends BaseAdapter{

	private ArrayList<String> mCurrentList;
	private Filter mSimpleFilter;
	private Context mContext;
	
	public SimpleAdapter(ArrayList<String> mCurrentList, Context mContext) {
		super();
		this.mCurrentList = mCurrentList;
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		if (mCurrentList != null)
			return mCurrentList.size();
		else
			return 0;
	}

	@Override
	public String getItem(int position) {
		if (mCurrentList != null)
			return mCurrentList.get(position);
		else
			return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	
	public void removeItem(int position) {
		if (mCurrentList != null)
			mCurrentList.remove(position);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		convertView = inflater.inflate(R.layout.simple_drag_list_item, null);
		
		try {
			TextView textRow = (TextView) convertView.findViewById(R.id.name);
			textRow.setText(getItem(position));
		} catch (Exception e) {
		}
		
		return convertView;
	}

}
