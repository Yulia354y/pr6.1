import  java.nio.file.Files;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) {
        Path file = Path.of("D:\\pr\\student.txt");
        try{
            if(Files.exists(file)){
                System.out.println("Файл є");
                String text = Files.readString(file);
                String newtext = text.replace("student","kursant");
                Files.writeString(file,newtext);
                System.out.println("Текст змінено");
            }else{
                System.out.println("Файл не знайдено");
            }
        }catch (Exception e){
            System.out.println("Помилка: "+e.getMessage());
        }
    }
}