2.	class Student{  
3.	    int id;  
4.	    String name;  
5.	      
6.	    Student11(int id,String name){  
7.	    this.id = id;  
8.	    this.name = name;  
9.	    }  
10.	    void display(){System.out.println(id+" "+name);}  
11.	    public static void main(String args[]){  
12.	    Student11 s1 = new Student11(111,"ria");  
13.	    Student11 s2 = new Student11(222,"nive");  
14.	    s1.display();  
15.	    s2.display();  
16.	}  
17.	}  
