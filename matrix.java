public class matrix {
    public static void main(String[] args)
    {
        String[] uzbekisan = {"Tashkent" , "Bukhara" , "Khorazm"};
        String[] usa = {"New York" , "Los Angeles" , "Mexico"};
        String[] russia = {"Moscow" , "Nimadir" , "Yana"};

        String[][] world = {uzbekisan , usa , russia};

        for(String[] country : world){
            for(String city : country){
                System.err.print(city + " ");
            }         
            System.out.println();   
        }
    }
}
