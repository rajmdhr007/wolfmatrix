public class Main
{
 public static void main (String[] args) {  
        int a1[] = {1,4,7}; 
   int a2[]={1,8,9};  
          int a3[]={9,6,4};
           	  int a4[]={5,2,3};
           	  int a5[]={2,8,6}; 
           	 int temp[] =  new int[3];  // For storing the result
           	//   1) removing all wrong items  {5,2,3} and making common items false 
           For (int i=0;i<3;i++) 
            {
               for(int j=0;j<3;j++)
        {
                   if(a4[i]==a1[j])
                   { 
                       a1[j]=-1;
                   } 
                    if(a4[i]==a2[j]) 
                   { 
                       a2[j]=-1; 
                   }
                    if(a4[i]==a3[j])
                   { 
                       a3[j]=-1;
                   } 
                    if(a4[i]==a5[j])
                   { 
                       a5[j]=-1;
          
                   }
               } 
           }
        //   making {5,2,3} -1 as it is not required
        for(int i=0;i<3;i++)
        {
            a4[i]=-1;
        }
           
            // comparing first and second condition as 1 digit is not the number so eliminating it

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a1[i]==a2[j]){
                    a1[i]=-1;
                    a2[j]=-1;

                }
            }
        }
        
        
        // comparing first and third condition  as 4 digit is wrong as the 7  digit is right
        
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a1[i]==a3[j]){
                    a1[i]=-1;
                    a3[j]=-1;

                }
            }
        }
        // comparing second and last array as 8 digit is not the right ans
        
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a2[i]==a5[j]){
                    a2[i]=-1;
                    a5[j]=-1;

                }
            }
        }
      
        
    
//   removing common digits
    
    for(int i=0;i<3;i++)
    {
    for(int j=0;j<3;j++)
    { 
          if(a2[i]==a3[j]){
            a3[j]=-1;
        }
      
    }
    }
     for(int i=0;i<3;i++)
    {
    for(int j=0;j<3;j++)
    { 
          if(a5[i]==a3[j]){
            a3[j]=-1;
        }
      
    }
    }
    
    //printing array digits after removing the unrequired digits making it -1
    
         for (int i=0; i<3; i++)  
        {
           System.out.print(a1[i]+" "); 
          
           
        }
         System.out.print("\n");
         for (int i=0; i<3; i++)  
        {
           System.out.print(a2[i]+" ");  
           
        }
          System.out.print("\n");
         for (int i=0; i<3; i++)  
        {
           System.out.print(a3[i]+" ");  
           
        }
          System.out.print("\n");
         for (int i=0; i<3; i++)  
        {
           System.out.print(a4[i]+" ");  
           
        }
          System.out.print("\n");
          for (int i=0; i<3; i++)  
        {
           
              System.out.print(a5[i]+" "); 
        }
        System.out.print("\n");
          
     
    // Output
 // -1 -1 7 
//  -1 -1 9 
// -1 -1 -1 
// -1 -1 -1 
// -1 -1 6 
  for (int i=0; i<3; i++) 
{
  if(a1[i]!=-1 || a2[i]!=-1 ||a5[i]!=-1)
  {
     temp[1]=a1[i];
     temp[0]=a5[i];
     temp[2]=a2[i];
     
  }

  
     
}
//   Displaying the correct three number

System.out.print(“The three digit key is”+” “);
 for (int i=0; i<3; i++) 
{
  
  System.out.print(temp[i]);

  
     
}
// Output
// The three digit key is 679
      
}  
}
