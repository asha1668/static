class Parent
{
      public Parent()
 
      {
          System.out.println("parent class no_args constructor called");
      }
 
       public Parent (String name)
 
       {
          System.out.println("parent class parameterized constructor called by  "+name);
       }

}

 public class Child extends Parent
 
 {
      public Child()
     
      {
           
         this("JIP");
         System.out.println("child class no_args called");
      }

       public Child(String name)
     
       {
          super("JIP");
          System.out.println("child class parameterized constructor called by  "+name);
       }
     
       public static void main(String args[])
     
       {
          Child c = new Child();
       }

   }