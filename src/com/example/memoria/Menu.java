package com.example.memoria;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu extends Activity  implements OnClickListener {

	Button grid;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		grid = (Button) findViewbyId(R.id.gvGrid);
		grid.setOnClickListener(this);
		
		
		
	}
	
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()){
		
		case R.id.gvGrid:
				
			Intent g = new Intent("com.example.memoria.GRID");
			startActivity(g);
			break;
			
		
		
		}
		
		
		
	}

	
	
	
	
	
}
