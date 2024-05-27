public class ContBancar {
    private boolean esteContDeSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;

    private ContBancar(Builder builder) {
        this.esteContDeSalariu = builder.esteContDeSalariu;
        this.areCardAtasat = builder.areCardAtasat;
        this.areInternetBanking = builder.areInternetBanking;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "esteContDeSalariu=" + esteContDeSalariu +
                ", areCardAtasat=" + areCardAtasat +
                ", areInternetBanking=" + areInternetBanking +
                '}';
    }

    public static class Builder {
        private boolean esteContDeSalariu;
        private boolean areCardAtasat;
        private boolean areInternetBanking;

        public Builder() {
        }

        public Builder setContDeSalariu() {
            this.esteContDeSalariu = true;
            return this;
        }

        public Builder setCardAtasat() {
            this.areCardAtasat = true;
            return this;
        }

        public Builder setInternetBanking() {
            this.areInternetBanking = true;
            return this;
        }

        public ContBancar build() {
            return new ContBancar(this);
        }
    }
}