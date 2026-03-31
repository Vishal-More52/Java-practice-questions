public class pattern5 {
    public static void main(String[] args) {
       int v=5;
       int d=4;
       for(int i=1 ; i<=v ; i++)
       {
            for(int j=1 ; j<=d ; j++   )
            {
                if(i%2==0 || j%2==0 || j==1 || i==1 || j==d || i==v)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.println();
                }
            
            }
             //System.out.println();
       } 
        for(int i= v; i>=1 ; i--)
       {
            for(int j=1 ; j<=d ; j++   )
            {
                if(i%2==0 || j%2==0 || j==1 || i==1 || j==d || i==v)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("*");
                }
            
            }


            
            
            System.out.println();
       } 
    }
}
