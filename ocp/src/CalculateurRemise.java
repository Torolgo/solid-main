public class CalculateurRemise {

    public double calculerTotal(StrategieRemise typeClient, double montant) {
        return typeClient.remise(montant);
    }
}
