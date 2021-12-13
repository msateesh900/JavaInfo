
import java.util.*;

class SingletonExample{

//private static volatile SingletonExample instance=new SingletonExample();
private static volatile SingletonExample instance=null;

private SingletonExample(){}

//public static SingletonExample getInstance(){
//return instance;
//}

public static SingletonExample getInstance(){
if(instance==null){
synchronized(SingletonExample.class){
if(instance==null){
instance=new SingletonExample();
}
}
}
return instance;
}

public String displayMessage(){
return "SingletonExample";
}
}


public class SingletonMainExample{

public static void main(String[] args){

SingletonExample sc=SingletonExample.getInstance();

//SingletonExample sc1=new SingletonExample();

System.out.println(sc.displayMessage());
System.out.println(sc1);
}
}