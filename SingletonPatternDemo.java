class SingleObject {

   //create an object of SingleObject
   private static SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}

// 1.Eager Singleton

class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();
 
    // private constructor
    private EagerSingleton() {}
 
    public static EagerSingleton getInstance() {
        return instance;
    }
    public void showMessage(){
      System.out.println("Eager Singleton!!!");
   }
}

// 2. Lazy Singleton
class LazySingleton {
    private static volatile LazySingleton instance = null;
 
    // private constructor
    private LazySingleton() {
    }
 
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                // Double check
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}


public class SingletonPatternDemo {
   public static void main(String[] args) {

      //illegal construct
      //Compile Time Error: The constructor SingleObject() is not visible
      //SingleObject object = new SingleObject();

      //Get the only object available
      SingleObject object2 = SingleObject.getInstance();

      //show the message
      object2.showMessage();

	EagerSingleton es=EagerSingleton.getInstance();
	es.showMessage();

	LazySingleton ls=LazySingleton.getInstance();
	ls.showMessage();


   }
}