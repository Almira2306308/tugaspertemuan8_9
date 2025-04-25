package No1;

public class ObjekGeometris{
    private String warna;
    private boolean terisi;

    public ObjekGeometris(){

    }

    public ObjekGeometris(String warna, boolean terisi){
        this.warna = warna;
        this.terisi = terisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public boolean cekTerisi(){
        return terisi;
    }

    public void setTerisi(boolean terisi){
        this.terisi = terisi;
    }

    public String toString(){
        return "warna: " + warna + "Terisi: " + terisi;
    }
}
