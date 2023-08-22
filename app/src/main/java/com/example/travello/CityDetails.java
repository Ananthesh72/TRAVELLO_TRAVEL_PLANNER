package com.example.travello;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CityDetails extends AppCompatActivity {
    TextView city, p1, p2, h1, h2, r1, r2;
    EditText addplacename;

    Button btn1,btn2,btn3,btn4,btn5,btn6,addplace;
    LinearLayout layout;

    private ArrayList<String> entries = new ArrayList<String>();
    String[] bng = {"Bengaluru Palace", "Lal Bagh Botanical Gardens", "Hilton Bangalore", "Coral Tree Goldfinch", "ITC Gardenia", "Toit"};
    String[] mng = {"Sulthan Bathery", "Surathkal Beach", "Ocean Pearl", "Riverroost Resorts", "Ideal Cafe", "Machali"};
    String[] chn = {"Marina Beach", "Snow Kingdom", "Radisson Blu", "Ibis Chennai", "Madras Pavilion", "Waterfall Restaurant"};
    String[] mmb = {"Gateway of India", "Elephanta Caves", "Empire Royale", "Hotel BKC Crown", "Yauatcha", "Bombay Canteen"};
    String[] klk = {"Indian Museum", "MP Birla Auditorium", "ELite Apartment Hotel", "Vivanta Kolkata EM Bypass", "Vintage Asia", "6 Ballygunge Place"};
    String[] ndl = {"India Gate", "Lotus Temple", "Amara Hotel", "JRD Luxury Boutique Hotel", "GT Road", "Kiyan"};
    int count = 0;
    String cn;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_details);
        city = findViewById(R.id.cityName);
        p1 = findViewById(R.id.placeName1);
        p2 = findViewById(R.id.placeName2);
        h1 = findViewById(R.id.hotelName1);
        h2 = findViewById(R.id.hotelName2);
        r1 = findViewById(R.id.restroName1);
        r2 = findViewById(R.id.restroName2);
        String cityName = getIntent().getStringExtra("keycity");
        cn=cityName;
        city.setText(cityName);
        btn1=new Button(CityDetails.this);
        btn2=new Button(CityDetails.this);
        btn3=new Button(CityDetails.this);
        btn4=new Button(CityDetails.this);
        btn5=new Button(CityDetails.this);
        btn6=new Button(CityDetails.this);

        addplace = findViewById(R.id.AddPlaceButton);
        addplacename = findViewById(R.id.AddPlaceName);
        layout = findViewById(R.id.buttonContainer);
        addplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addButton();
            }
        });

        Button remplace = findViewById(R.id.remPlaceButton);
        remplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remButton();
            }
        });

        if (cityName.equals("Bengaluru")) {
            p1.setText(bng[0]);
            p2.setText(bng[1]);
            h1.setText(bng[2]);
            h2.setText(bng[3]);
            r1.setText(bng[4]);
            r2.setText(bng[5]);
            p1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(bng[0], cityName);
                }
            });
            p2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(bng[1], cityName);
                }
            });
            h1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(bng[2], cityName);
                }
            });
            h2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(bng[3], cityName);
                }
            });
            r1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(bng[4], cityName);
                }
            });
            r2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(bng[5], cityName);
                }
            });
        }

        if (cityName.equals("Mangaluru")) {
            p1.setText(mng[0]);
            p2.setText(mng[1]);
            h1.setText(mng[2]);
            h2.setText(mng[3]);
            r1.setText(mng[4]);
            r2.setText(mng[5]);
            p1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mng[0], cityName);
                }
            });
            p2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mng[1], cityName);
                }
            });
            h1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mng[2], cityName);
                }
            });
            h2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mng[3], cityName);
                }
            });
            r1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mng[4], cityName);
                }
            });
            r2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mng[5], cityName);
                }
            });
        }

        if (cityName.equals("Chennai")) {
            p1.setText(chn[0]);
            p2.setText(chn[1]);
            h1.setText(chn[2]);
            h2.setText(chn[3]);
            r1.setText(chn[4]);
            r2.setText(chn[5]);
            p1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(chn[0], cityName);
                }
            });
            p2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(chn[1], cityName);
                }
            });
            h1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(chn[2], cityName);
                }
            });
            h2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(chn[3], cityName);
                }
            });
            r1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(chn[4], cityName);
                }
            });
            r2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(chn[5], cityName);
                }
            });
        }

        if (cityName.equals("Mumbai")) {
            p1.setText(mmb[0]);
            p2.setText(mmb[1]);
            h1.setText(mmb[2]);
            h2.setText(mmb[3]);
            r1.setText(mmb[4]);
            r2.setText(mmb[5]);
            p1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mmb[0], cityName);
                }
            });
            p2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mmb[1], cityName);
                }
            });
            h1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mmb[2], cityName);
                }
            });
            h2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mmb[3], cityName);
                }
            });
            r1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mmb[4], cityName);
                }
            });
            r2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(mmb[5], cityName);
                }
            });
        }


        //adding buttons
        /*    LinearLayout layout = findViewById(R.id.buttonContainer);
            switch (count) {
                case 0:

                    String text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");

                        Button btn1 = new Button(CityDetails.this);
                        btn1.setText(text);
                        layout.addView(btn1);

                        btn1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                openmap();
                            }

                            private void openmap() {
                                Uri uri = Uri.parse("geo:0, 0?q=" + Uri.encode(text) + "," + Uri.encode(cityName));
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                intent.setPackage("com.google.android.apps.maps");
                                startActivity(intent);
                            }

                        });
                    }
                    count = 1;
                    break;
                case 1:
                    text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");

                        Button btn2 = new Button(CityDetails.this);
                        btn2.setText(text);
                        layout.addView(btn2);

                        btn2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                openmap();
                            }

                            private void openmap() {
                                Uri uri = Uri.parse("geo:0, 0?q=" + Uri.encode(text) + Uri.encode(cityName));
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                intent.setPackage("com.google.android.apps.maps");
                                startActivity(intent);
                            }

                        });
                    }
                    count = 2;
                    break;
                case 2:
                    text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");

                        Button btn3 = new Button(CityDetails.this);
                        btn3.setText(text);
                        layout.addView(btn3);

                        btn3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                openmap();
                            }

                            private void openmap() {
                                Uri uri = Uri.parse("geo:0, 0?q=" + Uri.encode(text) + Uri.encode(cityName));
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                intent.setPackage("com.google.android.apps.maps");
                                startActivity(intent);
                            }

                        });
                    }
                    count = 3;
                    break;
                case 3:
                    text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");

                        Button btn4 = new Button(CityDetails.this);
                        btn4.setText(text);
                        layout.addView(btn4);

                        btn4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                openmap();
                            }

                            private void openmap() {
                                Uri uri = Uri.parse("geo:0, 0?q=" + Uri.encode(text) + Uri.encode(cityName));
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                intent.setPackage("com.google.android.apps.maps");
                                startActivity(intent);
                            }

                        });
                    }
                    count = 4;
                    break;
                case 4:
                    text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");

                        Button btn5 = new Button(CityDetails.this);
                        btn5.setText(text);
                        layout.addView(btn5);

                        btn5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                openmap();
                            }

                            private void openmap() {
                                Uri uri = Uri.parse("geo:0, 0?q=" + Uri.encode(text) + Uri.encode(cityName));
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                intent.setPackage("com.google.android.apps.maps");
                                startActivity(intent);
                            }

                        });
                    }
                    count = 5;
                    break;

                case 5:
                    text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");

                        Button btn6 = new Button(CityDetails.this);
                        btn6.setText(text);
                        layout.addView(btn6);

                        btn6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                openmap();
                            }

                            private void openmap() {
                                Uri uri = Uri.parse("geo:0, 0?q=" + Uri.encode(text) + Uri.encode(cityName));
                                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                                intent.setPackage("com.google.android.apps.maps");
                                startActivity(intent);
                            }

                        });
                    }
                    count = 6;
                    break;
                default:
                    Toast.makeText(getBaseContext(), "Cannot Add Any More", Toast.LENGTH_LONG).show();

            }           // end of switch

        } */              // end of if in mumbai


        if (cityName.equals("New Delhi")) {
            p1.setText(ndl[0]);
            p2.setText(ndl[1]);
            h1.setText(ndl[2]);
            h2.setText(ndl[3]);
            r1.setText(ndl[4]);
            r2.setText(ndl[5]);
            p1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(ndl[0], cityName);
                }
            });
            p2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(ndl[1], cityName);
                }
            });
            h1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(ndl[2], cityName);
                }
            });
            h2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(ndl[3], cityName);
                }
            });
            r1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(ndl[4], cityName);
                }
            });
            r2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(ndl[5], cityName);
                }
            });
        }

        if (cityName.equals("Kolkata")) {
            p1.setText(klk[0]);
            p2.setText(klk[1]);
            h1.setText(klk[2]);
            h2.setText(klk[3]);
            r1.setText(klk[4]);
            r2.setText(klk[5]);
            p1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(klk[0], cityName);
                }
            });
            p2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(klk[1], cityName);
                }
            });
            h1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(klk[2], cityName);
                }
            });
            h2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(klk[3], cityName);
                }
            });
            r1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(klk[4], cityName);
                }
            });
            r2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openmap(klk[5], cityName);
                }
            });
        }
    }
    public void addButton() {
            switch (count) {
                case 0:

                    String text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");
                        btn1.setText(text);
                        layout.addView(btn1);
                        btn1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                openmap(entries.get(0),cn);
                            }});
                    }
                    count = 1;
                    break;
                case 1:
                    text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");
                        btn2.setText(text);
                        layout.addView(btn2);

                        btn2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                openmap(entries.get(1),cn);
                            }});
                    }
                    count = 2;
                    break;
                case 2:
                    text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");
                        btn3.setText(text);
                        layout.addView(btn3);

                        btn3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                openmap(entries.get(2),cn);
                            }});
                    }
                    count = 3;
                    break;
                case 3:
                    text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");
                        btn4.setText(text);
                        layout.addView(btn4);

                        btn4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                openmap(entries.get(3),cn);
                            }});
                    }
                    count = 4;
                    break;
                case 4:
                    text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");
                        btn5.setText(text);
                        layout.addView(btn5);

                        btn5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                openmap(entries.get(4),cn);
                            }});
                    }
                    count = 5;
                    break;

                case 5:
                    text = addplacename.getText().toString().trim();
                    if (!text.isEmpty()) {
                        entries.add(text);
                        addplacename.setText("");
                        btn6.setText(text);
                        layout.addView(btn6);

                        btn6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                openmap(entries.get(5),cn);
                            }
                        });
                    }
                    count = 6;
                    break;
                default:
                    Toast.makeText(getBaseContext(), "Cannot Add Any More", Toast.LENGTH_LONG).show();
            }
        }
    public void remButton () {
        switch (count) {
            case 1: entries.remove(0);
                layout.removeView(btn1);
                count = 0;
                break;

            case 2: entries.remove(1);
                layout.removeView(btn2);
                count = 1;
                break;
            case 3: entries.remove(2);
                layout.removeView(btn3);
                count = 2;
                break;
            case 4: entries.remove(3);
                layout.removeView(btn4);
                count = 3;
                break;
            case 5: entries.remove(4);
                layout.removeView(btn5);
                count = 4;
                break;
            case 6: entries.remove(5);
                layout.removeView(btn6);
                count = 5;
                break;
            default:
                Toast.makeText(getBaseContext(), "Cannot Remove Any More", Toast.LENGTH_LONG).show();
        }
    }
    private void openmap (String place, String cityName){
        Uri uri = Uri.parse("geo:0, 0?q=" + Uri.encode(place) + " , " + Uri.encode(cityName));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}
