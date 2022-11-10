public class Main {

    public static void main(String[] args) {

        Employee[]employeeArray = new Employee [5];

        employeeArray[0] = new Employee("Ivanov Slava", "QA Engeneer", "Ivanov@mail.ru", "89994857859", 120000, 41);
        employeeArray[1] = new Employee("Petrov Leonid", "Salesmen", "Petrov@mail.ru", "88695842598", 60000, 50);
        employeeArray[2] = new Employee("Smirnov Pavel", "Engeneer", "Smirnov@mail.ru", "89658412586", 150000, 39);
        employeeArray[3] = new Employee("Babushkin Vladimir", "Designer", "Babushkin@mail.ru", "89421114687", 80000, 44);
        employeeArray[4] = new Employee("Stasov Oleg", "QA Automation Engineer", "Stasov@mail.ru", "89456714444", 200000, 37);

        for (Employee employee : employeeArray) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}