package pattern.creational.singleton;

/**
 * <p>An example of singleton implementation.</p>
 * <p>The constructor is private so, is no possible to invoke it to create more instances.</p>
 * <p>We provide only one static method <code>getInstance()</code> that returns the unique instance of this singleton.</p>
 *
 * <p>This is a no thread safe and lazy implementation:</p>
 * <ul>
 *  <li>Access to the instance variable is not synchronized between thread.</li>
 *  <li>A new instance will be created the first time someone needs for it.</li>
 * </ul>
 */
public class MyLazyLoadedSingleton {

    private static MyLazyLoadedSingleton instance = null;

    private MyLazyLoadedSingleton() { }

    public static MyLazyLoadedSingleton getInstance() {
        if (instance == null) {
            instance = new MyLazyLoadedSingleton();
        }
        return instance;
    }
}
