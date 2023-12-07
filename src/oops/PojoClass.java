package oops;

import java.io.File;
import java.io.FileOutputStream;

public class PojoClass {
    public static void main(String[] args) {
        try {
            String path = "city.txt";
            File file = new File(path);
            FileOutputStream fos = new FileOutputStream(file);

            Pojo[] pojos = new Pojo[5];
            pojos[0] = new Pojo("Jakarta Selatan", "DKI Jakarta");
            pojos[1] = new Pojo("Jakarta Barat", "DKI Jakarta");
            pojos[2] = new Pojo("Jakarta Timur", "DKI Jakarta");
            pojos[3] = new Pojo("Jakarta Utara", "DKI Jakarta");
            pojos[4] = new Pojo("Jakarta Pusat", "DKI Jakarta");

            for (Pojo pojo : pojos) {
                fos.write(("City : " + pojo.getCityName() + " Capital : " + pojo.getCapital() + "\n").getBytes());
            }
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
