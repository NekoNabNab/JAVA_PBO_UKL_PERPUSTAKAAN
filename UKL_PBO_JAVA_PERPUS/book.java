package UKL_PBO_JAVA_PERPUS;

class book{

    public book(String bookCode, String Tittle, String Author, String Price){
        System.out.println("Code    = " + bookCode);
        System.out.println("Tittle  = " + Tittle);
        System.out.println("Author  = " + Author);
        System.out.println("Price   = " + Price);
    }

    //contructor karena memiliki nama yg sama dgn class
    public book() {
    }

    //methodnya
    public void book1(){
        book descBook1 = new book("001","Ikigai","Ken Mogi","75.000");
        this.linePage();
    }
    
    public void book2(){
        book descBook1 = new book("002","Math","Angela","220.000");
        this.linePage();
    }
    
    public void book3(){
        book descBook1 = new book("003","English Grammar","Mc Kinsey","150.000");
        this.linePage();
    }
    
    public void linePage(){
        System.out.println("------------------------");  
    }

    public void borrowed(){
        System.out.println("The Book Succesfully Borrow");  
    }
    
    public void returned(){
        System.out.println("The Book Succesfully Return");
    }
    
    public void quit(){
        System.out.println("Thank You, don't forget to read!");
    }

    public void menu2 (){
        System.out.println("Do You want to return the book?");
        System.out.println("Type 1 for return the book");
    }
    public void listBook(){
        this.book1();
        this.book2();
        this.book3();
    }
}       


