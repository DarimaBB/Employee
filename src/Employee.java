
    public class Employee {

        public String name;
        public String position;
        public String email;
        public String phone;
        public double salary;
        public int age;

        public Employee(String name, String position, String email, String phone, double salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return  ( "Name: " + name+ "\n-" + " Position: " + position + " Email: " + email + " Phone: " + phone + " Salary " + salary + " Age "
                    + age);
        }
    }
