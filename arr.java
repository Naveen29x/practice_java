
public class arr {

        public static void main(String[] args) 
        {
        
            int arr[]={2,3,7,4,5};
            int largest= arr[0];
            int small= arr[0];
               
            for(int i=0;i<arr.length;i++){
                if(arr[i]<small){
                    small=arr[i];
                }
                if(arr[i]>largest){
                    largest=arr[i];
                }
            }
       System.out.println(largest);
System.out.println(small);

        
    }
}
  
   



