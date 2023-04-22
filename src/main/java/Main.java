import ru.netology.services.VacationService;

public class Main {

    public static void main(String[] args) {

    VacationService countService = new VacationService();
    int count = countService.calculate(10_000, 3_000, 20_000);

        System.out.println("Вего месяцев отдыха в году:" + count);
    }
}
