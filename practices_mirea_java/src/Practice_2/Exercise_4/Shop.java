package Practice_2.Exercise_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    private List<Computer> computers;

    public Shop() {
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public List<Computer> searchComputers(String criteria) {
        List<Computer> foundComputers = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getManufacturer().compareTo(criteria)==0 || computer.getModel().compareTo(criteria)==0) {
                foundComputers.add(computer);
            }
        }
        return foundComputers;
    }
}
