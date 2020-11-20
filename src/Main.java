public class Main {
    public static void main(String[] args) {
        float refill =  (float) 1100f;
        float result;
        byte start = 100;
        float bonus;
        if (refill < 1000.00) {
            bonus = 0;
        } else {
            bonus = refill / 100;
        }
        {
            result = start + bonus + refill ;
        }
        {
            System.out.println(result);
        }
    }
}
