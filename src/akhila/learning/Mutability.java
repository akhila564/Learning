package akhila.learning;


//Final means we cannot change the reference but we can change the values. 
//Immutable means we can change the reference but we cannot change the values

//Immutable class 
final class Student {
	final String name;
	final int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return rollNo;
	}
}

public class Mutability {
	 public static void main(String args[]) 
	    { 
	        Student st1 = new Student("Akhila", 101); 
	        System.out.println("st1 --> Name: "+st1.getName()+" - RollNo: "+st1.getRegNo()); 
	        Student st2 = new Student("Akhil", 102); 
	        System.out.println("st2 --> Name: "+st2.getName()+" - RollNo: "+st2.getRegNo()); 
	        st1 = st2;
	        System.out.println("st1 --> Name: "+st1.getName()+" - RollNo: "+st1.getRegNo());
	        
	      //String builder buffer:
	        {
	        	 String str = "Hello";
	        	 System.out.println("\nstr = "+str); 
	        	 str.concat(" World!");
	             StringBuffer sbf = new StringBuffer(str); 
	             sbf.append(" World!"); 
	             System.out.println("sb = "+sbf); 
	             StringBuilder sbl = new StringBuilder(str); 
	             sbl.append(" World!"); 
	             System.out.println("sbl = "+sbl); 
	        }
	        //Final vs Immutability
	        {
	        	String str="Hello";
	        	System.out.println("\nstr = "+str);
	        	str="Hello World!";
	        	System.out.println("str = "+str);
	        	System.out.println();
	        	final StringBuffer sb = new StringBuffer("Hello"); 
	        	System.out.println("sb = "+sb);
	        	 //sb = new StringBuffer("Hello"); //fails
	        	sb.append(" World!");
	        	System.out.println("sb = "+sb); 	
	        	
	        }
	        //equals & --
	        {
	        	String str1="Hello";
	        	String str2="Hello";
	        	System.out.print("\nstr1 = "+str1+ " str2 = "+str2+" -- ");
	        	System.out.println(str1.equals(str2)?" Equal":" Not Equal");
	        	
	        	str2=str1.concat("World");
	        	System.out.print("\nstr1 = "+str1+ " str2 = "+str2+" -- ");
	        	System.out.println(str1.equals(str2)?" Equal":" Not Equal");
	        	
	        	StringBuffer sbf1 = new StringBuffer("Hello");
	        	System.out.print("\nstr1 = "+str1+ " sbf = "+sbf1.toString()+" -- ");
	        	System.out.println(str1.equals(sbf1)?" Equal":" Not Equal");
	        	
	        	StringBuffer sbf2 = new StringBuffer("Hello");
	        	System.out.print("\nsbf1 = "+sbf1.toString()+ " sbf2 = "+sbf2.toString()+" -- ");
	        	System.out.println(sbf1.equals(sbf2)?" Equal":" Not Equal");
	        	System.out.println(sbf1.toString().equals(sbf2.toString())?"Inside Strings are Equal":"Inside Strings are Not Equal");
	        	System.out.println( (sbf1==sbf2)?"sbf1==sbf2":"sbf1!=sbf2");
	        	
	        	sbf1=sbf2;
	        	System.out.print("\n sbf1 = "+sbf1.toString()+ " sbf2 = "+sbf2.toString()+" -- ");
	        	System.out.println(sbf1.equals(sbf2)?" Equal":" Not Equal");
	        	System.out.println(sbf1.toString().equals(sbf2.toString())?"Inside Strings are Equal":"Inside Strings are Not Equal ");
	        	System.out.println( (sbf1==sbf2)?"sbf1==sbf2":"sbf1!=sbf2");
	        	
	        	sbf1.append(" World!");
	        	System.out.print("\n  sbf1 = "+sbf1.toString()+ " sbf2 = "+sbf2.toString()+" -- " );
	        	System.out.println(sbf1.equals(sbf2)?" Equal":" Not Equal");
	        	System.out.println(sbf1.toString().equals(sbf2.toString())?"Inside Strings are Equal":"Inside Strings are Not Equal");
	        	
	        	        	
	        }
	        
	        //string functions
	        {
	        	
	        	String str = new String("Akhila");
	        	System.out.println("\n String Functions: ");
	        	System.out.println("charAt 1 -- "+str.charAt(1));
	        	System.out.println("codePointAt 1 -- "+str.codePointAt(1)); //returns ascii value
	        	System.out.println("codePointBefore 4 -- "+str.codePointBefore(4));//returns ascii value
	        	System.out.println("codePointCount 1 5-- "+str.codePointCount(1, 5));
	        	System.out.println("compareTo Akhila -- "+str.compareTo("Akhila"));
	        	System.out.println("concat Surishetti -- "+str.concat(" Surishetti"));
	        	System.out.println("hashcode -- "+str.hashCode());
	        	System.out.println("indexOf A -- "+str.indexOf('A'));
	        	System.out.println("indexOf hi -- "+str.indexOf("hi"));
	        	System.out.println("indexOf 105,5 -- "+str.indexOf(105, 5));
	        	System.out.println("lastIndexOf i -- "+str.lastIndexOf('i'));
        			
	        	
	        }
	      //INTERN
	        {
	        	System.out.println("\n INTERN");
	        	// S1 refers to Object in the Heap Area  
	            String s1 = new String("Akhila");  
	      
	            // S2  refers to Object in SCP Area  
	            String s2 = s1.concat(" Surishetti");  
	      
	            // S3 refers to Object in SCP Area 
	            String s3 = s2.intern();   
	      
	            System.out.println(s2 == s3);  
	      
	            // S4 refers to Object in the SCP Area  
	            String s4 = "Akhila Surishetti";
	            
	            // S5 refers to Object in the Heap Area 
	            
	            String s5 = "Akhila";
	      
	            System.out.println("s2 == s4 -- >"+(s2 == s4));
	            System.out.println("s3 == s4 -- >"+( s3 == s4));
	            System.out.println("s1 == s5 -- >"+( s1 == s5));
	        }
	        
	        
	        
	       
	       
	         
	    }
	  
}
