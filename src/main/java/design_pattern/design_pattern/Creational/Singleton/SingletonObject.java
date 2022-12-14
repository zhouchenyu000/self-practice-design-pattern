package design_pattern.design_pattern.Creational.Singleton;

public class SingletonObject 
{
    private static SingletonObject instance;
    private SingletonObject(){
        // 很多code，建立物件需要花費很多資源
    }

    // 多執行緒時，當物件需要被建立時才使用synchronized保證Singleton一定是單一的
    public static SingletonObject getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new SingletonObject();
                }    
            }
        } 
        return instance;
    }
}
