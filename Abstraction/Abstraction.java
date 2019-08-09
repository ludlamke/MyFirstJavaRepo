package Abstraction;

abstract class Tea // abstract class
{
    // hiding certain details and showing only essential information to the user
    // An abstract class is a superclass that cannot be instantiated and is used to state or define general characteristics
    abstract void flavor(); // abstract method

    public void drink(boolean drank) // regular method 
    {
        System.out.println(drank);
    }
}

class LemonTea extends Tea // method that extends abstract method Tea
{
    
 void flavor()
{
    System.out.println("Lemon Tea Gets lemon");
}

}

class MangoTea extends Tea
{
 void flavor()
 {
    System.out.println("Mango Tea Gets mango");
 }
}
class MainClass
{
    public static void main(String[] args) {
        boolean isdrunky = true;
        boolean isdrunkn = false;
        LemonTea ltea = new LemonTea();
        MangoTea mTea = new MangoTea();
        //Tea myTea = new Tea();
        
        ltea.flavor();
        ltea.drink(isdrunky);
        mTea.flavor();
        mTea.drink(isdrunkn);

        
    }
}