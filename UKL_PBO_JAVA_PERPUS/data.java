package UKL_PBO_JAVA_PERPUS;

public interface data {
     public static void main(String[] args) {
         Member member1 = new Member();
         member1.student();
         member1.librarian();
     }
 }
    interface user{
        public String student();
        public String librarian();
    }
    class Member implements user {

        @Override
        public String student() {
            System.out.println("Nama    = Nabila");
            System.out.println("Alamat  = Kalipare");
            System.out.println("Nomor   = 093728");
            System.out.println("Status  = Student");
            return null;
        }

        @Override
        public String librarian() {
            System.out.println("Nama    = Nuera");
            System.out.println("Alamat  = Kepanjen");
            System.out.println("Nomor   = 083992");
            System.out.println("Status  = Librarian");
            return null;
        }
    }

    //polimorphysme artinya berbagai macam bentuk
    //interface hanya berisi method abstract
    //method abstract adalah method yang tidak memiliki body
    //keyword implement turunan dari kelas interface
    //overloading Deklarasi method lebih dari satu kali pada kelas yang sama/ kelas parent
    //overidding deklarasi method pada kelas turunannya


