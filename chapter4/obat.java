public class obat{
    static void klasifikasi(int usia,String jenis_kelamin,int berat_badan){
        if((berat_badan > 150 && jenis_kelamin =="Laki-Laki") || (usia < 21 && berat_badan < 150 && jenis_kelamin =="Perempuan")){
            System.out.println("OBAT 1");
        }else if((usia > 21 && berat_badan > 150 && jenis_kelamin == "Laki-Laki") || (usia < 21 && berat_badan > 150 && jenis_kelamin == "Laki-Laki")){
            System.out.println("OBAT 2");
        }else if((usia < 21 && berat_badan < 150 && jenis_kelamin == "Laki-Laki") || (berat_badan < 150 && jenis_kelamin == "Perempuan")){
            System.out.println("OBAT 3");
        }else{
            System.out.println("TIDAK ADA OBAT");
        }
    }
    public static void main(String[] args){
        klasifikasi(21,"Perempuan",120);
    }
}