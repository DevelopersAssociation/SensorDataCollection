package com.fruitbasket.sensordatacollection;

import java.io.File;
import java.util.Calendar;

import android.os.Environment;
import android.provider.MediaStore;

public final class Condition {
	
	private static final Condition mCondition=new Condition();
	
	private static int year=Calendar.getInstance().get(Calendar.YEAR);
	private static int month=1+Calendar.getInstance().get(Calendar.MONTH);
	private static int date=Calendar.getInstance().get(Calendar.DATE);
	
	public static final String APP_FILE_DIR=Environment.getExternalStorageDirectory()+"/SensorData";
	/*public static final String DATA_DIR=APP_FILE_DIR+"/"+year+"_"+month+"_"+date;
	
	public static final File PRE_ALT_EXCEL=new File(DATA_DIR+"/pressure&Altitude.xls");
	public static final File TEMPERATURE_EXCEL=new File(DATA_DIR+"/temperature.xls");
	public static final File ROTATION_EXCEL=new File(DATA_DIR+"/rotation.xls");
	public static final File ACC_EXCEL=new File(DATA_DIR+"/acc.xls");
	public static final File GYR_EXCEL=new File(DATA_DIR+"/gyr.xls");
	public static final File MAGS_EXCEL=new File(DATA_DIR+"/mags.xls");*/

	public static final String PRE_ALT_FILENAME="pressure&Altitude.xls";
	public static final String TEMPERATURE_FILENAME="emperature.xls";
	public static final String ROTATION_FILENAME="rotation.xls";
	public static final String ACC_FILENAME="acc.xls";
	public static final String GYR_FILENAME="gyr.xls";
	public static final String MAGS_FILENAME="mags.xls";

	private static File preAltExcel;
	private static File temperatureExcel;
	private static File rotationExcel;
	private static File accExcel;
	private static File gyrExcel;
	private static File magsExcel;
	
	//public static final int THREAD_NUM=6;   //用于采集传感器的线程数量。
	 
	public static final int FAST_FLUSH_INTERVAL=100;//传感器每采集FAST_FLUSH_INTERVAL次数据，就将数据输出到文件
	public static final int MID_FLUSH_INTERVAL=50;
	public static final int SLOW_FLUSH_INTERVAL=5;
	
	private Condition(){}
	
	public static final Condition getInstance(){
		return mCondition;
	}

	public static File getPreAltExcel() {
		return preAltExcel;
	}

	public static File getRotationExcel() {
		return rotationExcel;
	}

	public static File getTemperatureExcel() {
		return temperatureExcel;
	}

	public static File getAccExcel() {
		return accExcel;
	}

	public static File getGyrExcel() {
		return gyrExcel;
	}

	public static File getMagsExcel() {
		return magsExcel;
	}

	public static void setPreAltExcel(File preAltExcel) {
		Condition.preAltExcel = preAltExcel;
	}

	public static void setTemperatureExcel(File temperatureExcel) {
		Condition.temperatureExcel = temperatureExcel;
	}

	public static void setRotationExcel(File rotationExcel) {
		Condition.rotationExcel = rotationExcel;
	}

	public static void setAccExcel(File accExcel) {
		Condition.accExcel = accExcel;
	}

	public static void setGyrExcel(File gyrExcel) {
		Condition.gyrExcel = gyrExcel;
	}

	public static void setMagsExcel(File magsExcel) {
		Condition.magsExcel = magsExcel;
	}
}
