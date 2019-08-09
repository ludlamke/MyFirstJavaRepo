package AbstractVsInterface;

interface Feline 
{
  void breed();
  void fur();
  final int numC = 10;
} 

abstract class Dog
{
    
   abstract void breed();
   abstract void numOfBreed();
    protected void Bark()
    {
        System.out.println("doggie goes bark bark");
    }
}

class Pug extends Dog
{

void breed()
{
    System.out.println("dog is pug");
}

void numOfBreed()
{
 System.out.println("number of breed is 5");
}
}

class persian implements Feline
{
   
  public void breed()
  {
     System.out.println("cat in pushian");
  }

  public void fur()
  {
    System.out.println("white");
  }

  void NumOfCats()
  {
    System.out.println(numC);
  }
}

class MainClassA
{
    public static void main(String[] args) {
        Pug dog1 = new Pug();

        dog1.breed();
        dog1.numOfBreed();
        dog1.Bark();
    }
    
}
class MAinClassI
{
    public static void main(String[] args) {
        persian cat1 = new persian();

        cat1.NumOfCats();
        cat1.fur();
        cat1.breed();
    }
}