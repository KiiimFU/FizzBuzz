public class Multiples {
    public static void main(String[] args) {
        int x=3;
        int count= 0;
        while (x<1000)
        {
            if (x%3==0)
            {
                count+=1;
            }
            else if (x%5 == 0)
            {
                count++;
            }
            x += 1;

        }
        System.out.println(count);
    }
}
