/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author gylle
 */

//Klassen sköter all koppling om anställda mellan gränssnittet och databasen
// Klassens metoder är döpta efter vad de gör, där "get" hämtar något från databasen och "andra" ändrar något i datasen
public class AnstallBakgrund {

    private static InfDB idb;

    public AnstallBakgrund(InfDB idb) {
        this.idb = idb;
    }

    public static String getAId(String ePost) {
        String sqlFraga1 = "SELECT aid FROM anstalld WHERE epost = '" + ePost + "'";

        String aidInfo;
        try {
            String aid = idb.fetchSingle(sqlFraga1);

            aidInfo = aid;
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            aidInfo = "Kunde inte hämtas";
        }

        System.out.println(aidInfo);
        return aidInfo;
    }

    public static String getFornamn(String ePost) {
        String sqlFraga1 = "SELECT fornamn FROM anstalld WHERE epost = '" + ePost + "'";

        String aidInfo;
        try {
            String forNamn = idb.fetchSingle(sqlFraga1);

            aidInfo = forNamn;
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            aidInfo = "Kunde inte hämtas";
        }

        System.out.println(aidInfo);

        return aidInfo;
    }

    public static String getEfterNamn(String ePost) {
        String sqlFraga1 = "SELECT efternamn FROM anstalld WHERE epost = '" + ePost + "'";

        String efterNamnInfo;
        try {
            String efterNamn = idb.fetchSingle(sqlFraga1);

            efterNamnInfo = efterNamn;
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            efterNamnInfo = "Kunde inte hämtas";
        }

        return efterNamnInfo;

    }

    public static String getAdress(String ePost) {
        String sqlFraga1 = "SELECT adress FROM anstalld WHERE epost = '" + ePost + "'";

        String adressInfo;
        try {
            String adress = idb.fetchSingle(sqlFraga1);

            adressInfo = adress;
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            adressInfo = "Kunde inte hämtas";
        }

        return adressInfo;

    }

    public static String getTelefon(String ePost) {
        String sqlFraga1 = "SELECT telefon FROM anstalld WHERE epost = '" + ePost + "'";

        String telefonNmr;
        try {
            String nmr = idb.fetchSingle(sqlFraga1);

            telefonNmr = nmr;
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            telefonNmr = "Kunde inte hämtas";
        }

        return telefonNmr;
    }

    public static String getAnstallningsDatum(String ePost) {
        String sqlFraga1 = "SELECT anstallningsdatum FROM anstalld WHERE epost = '" + ePost + "'";

        String anstalldDatum;
        try {
            String anstallningsDatum = idb.fetchSingle(sqlFraga1);

            anstalldDatum = anstallningsDatum;
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            anstalldDatum = "Kunde inte hämtas";
        }

        return anstalldDatum;
    }

    public static String getAvdelning(String ePost) {
        String sqlFraga1 = "SELECT avdelning FROM anstalld WHERE epost = '" + ePost + "'";

        String avdelningsInfo;
        try {
            String avdelning = idb.fetchSingle(sqlFraga1);

            avdelningsInfo = avdelning;
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            avdelningsInfo = "Kunde inte hämtas";
        }

        return avdelningsInfo;
    }

    public static void andraAid(String nyttAid, String ePost) {

        String sqlFraga = "update anstalld set aid = " + nyttAid + " where epost = '" + ePost + "'";

        try {
            idb.update(sqlFraga);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public static boolean andraForNamn(String nyttNamn, String ePost) {
        boolean andringGjord = true;
        String sqlFraga = "update anstalld set fornamn = '" + nyttNamn + "' where epost = '" + ePost + "'";

        try {
            idb.update(sqlFraga);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            andringGjord = false;

        }
        return andringGjord;

    }

    public static boolean andraEfterNamn(String nyttNamn, String ePost) {
        boolean andringGjord = true;
        String sqlFraga = "update anstalld set efternamn = '" + nyttNamn + "' where epost = '" + ePost + "'";

        try {
            idb.update(sqlFraga);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            andringGjord = false;

        }
        return andringGjord;

    }

    public static boolean andraAdress(String nytt, String ePost) {
        boolean andringGjord = true;
        String sqlFraga = "update anstalld set adress = '" + nytt + "' where epost = '" + ePost + "'";

        try {
            idb.update(sqlFraga);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            andringGjord = false;

        }
        return andringGjord;
    }

    public static boolean andraNmr(String nytt, String ePost) {

        boolean andringGjord = true;
        String sqlFraga = "update anstalld set telefon = '" + nytt + "' where epost = '" + ePost + "'";

        try {
            idb.update(sqlFraga);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            andringGjord = false;

        }
        return andringGjord;

    }

    public static boolean andraEpost(String nytt, String aid) {

        boolean andringGjord = true;
        String sqlFraga = "update anstalld set epost = '" + nytt + "' where aid = '" + aid + "'";

        try {
            idb.update(sqlFraga);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            andringGjord = false;

        }
        return andringGjord;

    }
    // kod som tar en epost (oftast det användaren loggar in med) och kollar ifall denne är projektledare

    public static boolean isProjektLedare(String ePost) {
        boolean projektLedare = true;

        String sqlFraga = "SELECT aid FROM anstalld WHERE epost = '" + ePost + "'";

        try {
            String valtId = idb.fetchSingle(sqlFraga);
            int valtId2 = Integer.parseInt(valtId);
            String sqlFraga2 = "Select projektchef from projekt where projektchef = " + valtId2;
            String kontroll = idb.fetchSingle(sqlFraga2);
            System.out.println("Kontrollen blev: " + kontroll);
            if (kontroll == null || kontroll.isEmpty()) {
                projektLedare = false;
            }
        } catch (InfException ex) {
            System.out.println(ex.getMessage());

        }
        return projektLedare;

    }

    // Följande två kodblock hämtar en arraylist i databasen av fornamn och aid som används i projektledarfönstret
    public static ArrayList getAnstallda() {
        ArrayList<String> handlaggare = new ArrayList<>();
        String sqlFraga = "select fornamn from anstalld";

        try {
            handlaggare = idb.fetchColumn(sqlFraga);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());

        }
        return handlaggare;

    }

    public static ArrayList getAllaAid() {
        ArrayList<String> allaId = new ArrayList<>();
        String sqlFraga = "select aid from anstalld";

        try {
            allaId = idb.fetchColumn(sqlFraga);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());

        }
        return allaId;

    }

    public static String getAidMedForNamn(String fornamn) {
        String sqlFraga1 = "SELECT aid FROM anstalld WHERE fornamn = '" + fornamn + "'";

        String aidInfo;
        try {
            String aid = idb.fetchSingle(sqlFraga1);

            aidInfo = aid;
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            aidInfo = "Kunde inte hämtas";
        }

        System.out.println(aidInfo);
        return aidInfo;
    }

    //kolla hur många av ett fornamn som finns i databasen
    public static int getAntalforNamn(String fornamn) {
        String sqlFraga1 = "select count(*) "
                + "from anstalld "
                + "where fornamn = '" + fornamn + "' "
                + "group by fornamn";

        int antal;
        try {
            String antalStrang = idb.fetchSingle(sqlFraga1);
            antal = Integer.parseInt(antalStrang);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            antal = 100000;
        }

        return antal;

    }

}
