/*
 * User Defined Exception Demo
 *
 * 1. Create a class by extending Exception class
 * 2. Write a parameterized constructor.
 * 3. Override the toString() method.
 *
 * Usage:
 *   javac UserExceptionDemo.java
 *   java UserExceptionDemo 2 10 
 *   java UserExceptionDemo 10 2
 */
class MyException extends Exception {

  String message;

  MyException(String message) { // Parameterized constructor.
    this.message = message;
  }

  public String toString() { // Returns a string representation of the object.
    return this.message;
  }
}

    public static void main(String args[]) {
      try {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a>b) {
          throw new MyException("a is max"); // Invoke user defined exception.
        } else {
          throw new MyException("b is max or equal"); // Invoke user defined exception.
        }

      } // end of try
      catch (MyException m) {
        System.out.println(m); // Invokes toString();
      }

    }

}
