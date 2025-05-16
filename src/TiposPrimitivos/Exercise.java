package TiposPrimitivos;

import java.util.Scanner;

public class Exercise {

    String name = "Gabriel";
    String address = "Av 26 de Setembro";
    double salary = 5500.12D;
    String receiveData = "20/12/2021";

    public Exercise(String name, String address, double salary, String receiveData) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.receiveData = receiveData;
    }

    public static void main(String[] args) {
        // Cria uma instância do objeto Exercise
        Exercise employee = new Exercise("Gabriel", "Av 26 de Setembro", 5500.12, "20/12/2021");

        // Imprime o relatório
        System.out.println("Relatório: Eu, " + employee.name + ", morador de " + employee.address +
                ", confirmo que recebi o salário de " + employee.salary + " em " + employee.receiveData + ".");
    }
}
