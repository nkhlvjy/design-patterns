package adapter;

public class VegBiryani extends Biryani {
    Pulao pulao;

    public VegBiryani(Pulao pulao) {
        this.pulao = pulao;
    }


    @Override
    public String toString() {
        return pulao.toString();
    }
}
