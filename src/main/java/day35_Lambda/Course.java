package day35_Lambda;

public class Course {
    //Senaryo: Lambdayi object’lerle kullanmayi ogrenelim.
// Class icerisinde pasif ve aktif ozellikler olusturalim

    /*
        Icinde
        1) private variable’lar (kapsulleme-encapsulation)
        2) parametreli ve parametresiz constructor’lar
        3) getter’lar -Private değişkenlere erişim sağlamak için-
        4) setter’lar -Private değişkenleri değiştirmek için-
        5) toString() methodu -Objenin içeriğini okunabilir bir formatta döndürmek için-
        barindiran classlara POJO class denir
        POJO==>Plain Old Java Object -Düz Eski Java Nesnesi
        Birçok uygulamada, veriyi bir katmandan diğerine taşımak için POJO sınıfları kullanılır. (API)
    */
    //variablelar
    private String season;
    private int numberOfStudents;
    private String courseName;
    private double averageScore;
    //constructor
    public Course(String season,String courseName , double averageStore,int numberOfStudents) {
        this.season = season;
        this.numberOfStudents = numberOfStudents;
        this.courseName = courseName;
        this.averageScore = averageStore;
    }
    public Course() {
    }
    //getter methodlari
    public String getSeason() {
        return season;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public double getAverageScore() {
        return averageScore;
    }
    //setter methodlari
    public void setSeason(String season) {
        this.season = season;
    }
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }


    //toString methodu

    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", courseName='" + courseName + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
