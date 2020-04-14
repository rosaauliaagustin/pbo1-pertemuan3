package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs     : \"Terima kasih pak\"");
                System.out.println("Dosen   : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs     : \"Buhen ulun jida duan A, Pak?\"");
                System.out.println("Dosen   : \"Aweh ikau? \"");
                break;
            case 'C':
                System.out.println("Mhs     : \"Ulun muhun tarus pak ai, tugas pul kia\"");
                System.out.println("Dosen   : \"Tapi kawalah menjawab ujian?\"");
                System.out.println("Mhs     : \"Hihihi..\"");
                break;
            case 'D':
                System.out.println("Mhs     : \"Ulun muhun tarus pak ai, tugas pul kia\"");
                System.out.println("Dosen   : \"Bujur kia kah?\"");
                System.out.println("Dosen   : \"*memeriksa berkas\"");
                System.out.println("Dosen   : \"*menceleng\"");
                System.out.println("Mhs     : \"Kabur..\"");    
        }
    }
}
