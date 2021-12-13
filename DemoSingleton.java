import java.io.Serializable;
public class DemoSingleton implements Serializable {
    private static final long serialVersionUID = 1L;
 
    private DemoSingleton() {
        // private constructor
    }
 
    private static class DemoSingletonHolder {
        public static final DemoSingleton INSTANCE = new DemoSingleton();
    }
 
    public static DemoSingleton getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }
 
    protected Object readResolve() {
        return getInstance();
    }

	public static void main(String[] args) {
	 DemoSingleton ds=new DemoSingleton();
	 System.out.println("singleton object reference"+ds);
         DemoSingleton ds1=new DemoSingleton();
	 System.out.println("singleton object reference1"+ds1);
	}
}