
package arrays;


public class Arrays {

    
    public static void main(String[] args) {
       
        int [] testeArrays = new int [5];
        testeArrays[0] = 100;
        testeArrays[1] = 200;
        testeArrays[2] = 300;
        testeArrays[3] = 400;
        testeArrays[4] = 500;
                
        
        int [] testeArrays2 = new int[]{1,2,3,4,5};
        
        int [] testeArrays3 = {1,2,3,4,5};
        
       for(int i=0; i<=4; i++){ 
        System.out.println("Array 1 na posição "+i+" com o valor "+ testeArrays[i]);
       }
       for (int i=0; i<=4; i++){
        System.out.println("Array 2 na posição "+i+" com o valor "+ testeArrays2[i]);
       }
       for (int i=0; i <=4; i++){
        System.out.println("Array 3 na posição "+i+" com o valor "+ testeArrays3 [i]);
       }
    }
    
}
