import java.util.*;
import java.io.*;

class play {
	static void loader() throws Exception {
		int c=0;
		boolean s=false;
		System.out.println();
		for (int x = 0; x < 50; x++) {
			System.out.print("   [");
			if (c==0)
				s=false;
			else if (c==6)
				s=true;

			if (s==false)
				c++;
			else
				c--;

			for (int i=0; i<7; i++) {
				if (i==c)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.print("] >> Komputer memprediksi tangkapan");
			Thread.sleep(85);
			System.out.print("\r");
		}
	}

	static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}

	static void resetTitik() {
		for (int i=1; i <= 9; i++) {
			t[i] = " ";
		}
	}

	static int cekInput(int input) {
		// mengecek exception handling
		do {
			System.out.print("\tMasukan pilihan: "); 
		    while (!sc.hasNextInt()) {
		        System.out.print("\tInput salah!!!, Ulangi: ");
		        sc.next(); // wajib
		    }
		    input = sc.nextInt();
		    return input;
		} while (input <= ((input == 1) ? 1 : 0) && input >= ((input == 1) ? 19 : 2));
	}

	static void getPemenang(int skor1, int skor2, String tim1, String tim2) {
		System.out.print("\n\n\n");
		System.out.println("\t                           Full Time:");
		System.out.println("\t                           +---+---+        ");
		System.out.println("\t                           | "+skor1+" | "+skor2+" |");
		System.out.println("\t                           +---+---+        ");
		System.out.println("\t");
		System.out.println("\t __          __  _____   _   _   _   _   ______   _____  ");
		System.out.println("\t \\ \\        / / |_   _| | \\ | | | \\ | | |  ____| |  __ \\ ");
		System.out.println("\t  \\ \\  /\\  / /    | |   |  \\| | |  \\| | | |__    | |__) |");
		System.out.println("\t   \\ \\/  \\/ /     | |   | . ` | | . ` | |  __|   |  _  / ");
		System.out.println("\t    \\  /\\  /     _| |_  | |\\  | | |\\  | | |____  | | \\ \\ ");
		System.out.println("\t     \\/  \\/     |_____| |_| \\_| |_| \\_| |______| |_|  \\_\\");
		System.out.println("\t");
		System.out.println("\t                          ___________");
		System.out.println("\t                         '._==_==_=_.'");
		System.out.println("\t                         .-\\:      /-.");
		System.out.println("\t                        | (|:.     |) |");
		System.out.println("\t                         '-|:.     |-'");
		System.out.println("\t                           \\::.    /");
		System.out.println("\t                            '::. .'");
		System.out.println("\t                              ) (");
		System.out.println("\t                            _.' '._");
		System.out.println("\t                           `\"\"\"\"\"\"\"`\n");
		if (skor1 > skor2) 
			System.out.println("                              "+tim1);
		else
			System.out.println("                              "+tim2);
	}

	static String setBola(int shooter) {
		if (shooter <=9 && shooter >=1) {
			for (int i = 1; i <= 9; i++) {
				if (shooter == i)
					t[i] = "*";
			}
		}
		else
			System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");

		if (shooter >= 1 && shooter <= 9) {
			return "benar";
		}
		else {
			return "salah";
		}
	}

	static int setShooter(int tukar, int skor1, int skor2, String tim1, String tim2) {
		getTitikGawang(skor1, skor2, tim1, tim2);
		if (tukar == 0)
			System.out.println("\n\n   [Player 1] <-\n   [Player 2]");
		else
			System.out.println("\n\n   [Player 1]\n   [Player 2] <-");

		char[] sembunyi = console.readPassword("\n   [SHOOTER] >> Masukan titik tendangan: ");
		if (sembunyi.length > 0) {
			clearScreen();
			int shooter = Character.getNumericValue(sembunyi[sembunyi.length - 1]);
			return shooter;
		}
		else
			return 0;
	}

	static int setKeeper(int player, int tukar, int skor1, int skor2, String tim1, String tim2) throws Exception {
		getTitikGawang(skor1, skor2, tim1, tim2);
		if (tukar == 0)
			System.out.println("\n\n   [Player 1]\n   [Player 2] <-");
		else
			System.out.println("\n\n   [Player 1] <-\n   [Player 2]");

		if (tukar == 0 && player == 2) {
			loader();
			clearScreen();
			int keeper = rn.nextInt(9) + 1;
			return keeper;
		}
		else {
			char[] sembunyi = console.readPassword("\n   [KEEPER] >> Masukan titik tendangan: ");
			if (sembunyi.length > 0) {
				clearScreen();
				int keeper = Character.getNumericValue(sembunyi[sembunyi.length - 1]);
				return keeper;
			}
			else
				return 0;
		}
	}

	static int setSkor(int keeper, int shooter, int skor1, int skor2, String[] poin1, String[] poin2, int idPoin, int tukar) {
		if (tukar == 0) {
			if (keeper != shooter) {
				skor1 = skor1 + 1;
				poin1[idPoin] = "o";
			}
			else if (keeper == shooter) {
				poin1[idPoin] = "x";
			}
			return skor1;
		}
		else {
			if (keeper != shooter) {
				skor2 = skor2 + 1;
				poin2[idPoin] = "o";
			}
			else if (keeper == shooter) {
				poin2[idPoin] = "x";
			}
			return skor2;
		}
	}

	static void getStatusGol(int keeper, int shooter, String[] poin1, String[] poin2, String tim1, String tim2) {
		if (keeper != shooter) {
			System.out.println();
			System.out.println("                  _____    ____               _        _   _   _ ");
			System.out.println("                 / ____|  / __ \\      /\\     | |      | | | | | |");
			System.out.println("                | |  __  | |  | |    /  \\    | |      | | | | | |");
			System.out.println("                | | |_ | | |  | |   / /\\ \\   | |      | | | | | |");
			System.out.println("                | |__| | | |__| |  / ____ \\  | |____  |_| |_| |_|");
			System.out.println("                 \\_____|  \\____/  /_/    \\_\\ |______| (_) (_) (_)");  
			getPapanGol(poin1, poin2, tim1, tim2);
		}
		else {
			System.out.println();
			System.out.println("                 _____             __      __  ______   _   _   _ ");
			System.out.println("                / ____|     /\\     \\ \\    / / |  ____| | | | | | |");
			System.out.println("               | (___      /  \\     \\ \\  / /  | |__    | | | | | |");
			System.out.println("                \\___ \\    / /\\ \\     \\ \\/ /   |  __|   | | | | | |");
			System.out.println("                ____) |  / ____ \\     \\  /    | |____  |_| |_| |_|");
			System.out.println("               |_____/  /_/    \\_\\     \\/     |______| (_) (_) (_)");
			getPapanGol(poin1, poin2, tim1, tim2);
		}
	}

	static void getPapanGol(String[] poin1, String[] poin2, String tim1, String tim2) {
		System.out.println();
		if (suddenDeath == true) {
			System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
			System.out.println("              | " + tim1 + " |  "+poin1[2]+"  |  "+poin1[4]+"  |  "+poin1[6]+"  |  "+poin1[8]+"  |  "+poin1[10]+"  |");
			System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
			System.out.println("              | " + tim2 + " |  "+poin2[1]+"  |  "+poin2[3]+"  |  "+poin2[5]+"  |  "+poin2[7]+"  |  "+poin2[9]+"  |");
			System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
		}
		else {
			System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
			System.out.println("              | " + tim1 + " |  "+poin1[1]+"  |  "+poin1[3]+"  |  "+poin1[5]+"  |  "+poin1[7]+"  |  "+poin1[9]+"  |");
			System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
			System.out.println("              | " + tim2 + " |  "+poin2[2]+"  |  "+poin2[4]+"  |  "+poin2[6]+"  |  "+poin2[8]+"  |  "+poin2[10]+"  |");
			System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
		}
	}

	static void getPapanSkor(int skor1, int skor2, String tim1, String tim2) {
		System.out.print("\n");
		System.out.println("           +---------------------||-----------||---------------------+        ");
		System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
	}

	static void getTitikGawang(int skor1, int skor2, String tim1, String tim2) {
		// sc.nextLine();
		getPapanSkor(skor1, skor2, tim1, tim2);
		System.out.println("    _______|_____________________||___________||_____________________|_______ ");
		System.out.println("   |  _____________________________________________________________________  |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |    [1]                          [2]                          [3]    | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |    [4]                          [5]                          [6]    | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |    [7]                          [8]                          [9]    | |");
		System.out.println("   | |                                                                     | |");
	}

	static void getTampilanGawang(String[] t, int skor1, int skor2, String tim1, String tim2, int keeper) {
		getPapanSkor(skor1, skor2, tim1, tim2);

		switch (keeper) {
			case 1:
				System.out.println("    _______|_____________________||___________||_____________________|_______ ");
				System.out.println("   |  _____________________________________________________________________  |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[1]+"_____                       "+t[2]+"                            "+t[3]+"     | |");
				System.out.println("   | |      \\    \\                                                         | |");
				System.out.println("   | |       \\  ( )                                                        | |");
				System.out.println("   | |        \\___\\       __                                               | |");
				System.out.println("   | |             \\     /                                                 | |");
				System.out.println("   | |              \\___/                                                  | |");
				System.out.println("   | |     "+t[4]+"         \\                  "+t[5]+"                            "+t[6]+"     | |");
				System.out.println("   | |                \\____,                                               | |");
				System.out.println("   | |                     '                                               | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[7]+"                            "+t[8]+"                            "+t[9]+"     | |");
				System.out.println("   | |                                                                     | |");
				break;
			case 2:
				System.out.println("    _______|_____________________||___________||_____________________|_______ ");
				System.out.println("   |  _____________________________________________________________________  |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[1]+"                            "+t[2]+"                            "+t[3]+"     | |");
				System.out.println("   | |                                 / \\                                 | |");
				System.out.println("   | |                                / _ \\                                | |");
				System.out.println("   | |                                \\( )/                                | |");
				System.out.println("   | |                                  V                                  | |");
				System.out.println("   | |                                  |                                  | |");
				System.out.println("   | |     "+t[4]+"                            "+t[5]+"                            "+t[6]+"     | |");
				System.out.println("   | |                                 ( )                                 | |");
				System.out.println("   | |                                 | |                                 | |");
				System.out.println("   | |                                 | |                                 | |");
				System.out.println("   | |                                 | |                                 | |");
				System.out.println("   | |     "+t[7]+"                           /"+t[8]+"\\                           "+t[9]+"     | |");
				System.out.println("   | |                                                                     | |");
				break;
			case 3:
				System.out.println("    _______|_____________________||___________||_____________________|_______ ");
				System.out.println("   |  _____________________________________________________________________  |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[1]+"                            "+t[2]+"                       _____"+t[3]+"     | |");
				System.out.println("   | |                                                         /    /      | |");
				System.out.println("   | |                                                        ( )  /       | |");
				System.out.println("   | |                                               __       /___/        | |");
				System.out.println("   | |                                                 \\     /             | |");
				System.out.println("   | |                                                  \\___/              | |");
				System.out.println("   | |     "+t[4]+"                            "+t[5]+"                  /         "+t[6]+"     | |");
				System.out.println("   | |                                               ,____/                | |");
				System.out.println("   | |                                               '                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[7]+"                            "+t[8]+"                            "+t[9]+"     | |");
				System.out.println("   | |                                                                     | |");
				break;
			case 4:
				System.out.println("    _______|_____________________||___________||_____________________|_______ ");
				System.out.println("   |  _____________________________________________________________________  |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[1]+"                            "+t[2]+"                            "+t[3]+"     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |             _                                                       | |");
				System.out.println("   | |            ( )                                                      | |");
				System.out.println("   | |     "+t[4]+"________+.                  "+t[5]+"                            "+t[6]+"     | |");
				System.out.println("   | |              \\\\                                                     | |");
				System.out.println("   | |               \\\\                                                    | |");
				System.out.println("   | |               /\\'                                                   | |");
				System.out.println("   | |              /  \\___,                                               | |");
				System.out.println("   | |     "+t[7]+"        \\      '            "+t[8]+"                             "+t[9]+"    | |");
				System.out.println("   | |              _\\                                                     | |");
				break;
			case 5:
				System.out.println("    _______|_____________________||___________||_____________________|_______ ");
				System.out.println("   |  _____________________________________________________________________  |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[1]+"                            "+t[2]+"                            "+t[3]+"     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                  _                                  | |");
				System.out.println("   | |                                 ( )                                 | |");
				System.out.println("   | |     "+t[4]+"                           ("+t[5]+")                           "+t[6]+"     | |");
				System.out.println("   | |                                 /|\\                                 | |");
				System.out.println("   | |                                  |                                  | |");
				System.out.println("   | |                                  A                                  | |");
				System.out.println("   | |                                 / \\                                 | |");
				System.out.println("   | |     "+t[7]+"                          / "+t[8]+" \\                          "+t[9]+"     | |");
				System.out.println("   | |                               /     \\                               | |");
				break;
			case 6:
				System.out.println("    _______|_____________________||___________||_____________________|_______ ");
				System.out.println("   |  _____________________________________________________________________  |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[1]+"                            "+t[2]+"                            "+t[3]+"     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                       _             | |");
				System.out.println("   | |                                                      ( )            | |");
				System.out.println("   | |     "+t[4]+"                            "+t[5]+"                  .+________"+t[6]+"     | |");
				System.out.println("   | |                                                     //              | |");
				System.out.println("   | |                                                    //               | |");
				System.out.println("   | |                                                   '/\\               | |");
				System.out.println("   | |                                               ,___/  \\              | |");
				System.out.println("   | |     "+t[7]+"                            "+t[8]+"            '      /        "+t[9]+"     | |");
				System.out.println("   | |                                                     /_              | |");
				break;
			case 7:
				System.out.println("    _______|_____________________||___________||_____________________|_______ ");
				System.out.println("   |  _____________________________________________________________________  |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[1]+"                            "+t[2]+"                            "+t[3]+"     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[4]+"                            "+t[5]+"                            "+t[6]+"     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |          \\                                                          | |");
				System.out.println("   | |           \\           /\\                                            | |");
				System.out.println("   | |            \\         /  \\_                                          | |");
				System.out.println("   | |     "+t[7]+"______(:)+======+______,    "+t[8]+"                            "+t[9]+"     | |");
				System.out.println("   | |                                                                     | |");
				break;
			case 8:
				System.out.println("    _______|_____________________||___________||_____________________|_______ ");
				System.out.println("   |  _____________________________________________________________________  |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[1]+"                            "+t[2]+"                            "+t[3]+"     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[4]+"                            "+t[5]+"                            "+t[6]+"     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                  _                                  | |");
				System.out.println("   | |                                _( )_                                | |");
				System.out.println("   | |                                \\   /                                | |");
				System.out.println("   | |     "+t[7]+"                         __("+t[8]+")__                         "+t[9]+"     | |");
				System.out.println("   | |                              _\\     /_                              | |");
				break;
			case 9:
				System.out.println("    _______|_____________________||___________||_____________________|_______ ");
				System.out.println("   |  _____________________________________________________________________  |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[1]+"                            "+t[2]+"                            "+t[3]+"     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |     "+t[4]+"                            "+t[5]+"                            "+t[6]+"     | |");
				System.out.println("   | |                                                                     | |");
				System.out.println("   | |                                                        /            | |");
				System.out.println("   | |                                            /\\         /             | |");
				System.out.println("   | |                                          _/  \\       /              | |");
				System.out.println("   | |     "+t[7]+"                            "+t[8]+"    ,______+======+(:)______"+t[9]+"     | |");
				System.out.println("   | |                                                                     | |");
				break;
		}
	}

	public static Scanner sc = new Scanner(System.in);
	public static Console console = System.console();
	public static Random rn = new Random();
	public static String t[] = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
	public static boolean suddenDeath = false;

	// ------ Main method ------------------------------------------------------------------------------------

    public static void main(String[] args) throws Exception {

		int menu = 5;
		int statusMenu = 0;
		do { // while (statusMenu!=0);
			clearScreen();

			System.out.print("\n\n\n\n\n");
			System.out.println("     ___              _                                     _  _    _   ___ ");
			System.out.println("    |  _|            | |                                   | || |  (_) |_  |");
			System.out.println("    | |     __ _   __| | _   _   _ __    ___  _ __    __ _ | || |_  _    | |");
			System.out.println("    | |    / _` | / _` || | | | | '_ \\  / _ \\| '_ \\  / _` || || __|| |   | |");
			System.out.println("    | |   | (_| || (_| || |_| | | |_) ||  __/| | | || (_| || || |_ | |   | |");
			System.out.println("    | |_   \\__,_| \\__,_| \\__,_| | .__/  \\___||_| |_| \\__,_||_| \\__||_|  _| |");
			System.out.println("    |___|                       | |                                    |___|");
			System.out.println("                                |_|                                         \n");                                                              

			System.out.println("\n\t                      +---------+---+                           ");
			System.out.println("\t                      | Mulai   | 1 |                           ");
			System.out.println("\t                      +---------+---+                          ");
			System.out.println("\t                      | Bantuan | 2 |                          ");
			System.out.println("\t        ,             +---------+---+            ,__,__        ");
			System.out.println("\t    -   \\O            | Keluar  | 0 |          , |xx|XX\\       ");
			System.out.println("\t  -     /\\            +---------+---+        O/  |xx|XXX\\      ");
			System.out.println("\t -  ,__/\\ `                                  /\\  |xx|XXXX\\     ");
			System.out.println("\t         \\_ (*)                             ` << |xx|XXXXX|    ");
			System.out.println("\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

			menu = cekInput(menu);

			System.out.println();

			statusMenu = 0;
			switch (menu) {
				case 1:
					String tim1, tim2, statusInput="salah";
					String timList[] = {"                   ","     Arema FC      ","    Bali United    ","  Barito Putera FC ","  Bhayangkara FC   ","   Madura United   ","    Mitra Kukar    ","  Persegres Gresik ","  Persela Lamongan ","Perseru Serui Serui","  Persib Bandung   "," Persiba Balikpapan","Persija Jakarta    "," Persipura Jayapura","       PS TNI      ","    PSM Makassar   ","Pusamania Borneo FC","  Semen Padang FC  ","    Sriwijaya FC   ","    Persebaya FC   "};
					String poin1[] = {""," "," "," "," "," "," "," "," "," "," "," "}, poin2[] = {""," "," "," "," "," "," "," "," "," "," "," "};
					int player = 0, giliran = 0, tukar = 0, skor1 = 0, skor2 = 0, keeper, shooter, idTim1 = 1, idTim2 = 1, idPoin=1;
					char [] sembunyi;

					clearScreen();
					System.out.print("\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("\t\t\t\t+--------------+---+");
					System.out.println("\t\t\t\t| Singleplayer | 1 |");
					System.out.println("\t\t\t\t+--------------+---+");
					System.out.println("\t\t\t\t| Multiplayer  | 2 |");
					System.out.println("\t\t\t\t+--------------+---+");
					System.out.print("\t\t\t\tMasukan pilihan: "); player = sc.nextInt();

					clearScreen();
					System.out.print("\n\n\n");
					System.out.println("\t+----+---------------------+-------------+---------------------+");
					System.out.println("\t| NO | NAMA TIM            | LOKASI      | JULUKAN             |");
					System.out.println("\t+----+---------------------+-------------+---------------------+");
					System.out.println("\t| 1  | Arema FC            | Malang      | Singo Edan          |");
					System.out.println("\t| 2  | Bali United         | Bali        | Serdadu Tridatu     |");
					System.out.println("\t| 3  | Barito Putera FC    | Banjarmasin | Laskar Antasari     |");
					System.out.println("\t| 4  | Bhayangkara FC      | Bekasi      | -                   |");
					System.out.println("\t| 5  | Madura United       | Madura      | Laskar Sape Kerrab  |");
					System.out.println("\t| 6  | Mitra Kukar         | Tenggarong  | Si Naga Mekes       |");
					System.out.println("\t| 7  | Persegres Gresik    | Gresik      | Kebo Giras          |");
					System.out.println("\t| 8  | Persela Lamongan    | Lamongan    | Laskar Joko Tingkir |");
					System.out.println("\t| 9  | Perseru Serui Serui | Papua       | Cendrawasih Jingga  |");
					System.out.println("\t| 10 | Persib Bandung      | Bandung     | Maung Bandung       |");
					System.out.println("\t| 11 | Persiba Balikpapan  | Balikpapan  | Beruang Madu        |");
					System.out.println("\t| 12 | Persija Jakarta     | Jakarta     | Macan Kemayoran     |");
					System.out.println("\t| 13 | Persipura Jayapura  | Jayapura    | Mutiara Hitam       |");
					System.out.println("\t| 14 | PS TNI              | -           | -                   |");
					System.out.println("\t| 15 | PSM Makassar        | Makassar    | Pasukan Ramang      |");
					System.out.println("\t| 16 | Pusamania Borneo FC | Samarinda   | Pesut Etam          |");
					System.out.println("\t| 17 | Semen Padang FC     | Padang      | Kabau Sirah         |");
					System.out.println("\t| 18 | Sriwijaya FC        | Palembang   | Laskar Wong Kito    |");
					System.out.println("\t| 19 | Persebaya FC        | Surabaya    | Bonek               |");
					System.out.println("\t+----+---------------------+-------------+---------------------+");

					do {
						System.out.print("\n\t[Player 1] <-\n\t[Player 2]\n\t--------------------\n"); 
						idTim1 = cekInput(idTim1);
						if (idTim1>=1 && idTim1<=19)
							statusInput = "benar";
						else {
							System.out.print("\n\tInput salah, Ulangi!");
							statusInput = "salah";
						}
					} while (statusInput=="salah");

					do {
						System.out.print("\n\t[Player 1]\n\t[Player 2] <-\n\t--------------------\n");
						idTim2 = cekInput(idTim2);
						if (idTim2>=1 && idTim2<=19)
							statusInput = "benar";
						else {
							System.out.print("\n\tInput salah, Ulangi!");
							statusInput = "salah";
						}
					} while (statusInput=="salah");

					sc.nextLine();
					clearScreen();
					System.out.print("\n\n\n");
					System.out.println("\t                                                    ,/)");
					System.out.println("\t                                                    |_|    ");
					System.out.println("\t        _        _        _        _        _       ].[    ");
					System.out.println("\t       |.|      |.|      |.|      |.|      |.|    /~`-'~\\  ");
					System.out.println("\t       ]^[      ]^[      ]^[      ]^[      ]^[   (<| K |>) ");
					System.out.println("\t     /~/^\\~\\  /~`-'~\\  /~`-'~\\  /~`-'~\\  /~`-'~\\  \\|___|/  ");
					System.out.println("\t    {<| 1 |>}{<| 2 |>}{<| 3 |>}{<| 4 |>}{<| 5 |>} {/   \\}  ");
					System.out.println("\t     \\|___|/  \\|___|/  \\|___|/  \\|___|/  \\|___|/  /__1__\\  ");
					System.out.println("\t    /\\    \\    /   \\    /   \\    /   \\    /   \\   | / \\ |  ");
					System.out.println("\t    |/>/|__\\  /__|__\\  /__|__\\  /__|__\\  /__|__\\  |/   \\|  ");
					System.out.println("\t    |)   \\ |  | / \\ |  | / \\ |  | / \\ |  | / \\ |  {}   {}  ");
					System.out.println("\t   (_|    \\)  (/   \\)  (/   \\)  (/   \\)  (/   \\)  |)   (|  ");
					System.out.println("\t   / \\    (|  |)   (|  |)   (|  |)   (|  |)   (|  ||   ||  ");
					System.out.println("\t.,.\\_/,..,|,)(.|,.,|,)(,|,.,|.)(.|,.,|,)(,|,.,|.)(.|.,.|,) ");
					System.out.println("\t");
					System.out.println("\t                              _         _  _  _  _ ");
					System.out.println("\t                             | |       (_)| || || |");
					System.out.println("\t            _ __ ___   _   _ | |  __ _  _ | || || |");
					System.out.println("\t           | '_ ` _ \\ | | | || | / _` || || || || |");
					System.out.println("\t           | | | | | || |_| || || (_| || ||_||_||_|");
					System.out.println("\t           |_| |_| |_| \\__,_||_| \\__,_||_|(_)(_)(_)\n");
					System.out.println("\t                           [ENTER]");
					System.out.print("\t                              ");

					sc.nextLine();
					clearScreen();

					tim1 = timList[idTim1];
					tim2 = timList[idTim2];

					statusInput = "salah";
					do { //while (giliran<10);
						// getTitikGawang(skor1, skor2, tim1, tim2);
						
						if (tukar == 0) {
							do {
								shooter = setShooter(tukar, skor1, skor2, tim1, tim2);
								statusInput = setBola(shooter);
							} while (statusInput.equals("salah"));

							do { // while (statusInput.equals("salah"))
								keeper = setKeeper(player, tukar, skor1, skor2, tim1, tim2);

								if (keeper >=1 && keeper <=9) {
									statusInput = "benar";
									skor1 = setSkor(keeper, shooter, skor1, skor2, poin1, poin2, idPoin, tukar);
									getTampilanGawang(t, skor1, skor2, tim1, tim2, keeper);
								}
								else {
									System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
									statusInput = "salah";
								}
							} while (statusInput.equals("salah"));

							getStatusGol(keeper, shooter, poin1, poin2, tim1, tim2);

							tukar = 1;
							resetTitik();
							System.out.print("\n                       Tekan [ENTER] untuk melanjutkan"); 
							sc.nextLine();
							clearScreen();
						}

						else if (tukar == 1) {
							do {
								shooter = setShooter(tukar, skor1, skor2, tim1, tim2);
								statusInput = setBola(shooter);

							} while (statusInput.equals("salah"));

							do {
								keeper = setKeeper(player, tukar, skor1, skor2, tim1, tim2);

								if (keeper >=1 && keeper <=9) {
									statusInput = "benar";
									skor2 = setSkor(keeper, shooter, skor1, skor2, poin1, poin2, idPoin, tukar);
									getTampilanGawang(t, skor1, skor2, tim1, tim2, keeper);
								}
								else {
									System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
									statusInput = "salah";
								}
							} while (statusInput.equals("salah"));

							getStatusGol(keeper, shooter, poin1, poin2, tim1, tim2);

							tukar = 0;
							resetTitik();
							System.out.print("\n                       Tekan [ENTER] untuk melanjutkan"); 
							sc.nextLine();
							clearScreen();
						}

						// ganti giliran
						giliran = giliran + 1;
						idPoin = idPoin+1;

						if (giliran==8 && (skor1-skor2)>=2) {
							break;
						}
						else if (giliran==8 && (skor2-skor1)>=2) {
							break;
						}
					} while (giliran<10);

					if (skor1 > skor2 || skor1 < skor2) {
						getPemenang(skor1, skor2, tim1, tim2);
					}
					else {
						suddenDeath = true;
						int sd = 0; // mengulang sudden death
						do {
							System.out.print("\n\n\n\n\n");
							System.out.println("\t ____          _             _      HASIL SERI!");
							System.out.println("\t|  _ \\        | |           | |           SKOR:");
							System.out.println("\t| |_) |  __ _ | |__    __ _ | | __        +---+---+        ");
							System.out.println("\t|  _ <  / _` || '_ \\  / _` || |/ /        | "+skor1+" | "+skor2+" |");
							System.out.println("\t| |_) || (_| || |_) || (_| ||   < _       +---+---+        ");
							System.out.println("\t|____/  \\__,_||_.__/  \\__,_||_|\\_\\ |                       ");
							System.out.println("\t _ __    ___  _ __    ___  _ __  | |_  _   _   __ _  _ __  ");
							System.out.println("\t| '_ \\  / _ \\| '_ \\  / _ \\| '_ \\ | __|| | | | / _` || '_ \\ ");
							System.out.println("\t| |_) ||  __/| | | ||  __/| | | || |_ | |_| || (_| || | | |");
							System.out.println("\t| .__/  \\___||_| |_| \\___||_| |_| \\__| \\__,_| \\__,_||_| |_|");
							System.out.println("\t| |                                                        ");
							System.out.println("\t|_|                                                        ");
							System.out.println("\t                         [ENTER]");
							System.out.print("\t                            ");

							sc.nextLine();
							clearScreen();

							for (int i=1; i<=10; i++) {
								poin1[i] = " ";
								poin2[i] = " ";
							}

							idPoin = 1;
							tukar = 1;
							giliran = 0;

							do {
								if (tukar == 0) {
									do {
										shooter = setShooter(tukar, skor1, skor2, tim1, tim2);
										statusInput = setBola(shooter);

									} while (statusInput.equals("salah"));

									do {
										keeper = setKeeper(player, tukar, skor1, skor2, tim1, tim2);

										if (keeper >=1 && keeper <=9) {
											statusInput = "benar";
											skor1 = setSkor(keeper, shooter, skor1, skor2, poin1, poin2, idPoin, tukar);
											getTampilanGawang(t, skor1, skor2, tim1, tim2, keeper);
										}
										else {
											System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
											statusInput = "salah";
										}
									} while (statusInput.equals("salah"));

									getStatusGol(keeper, shooter, poin1, poin2, tim1, tim2);

									tukar = 1;
									resetTitik();
									System.out.print("\n                       Tekan [ENTER] untuk melanjutkan"); 
									sc.nextLine();
									clearScreen();
								}

								else if (tukar == 1) {
									do {
										shooter = setShooter(tukar, skor1, skor2, tim1, tim2);
										statusInput = setBola(shooter);

									} while (statusInput.equals("salah"));

									do {
										keeper = setKeeper(player, tukar, skor1, skor2, tim1, tim2);

										if (keeper >=1 && keeper <=9) {
											statusInput = "benar";
											skor2 = setSkor(keeper, shooter, skor1, skor2, poin1, poin2, idPoin, tukar);
											getTampilanGawang(t, skor1, skor2, tim1, tim2, keeper);
										}
										else {
											System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
											statusInput = "salah";
										}
									} while (statusInput.equals("salah"));

									getStatusGol(keeper, shooter, poin1, poin2, tim1, tim2);

									tukar = 0;
									resetTitik();
									System.out.print("\n                       Tekan [ENTER] untuk melanjutkan"); 
									sc.nextLine();
									clearScreen();
								}
								
								idPoin = idPoin + 1;

								if ((giliran%2)!=0 && (skor1-skor2)==1) {
									sd = 1;
									break;
								}
								else if ((giliran%2)!=0 && (skor2-skor1)==1) {
									sd = 1;
									break;
								}
								giliran = giliran + 1;
							} while (giliran<10);

						} while (sd==0);

						if (skor1 > skor2 || skor1 < skor2) {
							getPemenang(skor1, skor2, tim1, tim2);
						}
					}
				break;
				case 2:
					clearScreen();
					System.out.print("\n\n\n");
					System.out.println("\t\t\t\t+---------+");
					System.out.println("\t\t\t\t| BANTUAN |");
					System.out.println("\t\t\t\t+---------+\n");
					System.out.println("\t\tMinimum eksekutor penendang adalah lima orang ");
					System.out.println("\t\tdan untuk poin minimum adalah lima, ");
					System.out.println("\t\ttetapi bisa kurang dan bisa lebih ");
					System.out.println("\t\ttergantung pada skor. ");
					System.out.println("\t\t");
					System.out.println("\t\tSebagai contoh jika sampai penendang ke empat ");
					System.out.println("\t\tterdapat selisih dua angka terhadap tim lawan, ");
					System.out.println("\t\tmaka tim dengan skor paling tinggi ");
					System.out.println("\t\takan otomatis akan memenangkan pertandingan. ");
					System.out.println("\t\tApabila sampai pendendang ke lima tetap pada ");
					System.out.println("\t\tposisi imbang maka akan dilakukan 'sudden death' ");
					System.out.println("\t\tyang berarti setiap tim yang gagal ");
					System.out.println("\t\tsedangkan tim lain berhasil memasukkan ");
					System.out.println("\t\tmaka bisa diambil pemenangnnya.\n");
					statusMenu = 1;
					System.out.print("\t\t[ENTER]");
					sc.nextLine();
					sc.nextLine();
				break;
				case 0:
					clearScreen();
					System.exit(0);
					statusMenu = 0;
				break;
				default:
					System.out.println("Input Salah, tekan [ENTER]");
					statusMenu = 1;
					sc.nextLine();
					sc.nextLine();
			}
		} while (statusMenu!=0); 
	}
}

// // Mengacak nilai
// Random rn = new Random();

// for(int i =0; i < 0; i++)
// {
//     int answer = rn.nextInt(10) + 1;
//     System.out.println(answer);
// }