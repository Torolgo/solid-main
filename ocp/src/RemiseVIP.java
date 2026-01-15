public class RemiseVIP implements StrategieRemise {

    @Override
    public double remise(double montant) {
        return montant * 0.8;
    }
}
