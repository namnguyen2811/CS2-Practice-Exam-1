public class StarshipExplorer {

    //variable declaration section
    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";
    // declare array
    public Alien[] aliens = new Alien[50];

    public static void main(String[] args) {
        StarshipExplorer ship = new StarshipExplorer();
    }

    public StarshipExplorer() {
        aliens = new Alien[50];
        for (int i = 0; i < 50; i++) {
            //Math.random() gives a decimal between 0 and 1
            int energy = (int) (75 * Math.random() + 1);
            int hostility = (int) (101 * Math.random());
            aliens[i] = new Alien(energy, hostility);
        }
        displayAliens();
        checkEnergy();
    }

    public void displayAliens() {
        for (int i = 0; i < aliens.length; i++) {
            aliens[i].printInfo();
        }
    }

    public boolean checkEnergy() {
        boolean sameEnergy = false;
        //check whether alien 0's energy is the same as anyone else
        for (int x = 0; x < aliens.length; x++) {
            for (int i = 0; i < aliens.length; i++) {
                if (aliens[i].getEnergyLevel() == aliens[x].getEnergyLevel() && (i != x)) {
                    sameEnergy = true;
                    //System.out.println("aliens[" + i + "] energy: " + aliens[0].getEnergyLevel());
                    //System.out.println("aliens[" + x + "] energy: " + aliens[x].getEnergyLevel());
                }
            }
            if (sameEnergy == true) {
                return true;
            } else {
                return false;
            }
        }
    }

    public String decipher(String languageSample) {
        String decodedString = "";
        System.out.println(languageSample);
        int al = languageSample.indexOf("*") + 1;
        while (al != 0) {
            al = languageSample.indexOf("*") + 1;
            String sub = languageSample.substring(al, al +1);
            decodedString += sub;
        }
        System.out.println(decodedString);
        return decodedString;
    }
}