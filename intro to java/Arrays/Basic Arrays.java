public class BasicsOfArrays {
    public static void main(String args[]) {
     int arr[]=new int[10];
     arr[0]=5;
     arr[5]=17;
     System.out.println(arr[0]);
     System.out.println(arr[5]);
     //arr[-1]=18; //Negative indexing is not allowed in Java like it is allowed in Python.
     //arr[10]=15;
    // System.out.println(arr[3]);
     //System.out.println(arr[4]);
     char[] cArray=new char[10];
     double[] dArray=new double[10];
     System.out.println(cArray[0]); //returns empty that is null which is initiliazed with zero.
     System.out.println(dArray[0]); //returns 0.0 which is equivalent to int zero.
     }
}
