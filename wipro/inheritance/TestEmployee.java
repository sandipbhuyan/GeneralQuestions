class TestEmployee
{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Arpita");
        e.setSalary(1000);
        e.setWork("Wipro");
        e.setInsuranceNumber(1002);
        System.out.println(e.getName() + "\n" + e.getSalary() + "\n" + e.getWork() + "\n" + e.getInsuranceNumber());
    }
}