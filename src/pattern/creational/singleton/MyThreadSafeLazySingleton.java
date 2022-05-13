package pattern.creational.singleton;

/**
 * <p>An example of singleton implementation.</p>
 * <p>The constructor is private so, is no possible to invoke it to create more instances.</p>
 * <p>We provide only one static method <code>getInstance()</code> that returns the unique instance of this singleton.</p>
 *
 * <p>This is a thread safe and lazy implementation:</p>
 * <ul>
 *  <li>
 *      The modifier <code>volatile</code> ensures that updates done on the value of the variable
 *      <code>instance</code> will be performed in each copy of each thread has before any reading
 *  </li>
 *  <li>
 *      When a thread tries to get the singleton instance, if it found the instance null,
 *      the JVM synchronizes the access of the next peace of code, so those line will be execute
 *      once per thread.
 *      When a thread is unlocked, it needs to test again if the <code>instance</code> is <code>null</code>.
 *   </li>
 * </ul>
 */
public class MyThreadSafeLazySingleton {

    private static volatile MyThreadSafeLazySingleton instance = null;

    private MyThreadSafeLazySingleton() { }

    public static MyThreadSafeLazySingleton getInstance() {
        if (instance == null) {
            synchronized (MyThreadSafeLazySingleton.class) {
                if (instance == null) {
                    instance = new MyThreadSafeLazySingleton();
                }
            }
        }
        return instance;
    }
}
