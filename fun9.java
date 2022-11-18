class fun9{
    public static int[] add(int arr[]) {
        return arr;
    }
    public static int sum(int arr1[]) {
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        sum=sum+arr1[i];
        return sum;
    }
    public static int[] asnd(int a[]) {
        
        for(int i=0;i<a.length;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[min]>a[j])
                {
                    min=j;
                }
            }
            //---swap---
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] =new int[]{4,3,5,1,9,10,6};
        int[] x=add(arr);
        for(int i=0;i<x.length;i++)
        System.out.println(x[i]);
        System.out.println("---------");
        int y1=sum(arr);
        System.out.println(y1);
        System.out.println("---------");
        int y[]=asnd(arr);
        for(int i=0;i<y.length;i++)
        System.out.println(y[i]);
    }
}