package com.java.m1;

import java.util.*;

class ExtractLogs {

    public static void main(String[] args) {

        // Sample input (you can change / test)
        List<List<String>> logs = new ArrayList<>();

        logs.add(Arrays.asList("01-01-2023","14:00","ERROR","failed"));
        logs.add(Arrays.asList("01-01-2023","04:00","INFO","established"));
        logs.add(Arrays.asList("02-01-2023","1:30","ERROR","failed"));

        List<List<String>> result = extractErrorLogs(logs);

        System.out.println(result);
    }

    /*
        Implement this method:

        1. Filter logs where status = ERROR or CRITICAL
        2. Sort by date + time ascending
        3. Maintain stable ordering
        4. Do NOT use Java date-time APIs
    */
    public static List<List<String>> extractErrorLogs(List<List<String>> logs) {

        // TODO: implement logic here
    	
    	List<List<String>> list = new ArrayList<>();
    	
    	for(List<String> l: logs) {
    		if(l.get(2).equals("ERROR") || l.get(2).equals("INFO")) {
    			list.add(l);
    		}
    	}
    	
    	Collections.sort(list,(list1,list2) -> {
    		long a = getTimeValue(list1.get(0),list1.get(1));
    		long b = getTimeValue(list2.get(0),list2.get(1));
    		return Long.compare(a,b);
    	});

        return list;
    }

    /*
        Optional helper method (use if needed)

        Convert:
        "DD-MM-YYYY" + "HH:MM"
        into comparable value for sorting
    */
    private static long getTimeValue(String date, String time) {

        // TODO: parse date
        // TODO: parse time
        // TODO: return comparable number
    	String date1[]=date.split("-");
    	String time1[]=time.split(":");
    	
    	int days=Integer.parseInt(date1[0]);
    	int months=Integer.parseInt(date1[1]);
    	int years=Integer.parseInt(date1[2]);
    	
    	int hours=Integer.parseInt(time1[0]);
    	int minutes=Integer.parseInt(time1[1]);

    	
        return (long)years*100000000+
        		(long) months*1000000+
        		(long) days*10000+
        		(long) hours*100+
        		(long) minutes;
    }
}