package No2;

public class Staff extends Employee{
    private String title;

    public Staff(String nama, String alamat, String noTelp, String email, 
    String kantor, double gaji, MyDate tglBekerja, String title){
        super(nama, alamat, noTelp, email, kantor, gaji, tglBekerja);
        this.title = title;
    }

    @Override
    public final String toString(){
        return "Staff: " + nama;
    }
}
