public class Calculator {

    private int a;
    private int b;
    private char sign;
    private int result;

    public int getA() { 
      return a; 
    }

    public void setA(int a) { 
      this.a = a; 
    }
    
    public int getB() { 
      return b; 
    }

    public void setB(int b) { 
      this.b = b; 
    }

    public int getSign() { 
      return sign; 
    }

    public void setSign(char sign) { 
      this.sign = sign; 
    }
    
    public int calculate() { 
        if (b == 0) {
            System.out.println("На 0 делить нельзя");            
        } else {
            switch (sign) {
                case '+': result = a + b;
                          break;
                case '-': result = a - b;
                          break;
                case '*': result = a * b;
                          break;
                case '/': result = a / b;
                          break;
                case '%': result = a % b;
                          break;
                case '^': result = (int) Math.pow(a, b);
                          break;
            }
        }
        return result;
    };
}
