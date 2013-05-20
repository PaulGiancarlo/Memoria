package com.example.memoria;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class grid extends Activity{
	
	Integer[] imagenesID={
			
		R.drawable.num01,
		R.drawable.num02,
		R.drawable.num3,
		R.drawable.num4,
		R.drawable.num05,
		R.drawable.num06,
		R.drawable.num08,		
		R.drawable.num09
		
	};
	
	protected void OnCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid);
		GridView gridView = (GridView) findViewById(R.id.gridView);
		gridView.setAdapter(new ImageAdapter(this));
		
	}
	
	public class ImageAdapter extends BaseAdapter{
		
		private Context contexto;
		public ImageAdapter(Context c){
			contexto =c;
			
			
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return imagenesID.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			// TODO Auto-generated method stub
			ImageView imageView;
			
			if(convertView ==null){
				imageView = new ImageView(contexto);
				imageView.setLayoutParams(new GridView.LayoutParams(85,85));
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setPadding(5,5,5,5);
				
			}else{
				imageView =(ImageView) convertView;
				
							
			}
			imageView.setImageResource(imagenesID[position]);
			
			return imageView;
		}
		
		
		
		
	}
}
