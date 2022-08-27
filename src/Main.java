import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Задание №1 - вывести ФИО сотрудника в консоль
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ф.И.О. сотрудника - ";
        System.out.println(fullName + lastName + " " + firstName + " " + middleName);

        //Задание №2 - изменить написание ФИО сотрудника на заглавные буквы
        String fullName1 = "Ivanov Ivan Ivanovich";
        String fullName1Upper = fullName1.toUpperCase();//Меняем на заглавные
        System.out.println("Данные ФИО сотрудника для составления отчета - " + fullName1Upper);

        //Задание №3 - изменить написание Ф.И.О. сотрудника на необходимый формат
        String fullName2 = "Ivanov Ivan Ivanovich";
        fullName2 = fullName2.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName2);

        //Задание №4 - заменить символ ё на симвод е
        String fullName3 = "Иванов Семён Семёнович";
        fullName3 = fullName3.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника - " + fullName3);

        //Задание №5 - разбить одну строку на три
        String fullName4 = "Ivanov Ivan Ivanovich";
        int index1 = fullName4.indexOf(' ');//возврат первого индекса символа '_'
        int index2 = fullName4.lastIndexOf(' ');//возврат последнего индекса символа '_'
        System.out.println(fullName4.substring(0, index1));//возврат подстроки с индекса 0 до index1-1
        System.out.println(fullName4.substring(index1 + 1, index2));//возврат подстроки с индекса index1 до индекса index2-1
        System.out.println(fullName4.substring(index2 + 1));// возврат подстроки с индекса index2 до конца строки

        //Задание №6 - преобразовать написания фио со строчных букв на заглавные
        String fullName5 = "ivanov ivan ivanovich";
        int indexFirstSpace = fullName5.indexOf(' ');//возврат первого индекса символа '_'
        int indexLastSpace = fullName5.lastIndexOf(' ');//возврат последнего индекса символа '_'
        System.out.print(fullName5.substring(0, 1).toUpperCase() + fullName5.substring(1, indexFirstSpace) + " ");
        System.out.print(fullName5.substring(indexFirstSpace + 1, indexFirstSpace + 2).toUpperCase() + fullName5.substring(indexFirstSpace + 2, indexLastSpace) + " ");
        System.out.println(fullName5.substring(indexLastSpace + 1, indexLastSpace + 2).toUpperCase() + fullName5.substring(indexLastSpace + 2));

        //Задание №7 - собрать одну строку из двух, в заданной последовательности значений
        String one="135";
        String two="246";
        System.out.println(one.charAt(0));
        System.out.println(two.charAt(0));
        StringBuilder oneTwo=new StringBuilder(one.charAt(0)+two.charAt(0));
        //StringBuilder oneTwo=new StringBui
        // lder(one+two);
        //oneTwo.replace(1,1,"h");
        System.out.println(oneTwo);


    }


}


