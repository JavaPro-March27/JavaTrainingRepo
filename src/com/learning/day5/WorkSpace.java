package com.learning.day5;

public class WorkSpace {

	public static void main(String[] args) {
	
		
		Child child1 = new Child();
		child1.lastname ="jj";
		
		System.out.println(child1.lastname);
		
		
		CheckingsAccount ca = new CheckingsAccount();
		
		
		
	    SavingsAccount sa = new SavingsAccount();
	    
	    sa.showBestIntrestRates(0, 0, null);
	    
	    
	    Shape s = new Shape();
	    s.area();
	    
	    Triangle t = new Triangle();
	    		t.area();
	    		
	    		Rectangle r = new Rectangle();
	    		
	    		r.area();
	    		
	    		
	    		Calculator calc = new Calculator();
	    		Calculator calc2  = new Calculator();
	    		calc.add();      //30
	    		calc.add(20, 40); // 60
	    		calc.add(1.5, 5.2);  //6.7
	    		calc.add(1.2, 1.5, 1.6); // 4.300000000000001
	    		double result1 = calc.add(10, 1.5, 2.5);  //
	    		
	    		
	    		
                System.out.println(result1);
                
                D d1 = new D();
                d1.method4();
                d1.method5();
                
                System.out.println(calc.toString());
                System.out.println(calc2.toString());
//           com.learning.day5.Calculator@659e0bfd  == com.learning.day5.Calculator@2a139a55
                System.out.println(calc.equals(calc2));
                
                Table table1 = new Table();
                
                table1.height =10;
                table1.length =10;
                table1.width=10;
                
                
                Table table2 = new Table();
                
                table2.height =10;
                table2.length =10;
                table2.width=10;
                
                System.out.println(table1.toString());
                System.out.println(table2.toString());
                
                System.out.println(table1 == table2);
                
                System.out.println(table1.equals(table2));
                
//                System.out.println(table2.hashCode());
//                System.out.println(table2.getClass());
//                Table table2Copy = table2;
                
                
                
  
	}

}
