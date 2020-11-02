package oop;

// Counter is a simulation of a "click-counter" device that
// is used to count people passing through an entrance etc.
// Each click will add one to the counter's count

public class Counter {
    private int count;  // current count , initially 0
    private int limit;
    private int reset;

    // Constructor
    public Counter(int limit) {
        this.limit = limit; // 'this.' distinguishes field from parameter
        System.out.println("Counter constructor called, limit set to " + limit);
    }

    public Counter() {   // no-argument (default) constructor
        limit = 10;
    }

    public int getCount() {
        return this.count;
    }

    /**
     * click() increments the value of this counter by 1.
     */
    public void click() {
        if (count < limit) {
            count = count + 1;
        } else {
            System.out.println("Limit Reached");
        }
        System.out.println("Counter clicked! count = " + count);
    }
    public int getReset() {
        return reset;
    }

    public void setReset(int reset) {
        this.reset = reset;
    }

    public void reset(){
       this.count = 0;
        System.out.println("Reset the counter");
    }

    //TODO
    // Implement reset() method to set the count to 0.
    // the value of this counter to 0.
    // Test by calling from App start()

    //TODO
    // Implement an undo() method that will reduce the count by one.
    // Do not allow the count to become negative.
    // Print the value of count from the method after the decrement.
    // Call this undo() method from App start().

       public void undo(){
        if(this.count > 0){
            this.count = count -1;
            System.out.println("Counter undo! = " + this.count);
        }
}
    public void display() {
        System.out.println("Display count, count = " + this.count);
    }
}
