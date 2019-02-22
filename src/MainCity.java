import controller.CityController;

import java.io.IOException;

public class MainCity {
    public static void main(String[] args) throws IOException {
        CityController cc = new CityController();
        cc.insertIntoCity("Grudziadz", 95000., 59.);
        cc.insertIntoCity("Bydgoszcz", 320000., 170.5);
        cc.insertIntoCity("Toruń", 250000., 115.6);

        cc.selectFromCity();
        cc.selectFromCityById(1);
        cc.selectFromCityById(15);
        cc.deleteFromCityByID(3);
        cc.selectFromCity();
        cc.saveCityTableData();
    }
}
