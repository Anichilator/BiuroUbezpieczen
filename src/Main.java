import java.util.*;

public class Main {
    private static List<InsurancePolicy> policies = new ArrayList<>();

    public static void addPolicy(InsurancePolicy policy) {
        policies.add(policy);
    }

    public static void removePolicy(String policyNumber) {
        policies.removeIf(policy -> policy.getPolicyNumber().equals(policyNumber));
    }

    public static InsurancePolicy findPolicy(String policyNumber) {
        for (InsurancePolicy policy : policies) {
            if (policy.getPolicyNumber().equals(policyNumber)) {
                return policy;
            }
        }
        return null;
    }

    public static void sortPoliciesByContribution() {
        Collections.sort(policies, (policy1, policy2) -> Double.compare(policy1.getContribution(), policy2.getContribution()));
    }

    public static void main(String[] args) {
        addPolicy(new HealthInsurancePolicy("H1001", 500.0, 100));
        addPolicy(new LifeInsurancePolicy("L2001", 1000.0, 500));
        addPolicy(new HealthInsurancePolicy("H1002", 600.0, 150));
        addPolicy(new LifeInsurancePolicy("L2002", 1200.0, 700));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Dodaj nową polisę");
            System.out.println("2. Znajdź polisę");
            System.out.println("3. Wyświetl wszystkie polisy");
            System.out.println("4. Sortuj polisy");
            System.out.println("5. Zakończ");
            System.out.print("Wybierz opcję: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPolicyFromUserInput(scanner);
                    break;
                case 2:
                    System.out.print("Podaj numer polisy do znalezienia: ");
                    String policyNumber = scanner.nextLine();
                    InsurancePolicy foundPolicy = findPolicy(policyNumber);
                    if (foundPolicy != null) {
                        System.out.println("Znaleziona polisa: " + foundPolicy);
                    } else {
                        System.out.println("Brak polisy o podanym numerze.");
                    }
                    break;
                case 3:
                    System.out.println("Wszystkie polisy:");
                    for (InsurancePolicy policy : policies) {
                        System.out.println(policy);
                    }
                    break;
                case 4:
                    sortPoliciesByContribution();
                    System.out.println("Posortowane polisy:");
                    for (InsurancePolicy policy : policies) {
                        System.out.println(policy);
                    }
                    break;
                case 5:
                    System.out.println("Koniec programu.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór opcji.");
            }
        }
    }

    public static void addPolicyFromUserInput(Scanner scanner) {
        System.out.print("Wybierz rodzaj polisy (1 - Ubezpieczenie zdrowotne, 2 - Ubezpieczenie na życie): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Podaj numer polisy: ");
        String policyNumber = scanner.nextLine();

        System.out.print("Podaj składkę: ");
        double premium = scanner.nextDouble();
        scanner.nextLine();

        InsurancePolicy policy;

        if (choice == 1) {
            System.out.print("Podaj pokrycie (zdrowotne): ");
            int coverage = scanner.nextInt();
            policy = new HealthInsurancePolicy(policyNumber, premium, coverage);
        } else if (choice == 2) {
            System.out.print("Podaj pokrycie (na życie): ");
            int coverage = scanner.nextInt();
            policy = new LifeInsurancePolicy(policyNumber, premium, coverage);
        } else {
            System.out.println("Nieprawidłowy wybór rodzaju polisy.");
            return;
        }

        addPolicy(policy);
        System.out.println("Dodano nową polisę: " + policy);
    }
}
