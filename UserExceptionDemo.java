import Userexception;
class UserExceptionDemo {
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