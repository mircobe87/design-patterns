package pattern.creational.singleton;

/**
 * <p>An example of singleton implementation.</p>
 * <p>The constructor is private so, is no possible to invoke it to create more instances.</p>
 * <p>We provide only one static method <code>getInstance()</code> that returns the unique instance of this singleton.</p>
 *
 * <p>This is a no thread safe and eager implementation:</p>
 * <ul>
 *  <li>Access to the instance variable is not synchronized between thread.</li>
 *  <li>A new instance of this singleton is always created even if it will not be used.</li>
 * </ul>
 */
public class MySingleton {
    private static MySingleton instance = new MySingleton();

    private MySingleton() { }

    public static MySingleton getInstance() {
        return instance;
    }
}
