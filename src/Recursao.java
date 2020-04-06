public class Recursao {
    //1
    public int fatorial(int n){
        if(n<=1){
            return 1;
        }
        return  n*fatorial(n-1);
    }
    //2
    public int fibbonaci(int n){
        if (n<=1) return n;

        return fibbonaci(n-2)+fibbonaci(n-1);
    }
    //3
    public int somaInteiros(int n){
        if(n<1) return n;

        return n+somaInteiros(n-1);
    }
    //4
    public int somaInteirosPares(int n){
        if(n<=1 || n%2!=0) return n;
        return n+somaInteirosPares(n-2);
    }
    //5
    public int somaArray(int[] a,int i){
        if(i<a.length) return a[i]+somaArray(a,i+1);

        return 0;
    }
    //6
    public void inverterArrayR(int[]a){
        inverterArray(a,0,a.length-1);
    }
    public void inverterArray(int []a, int i,int j){
        if(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            inverterArray(a, ++i, --j);
        }
    }
    //7
    public String inverterString(String a){
        if (a.equals("")||a==null) return a;

        return a.substring(a.length()-1)+inverterString(a.substring(0,a.length()-1));
    }


}
