class Demo {
    public static void main(String[] args) {

      //MySingleton singletonPointer = new MySingleton(); //when the private constructor introduced, this is no longer executable
        MySingleton singletonPointer = MySingleton.getObject();
        MySingleton singletonPointerTwo = MySingleton.getObject();

        System.out.println(MySingleton.getObject()); // object memory location
        System.out.println(singletonPointer.getValue()); // pointer = 0
        singletonPointer.setValue(10); // pointer = 10
        System.out.println(singletonPointer.getValue());
        System.out.println(singletonPointerTwo.getValue()); // pointer2 = 10
        singletonPointerTwo.setValue(100); // pointer2 = 100
        System.out.println(singletonPointerTwo.getValue());
        System.out.println(singletonPointer.getValue()); //pointer = 100

        //what I have done is prevent direct instantiation of a new object
        // the singleton is created with the first getObject method
        // the subsequent getObject method assigns the same singleton to a new pointer
        // values of first pointer and second pointer assigned to demonstrate that only single object in memory exists and only 1 can exist

    }
}

class MySingleton {
    private int value = 0;
    static MySingleton object = new MySingleton(); // step 1: create a static instance using new keyword in the new class
    private MySingleton(){} // step 2: create a private constructor
    public static MySingleton getObject(){  // step 3: create a public static getter that returns the object
        return object;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

}


