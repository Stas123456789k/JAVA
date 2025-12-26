package company;
import Exceptions.OkladException;

public class Sotrudnik {
    private String fio;
    private String position;
    private double oklad;

    public Sotrudnik(String fio, String position, double oklad) throws OkladException {
        if (fio == null || fio.trim().isEmpty())
            throw new IllegalArgumentException("ФИО не может быть пустым.");
        if (position == null || position.trim().isEmpty())
            throw new IllegalArgumentException("Должность не может быть пустой.");
        if (oklad < 0)
            throw new OkladException(oklad);

        this.fio = fio;
        this.position = position;
        this.oklad = oklad;
    }

    public String getFio() { return fio; }

    public void setFio(String fio) {
        if (fio == null || fio.trim().isEmpty())
            throw new IllegalArgumentException("ФИО не может быть пустым.");
        this.fio = fio;
    }

    public String getPosition() { return position; }

    public void setPosition(String position) {
        if (position == null || position.trim().isEmpty())
            throw new IllegalArgumentException("Должность не может быть пустой.");
        this.position = position;
    }

    public double getOklad() { return oklad; }

    public void setOklad(double oklad) throws OkladException {
        if (oklad < 0)
            throw new OkladException(oklad);
        this.oklad = oklad;
    }

    public double rasschitatZarplatu() {
        try {
            return oklad;
        } catch (Exception e) {
            System.out.println("Ошибка расчета зарплаты: " + e.getMessage());
            return 0;
        }
    }
}
