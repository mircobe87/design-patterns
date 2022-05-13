package pattern.creational.builder;

/**
 * Example of a complex bean class where its creation is managed by a builder.
 * This patter is typically used to manage immutable classes.
 * This patter is a good choice when we have a complex class with several properties
 *   to be set up thus can require a lot of different constructors to manage all combination
 *   of setting up of its properties.
 */
public class MyComplexBean {

    /**
     * The builder class to create <code>MyComplexBean</code> instances.
     */
    public static class Builder {

        // the builder class typically has the same properties of the class we want to build.
        private String firstProp;
        private String secondProp;
        private String thirdProp;
        private String fourthProp;

        // in the builder constructor we can add some parameters, for example to make some properties mandatory.
        public Builder() { }

        // each builder method return the builder itself, so we can do a chain of method calls

        public Builder firstProp(String firstProp) {
            this.firstProp = firstProp;
            return this;
        }

        public Builder secondProp(String secondProp) {
            this.secondProp = secondProp;
            return this;
        }

        public Builder thirdProp(String thirdProp) {
            this.thirdProp = thirdProp;
            return this;
        }

        public Builder fourthProp(String fourthProp) {
            this.fourthProp = fourthProp;
            return this;
        }

        // the build method return the new instance invoking the private
        // constructor of the main class passing itself as parameter.
        public MyComplexBean build() {
            return new MyComplexBean(this);
        }
    }

    private String firstProp;
    private String secondProp;
    private String thirdProp;
    private String fourthProp;

    // one private constructor that accept the builder "configured" to create the instance.
    private MyComplexBean(Builder builder) {
        this.firstProp = builder.firstProp;
        this.secondProp = builder.secondProp;
        this.thirdProp = builder.thirdProp;
        this.fourthProp = builder.fourthProp;
    }

    // here we have only setter methods to make this class immutable.

    public String getFirstProp() {
        return firstProp;
    }

    public String getSecondProp() {
        return secondProp;
    }

    public String getThirdProp() {
        return thirdProp;
    }

    public String getFourthProp() {
        return fourthProp;
    }
}
