import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        String res = ex1();
        String filePath = "test.txt";
        ex2(res,filePath);
    }

    static String ex1(){
        /*
        Дана json строка {
         {"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
         {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
         {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}
         }
         Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
         Студент Иванов получил 5 по предмету Математика.
         Студент Петрова получил 4 по предмету Информатика.
         Студент Краснов получил 5 по предмету Физика.
         Используйте StringBuilder для подготовки ответа
         */

        StringBuilder stringBuilder = new StringBuilder();

        String stringJson = "{" +
                "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}" +
            "}";

        stringJson = stringJson.substring(0,stringJson.length() - 2);

        String jsonArr[] = stringJson.split("},");

        for (int i = 0; i < jsonArr.length; i++) {

                String jsonArr2[] = jsonArr[i].split(",");

                String familiya[] = jsonArr2[0].split(":");
                String ocenka[] = jsonArr2[1].split(":");
                String predmet[] = jsonArr2[2].split(":");

                stringBuilder.append("Студент "+familiya[1]);
                stringBuilder.append(" получил "+ocenka[1]);
                stringBuilder.append(" по предмету "+predmet[1]+"\n");

        }

        String res = stringBuilder.toString();
        System.out.print(res);

        return res;

    }
    static void ex2(String res,String filePath) {
        /* Создать метод, который запишет результат работы в файл Обработайте исключения и запишите ошибки в лог файл */

        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);

        try(FileWriter fileWriter = new FileWriter(filePath)){
            fileWriter.write(res);
        } catch (Exception e){
            logger.log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        }
    }

}