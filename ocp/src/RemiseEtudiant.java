public class RemiseEtudiant implements StrategieRemise{
    @Override
    public double remise(double montant) {
        return montant * 0.9;
    }
}
