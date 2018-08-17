
package Video25MatricesKev;


public class Matriz {
  
    public void llenar_imprimir(){
        
         int [][] matriz = new int[4][5];
        
        matriz[0][0]=15;
        matriz[0][1]=21;
        matriz[0][2]=18;
        matriz[0][3]=9;
        matriz[0][4]=15;
        
        matriz[1][0]=10;
        matriz[1][1]=52;
        matriz[1][2]=17;
        matriz[1][3]=19;
        matriz[1][4]=7;
        
        matriz[2][0]=19;
        matriz[2][1]=2;
        matriz[2][2]=19;
        matriz[2][3]=17;
        matriz[2][4]=7;
        
        matriz[3][0]=92;
        matriz[3][1]=13;
        matriz[3][2]=13;
        matriz[3][3]=32;
        matriz[3][4]=41;
        
        System.out.print("La matriz creada queda asi: ");
        
        System.out.println();
        
        for(int i=0; i < 4; i++){
    
            System.out.println();
            
            for(int z=0; z < 5; z++){
                
                System.out.print(matriz[i][z] + " ");
                
            }
        }
    }
    
    
}
