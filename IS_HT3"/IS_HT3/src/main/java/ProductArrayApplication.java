
import java.util.Arrays;
import java.util.OptionalLong;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardo
 */
public class ProductArrayApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long[] resultado= null;
        long[] entrada = null;
        
        entrada = new long[] {1, 2, 3, 4, 5 };
        resultado= calculateProductArrayBasic(entrada);
        System.out.println("Probando "+Arrays.toString(entrada)+" - Resultado "+Arrays.toString(resultado));
        
        entrada = new long[0];
        resultado =calculateProductArrayBasic(entrada);
        System.out.println("Probando "+Arrays.toString(entrada)+" - Resultado "+Arrays.toString(resultado));
        
        entrada = new long[]{0, 1};
        resultado =calculateProductArrayBasic(entrada);
        System.out.println("Probando "+Arrays.toString(entrada)+" - Resultado "+Arrays.toString(resultado));
        
        entrada = new long[]{1, 0,2,4,3};
        resultado =calculateProductArrayBasic(entrada);
        System.out.println("Probando "+Arrays.toString(entrada)+" - Resultado "+Arrays.toString(resultado));
        
        entrada = new long[]{1, 5,2,0,3};
        resultado =calculateProductArrayBasic(entrada);
        System.out.println("Probando "+Arrays.toString(entrada)+" - Resultado "+Arrays.toString(resultado));
        
        entrada = new long[]{1};
        resultado =calculateProductArrayBasic(entrada);
        System.out.println("Probando "+Arrays.toString(entrada)+" - Resultado "+Arrays.toString(resultado));
        
        entrada = new long[]{0};
        resultado =calculateProductArrayBasic(entrada);
        System.out.println("Probando "+Arrays.toString(entrada)+" - Resultado "+Arrays.toString(resultado));
        
        entrada = null;
        resultado =calculateProductArrayBasic(entrada);
        System.out.println("Probando "+Arrays.toString(entrada)+" - Resultado "+Arrays.toString(resultado));
        
        entrada =  new long[]{};
        resultado =calculateProductArrayBasic(entrada);
        System.out.println("Probando "+Arrays.toString(entrada)+" - Resultado "+Arrays.toString(resultado));
        
        
        entrada =  new long[]{2,4,  0};
        resultado =calculateProductArrayBasic(entrada);
        System.out.println("Probando "+Arrays.toString(entrada)+" - Resultado "+Arrays.toString(resultado));
        
        
    }
    
    public static long[] calculateProductArrayBasic(long[] input){
        long[] l2=null;
        
        
        if(input!=null){
             
        l2=Arrays.copyOf(input,input.length);
        
        
        Arrays.fill(l2, 0);
        
        
        OptionalLong resp= Arrays.stream(input).reduce((a,b)->a*  b );
        
        long[] l3 = null;
        
        l3= Arrays.copyOf(input,input.length);
        
        Arrays.sort(l3);
        
        for(int i=0; i<input.length; i++){
         
            long dato = input[i];
            int pos = Arrays.binarySearch(l3, dato);
           
            long l4=l3[pos];
            l3[pos]=1;
            OptionalLong op= Arrays.stream(l3).reduce((a,b)->a*  b );
           
            l2[i]=op.getAsLong();
            l3[pos]=l4;
        }
        }
        return l2;
    }
    
}
