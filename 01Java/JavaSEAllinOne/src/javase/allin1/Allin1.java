package javase.allin1;

/** [ Why, What, How, Where, When ] 
 *  [ JDK->JRE->JVM->JIT ] (compiler & interpreter)
 * 
 * variables
 * datatypes
 * operators
 * 
 */
// import java.lang.*;
// import java.util.Scanner;

//Driver Code
public class Allin1
{                
//main method 
  //(different ways of writing main method signature)
  // public static void main(String [ ] args) 
  // public static void main(String args [ ]) 
  // static public void main(String [ ] args)  
  // static public void main(String args[ ]) 
  // public static void main(String...args)  
public static void main(String args[])  
{
   System.out.println("Hello, World!");
   Child1 c1 = new Child1();
   System.out.println(c1.property);

   Display d = ()->System.out.println("Hello, World! from lambda");d.disp();

   Varargs vr = new Varargs(); System.out.println(vr.sum(10,20,39));


   //anonymous class.
}
//   
    // //instance primitive variables   
    //     byte ib;
    //     short is;
    //     int ii;
    //     long il;

    //     float if;
    //     double id;

    //     char ic;
    //     boolean ibl;

    // //static primitive variables at instance level
    //     static byte isb;
    //     static short iss;
    //     static int isi;
    //     static long isl;

    //     static float isf;
    //     static double isd;

    //     static char isc;
    //     static boolean isbl;

    // //final primitive variables at instance level
    //     final byte ifb;
    //     final short ifs;
    //     final int ifi;
    //     final long ifl;

    //     final float iff;
    //     final double ifd;

    //     final char ifc;
    //     final boolean ifbl;

    // // final static primitive variables at instance level
    //     final static byte ifsb;
    //     final static short ifss;
    //     final static int ifsi;
    //     final static long ifsl;

    //     final static float ifsf;
    //     final static double ifsd;

    //     final static char ifsc;
    //     final static boolean ifsbl;
        

    
    // //

 //command line arguments  
  // Irrespective of whether the data(arguments) are passed from command line or not, the main
  //  method must contain String []args. If we ignore String [] args from the main method then the
  //  Java file will be compiled but cannot be executed by JVM. Hence it must be required in the
  //  main method.  

        
  //   //primitive data types
  //         //local var's
  //         byte b;
  //         short s;
  //         int i;
  //         long l;

  //         float f;
  //         double d;

  //         char c;
  //         boolean bl;

  //   //
  //         static byte lsb;
  //         static short lss;
  //         static int lsi;
  //         static long lsl;

  //         static float lsf;
  //         static double lsd;

  //         static char lsc;
  //         static boolean lsbl;
  //   //

  //operators
    // String str = "Hello, World!";
    // System.out.println(str);
        
    // }
}

// class String
// {

// }

class WhatCanBeInsideClass{
  //instance variables
  int primitiveIntVar;
  Integer wrapperIntegerVar;

  {

  }

  WhatCanBeInsideClass(){ //instance block automatically comes inside constructor during runtime
  //1st line of constructor super() will present, (you can use either super() or this() )
    System.out.println("Constructor() called automatically when object is created.");
  }

  public void disp(){ System.out.println("disp() method."); }

  //static variable
  int primitiveStaticIntVar;
  Integer wrapperStaticIntegerVar;

  static
  {

  }

  static public void show(){System.out.println("static show() methods.");}

  class InnerClass
  {
    public void innerClassShow(){ System.out.println("Inner Class show()"); }
  }
 
}

class Encapsulation
{//(bean)
  private int id;//read only
  private String name; //read and write value
  public static float donationAmount;//write only

  public int getId(){
    return id;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setDonation(float donationAmount){
    this.donationAmount = donationAmount;
  }

  public void setDonation(int donationAmount){
    this.donationAmount = donationAmount;
  }

}

class Inheritance extends Encapsulation{

  
  public void setDonation(int donationAmount){
    if(donationAmount>=500)
      this.donationAmount = donationAmount;
    else
      System.out.println("minimum 500 amount has to donate.(less that 500 is not accepted.)");
  }
}

abstract class Abstraction {}

interface Abstraction1{

  default void dispAbstraction1(){
    System.out.println("default methods inside an interface");
  }

}

class GrandFather { String property = "kazipet"; public void DrinkingTea(){ System.out.println("Heavy Tea Drinkers"); } }
class Father extends GrandFather {}
class Child1 extends Father {}
class Child2 extends Father {}

class Engine {}

class Car { 
  //has-A depenpency
  Engine e;
}

class WrapperClassImmutables{
  Integer iI;
  Byte iB;
  Short iS;
  Long iL;

  Float iF;
  Double iD;

  Character iC;
  Boolean iBl;
}

class StringConcept{
  String str1 = "Hello, World!";
  StringBuffer strBuf = new StringBuffer();
  StringBuilder strBuild = new StringBuilder();
}

class Varargs
{
   public int sum(int... a)
   {
    int sum = 0;
    for(int x:a){sum+=x;};
    return sum;
   }
}

// @FunctionalInteface
interface Display
{
  void disp();
}

