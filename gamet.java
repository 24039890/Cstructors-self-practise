import java.util.Scanner;

public class gamet {

    public static void main(String []  args) {


            Scanner me = new Scanner(System.in);
            String[][] play = {
                    {" ", "| ", " ", " |", " "},
                    {"---", "--", "--"},
                    {" ", "| ", " ", " |", " "},
                    {"---", "--", "--"},
                    {" ", "| ", " ", " |", " "}};



            for (String[] row : play) {
                for (String culomn : row) {
                    System.out.print(culomn);
                }
                System.out.println();
            }
            System.out.println(" enter the  row  and column in order");
            int i = me.nextInt();
            me.nextLine();
            //String s=me.nextLine();


            if (i == 00) {
                play[0][0] = "x";

            } else if (i == 02) {
                play[0][2] = "x";
            } else if (i == 04) {
                play[0][4] = "x";
            } else if (i == 20) {
                play[2][0] = "x";
            } else if (i == 22) {
                play[2][2] = "x";
            } else if (i == 24) {
                play[2][4] = "x";
            } else if (i == 40) {
                play[4][0] = "x";
            } else if (i == 42) {
                play[4][2] = "x";
            } else if (i == 44) {
                play[4][4] = "x";
            }

            for (String[] row : play) {
                for (String culomn : row) {
                    System.out.print(culomn);
                }
                System.out.println();
            }

            int z = me.nextInt();
            if (z == 00) {
                play[0][0] = "o";

            } else if (z == 02) {
                play[0][2] = "o";
            } else if (z == 04) {
                play[0][4] = "o";
            } else if (z == 20) {
                play[2][0] = "o";
            } else if (z == 22) {
                play[2][2] = "o";
            } else if (z == 24) {
                play[2][4] = "o";
            } else if (z == 40) {
                play[4][0] = "o";
            } else if (z == 42) {
                play[4][2] = "o";
            } else if (z == 44) {
                play[4][4] = "o";
            }

            for (String[] row : play) {
                for (String me2 : row) {
                    System.out.print(me2);
                }
                System.out.println();
            }

            ///
        int k = me.nextInt();
        if (k == 00) {
            play[0][0] = "x";

        } else if (k == 02) {
            play[0][2] = "x";
        } else if (k == 04) {
            play[0][4] = "x";
        } else if (k == 20) {
            play[2][0] = "x";
        } else if (k == 22) {
            play[2][2] = "x";
        } else if (k == 24) {
            play[2][4] = "x";
        } else if (k == 40) {
            play[4][0] = "x";
        } else if (k == 42) {
            play[4][2] = "x";
        } else if (k == 44) {
            play[4][4] = "x";
        }

        for (String[] row : play) {
            for (String me4 : row) {
                System.out.print(me4);
            }
            System.out.println();
        }


    int j = me.nextInt();
        if (j == 00) {
            play[0][0] = "o";

        } else if (j == 02) {
            play[0][2] = "o";
        } else if (j == 04) {
            play[0][4] = "o";
        } else if (j == 20) {
            play[2][0] = "o";
        } else if (j == 22) {
            play[2][2] = "o";
        } else if (j == 24) {
            play[2][4] = "o";
        } else if (j == 40) {
            play[4][0] = "o";
        } else if (j == 42) {
            play[4][2] = "o";
        } else if (j == 44) {
            play[4][4] = "o";
        }

        for (String[] row : play) {
            for (String me3 : row) {
                System.out.print(me3);
            }
            System.out.println();
        }
  //

        int m= me.nextInt();
        me.nextLine();
        //String s=me.nextLine();


        if (m== 00) {
            play[0][0] = "x";

        } else if (m== 02) {
            play[0][2] = "x";
        } else if (m== 04) {
            play[0][4] = "x";
        } else if (m== 20) {
            play[2][0] = "x";
        } else if (m== 22) {
            play[2][2] = "x";
        } else if (m== 24) {
            play[2][4] = "x";
        } else if (m== 40) {
            play[4][0] = "x";
        } else if (m== 42) {
            play[4][2] = "x";
        } else if (m== 44) {
            play[4][4] = "x";
        }

        for (String[] row : play) {
            for (String m6 : row) {
                System.out.print(m6);
            }
            System.out.println();
        }

        int h = me.nextInt();
        if (h == 00) {
            play[0][0] = "o";

        } else if (h == 02) {
            play[0][2] = "o";
        } else if (h == 04) {
            play[0][4] = "o";
        } else if (h == 20) {
            play[2][0] = "o";
        } else if (h == 22) {
            play[2][2] = "o";
        } else if (h == 24) {
            play[2][4] = "o";
        } else if (h == 40) {
            play[4][0] = "o";
        } else if (h == 42) {
            play[4][2] = "o";
        } else if (h == 44) {
            play[4][4] = "o";
        }





        for (String[] row : play) {
            for (String me5 : row) {
                System.out.print(me5);
            }
            System.out.println();
        }
        ///
        int E = me.nextInt();
        if (E == 00) {
            play[0][0] = "x";

        } else if (E == 02) {

            play[0][2] = "x";
        } else if (E == 04) {
            play[0][4] = "x";
        } else if (E == 20) {
            play[2][0] = "x";
        } else if (E == 22) {
            play[2][2] = "x";
        } else if (E == 24) {
            play[2][4] = "x";
        } else if (E == 40) {
            play[4][0] = "x";
        } else if (E == 42) {
            play[4][2] = "x";
        } else if (E == 44) {
            play[4][4] = "x";
        }

        for (String[] row : play) {
            for (String pe7 : row) {
                System.out.print(pe7);
            }
            System.out.println();
        }


        int d= me.nextInt();
        if (d== 00) {
            play[0][0] = "o";

        } else if (d== 02) {
            play[0][2] = "o";
        } else if (d== 04) {
            play[0][4] = "o";
        } else if (d== 20) {
            play[2][0] = "o";
        } else if (d== 22) {
            play[2][2] = "o";
        } else if (d== 24) {
            play[2][4] = "o";
        } else if (d== 40) {
            play[4][0] = "o";
        } else if (d== 42) {
            play[4][2] = "o";
        } else if (d== 44) {
            play[4][4] = "o";
        }

        for (String[] row : play) {
            for (String p38 : row) {
                System.out.print(p38);
            }
            System.out.println();
        }   if("x".equals(play[0][0]) && "x".equals(play[0][2]) && "x".equals(play[0][4])||"x".equals(play[2][0]) && "x".equals(play[2][2]) && "x".equals(play[2][4])||"x".equals(play[4][0]) && "x".equals(play[4][2]) && "x".equals(play[4][4]) || "x".equals(play[0][0]) && "x".equals(play[2][2]) && "x".equals(play[4][4])||"x".equals(play[0][4]) && "x".equals(play[2][2]) && "x".equals(play[4][0])){
            System.out.println("  x win ");
            System.out.println("  o you lose sorry");
        }else if("o".equals(play[0][0]) && "o".equals(play[0][2]) && "o".equals(play[0][4]) || "o".equals(play[2][0]) && "o".equals(play[2][2]) && "o".equals(play[2][4]) || "o".equals(play[4][0]) && "o".equals(play[4][2]) && "o".equals(play[4][4]) || "o".equals(play[0][0]) && "o".equals(play[2][2]) && "o".equals(play[4][4]) || "x".equals(play[0][4]) && "x".equals(play[2][2]) && "x".equals(play[4][0])){
            System.out.println("  0 win ");
            System.out.println("  x you lose sorry");
        }else{
        System.out.println("  draw ");
        }
        //

        int p= me.nextInt();
        me.nextLine();
        //String s=pe.nextLine();


        if (p== 00) {
            play[0][0] = "x";

        } else if (p== 02) {
            play[0][2] = "x";
        } else if (p== 04) {
            play[0][4] = "x";
        } else if (p== 20) {
            play[2][0] = "x";
        } else if (p== 22) {
            play[2][2] = "x";
        } else if (p== 24) {
            play[2][4] = "x";
        } else if (p== 40) {
            play[4][0] = "x";
        } else if (p== 42) {
            play[4][2] = "x";
        } else if (p== 44) {
            play[4][4] = "x";
        }

        for (String[] row : play) {
            for (String p6 : row) {
                System.out.print(p6);
            }
            System.out.println();
        }


        }}



