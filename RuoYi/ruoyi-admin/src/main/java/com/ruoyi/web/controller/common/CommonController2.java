package com.ruoyi.web.controller.common;

import java.util.ArrayList;
import java.util.List;

public class CommonController2 {
	public static void main(String[] args) {
		CommonController2.aa();
	}
	
	public static void aa(){
List<List<String>> data = new ArrayList<List<String>>();//金额数组
		
		if(data!=null && !data.isEmpty()){
			System.out.println("123");
		}
		else{
			System.out.println("456");
		}
	}

}
