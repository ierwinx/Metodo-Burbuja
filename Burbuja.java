package burbuja;

/**
 *
 * @author Erwin
 */
public class Burbuja {

    public static void main(String[] args) {
        int[] a = {3, 8, 100, 45, 99, 10, 9, 11, 0, -2};
        int aux;
        
        for(int i=0; i < a.length; i++) {
            for(int j=0; j < a.length-1; j++){
                if ( a[j] > a[j+1] ) {
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
                System.out.print(a[j] + "  ");
            }
            System.out.println();
        }
       
    }
    
}
