package com.jimh.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "9NgCZx5aoWDwzCZcShOMLRdtsC5pFsIK7pTpfpKH", "wmSgyM2phiVTBmSvmVO6JJHt6Q17gaFyOUJtgwpw");

//		ParseObject testObject = new ParseObject("TestObject");
//		testObject.put("foo", "bar");
//		testObject.saveInBackground();

	}
}
