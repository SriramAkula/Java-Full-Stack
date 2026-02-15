package com.javafullstack.core.collections;

public class Demo {

   public static void main(String args[]) {
	

	  
// 1) 
	   String s= null;
	   System.out.println(s);     //     ----- > error
	   
//// 2)
       
       String s1=null+"sri ram";
       System.out.println(s1);    //     -------> error
       
//// 3) 
	   String s3= "raju"+null;
	   System.out.println(s3);    //     -------> error
	   
//// 4)
       
//       String s4=null+null;
//       System.out.println(s4);     //     -------> error    --> 1 correct
       
//// 5) 
//	   String s5= false+null;
//	   System.out.println(s5);       //   -------> error     --> 2 correct
	   
//// 6)
//       
//       String s6= 4 + null;
//       System.out.println(s6);      //    -------> 4  
//       
//// 7) 
//	   String s7= null+false;
//	   System.out.println(s7);       //    -------> error    --> 3 correct
//	   
//// 8)
//       
//       String s8= 4+false;
//       System.out.println(s8);        //   -------> 4
//       
//// 9)  
//        String s9= false+"4";
//	    System.out.println(s9);       //    -------> 04
//	   
//// 10)
//       
//       String s10= "4"+false;
//       System.out.println(s10);        //   -------> 40
//       
//// 11)
//      
//       String s11 = 4+5+false;
//       System.out.println(s11);        //   -------> 9
//       
//// 12)
//       
//       String s12= true+a;
//       System.out.println(s12);        //    -------> 1a
//       
//// 13)
//      
//       String s13 = a+true;
//       System.out.println(s13);         //    -------> a1
//       
//// 14)
//       
//       String s14= false+a+(2+4);
//       System.out.println(s14);          //   -------> 0a6
//       
//// 15)
//      
//       String s15 = false+2+3;
//       System.out.println(s15);          //  -------> 5
       
 
       
       
//	      ------> true, false, null are keywords and literals, 
//	      --> we can assign only a variables, expression, literal, method returning value to the variables, but not keywords
	   
//	      --->  " + " operator , when we use in the Strings, it behaves like---- 
//	                                                                            |
//	                                                                            |
//	                                                                            V  
//	                               either left side of + or right side must be a String value, then only it treats as a String 
	           
	           
	   //  String k1=4+null;
	     String k2=null+"4";
	   // String k3=null+null;
	     
	    
	       Object v1=null;
	       String v2=null;
	       String v3=v1+v2;  // String.valueOf(null) --> "null" 
	    //   String v4=v1.concat(v2); // null perform NPE
	      // System.out.println(v4);
	       
	       System.out.println(v3);
	       
	       // NPE option, unsolved compilation error, JVM internal error, answer

	     
//	    String b1= "7".concat(4); // no SB 
//	    String b3=     
//	    String b2= 7+"4";  // SB --> char [] --> java8 , byte [] --> java9
//	    System.out.println(b1);
	   
	        
	             Object a=10;  // up casting 
	            String b=(String)a; // down casting
	            System.out.println(b);   
	            
	            
	        
   }
}
