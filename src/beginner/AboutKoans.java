package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.util.Assert.fail;

public class AboutKoans {

    @Koan
    public void findAboutKoansFile() {
        //fail("delete this line to advance"); Diese Zeile muss in der ersten Aufgabe gel�scht werden
    }

    @Koan
    public void definitionOfKoanCompletion() {
        boolean koanIsComplete = true; //statt false true hinschreiben(vorher stand false)
        if (!koanIsComplete) {
            fail("what if koanIsComplete variable was true?");
        }
    }

}
