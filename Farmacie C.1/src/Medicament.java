public class Medicament {
        private String denumire;
        private double pret;
        private Category categorie;

        public Medicament(String denumire, double pret, Category categorie) {
            this.denumire = denumire;
            this.pret = pret;
            this.categorie = categorie;
        }

        public String getDenumire() {
            return denumire;
        }

        public double getPret() {
            return pret;
        }

        public Category getCategorie() {
            return categorie;
        }

        @Override
        public String toString() {
            return "Medicament{" +
                    "denumire='" + denumire + '\'' +
                    ", pret=" + pret +
                    ", categorie=" + categorie +
                    '}';
        }
    }

