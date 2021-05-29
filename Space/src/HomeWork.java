public class HomeWork {
    public static void main(String[] args) {
        String NameOfMonths = "asda";

        if (NameOfMonths=="Январь" || NameOfMonths=="Февраль" || NameOfMonths=="Декабрь")
        {
            System.out.println("Winter");
        }
            else if (NameOfMonths=="Март" ||  NameOfMonths=="Апрель" || NameOfMonths=="Май") {
            System.out.println("Spring");
        }
            else if (NameOfMonths=="Июнь" ||  NameOfMonths=="Июль" || NameOfMonths=="Август") {
                System.out.println("Summer");
        }
        else if (NameOfMonths=="Сентябрь" ||  NameOfMonths=="Октябрь" || NameOfMonths=="Ноябрь") {
            System.out.println("Autumn");
        }
        else System.out.println("Time of year isn't exist");

        String NameOfMonths2 = "Январь";
        switch (NameOfMonths2) {
            case "Январь" :
            case  "Февраль":
            case  "Декабрь" :
                System.out.println("Winter");
                break;
            case "Март" :
            case  "Апрель":
            case  "Май" :
                System.out.println("Spring");
                break;
            case "Июнь" :
            case  "Июль":
            case  "Август" :
                System.out.println("Summer");
                break;
            case "Сентябрь" :
            case  "Октябрь":
            case  "Ноябрь" :
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Несуществующее время года");
                break;
        }
    }
}
