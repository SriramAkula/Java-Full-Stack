package com.java.m1;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.*;


public class DNAWorldwide {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.nextLine();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		ForensicReport obj = new ForensicReport();
		
		
		while(n-- > 0) {
			String details[] = sc.nextLine().split(":");
			obj.addReportDetails(details[0],format.parse(details[1]));
			
		}
		
		String date = sc.nextLine();
		
		List<String> list = obj.getOfficersWhoFiledReportsOnDate(format.parse(date));
		
		
		if(list.isEmpty()) {
			System.out.println("No reporting officer filed the report");
		}
		for(String s:list) {
			System.out.println(s);
		}
		
	}
}

class ForensicReport{
	
	private Map<String, Date> reportMap = new HashMap<>();
	
	public void addReportDetails(String reportingOfficeName, Date reportFiledDate) {
		reportMap.put(reportingOfficeName, reportFiledDate);
	}
	
	public List<String> getOfficersWhoFiledReportsOnDate(Date reportFiledDate){
		return reportMap.entrySet().stream()
					.filter(obj -> obj.getValue().equals(reportFiledDate))
					.map(obj -> obj.getKey())
					.toList();
	}
}
