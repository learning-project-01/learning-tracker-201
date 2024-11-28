public class InstanceExample {
    int instanceVariable;

    // Instance block
    {
        instanceVariable = 99;
        System.out.println("Instance block executed. Instance variable initialized.");
    }

    public InstanceExample() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        InstanceExample obj = new InstanceExample();
        System.out.println("Instance Variable: " + obj.instanceVariable);
    }
}
