package No2;

public class Faculty extends Employee{
    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String noTelp, String email, 
    String kantor, double gaji, MyDate tglBekerja, String jamKerja, String pangkat){
        super(nama, alamat, noTelp, email, kantor, gaji, tglBekerja);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString(){
        return "Faculty: " + nama;
    }
}
