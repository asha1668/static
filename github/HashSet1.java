
/* program to write hashset using constructor */

import java.util.HashSet;
class Students
{
  int rollno ;
  String subject;
  int marks;
  
  
      Students( int rollno, String subject, int marks )
      {
         this.rollno = rollno;
         this.subject = subject;
         this.marks = marks;
        
      }
          
}
  
 class HashSet1
{
      public static void main(String[] args)
      {
          HashSet<Students> set = new HashSet<Students>();
         
          Students s1 = new Students(01, "c programming", 80);
          Students s2 = new Students(01, "data structure", 82);
          Students s3 = new Students(01, "java", 84);
          Students s4 = new Students(01, "network", 85);
       
   
           set.add(s1);
           set.add(s2);
           set.add(s3);
           set.add(s4);
      
          for(Students p:set)
          {
             System.out.println(p.rollno+" "+p.subject+" "+p.marks);
          }
       }
}

 
  