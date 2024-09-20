import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> parzyste = new ArrayList<>();
        ArrayList<Integer> nieparzyste = new ArrayList<>();
        int [] wylos = new  int[100];
        for (int i = 0; i < wylos.length; i++) {
            wylos[i] = (int) (Math.random()*100 +1);

        }
        for (int i = 0; i < wylos.length; i++) {
            if(i % 2 == 0){
                parzyste.add(i);

            }
            else{
                nieparzyste.add(i);
            }
        }
        System.out.println(parzyste);
        System.out.println(nieparzyste);
    }
}