package InheritanceAndOverriding;

public class RunnerPerson {

    /*
    bir okul yönetim sistemi olacak
    - person sınıfı --> age name displayinfo olacak
    - teacher ve student sınıflari olacak person sınıfından miras alacaklar
    - display info methodu alt sınıflarda override edilecek
     */

    public static void main(String[] args) {
       Teacher teacher=new Teacher("serkan",25);
       Student student=new Student("serkan",25);

       student.displayInfo();
       teacher.displayInfo();


    }
}
