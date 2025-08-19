public class TaskFour{
public int getNearestPump(int gallonfuel , int miles) {
int newMile = miles + miles;
if(newMile == gallonfuel) {
 return true;
}else {
  return false;
}
}
public static void main(String...args) {
System.out.print(getNearestPump(20, 20));
}
}