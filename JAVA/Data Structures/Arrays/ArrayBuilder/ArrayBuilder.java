public class ArrayBuilder {
    public static int [] getArray(int size){
        int []Array = new int[size];
        for(int i=0;i<size;i++){
            Array[i] = (int)(Math.random()*100);
        }
        return Array;
    }
}
