package com.xhq.simida.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.preference.PreferenceManager;

public class Util {
	private static final String VERSION_CODE = "version_code";

	public static boolean isFirstStart(Context ctx) 
	{
		PackageInfo info = null;
		try {
			info = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(),
					0);
			int cur = info.versionCode;
			SharedPreferences prefs = PreferenceManager
					.getDefaultSharedPreferences(ctx);
			int last = prefs.getInt(VERSION_CODE, -1);
			if (cur > last) {
				prefs.edit().putInt(VERSION_CODE, cur).commit();
				return true;
			}
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
