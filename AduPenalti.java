import java.util.*;
import java.io.*;

class play {
	static void getGameplay(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8, String t9) {
		System.out.println("    _______|_____________________||___________||_____________________|_______ ");
		System.out.println("   |  _____________________________________________________________________  |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |     "+t1+"_____                       "+t2+"                            "+t3+"     | |");
		System.out.println("   | |      \\    \\                                                         | |");
		System.out.println("   | |       \\  ( )                                                        | |");
		System.out.println("   | |        \\___\\       __                                               | |");
		System.out.println("   | |             \\     /                                                 | |");
		System.out.println("   | |              \\___/                                                  | |");
		System.out.println("   | |     "+t4+"         \\                  "+t5+"                            "+t6+"     | |");
		System.out.println("   | |                \\____,                                               | |");
		System.out.println("   | |                     '                                               | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |                                                                     | |");
		System.out.println("   | |     "+t7+"                            "+t8+"                            "+t9+"     | |");
		System.out.println("   | |                                                                     | |");
	}

	static void getPapanSkor(String statusInput, int keeper, int shooter, int skor1, int skor2, String poin1[], int idPoin, String tim1, String tim2) {
		statusInput = "benar";
		if (keeper != shooter) {
			skor1 = skor1 + 1;
			poin1[idPoin] = "o";
			System.out.println("           +---------------------||-----------||---------------------+        ");
			System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
		}
		else if (keeper == shooter) {
			poin1[idPoin] = "x";
			System.out.println("           +---------------------||-----------||---------------------+        ");
			System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
		}
	}
	static void keeper2() {

	}
	static void keeper3() {

	}
	static void keeper4() {

	}
	static void keeper5() {

	}
	static void keeper6() {

	}
	static void keeper7() {

	}
	static void keeper8() {

	}
	static void keeper9() {

	}


    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Console console = System.console();

		int menu;
		int statusMenu=0;
		do {
			System.out.println("\n     ___              _                                     _  _    _   ___ ");
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

			// mengecek exception handling
			do {
				System.out.print("\tMasukan pilihan: "); 
			    while (!sc.hasNextInt()) {
			        System.out.print("\tInput salah!!!, Ulangi");
			        sc.next(); // wajib
			    }
			    menu = sc.nextInt();
			} while (menu <= 0 && menu >= 2);

			System.out.println();

			statusMenu = 0;
			switch (menu) {
				case 1:
					String tim1, tim2, statusInput="salah";
					String timList[] = {"                   ","     Arema FC      ","    Bali United    ","  Barito Putera FC ","  Bhayangkara FC   ","   Madura United   ","    Mitra Kukar    ","  Persegres Gresik ","  Persela Lamongan ","Perseru Serui Serui","  Persib Bandung   "," Persiba Balikpapan","Persija Jakarta    "," Persipura Jayapura","       PS TNI      ","    PSM Makassar   ","Pusamania Borneo FC","  Semen Padang FC  ","    Sriwijaya FC   ","    Persebaya FC   "};
					String t1=" ", t2=" ", t3=" ", t4=" ", t5=" ", t6=" ", t7=" ", t8=" ", t9=" ";
					String poin1[] = {""," "," "," "," "," "," "," "," "," "," "," "}, poin2[] = {""," "," "," "," "," "," "," "," "," "," "," "};
					int giliran = 0, tukar = 0, skor1 = 0, skor2 = 0, keeper, shooter, idTim1, idTim2, idPoin=1;
					char [] sembunyi;

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
					System.out.println("\t+----+---------------------+-------------+---------------------+\n");

					do {
						System.out.print("\n[Player 1] <-\n[Player 2]\n--------------------\n Pilih Nomor Tim: "); idTim1 = sc.nextInt();
						if (idTim1>=1 && idTim1<=19) {
							statusInput = "benar";
						}
						else {
							System.out.print("Input salah, Ulangi!: ");
							statusInput = "salah";
						}
					} while (statusInput=="salah");
					do {
						System.out.print("\n[Player 1]\n[Player 2] <-\n--------------------\n Pilih Nomor Tim: "); idTim2 = sc.nextInt();
						if (idTim2>=1 && idTim2<=19) {
							statusInput = "benar";
						}
						else {
							System.out.print("Input salah, Ulangi!");
							statusInput = "salah";
						}
					} while (statusInput=="salah");
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
                                         
					sc.nextLine();
					tim1 = timList[idTim1];
					tim2 = timList[idTim2];
					System.out.println("\n\n");

					statusInput = "salah";
					do {
						sc.nextLine();
						System.out.println("           +---------------------||-----------||---------------------+        ");
						System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
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

						if (tukar == 0) {
							do {
								System.out.println("\n\n[Player 1] <-\n[Player 2]"); 
								sembunyi = console.readPassword("\n   [SHOOTER] >> Masukan titik tendangan: ");
								shooter = Character.getNumericValue(sembunyi[sembunyi.length - 1]);
								switch (shooter) {

									case 1:
										t1 = "*";
										statusInput = "benar";
										break;
									case 2:
										t2 = "*";
										statusInput = "benar";
										break;
									case 3:
										t3 = "*";
										statusInput = "benar";
										break;
									case 4:
										t4 = "*";
										statusInput = "benar";
										break;
									case 5:
										t5 = "*";
										statusInput = "benar";
										break;
									case 6:
										t6 = "*";
										statusInput = "benar";
										break;
									case 7:
										t7 = "*";
										statusInput = "benar";
										break;
									case 8:
										t8 = "*";
										statusInput = "benar";
										break;
									case 9:
										t9 = "*";
										statusInput = "benar";
										break;
									default:
										System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
										statusInput = "salah";
										break;
								}
							} while (statusInput.equals("salah"));


							do {
								System.out.println("\n\n[Player 1] \n[Player 2]<-"); 
								sembunyi = console.readPassword("\n    [KEEPER] >> Masukan titik tangkapan: ");
								keeper = Character.getNumericValue(sembunyi[sembunyi.length - 1]);
								System.out.println("\n\n");

								switch (keeper) {
									case 1:
										getPapanSkor(statusInput, keeper, shooter, skor1, skor2, poin1, idPoin, tim1, tim2);
										getGameplay(t1, t2, t3, t4, t5, t6, t7, t8, t9);
										break;
									case 2:
										getPapanSkor(statusInput, keeper, shooter, skor1, skor2, poin1, idPoin, tim1, tim2);
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                 / \\                                 | |");
										System.out.println("   | |                                / _ \\                                | |");
										System.out.println("   | |                                \\( )/                                | |");
										System.out.println("   | |                                  V                                  | |");
										System.out.println("   | |                                  |                                  | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
										System.out.println("   | |                                 ( )                                 | |");
										System.out.println("   | |                                 | |                                 | |");
										System.out.println("   | |                                 | |                                 | |");
										System.out.println("   | |                                 | |                                 | |");
										System.out.println("   | |     "+t7+"                           /"+t8+"\\                           "+t9+"     | |");
										System.out.println("   | |                                                                     | |");
										break;
									case 3:
										getPapanSkor(statusInput, keeper, shooter, skor1, skor2, poin1, idPoin, tim1, tim2);
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                       _____"+t3+"     | |");
										System.out.println("   | |                                                         /    /      | |");
										System.out.println("   | |                                                        ( )  /       | |");
										System.out.println("   | |                                               __       /___/        | |");
										System.out.println("   | |                                                 \\     /             | |");
										System.out.println("   | |                                                  \\___/              | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                  /         "+t6+"     | |");
										System.out.println("   | |                                               ,____/                | |");
										System.out.println("   | |                                               '                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t7+"                            "+t8+"                            "+t9+"     | |");
										System.out.println("   | |                                                                     | |");
										break;
									case 4:
										getPapanSkor(statusInput, keeper, shooter, skor1, skor2, poin1, idPoin, tim1, tim2);
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |             _                                                       | |");
										System.out.println("   | |            ( )                                                      | |");
										System.out.println("   | |     "+t4+"________+.                  "+t5+"                            "+t6+"     | |");
										System.out.println("   | |              \\\\                                                     | |");
										System.out.println("   | |               \\\\                                                    | |");
										System.out.println("   | |               /\\'                                                   | |");
										System.out.println("   | |              /  \\___,                                               | |");
										System.out.println("   | |     "+t7+"        \\      '            "+t8+"                             "+t9+"    | |");
										System.out.println("   | |              _\\                                                     | |");
										break;
									case 5:
										getPapanSkor(statusInput, keeper, shooter, skor1, skor2, poin1, idPoin, tim1, tim2);
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                  _                                  | |");
										System.out.println("   | |                                 ( )                                 | |");
										System.out.println("   | |     "+t4+"                           ("+t5+")                           "+t6+"     | |");
										System.out.println("   | |                                 /|\\                                 | |");
										System.out.println("   | |                                  |                                  | |");
										System.out.println("   | |                                  A                                  | |");
										System.out.println("   | |                                 / \\                                 | |");
										System.out.println("   | |     "+t7+"                          / "+t8+" \\                          "+t9+"     | |");
										System.out.println("   | |                               /     \\                               | |");
										break;
									case 6:
										getPapanSkor(statusInput, keeper, shooter, skor1, skor2, poin1, idPoin, tim1, tim2);
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                       _             | |");
										System.out.println("   | |                                                      ( )            | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                  .+________"+t6+"     | |");
										System.out.println("   | |                                                     //              | |");
										System.out.println("   | |                                                    //               | |");
										System.out.println("   | |                                                   '/\\               | |");
										System.out.println("   | |                                               ,___/  \\              | |");
										System.out.println("   | |     "+t7+"                            "+t8+"            '      /        "+t9+"     | |");
										System.out.println("   | |                                                     /_              | |");
										break;
									case 7:
										getPapanSkor(statusInput, keeper, shooter, skor1, skor2, poin1, idPoin, tim1, tim2);
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |          \\                                                          | |");
										System.out.println("   | |           \\           /\\                                            | |");
										System.out.println("   | |            \\         /  \\_                                          | |");
										System.out.println("   | |     "+t7+"______(:)+======+______,    "+t8+"                            "+t9+"     | |");
										System.out.println("   | |                                                                     | |");
										break;
									case 8:
										getPapanSkor(statusInput, keeper, shooter, skor1, skor2, poin1, idPoin, tim1, tim2);
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                  _                                  | |");
										System.out.println("   | |                                _( )_                                | |");
										System.out.println("   | |                                \\   /                                | |");
										System.out.println("   | |     "+t7+"                         __("+t8+")__                         "+t9+"     | |");
										System.out.println("   | |                              _\\     /_                              | |");
										break;
									case 9:
										getPapanSkor(statusInput, keeper, shooter, skor1, skor2, poin1, idPoin, tim1, tim2);
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                        /            | |");
										System.out.println("   | |                                            /\\         /             | |");
										System.out.println("   | |                                          _/  \\       /              | |");
										System.out.println("   | |     "+t7+"                            "+t8+"    ,______+======+(:)______"+t9+"     | |");
										System.out.println("   | |                                                                     | |");
										break;
									default:
										System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
										statusInput = "salah";
										break;
								}
							} while (statusInput.equals("salah"));

							if (keeper != shooter) {
								System.out.println("");
								System.out.println("                  _____    ____               _        _   _   _ ");
								System.out.println("                 / ____|  / __ \\      /\\     | |      | | | | | |");
								System.out.println("                | |  __  | |  | |    /  \\    | |      | | | | | |");
								System.out.println("                | | |_ | | |  | |   / /\\ \\   | |      | | | | | |");
								System.out.println("                | |__| | | |__| |  / ____ \\  | |____  |_| |_| |_|");
								System.out.println("                 \\_____|  \\____/  /_/    \\_\\ |______| (_) (_) (_)");  
								System.out.println(""); 
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
								System.out.println("              | " + tim1 + " |  "+poin1[1]+"  |  "+poin1[3]+"  |  "+poin1[5]+"  |  "+poin1[7]+"  |  "+poin1[9]+"  |");
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
								System.out.println("              | " + tim2 + " |  "+poin2[2]+"  |  "+poin2[4]+"  |  "+poin2[6]+"  |  "+poin2[8]+"  |  "+poin2[10]+"  |");
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
							}
							else if (keeper == shooter) {
								System.out.println(""); 
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
								System.out.println("              | " + tim1 + " |  "+poin1[1]+"  |  "+poin1[3]+"  |  "+poin1[5]+"  |  "+poin1[7]+"  |  "+poin1[9]+"  |");
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
								System.out.println("              | " + tim2 + " |  "+poin2[2]+"  |  "+poin2[4]+"  |  "+poin2[6]+"  |  "+poin2[8]+"  |  "+poin2[10]+"  |");
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
							}
							else {
								System.out.println("");
							}
							tukar = 1;
							t1=" "; t2=" "; t3=" "; t4=" "; t5=" "; t6=" "; t7=" "; t8=" "; t9=" ";
							System.out.println("\n                       Tekan [ENTER] untuk melanjutkan"); 
						}



						else if (tukar == 1) {
							do {
								System.out.println("\n\n[Player 1]\n[Player 2] <-"); 
								sembunyi = console.readPassword("\n   [SHOOTER] >> Masukan titik tendangan: ");
								shooter = Character.getNumericValue(sembunyi[sembunyi.length - 1]);
								switch (shooter) {

									case 1:
										t1 = "*";
										statusInput = "benar";
										break;
									case 2:
										t2 = "*";
										statusInput = "benar";
										break;
									case 3:
										t3 = "*";
										statusInput = "benar";
										break;
									case 4:
										t4 = "*";
										statusInput = "benar";
										break;
									case 5:
										t5 = "*";
										statusInput = "benar";
										break;
									case 6:
										t6 = "*";
										statusInput = "benar";
										break;
									case 7:
										t7 = "*";
										statusInput = "benar";
										break;
									case 8:
										t8 = "*";
										statusInput = "benar";
										break;
									case 9:
										t9 = "*";
										statusInput = "benar";
										break;
									default:
										System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
										statusInput = "salah";
										break;
								}
							} while (statusInput.equals("salah"));


							do {
								System.out.println("\n\n[Player 1] <-\n[Player 2]"); 
								sembunyi = console.readPassword("\n    [KEEPER] >> Masukan titik tangkapan: ");
								keeper = Character.getNumericValue(sembunyi[sembunyi.length - 1]);
								System.out.println("\n\n");

								switch (keeper) {
									case 1:
										statusInput = "benar";
										if (keeper != shooter) {
											skor2 = skor2 + 1;
											poin2[idPoin] = "o";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										else if (keeper == shooter) {
											poin2[idPoin] = "x";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"_____                       "+t2+"                            "+t3+"     | |");
										System.out.println("   | |      \\    \\                                                         | |");
										System.out.println("   | |       \\  ( )                                                        | |");
										System.out.println("   | |        \\___\\       __                                               | |");
										System.out.println("   | |             \\     /                                                 | |");
										System.out.println("   | |              \\___/                                                  | |");
										System.out.println("   | |     "+t4+"         \\                  "+t5+"                            "+t6+"     | |");
										System.out.println("   | |                \\____,                                               | |");
										System.out.println("   | |                     '                                               | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t7+"                            "+t8+"                            "+t9+"     | |");
										System.out.println("   | |                                                                     | |");
										break;
									case 2:
										statusInput = "benar";
										if (keeper != shooter) {
											skor2 = skor2 + 1;
											poin2[idPoin] = "o";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										else if (keeper == shooter) {
											poin2[idPoin] = "x";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                 / \\                                 | |");
										System.out.println("   | |                                / _ \\                                | |");
										System.out.println("   | |                                \\( )/                                | |");
										System.out.println("   | |                                  V                                  | |");
										System.out.println("   | |                                  |                                  | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
										System.out.println("   | |                                 ( )                                 | |");
										System.out.println("   | |                                 | |                                 | |");
										System.out.println("   | |                                 | |                                 | |");
										System.out.println("   | |                                 | |                                 | |");
										System.out.println("   | |     "+t7+"                           /"+t8+"\\                           "+t9+"     | |");
										System.out.println("   | |                                                                     | |");
										break;
									case 3:
										statusInput = "benar";
										if (keeper != shooter) {
											skor2 = skor2 + 1;
											poin2[idPoin] = "o";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										else if (keeper == shooter) {
											poin2[idPoin] = "x";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                       _____"+t3+"     | |");
										System.out.println("   | |                                                         /    /      | |");
										System.out.println("   | |                                                        ( )  /       | |");
										System.out.println("   | |                                               __       /___/        | |");
										System.out.println("   | |                                                 \\     /             | |");
										System.out.println("   | |                                                  \\___/              | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                  /         "+t6+"     | |");
										System.out.println("   | |                                               ,____/                | |");
										System.out.println("   | |                                               '                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t7+"                            "+t8+"                            "+t9+"     | |");
										System.out.println("   | |                                                                     | |");
										break;
									case 4:
										statusInput = "benar";
										if (keeper != shooter) {
											skor2 = skor2 + 1;
											poin2[idPoin] = "o";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										else if (keeper == shooter) {
											poin2[idPoin] = "x";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |             _                                                       | |");
										System.out.println("   | |            ( )                                                      | |");
										System.out.println("   | |     "+t4+"________+.                  "+t5+"                            "+t6+"     | |");
										System.out.println("   | |              \\\\                                                     | |");
										System.out.println("   | |               \\\\                                                    | |");
										System.out.println("   | |               /\\'                                                   | |");
										System.out.println("   | |              /  \\___,                                               | |");
										System.out.println("   | |     "+t7+"        \\      '            "+t8+"                             "+t9+"    | |");
										System.out.println("   | |              _\\                                                     | |");
										break;
									case 5:
										statusInput = "benar";
										if (keeper != shooter) {
											skor2 = skor2 + 1;
											poin2[idPoin] = "o";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										else if (keeper == shooter) {
											poin2[idPoin] = "x";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                  _                                  | |");
										System.out.println("   | |                                 ( )                                 | |");
										System.out.println("   | |     "+t4+"                           ("+t5+")                           "+t6+"     | |");
										System.out.println("   | |                                 /|\\                                 | |");
										System.out.println("   | |                                  |                                  | |");
										System.out.println("   | |                                  A                                  | |");
										System.out.println("   | |                                 / \\                                 | |");
										System.out.println("   | |     "+t7+"                          / "+t8+" \\                          "+t9+"     | |");
										System.out.println("   | |                               /     \\                               | |");
										break;
									case 6:
										statusInput = "benar";
										if (keeper != shooter) {
											skor2 = skor2 + 1;
											poin2[idPoin] = "o";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										else if (keeper == shooter) {
											poin2[idPoin] = "x";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                       _             | |");
										System.out.println("   | |                                                      ( )            | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                  .+________"+t6+"     | |");
										System.out.println("   | |                                                     //              | |");
										System.out.println("   | |                                                    //               | |");
										System.out.println("   | |                                                   '/\\               | |");
										System.out.println("   | |                                               ,___/  \\              | |");
										System.out.println("   | |     "+t7+"                            "+t8+"            '      /        "+t9+"     | |");
										System.out.println("   | |                                                     /_              | |");
										break;
									case 7:
										statusInput = "benar";
										if (keeper != shooter) {
											skor2 = skor2 + 1;
											poin2[idPoin] = "o";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										else if (keeper == shooter) {
											poin2[idPoin] = "x";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |          \\                                                          | |");
										System.out.println("   | |           \\           /\\                                            | |");
										System.out.println("   | |            \\         /  \\_                                          | |");
										System.out.println("   | |     "+t7+"______(:)+======+______,    "+t8+"                            "+t9+"     | |");
										System.out.println("   | |                                                                     | |");
										break;
									case 8:
										statusInput = "benar";
										if (keeper != shooter) {
											skor2 = skor2 + 1;
											poin2[idPoin] = "o";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										else if (keeper == shooter) {
											poin2[idPoin] = "x";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                  _                                  | |");
										System.out.println("   | |                                _( )_                                | |");
										System.out.println("   | |                                \\   /                                | |");
										System.out.println("   | |     "+t7+"                         __("+t8+")__                         "+t9+"     | |");
										System.out.println("   | |                              _\\     /_                              | |");
										break;
									case 9:
										statusInput = "benar";
										if (keeper != shooter) {
											skor2 = skor2 + 1;
											poin2[idPoin] = "o";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										else if (keeper == shooter) {
											poin2[idPoin] = "x";
											System.out.println("           +---------------------||-----------||---------------------+        ");
											System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
										}
										System.out.println("    _______|_____________________||___________||_____________________|_______ ");
										System.out.println("   |  _____________________________________________________________________  |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
										System.out.println("   | |                                                                     | |");
										System.out.println("   | |                                                        /            | |");
										System.out.println("   | |                                            /\\         /             | |");
										System.out.println("   | |                                          _/  \\       /              | |");
										System.out.println("   | |     "+t7+"                            "+t8+"    ,______+======+(:)______"+t9+"     | |");
										System.out.println("   | |                                                                     | |");
										break;
									default:
										System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
										statusInput = "salah";
										break;
								}
							} while (statusInput.equals("salah"));

							if (keeper != shooter) {
								System.out.println("");
								System.out.println("                  _____    ____               _        _   _   _ ");
								System.out.println("                 / ____|  / __ \\      /\\     | |      | | | | | |");
								System.out.println("                | |  __  | |  | |    /  \\    | |      | | | | | |");
								System.out.println("                | | |_ | | |  | |   / /\\ \\   | |      | | | | | |");
								System.out.println("                | |__| | | |__| |  / ____ \\  | |____  |_| |_| |_|");
								System.out.println("                 \\_____|  \\____/  /_/    \\_\\ |______| (_) (_) (_)");  
								System.out.println(""); 
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
								System.out.println("              | " + tim1 + " |  "+poin1[1]+"  |  "+poin1[3]+"  |  "+poin1[5]+"  |  "+poin1[7]+"  |  "+poin1[9]+"  |");
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
								System.out.println("              | " + tim2 + " |  "+poin2[2]+"  |  "+poin2[4]+"  |  "+poin2[6]+"  |  "+poin2[8]+"  |  "+poin2[10]+"  |");
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
							}
							else if (keeper == shooter) {
								System.out.println(""); 
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
								System.out.println("              | " + tim1 + " |  "+poin1[1]+"  |  "+poin1[3]+"  |  "+poin1[5]+"  |  "+poin1[7]+"  |  "+poin1[9]+"  |");
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
								System.out.println("              | " + tim2 + " |  "+poin2[2]+"  |  "+poin2[4]+"  |  "+poin2[6]+"  |  "+poin2[8]+"  |  "+poin2[10]+"  |");
								System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
							}
							else {
								System.out.println("");
							}
							tukar = 0;
							t1=" "; t2=" "; t3=" "; t4=" "; t5=" "; t6=" "; t7=" "; t8=" "; t9=" ";
							System.out.println("\n                       Tekan [ENTER] untuk melanjutkan"); 
						}
						





						giliran = giliran + 1;
						idPoin = idPoin+1;

						if (giliran==8 && (skor1-skor2)>=2) {
							break;
						}
						else if (giliran==8 && (skor2-skor1)>=2) {
							break;
						}
					} while (giliran<10);

					if (skor1 > skor2) {
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
						System.out.println("                              "+tim1);

					}
					else if (skor1 < skor2) {
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
						System.out.println("                              "+tim2);
					}
					else {
						idPoin = 1;
						System.out.println(idPoin);
						poin1[1] = " ";
						poin1[2] = " ";
						poin1[3] = " ";
						poin1[4] = " ";
						poin1[5] = " ";
						poin1[6] = " ";
						poin1[7] = " ";
						poin1[8] = " ";
						poin1[9] = " ";
						poin1[10] = " ";
						poin1[11] = " ";


						poin2[1] = " ";
						poin2[2] = " ";
						poin2[3] = " ";
						poin2[4] = " ";
						poin2[5] = " ";
						poin2[6] = " ";
						poin2[7] = " ";
						poin2[8] = " ";
						poin2[9] = " ";
						poin2[10] = " ";
						poin2[11] = " ";



							int sd = 0;
						do {
							System.out.println("\t ____          _             _       HASIL SERI");
							System.out.println("\t|  _ \\        | |           | |           SKOR:            ");
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

							tukar = 1;
							giliran = 0;



							do {
								sc.nextLine();
								System.out.println("           +---------------------||-----------||---------------------+        ");
								System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
								System.out.println("    _________________________________________________________________________ ");
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


								if (tukar == 0) {
									do {
										System.out.println("\n\n[Player 1] <-\n[Player 2]"); 
										sembunyi = console.readPassword("\n   [SHOOTER] >> Masukan titik tendangan: ");
										shooter = Character.getNumericValue(sembunyi[sembunyi.length - 1]);
										switch (shooter) {

											case 1:
												t1 = "*";
												statusInput = "benar";
												break;
											case 2:
												t2 = "*";
												statusInput = "benar";
												break;
											case 3:
												t3 = "*";
												statusInput = "benar";
												break;
											case 4:
												t4 = "*";
												statusInput = "benar";
												break;
											case 5:
												t5 = "*";
												statusInput = "benar";
												break;
											case 6:
												t6 = "*";
												statusInput = "benar";
												break;
											case 7:
												t7 = "*";
												statusInput = "benar";
												break;
											case 8:
												t8 = "*";
												statusInput = "benar";
												break;
											case 9:
												t9 = "*";
												statusInput = "benar";
												break;
											default:
												System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
												statusInput = "salah";
												break;
										}
									} while (statusInput.equals("salah"));


									do {
										System.out.println("\n\n[Player 1] \n[Player 2]<-"); 
										sembunyi = console.readPassword("\n    [KEEPER] >> Masukan titik tangkapan: ");
										keeper = Character.getNumericValue(sembunyi[sembunyi.length - 1]);
										System.out.println("\n\n");

										switch (keeper) {
											case 1:
												statusInput = "benar";
												if (keeper != shooter) {
													skor1 = skor1 + 1;
													poin1[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin1[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"_____                       "+t2+"                            "+t3+"     | |");
												System.out.println("   | |      \\    \\                                                         | |");
												System.out.println("   | |       \\  ( )                                                        | |");
												System.out.println("   | |        \\___\\       __                                               | |");
												System.out.println("   | |             \\     /                                                 | |");
												System.out.println("   | |              \\___/                                                  | |");
												System.out.println("   | |     "+t4+"         \\                  "+t5+"                            "+t6+"     | |");
												System.out.println("   | |                \\____,                                               | |");
												System.out.println("   | |                     '                                               | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t7+"                            "+t8+"                            "+t9+"     | |");
												System.out.println("   | |                                                                     | |");
												break;
											case 2:
												statusInput = "benar";
												if (keeper != shooter) {
													skor1 = skor1 + 1;
													poin1[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin1[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                 / \\                                 | |");
												System.out.println("   | |                                / _ \\                                | |");
												System.out.println("   | |                                \\( )/                                | |");
												System.out.println("   | |                                  V                                  | |");
												System.out.println("   | |                                  |                                  | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
												System.out.println("   | |                                 ( )                                 | |");
												System.out.println("   | |                                 | |                                 | |");
												System.out.println("   | |                                 | |                                 | |");
												System.out.println("   | |                                 | |                                 | |");
												System.out.println("   | |     "+t7+"                           /"+t8+"\\                           "+t9+"     | |");
												System.out.println("   | |                                                                     | |");
												break;
											case 3:
												statusInput = "benar";
												if (keeper != shooter) {
													skor1 = skor1 + 1;
													poin1[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin1[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                       _____"+t3+"     | |");
												System.out.println("   | |                                                         /    /      | |");
												System.out.println("   | |                                                        ( )  /       | |");
												System.out.println("   | |                                               __       /___/        | |");
												System.out.println("   | |                                                 \\     /             | |");
												System.out.println("   | |                                                  \\___/              | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                  /         "+t6+"     | |");
												System.out.println("   | |                                               ,____/                | |");
												System.out.println("   | |                                               '                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t7+"                            "+t8+"                            "+t9+"     | |");
												System.out.println("   | |                                                                     | |");
												break;
											case 4:
												statusInput = "benar";
												if (keeper != shooter) {
													skor1 = skor1 + 1;
													poin1[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin1[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |             _                                                       | |");
												System.out.println("   | |            ( )                                                      | |");
												System.out.println("   | |     "+t4+"________+.                  "+t5+"                            "+t6+"     | |");
												System.out.println("   | |              \\\\                                                     | |");
												System.out.println("   | |               \\\\                                                    | |");
												System.out.println("   | |               /\\'                                                   | |");
												System.out.println("   | |              /  \\___,                                               | |");
												System.out.println("   | |     "+t7+"        \\      '            "+t8+"                             "+t9+"    | |");
												System.out.println("   | |              _\\                                                     | |");
												break;
											case 5:
												statusInput = "benar";
												if (keeper != shooter) {
													skor1 = skor1 + 1;
													poin1[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin1[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                  _                                  | |");
												System.out.println("   | |                                 ( )                                 | |");
												System.out.println("   | |     "+t4+"                           ("+t5+")                           "+t6+"     | |");
												System.out.println("   | |                                 /|\\                                 | |");
												System.out.println("   | |                                  |                                  | |");
												System.out.println("   | |                                  A                                  | |");
												System.out.println("   | |                                 / \\                                 | |");
												System.out.println("   | |     "+t7+"                          / "+t8+" \\                          "+t9+"     | |");
												System.out.println("   | |                               /     \\                               | |");
												break;
											case 6:
												statusInput = "benar";
												if (keeper != shooter) {
													skor1 = skor1 + 1;
													poin1[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin1[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                       _             | |");
												System.out.println("   | |                                                      ( )            | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                  .+________"+t6+"     | |");
												System.out.println("   | |                                                     //              | |");
												System.out.println("   | |                                                    //               | |");
												System.out.println("   | |                                                   '/\\               | |");
												System.out.println("   | |                                               ,___/  \\              | |");
												System.out.println("   | |     "+t7+"                            "+t8+"            '      /        "+t9+"     | |");
												System.out.println("   | |                                                     /_              | |");
												break;
											case 7:
												statusInput = "benar";
												if (keeper != shooter) {
													skor1 = skor1 + 1;
													poin1[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin1[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |          \\                                                          | |");
												System.out.println("   | |           \\           /\\                                            | |");
												System.out.println("   | |            \\         /  \\_                                          | |");
												System.out.println("   | |     "+t7+"______(:)+======+______,    "+t8+"                            "+t9+"     | |");
												System.out.println("   | |                                                                     | |");
												break;
											case 8:
												statusInput = "benar";
												if (keeper != shooter) {
													skor1 = skor1 + 1;
													poin1[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin1[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                  _                                  | |");
												System.out.println("   | |                                _( )_                                | |");
												System.out.println("   | |                                \\   /                                | |");
												System.out.println("   | |     "+t7+"                         __("+t8+")__                         "+t9+"     | |");
												System.out.println("   | |                              _\\     /_                              | |");
												break;
											case 9:
												statusInput = "benar";
												if (keeper != shooter) {
													skor1 = skor1 + 1;
													poin1[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin1[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                        /            | |");
												System.out.println("   | |                                            /\\         /             | |");
												System.out.println("   | |                                          _/  \\       /              | |");
												System.out.println("   | |     "+t7+"                            "+t8+"    ,______+======+(:)______"+t9+"     | |");
												System.out.println("   | |                                                                     | |");
												break;
											default:
												System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
												statusInput = "salah";
												break;
										}
									} while (statusInput.equals("salah"));

									if (keeper != shooter) {
										System.out.println("");
										System.out.println("                  _____    ____               _        _   _   _ ");
										System.out.println("                 / ____|  / __ \\      /\\     | |      | | | | | |");
										System.out.println("                | |  __  | |  | |    /  \\    | |      | | | | | |");
										System.out.println("                | | |_ | | |  | |   / /\\ \\   | |      | | | | | |");
										System.out.println("                | |__| | | |__| |  / ____ \\  | |____  |_| |_| |_|");
										System.out.println("                 \\_____|  \\____/  /_/    \\_\\ |______| (_) (_) (_)");  
										System.out.println(""); 
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
										System.out.println("              | " + tim1 + " |  "+poin1[2]+"  |  "+poin1[4]+"  |  "+poin1[6]+"  |  "+poin1[8]+"  |  "+poin1[10]+"  |");
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
										System.out.println("              | " + tim2 + " |  "+poin2[1]+"  |  "+poin2[3]+"  |  "+poin2[5]+"  |  "+poin2[7]+"  |  "+poin2[9]+"  |");
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
									}
									else if (keeper == shooter) {
										System.out.println(""); 
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
										System.out.println("              | " + tim1 + " |  "+poin1[2]+"  |  "+poin1[4]+"  |  "+poin1[6]+"  |  "+poin1[8]+"  |  "+poin1[10]+"  |");
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
										System.out.println("              | " + tim2 + " |  "+poin2[1]+"  |  "+poin2[3]+"  |  "+poin2[5]+"  |  "+poin2[7]+"  |  "+poin2[9]+"  |");
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
									}
									else {
										System.out.println("");
									}
									tukar = 1;
									t1=" "; t2=" "; t3=" "; t4=" "; t5=" "; t6=" "; t7=" "; t8=" "; t9=" ";
									System.out.println("\n                       Tekan [ENTER] untuk melanjutkan"); 
									System.out.println(idPoin);
								}



								else if (tukar == 1) {
									do {
										System.out.println("\n\n[Player 1]\n[Player 2] <-"); 
										sembunyi = console.readPassword("\n   [SHOOTER] >> Masukan titik tendangan: ");
										shooter = Character.getNumericValue(sembunyi[sembunyi.length - 1]);
										switch (shooter) {

											case 1:
												t1 = "*";
												statusInput = "benar";
												break;
											case 2:
												t2 = "*";
												statusInput = "benar";
												break;
											case 3:
												t3 = "*";
												statusInput = "benar";
												break;
											case 4:
												t4 = "*";
												statusInput = "benar";
												break;
											case 5:
												t5 = "*";
												statusInput = "benar";
												break;
											case 6:
												t6 = "*";
												statusInput = "benar";
												break;
											case 7:
												t7 = "*";
												statusInput = "benar";
												break;
											case 8:
												t8 = "*";
												statusInput = "benar";
												break;
											case 9:
												t9 = "*";
												statusInput = "benar";
												break;
											default:
												System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
												statusInput = "salah";
												break;
										}
									} while (statusInput.equals("salah"));


									do {
										System.out.println("\n\n[Player 1] <-\n[Player 2]"); 
										sembunyi = console.readPassword("\n    [KEEPER] >> Masukan titik tangkapan: ");
										keeper = Character.getNumericValue(sembunyi[sembunyi.length - 1]);
										System.out.println("\n\n");

										switch (keeper) {
											case 1:
												statusInput = "benar";
												if (keeper != shooter) {
													skor2 = skor2 + 1;
													poin2[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin2[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"_____                       "+t2+"                            "+t3+"     | |");
												System.out.println("   | |      \\    \\                                                         | |");
												System.out.println("   | |       \\  ( )                                                        | |");
												System.out.println("   | |        \\___\\       __                                               | |");
												System.out.println("   | |             \\     /                                                 | |");
												System.out.println("   | |              \\___/                                                  | |");
												System.out.println("   | |     "+t4+"         \\                  "+t5+"                            "+t6+"     | |");
												System.out.println("   | |                \\____,                                               | |");
												System.out.println("   | |                     '                                               | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t7+"                            "+t8+"                            "+t9+"     | |");
												System.out.println("   | |                                                                     | |");
												break;
											case 2:
												statusInput = "benar";
												if (keeper != shooter) {
													skor2 = skor2 + 1;
													poin2[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin2[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                 / \\                                 | |");
												System.out.println("   | |                                / _ \\                                | |");
												System.out.println("   | |                                \\( )/                                | |");
												System.out.println("   | |                                  V                                  | |");
												System.out.println("   | |                                  |                                  | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
												System.out.println("   | |                                 ( )                                 | |");
												System.out.println("   | |                                 | |                                 | |");
												System.out.println("   | |                                 | |                                 | |");
												System.out.println("   | |                                 | |                                 | |");
												System.out.println("   | |     "+t7+"                           /"+t8+"\\                           "+t9+"     | |");
												System.out.println("   | |                                                                     | |");
												break;
											case 3:
												statusInput = "benar";
												if (keeper != shooter) {
													skor2 = skor2 + 1;
													poin2[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin2[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                       _____"+t3+"     | |");
												System.out.println("   | |                                                         /    /      | |");
												System.out.println("   | |                                                        ( )  /       | |");
												System.out.println("   | |                                               __       /___/        | |");
												System.out.println("   | |                                                 \\     /             | |");
												System.out.println("   | |                                                  \\___/              | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                  /         "+t6+"     | |");
												System.out.println("   | |                                               ,____/                | |");
												System.out.println("   | |                                               '                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t7+"                            "+t8+"                            "+t9+"     | |");
												System.out.println("   | |                                                                     | |");
												break;
											case 4:
												statusInput = "benar";
												if (keeper != shooter) {
													skor2 = skor2 + 1;
													poin2[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin2[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |             _                                                       | |");
												System.out.println("   | |            ( )                                                      | |");
												System.out.println("   | |     "+t4+"________+.                  "+t5+"                            "+t6+"     | |");
												System.out.println("   | |              \\\\                                                     | |");
												System.out.println("   | |               \\\\                                                    | |");
												System.out.println("   | |               /\\'                                                   | |");
												System.out.println("   | |              /  \\___,                                               | |");
												System.out.println("   | |     "+t7+"        \\      '            "+t8+"                             "+t9+"    | |");
												System.out.println("   | |              _\\                                                     | |");
												break;
											case 5:
												statusInput = "benar";
												if (keeper != shooter) {
													skor2 = skor2 + 1;
													poin2[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin2[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                  _                                  | |");
												System.out.println("   | |                                 ( )                                 | |");
												System.out.println("   | |     "+t4+"                           ("+t5+")                           "+t6+"     | |");
												System.out.println("   | |                                 /|\\                                 | |");
												System.out.println("   | |                                  |                                  | |");
												System.out.println("   | |                                  A                                  | |");
												System.out.println("   | |                                 / \\                                 | |");
												System.out.println("   | |     "+t7+"                          / "+t8+" \\                          "+t9+"     | |");
												System.out.println("   | |                               /     \\                               | |");
												break;
											case 6:
												statusInput = "benar";
												if (keeper != shooter) {
													skor2 = skor2 + 1;
													poin2[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin2[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                       _             | |");
												System.out.println("   | |                                                      ( )            | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                  .+________"+t6+"     | |");
												System.out.println("   | |                                                     //              | |");
												System.out.println("   | |                                                    //               | |");
												System.out.println("   | |                                                   '/\\               | |");
												System.out.println("   | |                                               ,___/  \\              | |");
												System.out.println("   | |     "+t7+"                            "+t8+"            '      /        "+t9+"     | |");
												System.out.println("   | |                                                     /_              | |");
												break;
											case 7:
												statusInput = "benar";
												if (keeper != shooter) {
													skor2 = skor2 + 1;
													poin2[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin2[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |          \\                                                          | |");
												System.out.println("   | |           \\           /\\                                            | |");
												System.out.println("   | |            \\         /  \\_                                          | |");
												System.out.println("   | |     "+t7+"______(:)+======+______,    "+t8+"                            "+t9+"     | |");
												System.out.println("   | |                                                                     | |");
												break;
											case 8:
												statusInput = "benar";
												if (keeper != shooter) {
													skor2 = skor2 + 1;
													poin2[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin2[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                  _                                  | |");
												System.out.println("   | |                                _( )_                                | |");
												System.out.println("   | |                                \\   /                                | |");
												System.out.println("   | |     "+t7+"                         __("+t8+")__                         "+t9+"     | |");
												System.out.println("   | |                              _\\     /_                              | |");
												break;
											case 9:
												statusInput = "benar";
												if (keeper != shooter) {
													skor2 = skor2 + 1;
													poin2[idPoin] = "o";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												else if (keeper == shooter) {
													poin2[idPoin] = "x";
													System.out.println("           +---------------------||-----------||---------------------+        ");
													System.out.println("           | " + tim1 + " || [" + skor1 + "] - [" + skor2 + "] || " + tim2 + " |");
												}
												System.out.println("    _______|_____________________||___________||_____________________|_______ ");
												System.out.println("   |  _____________________________________________________________________  |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");
												System.out.println("   | |                                                                     | |");
												System.out.println("   | |                                                        /            | |");
												System.out.println("   | |                                            /\\         /             | |");
												System.out.println("   | |                                          _/  \\       /              | |");
												System.out.println("   | |     "+t7+"                            "+t8+"    ,______+======+(:)______"+t9+"     | |");
												System.out.println("   | |                                                                     | |");
												break;
											default:
												System.out.println("----------------\nULANGI!!!\nINPUT SALAH!!!");
												statusInput = "salah";
												break;
										}
									} while (statusInput.equals("salah"));

									if (keeper != shooter) {
										System.out.println("");
										System.out.println("                  _____    ____               _        _   _   _ ");
										System.out.println("                 / ____|  / __ \\      /\\     | |      | | | | | |");
										System.out.println("                | |  __  | |  | |    /  \\    | |      | | | | | |");
										System.out.println("                | | |_ | | |  | |   / /\\ \\   | |      | | | | | |");
										System.out.println("                | |__| | | |__| |  / ____ \\  | |____  |_| |_| |_|");
										System.out.println("                 \\_____|  \\____/  /_/    \\_\\ |______| (_) (_) (_)");  
										System.out.println(""); 
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
										System.out.println("              | " + tim1 + " |  "+poin1[2]+"  |  "+poin1[4]+"  |  "+poin1[6]+"  |  "+poin1[8]+"  |  "+poin1[10]+"  |");
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
										System.out.println("              | " + tim2 + " |  "+poin2[1]+"  |  "+poin2[3]+"  |  "+poin2[5]+"  |  "+poin2[7]+"  |  "+poin2[9]+"  |");
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
										System.out.println(""); 
										System.out.println("                               +-------+-------+");
										System.out.println("                               |       |       |");
										System.out.println("                               |   " + skor1 + "   |   " + skor2 + "   |");
										System.out.println("                               |       |       |");
										System.out.println("                               +-------+-------+"); 
									}
									else if (keeper == shooter) {
										System.out.println(""); 
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
										System.out.println("              | " + tim1 + " |  "+poin1[2]+"  |  "+poin1[4]+"  |  "+poin1[6]+"  |  "+poin1[8]+"  |  "+poin1[10]+"  |");
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
										System.out.println("              | " + tim2 + " |  "+poin2[1]+"  |  "+poin2[3]+"  |  "+poin2[5]+"  |  "+poin2[7]+"  |  "+poin2[9]+"  |");
										System.out.println("              +---------------------+-----+-----+-----+-----+-----+");
									}
									else {
										System.out.println("");
									}
									tukar = 0;
									t1=" "; t2=" "; t3=" "; t4=" "; t5=" "; t6=" "; t7=" "; t8=" "; t9=" ";
									System.out.println("\n                       Tekan [ENTER] untuk melanjutkan"); 
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
						if (skor1>skor2) {
						System.out.println("                              "+tim1);
						}
						else if (skor1<skor2) {
						System.out.println("                              "+tim2);
						}




					}
				break;
				case 2:
					System.out.println("+---------+");
					System.out.println("| BANTUAN |");
					System.out.println("+---------+\n");
					System.out.println("Minimum eksekutor penendang adalah lima orang ");
					System.out.println("dan untuk poin minimum adalah lima, ");
					System.out.println("tetapi bisa kurang dan bisa lebih ");
					System.out.println("tergantung pada skor. ");
					System.out.println("");
					System.out.println("Sebagai contoh jika sampai penendang ke empat ");
					System.out.println("terdapat selisih dua angka terhadap tim lawan, ");
					System.out.println("maka tim dengan skor paling tinggi ");
					System.out.println("akan otomatis akan memenangkan pertandingan. ");
					System.out.println("Apabila sampai pendendang ke lima tetap pada ");
					System.out.println("posisi imbang maka akan dilakukan 'sudden death' ");
					System.out.println("yang berarti setiap tim yang gagal ");
					System.out.println("sedangkan tim lain berhasil memasukkan ");
					System.out.println("maka bisa diambil pemenangnnya.\n");
					statusMenu = 1;
					System.out.print("Tekan [ENTER]");
					sc.nextLine();
				break;
				case 0:
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



















			// System.out.println("    _______|_____________________||___________||_____________________|_______ ");
			// System.out.println("   |  _____________________________________________________________________  |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |"); // System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                  _                                  | |");
			// System.out.println("   | |                                 ( )                                 | |");
			// System.out.println("   | |                         o--------|--------o                         | |"); // System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");			System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                  |                                  | |");
			// System.out.println("   | |                                  |                                  | |");
			// System.out.println("   | |                                  A                                  | |");
			// System.out.println("   | |                                 / \\                                 | |");
			// System.out.println("   | |                                /   \\                                | |"); // System.out.println("   | |     "+t7+"                            "+t8+"                            "+t9+"     | |");			System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                               /     \\                               | |");


			// System.out.println("    _______|_____________________||___________||_____________________|_______ ");
			// System.out.println("   |  _____________________________________________________________________  |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |     "+t1+"                            "+t2+"                            "+t3+"     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |     "+t4+"                            "+t5+"                            "+t6+"     | |");			System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");
			// System.out.println("   | |     "+t7+"                            "+t8+"                            "+t9+"     | |");			System.out.println("   | |                                                                     | |");
			// System.out.println("   | |                                                                     | |");





// System.out.println("Minimum eksekutor penendang adalah lima orang ");
// System.out.println("dan untuk poin minimum adalah lima, ");
// System.out.println("tetapi bisa kurang dan bisa lebih ");
// System.out.println("tergantung pada skor. ");
// System.out.println("");
// System.out.println("Sebagai contoh jika sampai penendang ke empat ");
// System.out.println("terdapat selisih dua angka terhadap tim lawan, ");
// System.out.println("maka tim dengan skor paling tinggi ");
// System.out.println("akan otomatis akan memenangkan pertandingan. ");
// System.out.println("Apabila sampai pendendang ke lima tetap pada ");
// System.out.println("posisi imbang maka akan dilakukan 'sudden death' ");
// System.out.println("yang berarti setiap tim yang gagal ");
// System.out.println("sedangkan tim lain berhasil memasukkan ");
// System.out.println("maka bisa diambil pemenangnnya.");