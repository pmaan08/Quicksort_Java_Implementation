public class Quicksort
{
  private static int partition(Comparable[] a ,int lo , int hi)
  {
     int i=lo, j=hi+1;
     while(true)
     {
       while(less(a[++i],a[lo]) )
       {
         if(i==hi){ break; }
       }
       while(less( a[lo],a[--j]))
       {
           if(j==lo) break;
       }
       if(i>=j) break;
       exch(a,i,j);
    }
    
    exch(a,lo,j);
    return j;
  }
  
 public static void sort(Comparable[] a)
 {
    StdRandom.shuffle(a);     //shuffling is required to guarentee performance and so it doesn't take quadratic time 
    sort(a,0,a.length-1);    
 }
 
 private static void sort(Comparable[] a ,int lo, int hi)
 {
   if(hi<=lo) retrurn ;
   int j= partition(a,lo,hi);
   sort(a,lo,j-1);
   sort(a,j+1,hi);
 }
  
  private static void exch(Object[] a, int i, int j) 
  {     
    Object tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

}
