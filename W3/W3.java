 class Room101 
{
    int deskNum = 4;
    int chairNum = 8;
    String whatAmI = "it's a classroom";

   public static void main(String[] args)
   {

        // an object it an instance on a class 
        Room101 roomObj = new Room101(); 
        // you can have more that one object of a class
        Room101 roomObj2 = new Room101();  

        // you can creat an object and asses it in another class
        Closet colosobj  = new Closet();  

        System.out.println(roomObj.deskNum +" is room1 desk num" );
        System.out.println(roomObj.chairNum +" is room1 chair num" );
        System.out.println(roomObj2.deskNum + " is room2 desk num" );
        System.out.println(colosobj.jacket + " is jackit num");
        System.out.println(colosobj.whatAmI);

   } 
}

class Closet

{
    int jacket = 3;
    String whatAmI = "it's a Closet";

    public static void main(String[] args)
    {
        Closet closObj = new Closet();
        Room101 closRoom = new Room101(); // you can creat an object and asses it in another class 

        System.out.println(closRoom.chairNum + " chair in room 101");
        System.out.println(closObj.jacket + " jacket in Closet");
        System.out.println(closRoom.whatAmI);
       
        
    }
}