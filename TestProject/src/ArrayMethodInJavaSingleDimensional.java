
public class ArrayMethodInJavaSingleDimensional {
	static void min(int arr[]){  //need to ask this 
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(min>arr[i])  
		  min=arr[i];  
		System.out.println(min);  
	}


public static void main(String args[]){  
int b[]={33,3,4,5};//declaring and initializing an array  
min(b);//passing array to method  
}

//creating a method which receives an array as a parameter  
	static void printArray(int arr[]){  
	for(int i=0;i<arr.length;i++)  
	System.out.println(arr[i]);  
	}  
}
