package com.example.sujith.game;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class page1 extends AppCompatActivity {

    TextView B1p,B2p,B3p,B4p,B5p,B6p,B7p,B8p,B9p,TVresp,Xwdp,Owdp;
    Button restp,ngBp;
    int click=1,count=0,Xw=0,Ow=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        B1p=findViewById(R.id.B1);
        B2p=findViewById(R.id.B2);
        B3p=findViewById(R.id.B3);
        B4p=findViewById(R.id.B4);
        B5p=findViewById(R.id.B5);
        B6p=findViewById(R.id.B6);
        B7p=findViewById(R.id.B7);
        B8p=findViewById(R.id.B8);
        B9p=findViewById(R.id.B9);
        TVresp=findViewById(R.id.TVres);
        restp=findViewById(R.id.reset);
        Xwdp=findViewById(R.id.Xwd);
        Owdp=findViewById(R.id.Owd);
        ngBp=findViewById(R.id.ngB);


        final String a=B1p.getText().toString();
        final String b=B2p.getText().toString();
        final String c=B3p.getText().toString();
        final String d=B4p.getText().toString();
        final String e=B5p.getText().toString();
        final String f=B6p.getText().toString();
        final String g=B7p.getText().toString();
        final String h=B8p.getText().toString();
        final String i=B9p.getText().toString();


        B1p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                count++;
                if (a.equals(""))
                {
                    if (click==1)
                    {
                        click=2;
                        B1p.setText("X");
                    }
                    else
                    {
                        click=1;
                        B1p.setText("O");
                    }
                }
                B1p.setEnabled(false);
                endgame();
                if(count==9&&TVresp.getText().toString().equals(""))
                {
                    TVresp.setText("IT'S A DRAW");
                }
            }
        });
        B2p.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                count++;
                if(b.equals(""))
                {

                    if (click==1)
                    {
                        click=2;
                        B2p.setText("X");
                    }
                    else
                    {
                        click=1;
                        B2p.setText("O");
                    }
                    B2p.setEnabled(false);
                }
                endgame();
                if(count==9&&TVresp.getText().toString().equals(""))
                {
                    TVresp.setText("IT'S A DRAW");
                }
            }
        });
        B3p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                count++;
                if(c.equals(""))
                {
                    if (click==1)
                    {
                        click=2;
                        B3p.setText("X");
                    }
                    else
                    {
                        click=1;
                        B3p.setText("O");
                    }
                    B3p.setEnabled(false);
                }
                endgame();
                if(count==9&&TVresp.getText().toString().equals(""))
                {
                    TVresp.setText("IT'S A DRAW");
                }
            }
        });
        B4p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                count++;
                if(d.equals(""))
                {
                    if (click==1)
                    {
                        click=2;
                        B4p.setText("X");
                    }
                    else
                    {
                        click=1;
                        B4p.setText("O");
                    }
                    B4p.setEnabled(false);
                }
                endgame();
                if(count==9&&TVresp.getText().toString().equals(""))
                {
                    TVresp.setText("IT'S A DRAW");
                }
            }
        });
        B5p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                count++;
                if(e.equals(""))
                {
                    if (click==1)
                    {
                        click=2;
                        B5p.setText("X");
                    }
                    else
                    {
                        click=1;
                        B5p.setText("O");
                    }
                    B5p.setEnabled(false);
                }
                endgame();
                if(count==9&&TVresp.getText().toString().equals(""))
                {
                    TVresp.setText("IT'S A DRAW");
                }
            }
        });
        B6p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                count++;
                if(f.equals(""))
                {
                    if (click==1)
                    {
                        click=2;
                        B6p.setText("X");
                    }
                    else
                    {
                        click=1;
                        B6p.setText("O");
                    }
                    B6p.setEnabled(false);
                }
                endgame();
                if(count==9&&TVresp.getText().toString().equals(""))
                {
                    TVresp.setText("IT'S A DRAW");
                }
            }
        });
        B7p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                count++;
                if(g.equals(""))
                {
                    if (click==1)
                    {
                        click=2;
                        B7p.setText("X");
                    }
                    else
                    {
                        click=1;
                        B7p.setText("O");
                    }
                    B7p.setEnabled(false);
                }
                endgame();
                if(count==9&&TVresp.getText().toString().equals(""))
                {
                    TVresp.setText("IT'S A DRAW");
                }
            }
        });
        B8p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                count++;
                if(h.equals(""))
                {
                    if (click==1)
                    {
                        click=2;
                        B8p.setText("X");
                    }
                    else
                    {
                        click=1;
                        B8p.setText("O");
                    }
                    B8p.setEnabled(false);
                }
                endgame();
                if(count==9&&TVresp.getText().toString().equals(""))
                {
                    TVresp.setText("IT'S A DRAW");
                }
            }
        });
        B9p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                count++;
                if(i.equals(""))
                {
                    if (click==1)
                    {
                        click=2;
                        B9p.setText("X");
                    }
                    else
                    {
                        click=1;
                        B9p.setText("O");
                    }
                    B9p.setEnabled(false);
                }
                endgame();
                if(count==9&&TVresp.getText().toString().equals(""))
                {
                    TVresp.setText("IT'S A DRAW");
                }
            }
        });
        ngBp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                SharedPreferences spm=PreferenceManager.getDefaultSharedPreferences(page1.this);
                SharedPreferences.Editor ed=spm.edit();
                ed.putString("px",Xwdp.getText().toString());
                ed.putString("po",Owdp.getText().toString());
                ed.apply();
                Xwdp.setText("");
                Owdp.setText("");
                Xw=0;
                Ow=0;
                restg();


            }
        });

        restp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                restg();

            }
        });
    }

    private void restg()
    {
        B1p.setText("");
        B2p.setText("");
        B3p.setText("");
        B4p.setText("");
        B5p.setText("");
        B6p.setText("");
        B7p.setText("");
        B8p.setText("");
        B9p.setText("");

        B1p.setEnabled(true);
        B2p.setEnabled(true);
        B3p.setEnabled(true);
        B4p.setEnabled(true);
        B5p.setEnabled(true);
        B6p.setEnabled(true);
        B7p.setEnabled(true);
        B8p.setEnabled(true);
        B9p.setEnabled(true);

        TVresp.setText("");

        count=0;

        click=1;
    }

    private void endgame()
    {
        final String a=B1p.getText().toString();
        final String b=B2p.getText().toString();
        final String c=B3p.getText().toString();
        final String d=B4p.getText().toString();
        final String e=B5p.getText().toString();
        final String f=B6p.getText().toString();
        final String g=B7p.getText().toString();
        final String h=B8p.getText().toString();
        final String i=B9p.getText().toString();

        if (a.equals(b)&&a.equals(c)&&a.equals("X"))
        {
            TVresp.setText("PLAYER X WINS");
            force();
            Xwin();

        }
        else if (a.equals(d)&&a.equals(g)&&a.equals("X"))
        {
            TVresp.setText("PLAYER X WINS");
            force();
            Xwin();

        }
        else if (a.equals(e)&&a.equals(i)&&a.equals("X"))
        {
            TVresp.setText("PLAYER X WINS");
            force();
            Xwin();

        }
        else if (d.equals(e)&&d.equals(f)&&d.equals("X"))
        {
            TVresp.setText("PLAYER X WINS");
            force();
            Xwin();

        }
        else if (g.equals(h)&&g.equals(i)&&g.equals("X"))
        {
            TVresp.setText("PLAYER X WINS");
            force();
            Xwin();

        }
        else if (b.equals(e)&&b.equals(h)&&!b.equals("")&&b.equals("X"))
        {
            TVresp.setText("PLAYER X WINS");
            force();
            Xwin();

        }
        else if (c.equals(f)&&c.equals(i)&&c.equals("X"))
        {
            TVresp.setText("PLAYER X WINS");
            force();
            Xwin();

        }
        else if (c.equals(e)&&c.equals(g)&&c.equals("X"))
        {
            TVresp.setText("PLAYER X WINS");
            force();
            Xwin();
        }



        if (a.equals(b)&&a.equals(c)&&a.equals("O"))
        {
            TVresp.setText("PLAYER O WINS");
            force();
            Owin();

        }
        else if (a.equals(d)&&a.equals(g)&&a.equals("O"))
        {
            TVresp.setText("PLAYER O WINS");
            force();
            Owin();

        }
        else if (a.equals(e)&&a.equals(i)&&a.equals("O"))
        {
            TVresp.setText("PLAYER O WINS");
            force();
            Owin();

        }
        else if (d.equals(e)&&d.equals(f)&&d.equals("O"))
        {
            TVresp.setText("PLAYER O WINS");
            force();
            Owin();

        }
        else if (g.equals(h)&&g.equals(i)&&g.equals("O"))
        {
            TVresp.setText("PLAYER O WINS");
            force();
            Owin();

        }
        else if (b.equals(e)&&b.equals(h)&&b.equals("O"))
        {
            TVresp.setText("PLAYER O WINS");
            force();
            Owin();

        }
        else if (c.equals(f)&&c.equals(i)&&c.equals("O"))
        {
            TVresp.setText("PLAYER O WINS");
            force();
            Owin();

        }
        else if (c.equals(e)&&c.equals(g)&&c.equals("O"))
        {
            TVresp.setText("PLAYER O WINS");
            force();
            Owin();

        }
    }

    private void Owin()
    {
        Ow++;
        Owdp.setText(""+Ow);
    }

    private void Xwin()
    {
        Xw++;
        Xwdp.setText(""+Xw);

    }


    private void force()
    {
        B1p.setEnabled(false);
        B2p.setEnabled(false);
        B3p.setEnabled(false);
        B4p.setEnabled(false);
        B5p.setEnabled(false);
        B6p.setEnabled(false);
        B7p.setEnabled(false);
        B8p.setEnabled(false);
        B9p.setEnabled(false);

    }


    public void score(View view)
    {
        Intent i=new Intent(page1.this,page2.class);
        startActivity(i);
    }
}
