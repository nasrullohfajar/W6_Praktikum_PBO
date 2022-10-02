package Multiple_Inheritance;

abstract class Sortable implements shell_sort{

	public abstract int compare(Sortable b);
	public static void shell_sort(Sortable[] a) {
		
		int n = a.length;
		Sortable temp;
	    for (int interval = n/2; interval > 0; interval /= 2)  
	    {  
	        for (int i = interval; i < n; i += 1)  
	        {   
	            temp = a[i];
	            int j;        
	            for (j = i; j >= interval && a[j-interval].compare(temp)> 0; 
	            		j -= interval) 
	                a[j] = a[j - interval];  
	            a[j] = temp; 
	        }  
	    }  
	}
}
