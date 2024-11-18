package Nov.ex_16112024;

public class Lab_194 {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",121);
        System.out.println(sbi.add(icici));

        Bank jp_chase = new Bank("USD",100);
        // 100 + 100*85 = 8600
        System.out.println(sbi.add(jp_chase));

    }
}
