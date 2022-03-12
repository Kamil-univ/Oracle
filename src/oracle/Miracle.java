package oracle;

class Miracle implements MiracleInterface{
    @Override
    public void realiserMiracle(String oracle, String croyant) {
        System.out.println(oracle + " accomplit un miracle pour " + croyant);
    }
}
