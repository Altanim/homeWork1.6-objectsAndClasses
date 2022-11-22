package hw11;

public class Hw11 {
    public static void main(String[] args) {
        Author adamsDouglas = new Author("Дуглас", "Адамс");
        Book avtostopomPoGalaktike = new Book("Автостопом по галактике", adamsDouglas, 1979);
        Author berdBarry = new Author("Барри", "Берд");
        Book javaDLyaChaynikov = new Book("Джава для чайников", berdBarry,2018);
        avtostopomPoGalaktike.setPublicationYear(1980);
        System.out.println("avtostopomPoGalaktike.getPublicationYear() = " +
                avtostopomPoGalaktike.getPublicationYear());


    }
}