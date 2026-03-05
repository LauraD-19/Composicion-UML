class Corazon {
    private int latidosPorMinuto;

    public Corazon(int latidosPorMinuto) {
        this.latidosPorMinuto = latidosPorMinuto;
    }

    public void latir() {
        System.out.println("El corazón late a " + latidosPorMinuto + " bpm.");
    }
}
