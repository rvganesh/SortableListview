package com.example.demodragdroplistview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.example.demodragdroplistview.widget.DragSortListView;

public class DragDropListView extends Activity {

	private DragSortListView listView;
	private SimpleAdapter simpleAdapter;
	private ArrayList<String> list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drag_drop_list_view);

		if (listView == null)
			listView = (DragSortListView) findViewById(R.id.simpleDragListview);

		initList();

		simpleAdapter = new SimpleAdapter(list, this);
		listView.setAdapter(simpleAdapter);
		listView.setRemoveListener(onRemove);
		listView.setDragListener(onDrag);
		listView.setDropListener(onDrop);
	}
	
	private DragSortListView.RemoveListener onRemove = new DragSortListView.RemoveListener() {
		
		@Override
		public void remove(int which) {
			Log.e("DragDropListView", "remove");
			simpleAdapter.removeItem(which);
			simpleAdapter.notifyDataSetChanged();
		}
	};
	
	private DragSortListView.DragListener onDrag= new DragSortListView.DragListener() {

		@Override
		public void drag(int from, int to) {
			String temp = list.get(from);
			list.set(from, ""+list.get(to));
			list.set(to, ""+temp);
			
		}
	};
	
	private DragSortListView.DropListener onDrop= new DragSortListView.DropListener() {

		@Override
		public void drop(int from, int to) {
			simpleAdapter.notifyDataSetChanged();
		}

	};
	 
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.drag_drop_list_view, menu);
		return true;
	}

	private void initList() {

		if (list == null)
			list = new ArrayList<String>();

		list.add("Russia");
		list.add("Canada");
		list.add("United States of America");
		list.add("China");
		list.add("Brazil");
		list.add("Australia");
		list.add("India");
		list.add("Argentina");
		list.add("Kazakhstan");
		list.add("Sudan");
		list.add("Algeria");
		list.add("Congo (Dem. Rep. of )");
		list.add("Mexico");
		list.add("Saudi Arabia");
		list.add("Indonesia");
		list.add("Libya");
		list.add("Iran");
		list.add("Mongolia");
		list.add("Peru");
		list.add("Chad");
		list.add("Niger");
		list.add("Angola");
		list.add("Mali");
		list.add("South Africa  ");
		list.add("Colombia");
		list.add("Ethiopia");
		list.add("Bolivia  ");
		list.add("Mauritania");
		list.add("Egypt");
		list.add("Tanzania  ");
		list.add("Nigeria");
		list.add("Venezuela");
		list.add("Namibia");
		list.add("Pakistan");
		list.add("Mozambique");
		list.add("Turkey");
		list.add("Chile  ");
		list.add("Zambia");
		list.add("Myanmar");
		list.add("Afghanistan");
		list.add("Somalia");
		list.add("Central African Republic");
		list.add("Ukraine");
		list.add("Botswana");
		list.add("Madagascar");
		list.add("Kenya");
		list.add("France");
		list.add("Yemen");
		list.add("Thailand");
		list.add("Spain");
		list.add("Turkmenistan");
		list.add("Cameroon");
		list.add("Papua New Guinea");
		list.add("Sweden");
		list.add("Uzbekistan");
		list.add("Morocco");
		list.add("Iraq");
		list.add("Paraguay");
		list.add("Zimbabwe");
		list.add("Japan");
		list.add("Germany");
		list.add("Congo (Rep.)");
		list.add("Finland");
		list.add("Malaysia");
		list.add("Vietnam");
		list.add("Norway");
		list.add("Cote d'Ivoire  ");
		list.add("Poland");
		list.add("Italy");
		list.add("Philippines");
		list.add("Ecuador");
		list.add("Burkina Faso");
		list.add("New Zealand");
		list.add("Gabon");
		list.add("Guinea");
		list.add("United Kingdom (UK)");
		list.add("Ghana");
		list.add("Romania");
		list.add("Laos");
		list.add("Uganda");
		list.add("Guyana");
		list.add("Oman");
		list.add("Belarus");
		list.add("Kyrgyzstan");
		list.add("Senegal");
		list.add("Syria");
		list.add("Cambodia");
		list.add("Uruguay");
		list.add("Tunisia");
		list.add("Suriname");
		list.add("Bangladesh");
		list.add("Tajikstan");
		list.add("Nepal");
		list.add("Greece");
		list.add("Nicaragua");
		list.add("Eritrea");
		list.add("Korea (North)");
		list.add("Malawi");
		list.add("Benin  ");
		list.add("Honduras");
		list.add("Liberia");
		list.add("Bulgaria ");
		list.add("Cuba");
		list.add("Guatemala");
		list.add("Iceland");
		list.add("Serbia & Montenegro");
		list.add("Korea (South)");
		list.add("Hungary");
		list.add("Portugal");
		list.add("Jordan");
		list.add("Azerbaijan");
		list.add("Austria");
		list.add("United Arab Emirates");
		list.add("Czech Republic");
		list.add("Panama");
		list.add("Sierra Leone");
		list.add("Ireland");
		list.add("Georgia");
		list.add("Sri Lanka  ");
		list.add("Lithuania");
		list.add("Latvia");
		list.add("Togo");
		list.add("Croatia");
		list.add("Bosnia & Herzegovina");
		list.add("Costa Rica");
		list.add("Slovakia");
		list.add("Dominican Republic");
		list.add("Bhutan");
		list.add("Estonia");
		list.add("Denmark");
		list.add("Netherlands  ");
		list.add("Switzerland");
		list.add("Guinea-Bissau");
		list.add("Moldova");
		list.add("Belgium");
		list.add("Lesotho");
		list.add("Armenia");
		list.add("Albania");
		list.add("Solomon Islands");
		list.add("Equatorial Guinea");
		list.add("Burundi");
		list.add("Haiti");
		list.add("Rwanda");
		list.add("Macedonia");
		list.add("Djibouti");
		list.add("Belize");
		list.add("El Salvador");
		list.add("Israel");
		list.add("Slovenia");
		list.add("Fiji");
		list.add("Kuwait");
		list.add("Swaziland");
		list.add("East Timor");
		list.add("Bahamas");
		list.add("Vanuatu");
		list.add("Qatar");
		list.add("Gambia");
		list.add("Jamaica");
		list.add("Lebanon");
		list.add("Cyprus");
		list.add("Brunei");
		list.add("Trinidad & Tobago");
		list.add("Cape Verde");
		list.add("Samoa");
		list.add("Luxembourg");
		list.add("Comoros");
		list.add("Mauritius");
		list.add("Sao Tome & Principe");
		list.add("Kiribati");
		list.add("Dominica");
		list.add("Tonga");
		list.add("Micronesia");
		list.add("Singapore");
		list.add("Bahrain");
		list.add("Saint Lucia");
		list.add("Andorra");
		list.add("Palau");
		list.add("Seychelles");
		list.add("Antigua & Barbuda");
		list.add("Barbados");
		list.add("St. Vincent & the Grenadines");
		list.add("Grenada");
		list.add("Malta");
		list.add("Maldives");
		list.add("Saint Kitts & Nevis");
		list.add("Marshall Islands");
		list.add("Liechtenstein");
		list.add("San Marino");
		list.add("Tuvalu");
		list.add("Nauru");
		list.add("Monaco");
		list.add("Vatican City");

	}

}
