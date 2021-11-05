import static java.lang.Math.sqrt;

public class Funcion {

    private boolean isPerfectSquare(long n) {
        long s = (long)(sqrt(n) + 0.5);
        return s*s == n;
    }

    public boolean isFibbonaci(int n){
        if (n<0)
            return false;
        else
            return (isPerfectSquare((5*n*n)+4) || isPerfectSquare((5*n*n)-4));
    }

    public int cantCaracteres(String msg, char x){
        int i, contador=0;
        i = msg.indexOf(x);
        while(i != -1){
            contador++;
            i = msg.indexOf(x,i+1);
        }
        return contador;
    }

    private boolean esPrimo(int n){
        if (n < 2 || n == 4)
            return false;
        for(int i = 2; i < n/2 ; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int sumaPrimos(int n){
        int toReturn=0;
        for(int i=0; i<n;i++){
            if(esPrimo(i)){
                toReturn += i;
            }
        }
        return toReturn;
    }
}