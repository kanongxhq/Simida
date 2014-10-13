package com.xhq.simida.layout;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Loginlayout extends LinearLayout{

	private TextView mTitle = null;
	private EditText mMoble = null;
	private EditText mPassword = null;
	private Button mLogin = null;
	private Button mRegister = null;
	public Loginlayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		this.setOrientation(LinearLayout.VERTICAL);
	}
	
	

}
