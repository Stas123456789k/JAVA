package company;
import Exceptions.OkladException;

public class KontraktnySotrudnik extends Sotrudnik {
    private int contractDuration; // добавим поле для демонстрации проверки

    public KontraktnySotrudnik(String fio, String position, double oklad, int contractDuration)
            throws OkladException {
        super(fio, position, oklad);

        if (contractDuration <= 0)
            throw new IllegalArgumentException("Срок контракта должен быть положительным.");
        this.contractDuration = contractDuration;
    }

    public int getContractDuration() { return contractDuration; }

    public void setContractDuration(int contractDuration) {
        if (contractDuration <= 0)
            throw new IllegalArgumentException("Срок контракта должен быть положительным.");
        this.contractDuration = contractDuration;
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            return getOklad();
        } catch (Exception e) {
            System.out.println("Ошибка расчета зарплаты: " + e.getMessage());
            return 0;
        }
    }
}
