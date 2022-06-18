public class Main
{

    public static void main (String[] args) {  
        int a1[] = {6,8,2};  
        int a2[]={6,1,4};  
          int a3[]={2,0,6};
           	  int a4[]={7,3,8};
           	  int a5[]={3,8,0}; 
           	 int temp[] =  new int[3]; 
           	//  1) removing all wrong items  {7,3,8} and making common items false 
           for(int i=0;i<3;i++) 
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
        //   making {7,3,8} -1 as it is not required
        for(int i=0;i<3;i++)
        {
            a4[i]=-1;
        }
        // making second condition (6)=(-1) as it is not required
       a2[1]=-1;
            // comparing first second and third condition as 6 digit is not the number so eliminating it

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a1[i]==a2[j]){
                    a1[i]=-1;
                     }
            }
        }
          for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a2[i]==a3[j]){
                    a2[i]=-1;
                    a3[j]=-1;
}
            }
        }
        //   removing common digits
    
    for(int i=0;i<3;i++)
    {
    for(int j=0;j<3;j++)
    { 
          if(a1[i]==a3[j]){
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
 // -1 -1 2 
//  -1 -1 4
// -1 -1 -1 
// -1 -1 -1 
// -1 -1 0 
  for (int i=0; i<3; i++) 
{
  if(a1[i]!=-1 || a2[i]!=-1 ||a5[i]!=-1)
  {
     temp[2]=a1[i];
     temp[0]=a5[i];
     temp[1]=a2[i];
     
  }
}
//   Displaying the correct three number

System.out.print("the three digit key is"+" ");
 for (int i=0; i<3; i++) 
{
    System.out.print( temp[i]);
}
// Output
// the three digit key is 042
      }  
}