import java.util.Array;
public class TaskSix {
}
public static int [] number(int [] array){
int largest = array[0];
for ( int count = 0; count < array.length; count++){  
if(array[count] > largest){
largest = array[count];
}
}
return largest;
}
public static void main( String...args){
int[] array = {1, 4, 7, 8, 10};
System.out.print(largest(array ));
}

