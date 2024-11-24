public class RunnerOrnek_VoidNoParam {
    /* Bir claas içinde
    metod
    değişken
    inner claas --> tanımlanır

metod --> kod reuse için ideal

    */
    public static void main(String[] args) {
        System.out.println("basladi");
ekranaYaz();

        System.out.println("bitti");
    }// END OF MAIN METHOD

    // static metodlar statik değişken ve metodlar ile çalişır
    // donüş tipi ve adı yazılmak zorundadır

    public static void ekranaYaz() {
        System.out.println("""
                *********************************
                *        HESAP MAKINESI         *
                *********************************
                """);
    }


}//END OF CLASS
