class fastthing
{
    
      public static void main(String[] args) 
      {
        int arraynum[] = new int[]{5,7,2,4,9};
        int even = 0;
        int odd = 0;

        for(int i = 0; i < arraynum.length; i++)
        {
          
          if(arraynum[i]%2 == 0)
          {
            even++;
          }
          else
          {
            odd++;
          }
        }
        
        System.out.println("evennum: " + even);
          System.out.println("oddNum: " + odd);

      }


}