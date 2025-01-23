package day14_Review;

public class C02_IfElse_DayOfWeek {
    public static void main(String[] args) {

        int dayOfWeek = 8;
        String day = "";

        if (dayOfWeek == 1) {
            day = "Pazartesi";

        } else if (dayOfWeek == 2) {
            day = "Salı";

        } else if (dayOfWeek == 3) {
            day = "Çarşamba";

        } else if (dayOfWeek == 4) {
            day = "Perşembe";
        } else if (dayOfWeek == 5) {
            day = "Cuma";
        } else if (dayOfWeek == 6) {
            day = "Cumartesi";
        } else if (dayOfWeek == 7) {
            day = "Pazar";
        } else {
            System.out.println("Herhangi bir gün belirtilmemiştir");
        }
        if (dayOfWeek >= 1 && dayOfWeek <= 7)
            System.out.println("Bugün günlerden" + day + " 'dir.");
    }
}
