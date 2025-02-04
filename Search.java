public class Search {
    public static void main(String[] args)
    {
        System.err.println(summ(1,2,3));
    }

    static int summ(int... numbers)
    {
        int sum = 0;

        for(int num:numbers){
            sum += num;
        }

        return sum;
    }
}
