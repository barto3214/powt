import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> parzyste = new ArrayList<>();
        ArrayList<Integer> nieparzyste = new ArrayList<>();
        int [] wylos = new  int[100];
        for (int i = 0; i < wylos.length; i++) {
            wylos[i] = (int) (Math.random()*100 +1);

        }
        Arrays.sort(wylos);
        int najczestszyelement = wylos[0];
        int liczbawyst = 1;
        int akualelement = wylos[0];
        int akualliczbwyst = 1;
        for (int i = 1; i < wylos.length; i++) {
            if(wylos[i-1] == wylos[i]){
                akualliczbwyst++;
            }
            else{
                if(akualliczbwyst>liczbawyst) {
                    liczbawyst = akualliczbwyst;
                    najczestszyelement = akualelement;
                }
                    akualelement = wylos[i];
                    akualliczbwyst = 1;

            }
        }
        for(int i : wylos) {
            System.out.println(i);
        }
        System.out.println("Najczęstszy");
        System.out.println(najczestszyelement);
        System.out.println(liczbawyst);

    }
}