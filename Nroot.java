public  class Nroot{

    public static void main(String[] args){
        int num = 16;
        int x = 4;
        //int c = 1;
        
        for(int i =1; i <=num /2; i++){
            
            if(num % i == 0 ){
              
                int c = i;
                
                
            //System.out.println(c);  
            System.out.println();  
            
            
            int d = 1;
            int f = c;
            for(int j=1; j<=x; j++){
                d = d * f;
                if (d == num){
                    
                    //System.out.println(d);
                    //System.out.println();
                    System.out.println(f);
                }
            
        }
       
            
        }
        

    }
}
}
   
