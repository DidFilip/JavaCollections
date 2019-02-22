import controller.AutoController;

import java.io.IOException;

public class MainAuto {
    public static void main(String[] args) throws IOException {
        AutoController ac = new AutoController();
        ac.addAuto(
                "347122HYS801",
                "VW",
                "Passat",
                150000);
        ac.addAuto(
                "36103BNH7453",
                "VW",
                "Golf",
                100000);
        ac.addAuto(
                "98712WBZ0921",
                "VW",
                "Tiguan",
                200000);
        ac.addAuto(
                "23610BHS9761",
                "VW",
                "Scirocco",
                180000);
        ac.addEquipment("23610BHS9761","B");
        ac.addEquipment("23610BHS9761","C");
        ac.getAllAutos();
        ac.deleteEqipment("23610BHS9761","C");
        ac.addEquipment("36103BNH7453", "C");
        ac.addEquipment("36103BNH7453", "B");
        ac.saveDataToFile("MyFile.txt");

        ac.getAllAutos();
    }
}
