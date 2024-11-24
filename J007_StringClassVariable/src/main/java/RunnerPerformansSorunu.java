public class RunnerPerformansSorunu {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int islemAdedi=100_000;
        String ifade="serkan";
        for(int i=0;i<islemAdedi;i++)
        {
            ifade = ifade + i ;// her seferinde bir nesne yaratılıyor ( String Pool içinde)
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);



        // yukarıda performans sorunu oluşur

        System.out.println("""
                
                
                """);

        // aşağıda stringBuilder ile bu sorun çözülür

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("serkan");
        for(int i=0;i<islemAdedi;i++){
            stringBuilder.append(i);
        }
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);


    }//END METHOD
}//END CLASS
