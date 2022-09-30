import java.util.Random;
public class CDIO {
    public static void main(String[] args){

    Random ranNum = new Random();

    int totalSpillerA=0;
    int totalSpillerB=0;
    int randomNummer=0;
       while(totalSpillerA <=40 || totalSpillerB<=40) {
            randomNummer = ranNum.nextInt(6)+1;
            totalSpillerA = totalSpillerA + randomNummer;
            System.out.println(randomNummer + " ");
            randomNummer = ranNum.nextInt(6) + 1;
            totalSpillerB = totalSpillerB + randomNummer;
            System.out.println(randomNummer);
            System.out.println(" ");
        }
        if(totalSpillerA > totalSpillerB) {
            System.out.println("");
            System.out.println("A vinder Total: " + totalSpillerA);
        } else if (totalSpillerB > totalSpillerA) {
            System.out.println("");
            System.out.println("B vinder Total: " + totalSpillerA);
        } else {
            System.out.println("");
            System.out.println("Uafgjort" + totalSpillerA);
        }
    }
}
