
public class BracePair {
	public BracePair()
	{
		 int cnt = 2;
		    char[] array = new char[2*cnt];
		    print_pare(cnt, cnt, array, 0);
	}
	
	void print_pare(int l, int r, char str[], int cnt){
	    if(l<0 || r<l) return;
	    if(l==0 && r==0){
	        for(int i=0; i<cnt; ++i){
	            System.out.print(str[i]);
	        }
	        System.out.println(", ");
	    }
	    else{
	        if(l > 0){
	            str[cnt] = '(';
	            print_pare(l-1, r, str, cnt+1);
	        }
	        if(r > l){
	            str[cnt] = ')';
	            print_pare(l, r-1, str, cnt+1);
	        }
	    }
	}
	
	
	public static void main(String[] args)
	{
		new BracePair();
	}
}
