package bagian2.Arraylist;

    import java.util.ArrayList;

public class NamaAwalA {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ani");
        nama.add("Citra");
        nama.add("Ahmad");
        nama.add("Dina");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}