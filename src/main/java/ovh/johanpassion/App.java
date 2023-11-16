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

        public static void louis(){
        int nbreCarac = 5;
        while (nbreCarac != 0){
            int nbre = 1;
            for (int i = 1 ; i <= nbreCarac;i++){
                System.out.print(" ");
            }   
            nbreCarac = nbreCarac -1;
            System.out.print(nbre);
            nbre = nbre + 1;
            System.out.println();
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
            for (int r =5; r>0;r--){
                    System.out.print("");
                for (int i =0; i<r;i++){
                    System.out.print(" ");             
                }
                int e=r;
                while(e>0){
                    System.out.print(r);
                    e--;
                    

                }
                System.out.println("");         
            }
        }
        public static void motif7(){
            for(int e = 0;e<3;e++){
                for(int i =0;i<10;i++){
                        int r = 3;
                        while(r!=0){
                            System.out.print(i);
                            r--;
                        }
                    System.out.print("");;
                }
                System.out.println("");
            }
        }
        public static void motif8(){
            for(int e = 0;e<3;e++){
                for(int i =9;i>-1;i--){
                        int r = 5;
                        while(r!=0){
                            System.out.print(i);
                            r--;
                        }
                    System.out.print("");;
                }
                System.out.println("");
            }
        
        }
        public static void motif9(){
            for(int e = 0;e<3;e++){
                for(int i =9;i>0;i--){
                    int r = i;
                        while(r!=0){
                            System.out.print(i);
                            r--;
                        }
                    System.out.print("");;
                }
                System.out.println("");
            }
        }
        public static void motif10(){
            
        }
        
        
    }
    public static void main(String[] args) {
        //main.suite1();
        //main.suite2();
        //main.suite3();
        main.motif9();
        //main.louis();
    }
    
    
}
