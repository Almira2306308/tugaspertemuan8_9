package No2;

public class Employee extends Person{
    protected String kantor;
    protected double gaji;
    protected MyDate tglBekerja;

    public Employee(String nama, String alamat, String noTelp, String email, 
    String kantor, double gaji, MyDate tglBekerja){
        super(nama, alamat, noTelp, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tglBekerja = tglBekerja;
    }

    @Override
    public String toString(){
        return "Employee: " + nama;
    }
}
