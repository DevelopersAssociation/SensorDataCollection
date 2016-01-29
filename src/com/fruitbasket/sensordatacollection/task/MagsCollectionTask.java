package com.fruitbasket.sensordatacollection.task;

import java.io.IOException;

import com.fruitbasket.sensordatacollection.Condition;
import com.fruitbasket.sensordatacollection.sensor.MagsSensor;
import com.fruitbasket.sensordatacollection.utilities.ExcelProcessor;

public class MagsCollectionTask implements Runnable {

	private MagsSensor[] magsSensorDatas;
	private int length=0;//��������Ч���ݵĳ���
	
	public MagsCollectionTask(MagsSensor[] magsSensorDatas,int length){
		this.magsSensorDatas=MagsSensor.objectArrayDeepCopyOf(magsSensorDatas, length);
		this.length=length;
	}
	
	@Override
	public void run() {
		try {
			ExcelProcessor.appendDataQuickly(Condition.MAGS_EXCEL, magsSensorDatas,length);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
