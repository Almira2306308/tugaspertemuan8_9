package No2;

public class Student extends Person{
    public static final String mahasiswaBaru = "Mahasiswa Baru";
    public static final String tahunKedua = "Tahun Kedua";
    public static final String junior = "Junior";
    public static final String senior = "Senior";

    private String status;

    public Student(String nama, String alamat, String noTelp, String email, String status){
        super(nama, alamat, noTelp, email);
        this.status = status;
    }

    @Override
    public String toString(){
        return "Student: " + nama;
    }
}
