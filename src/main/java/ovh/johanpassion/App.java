package ovh.johanpassion;

public class App {
    /**
     * main
 
 public static void suite1(){
    
 }    */
    public static class main {
        public static void suite1(){
            int nb =0;
        for(int i =-4; nb<86;i+=18){
            nb=i;
            System.out.print(nb+" ");
        }
        }

        public static void suite2() {
            int nombreUn = 0;
            int nombreDeux = 1;
            int i=0;
            while (i!=20) {
                System.out.print(" "+nombreUn+" "+nombreDeux);
                nombreUn+=nombreDeux;
                nombreDeux+=nombreUn;
                i++;
            }
            
        }

        public static void suite3(){
            for(int i=0; i<30;i++){
                System.out.print((Math.pow(i, 2))+" ");
                
            }
        }
        
        public static void motif3(){
            String etoile = "*";
            for (int r =0; r<6;r++){
                for (int i =0; i<r;i++){
                    System.out.print(etoile);
                }
                System.out.println("");             
            }
        }
        public static void motif4(){
            for (int r =0; r<6;r++){
                for (int i =0; i<r;i++){
                    System.out.print(r);
                }
                System.out.println("");             
            }
        }

        public static void motif5(){
            
        }
        
    }
    public static void main(String[] args) {
        //main.suite1();
        //main.suite2();
        //main.suite3();
        main.motif4();
        
    }
    
    
}
