package com.pzk.jmbgvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText jmbg;
    TextView jmbgispis,drzava,region,pol,datum,drzava1,region1,pol1,datum1;
    Button provjera;
    private int greska=0;
    private String drzavaRodjenja;
    private String mjestoRodjenja;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jmbg = findViewById(R.id.jmbg);
        jmbgispis = findViewById(R.id.jmbgispis);
        drzava = findViewById(R.id.drzava);
        region = findViewById(R.id.region);
        pol = findViewById(R.id.pol);
        datum = findViewById(R.id.datum);
        provjera = findViewById(R.id.provjera);
        drzava1 = findViewById(R.id.drzava1);
        region1 = findViewById(R.id.region1);
        pol1 = findViewById(R.id.pol1);
        datum1 = findViewById(R.id.datum1);



        provjera.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                if(jmbg.length()!=13){
                    Toast.makeText(getApplicationContext(),"JMBG mora da ima 13 brojeva",Toast.LENGTH_SHORT).show();
                    greska=1;
                }
                if (greska != 1) {

                    drzava1.setText("");
                    region1.setText("");
                    pol1.setText("");
                    datum1.setText("");


                    Integer danRodjenjaINT = Integer.valueOf(jmbg.getText().toString().substring(0,
                            jmbg.length() - 11));
                    Integer mjesecRodjenjaINT = Integer.valueOf(jmbg.getText().toString().substring(2,
                            jmbg.length() - 9));
                    Integer godinaRodjenjaINT = Integer.valueOf(jmbg.getText().toString().substring(4,
                            jmbg.length() - 6));

                    datum1.setText(danRodjenjaINT+"."+mjesecRodjenjaINT+".1"+godinaRodjenjaINT+".");

                    Integer pol = Integer.valueOf(jmbg.getText().toString().substring(9, jmbg.length() - 1));

                    if (pol < 500) {
                        pol1.setText("Muški");
                    } else if (pol >= 500) {
                        pol1.setText("Ženski");
                    }else{
                        Toast.makeText(getApplicationContext(),"Pol je nemoguće odrediti zbog greške u matičnom broju",Toast.LENGTH_SHORT).show();
                    }

                    Integer regionRodjenja = Integer.valueOf(jmbg.getText().toString().substring(7, jmbg.length() - 4));

                    if (regionRodjenja >= 10 && regionRodjenja <= 19) {
                        drzavaRodjenja = "Bosna i Hercegovina";

                        switch (regionRodjenja) {

                            case 10:
                                mjestoRodjenja = "Banja Luka";
                                break;

                            case 11:
                                mjestoRodjenja = "Bihac";
                                break;

                            case 12:
                                mjestoRodjenja = "Doboj";
                                break;

                            case 13:
                                mjestoRodjenja = "Gorazde";
                                break;

                            case 14:
                                mjestoRodjenja = "Livno";
                                break;

                            case 15:
                                mjestoRodjenja = "Mostar";
                                break;

                            case 16:
                                mjestoRodjenja = "Prijedoro";
                                break;

                            case 17:
                                mjestoRodjenja = "Sarajevo";
                                break;

                            case 18:
                                mjestoRodjenja = "Tuzla";
                                break;

                            case 19:
                                mjestoRodjenja = "Zenica";
                                break;

                            default:
                                mjestoRodjenja = "Nije Poznato";
                                break;

                        }

                    }

                    // Rodjeni u Crna Gora

                    else if (regionRodjenja > 20 && regionRodjenja < 30) {
                        drzavaRodjenja = "Crna Gora";

                        switch (regionRodjenja) {

                            case 21:
                                mjestoRodjenja = "Podgorica";
                                break;

                            case 22:
                                mjestoRodjenja = "Bar, Ulcinj";
                                break;

                            case 23:
                                mjestoRodjenja = "Budva, Kotor, Tivat";
                                break;

                            case 24:
                                mjestoRodjenja = "Herceg Novit";
                                break;

                            case 25:
                                mjestoRodjenja = "Cetinje";
                                break;

                            case 26:
                                mjestoRodjenja = "Niksic";
                                break;

                            case 27:
                                mjestoRodjenja = "Barane, Rozaje, Plav, Andrijevica";
                                break;

                            case 28:
                                mjestoRodjenja = "Bijelo Polje, Mojkovac";
                                break;

                            case 29:
                                mjestoRodjenja = "Pljevlja, Zabljak";
                                break;

                            default:
                                mjestoRodjenja = "Nije Poznato";
                                break;

                        }

                    }

                    // Rodjeni u Hrvatska

                    else if (regionRodjenja >= 30 && regionRodjenja < 40) {
                        drzavaRodjenja = "Hrvatska";

                        switch (regionRodjenja) {

                            case 30:
                                mjestoRodjenja = "Osjek";
                                break;

                            case 31:
                                mjestoRodjenja = "Podravina";
                                break;

                            case 32:
                                mjestoRodjenja = "Medjimurje";
                                break;

                            case 33:
                                mjestoRodjenja = "Zagreb";
                                break;

                            case 34:
                                mjestoRodjenja = "Karlovac";
                                break;

                            case 35:
                                mjestoRodjenja = "Lika";
                                break;

                            case 36:
                                mjestoRodjenja = "Rijeka, Iskra";
                                break;

                            case 37:
                                mjestoRodjenja = "Karlovac";
                                break;

                            case 38:
                                mjestoRodjenja = "Dalmacija";
                                break;

                            default:
                                mjestoRodjenja = "Nije Poznato";
                                break;

                        }

                    }

                    // Rodjeni u Makedonija

                    else if (regionRodjenja > 40 && regionRodjenja < 50) {
                        drzavaRodjenja = "Makedonija";

                        switch (regionRodjenja) {

                            case 41:
                                mjestoRodjenja = "Bitola";
                                break;

                            case 42:
                                mjestoRodjenja = "Kumanovo";
                                break;

                            case 43:
                                mjestoRodjenja = "Ohrid";
                                break;

                            case 44:
                                mjestoRodjenja = "Prilep";
                                break;

                            case 45:
                                mjestoRodjenja = "Skoplje";
                                break;

                            case 46:
                                mjestoRodjenja = "Strumica";
                                break;

                            case 47:
                                mjestoRodjenja = "Tetovo";
                                break;

                            case 48:
                                mjestoRodjenja = "Veles";
                                break;

                            case 49:
                                mjestoRodjenja = "Stip";
                                break;

                            default:
                                mjestoRodjenja = "Nije Poznato";
                                break;

                        }

                    }

                    // Rodjeni u Slovenija

                    else if (regionRodjenja >= 50 && regionRodjenja < 60) {
                        drzavaRodjenja = "Slovenija";

                        mjestoRodjenja = "Slovenija";

                        // Slovenija koristi samo broj 50 za cijelu drzavu

                    }

                    // Rodjeni u Srbija

                    // Rodjeni u Uza Srbija ( Bez Pokrajna: Vojvodine i Kosova i
                    // Metohije )

                    else if (regionRodjenja > 70 && regionRodjenja < 80) {
                        drzavaRodjenja = "Srbija";

                        switch (regionRodjenja) {

                            case 71:
                                mjestoRodjenja = "Beograd";
                                break;

                            case 72:
                                mjestoRodjenja = "Kragujevac, Jagodina";
                                break;

                            case 73:
                                mjestoRodjenja = "Nis, Pirot, Toplica";
                                break;

                            case 74:
                                mjestoRodjenja = "Leskovac, Vranje";
                                break;

                            case 75:
                                mjestoRodjenja = "Bor, Zajecar";
                                break;

                            case 76:
                                mjestoRodjenja = "Smederevo, Pozarevac";
                                break;

                            case 77:
                                mjestoRodjenja = "Macva, Kolubara";
                                break;

                            case 78:
                                mjestoRodjenja = "Kraljevo, Krusevac";
                                break;

                            case 79:
                                mjestoRodjenja = "Uzice";
                                break;

                            default:
                                mjestoRodjenja = "Nije Poznato";
                                break;

                        }

                    }

                    // Rodjeni u Autonomska Pokrajina Vojvodina

                    else if (regionRodjenja >= 80 && regionRodjenja < 90) {
                        drzavaRodjenja = "Srbija";

                        switch (regionRodjenja) {

                            case 80:
                                mjestoRodjenja = "Novi Sad";
                                break;

                            case 81:
                                mjestoRodjenja = "Sombor";
                                break;

                            case 82:
                                mjestoRodjenja = "Subotica";
                                break;

                            case 83:
                                mjestoRodjenja = "Vrbas";
                                break;

                            case 84:
                                mjestoRodjenja = "Kikinda";
                                break;

                            case 85:
                                mjestoRodjenja = "Zrenjanin";
                                break;

                            case 86:
                                mjestoRodjenja = "Pancevo";
                                break;

                            case 87:
                                mjestoRodjenja = "Vrsac";
                                break;

                            case 88:
                                mjestoRodjenja = "Ruma";
                                break;

                            case 89:
                                mjestoRodjenja = "Sremska Mitrovica";
                                break;

                            default:
                                mjestoRodjenja = "Nije Poznato";
                                break;

                        }

                    }

                    // Rodjeni u Kosovo i Metohija

                    else if (regionRodjenja > 90 && regionRodjenja < 99) {
                        drzavaRodjenja = "Srbija";

                        switch (regionRodjenja) {

                            case 81:
                                mjestoRodjenja = "Pristina";
                                break;

                            case 92:
                                mjestoRodjenja = "Kosovksa Mitrovica";
                                break;

                            case 93:
                                mjestoRodjenja = "Pec";
                                break;

                            case 94:
                                mjestoRodjenja = "Djakovica";
                                break;

                            case 95:
                                mjestoRodjenja = "Prizren";
                                break;

                            case 96:
                                mjestoRodjenja = "Gnjilane";
                                break;

                            default:
                                mjestoRodjenja = "Nije Poznato";
                                break;

                        }

                    }

                    else {
                        drzavaRodjenja = " Nije poznato";
                        mjestoRodjenja = " Nije poznato";
                    }
                    region1.setText(mjestoRodjenja);
                    drzava1.setText(drzavaRodjenja);

            }
            };
    });
}
}
