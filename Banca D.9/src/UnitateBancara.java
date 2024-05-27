import java.util.ArrayList;
import java.util.List;

interface UnitateBancara {
    void afiseazaDetalii();
    void adaugaUnitate(UnitateBancara unitate);
    void stergeUnitate(UnitateBancara unitate);
    UnitateBancara getUnitate(int index);
}