import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class KBC {
	static int count=0;

	public static void main(String[] args) throws IOException {
		System.out.println("**********\tWELCOME TO KBC\t\t**********");
		System.out.println("**********\tYOU HAVE 10 LEVELS\t**********");
		System.out.println("\t\tWrong Answer Will Exit the Game");
		System.out.println("\t\tYou will be provided 5 CHANCES only");
		System.out.println("\t\tPlay Game Wisely");
		System.out.println("**********\tALL THE BEST\t\t**********\n");
		level1();
	}
		
		public static void level1() throws IOException
		{
			
			System.out.println("\nYOU HAVE ENTERED IN LEVEL 1!");
			System.out.println("This is Basic Computer level");
			Random rand = new Random();
			String ans;
			int count=0;
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			switch(rand.nextInt(10))
			{
				case 0:	System.out.println("\n1)The most widely used computer device is.");
						System.out.println("\nA.) Solid state disks\t\tB.) External hard disk");
						System.out.println("\nC.) Internal hard disk\t\tD.) Mouse ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level2();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							level1();
						}
						break;
				case 1: System.out.println("\n1)_______ are software which is used to do particular task.");
						System.out.println("\nA.) Operating system\t\tB.) Program");
						System.out.println("\nC.) Data\t\tD.) Software ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level2();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level1();
						}
						break;
				case 2: System.out.println("\n1)Who is father of modern computers?");
						System.out.println("\nA.) Abraham Lincoln\t\tB.) James Gosling");
						System.out.println("\nC.) Charles Babbage\t\tD.) Gordon E. Moore ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level2();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level1();
						}
						break;
				case 3: System.out.println("\n1)How many generations of computers we have?");
						System.out.println("\nA.) 6\t\tB.) 7");
						System.out.println("\nC.) 5\t\tD.) 4 ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level2();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level1();
						}
						break;
				case 4: System.out.println("\n1)VLSI technology is used in __________ generation computers.");
						System.out.println("\nA.) First\t\tB.) Second");
						System.out.println("\nC.) Third\t\tD.) Fourth ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("d"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level2();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level1();
						}
						break;
				case 5: System.out.println("\n1)What computers are used for fastest type of computer that can perform complex operations at very high speed?");
						System.out.println("\nA.) Micro\t\tB.) Mini");
						System.out.println("\nC.) Mainframe\t\tD.) Super ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("d"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level2();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level1();
						}
						break;
				case 6: System.out.println("\n1)One of the Input device in computer are");
						System.out.println("\nA.) Keyboard\t\tB.) Os");
						System.out.println("\nC.) Pen drive\t\tD.) Cable ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("a"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level2();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level1();
						}
						break;
				case 7: System.out.println("\n1)The main working memory used by the computer are");
						System.out.println("\nA.) RAM\t\tB.) ROM");
						System.out.println("\nC.) DVD\t\tD.) CD ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("a"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level2();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level1();
						}
						break;
				case 8: System.out.println("\n1)A special type of memory chip that holds software that can be read but not written to");
						System.out.println("\nA.) RAM\t\tB.) Mother Board");
						System.out.println("\nC.) ROM\t\tD.) CPU ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level2();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level1();
						}
						break;
				case 9: System.out.println("A byte consist of how many bits.");
						System.out.println("\nA.) 8\t\tB.) 9");
						System.out.println("\nC.) 10\t\tD.) 16 ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("a"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level2();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level1();
						}
						break;
			}
		}
		public static void level2() throws IOException
		{
			System.out.println("\nYOU HAVE ENTERED IN LEVEL 2!");
			System.out.println("This is Basic Computer level");
			Random rand = new Random();
			String ans;
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			switch(rand.nextInt(10))
			{
				case 0:	System.out.println("\n2)Special type of program that loads automatically when you start your computer.");
						System.out.println("\nA.) MS-office\t\tB.) Internet");
						System.out.println("\nC.) OS\t\tD.) None of these ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level3();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level2();
						}
						break;
				case 1: System.out.println("\n2)Ram is considered which memory");
						System.out.println("\nA.) Secondary\t\tB.) Territory");
						System.out.println("\nC.) Primary\t\tD.) None of these ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level3();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level2();
						}
						break;
				case 2: System.out.println("\n2)Rom can only perform _______ operations");
						System.out.println("\nA.) Read\t\tB.) Write");
						System.out.println("\nC.) Access\t\tD.) Delete ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("a"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level3();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level2();
						}
						break;
				case 3: System.out.println("\n2)MS-DOS is a ___________ type of operating system.");
						System.out.println("\nA.) Text based\t\tB.) Windows based");
						System.out.println("\nC.) Program based\t\tD.) None of these ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("a"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level3();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level2();
						}
						break;
				case 4: System.out.println("\n2)	________ is the first widely installed operating system used in the personal computers");
						System.out.println("\nA.) Windows\t\tB.) Windows 7");
						System.out.println("\nC.) Pc-Dos\t\tD.) Ms-Dos ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level3();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level2();
						}
						break;
				case 5: System.out.println("\n2)Which of the following devices have a limitation that we can only store information to it but cannot erase or modify it?");
						System.out.println("\nA.) Floppy Disk\t\tB.) Hard Disk");
						System.out.println("\nC.) Tape Drive\t\tD.) CDROM");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("d"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level3();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level2();
						}
						break;
				case 6: System.out.println("\n2)Which is the type of memory for information that does not change on your computer?");
						System.out.println("\nA.) RAM\t\tB.) ROM");
						System.out.println("\nC.) ERAM\t\tD.) RW / RAM ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level3();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level2();
						}
						break;
				case 7: System.out.println("\n2)Which device is required for the Internet connection?");
						System.out.println("\nA.) Joystick\t\tB.) Modem");
						System.out.println("\nC.) CD Drive\t\tD.) NIC Card ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level3();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level2();
						}
						break;
				case 8: System.out.println("\n2)Which statement is valid?");
						System.out.println("\nA.) 1KB = 1024 bytes\t\tB.) 1 MB=2048 bytes");
						System.out.println("\nC.) 1 MB = 1000 kilobytes\t\tD.) 1 KB = 1000 bytes ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("a"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level3();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level2();
						}
						break;
				case 9: System.out.println("Which is an item of storage medium in the form of circular plate?");
						System.out.println("\nA.) Disk\t\tB.) CPU");
						System.out.println("\nC.) Printer\t\tD.) ALU ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("a"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level3();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level2();
						}
						break;
			}
		}
		public static void level3() throws IOException
		{
			System.out.println("\nYOU HAVE ENTERED IN LEVEL 3!");
			System.out.println("This is Basic Computer level with tricky question");
			Random rand = new Random();
			String ans;
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			switch(rand.nextInt(10))
			{
				case 0:	System.out.println("\n3)Each model of a computer has a unique");
						System.out.println("\nA.) Assembly of a computer\t\tB.) Machine language");
						System.out.println("\nC.) High level language\t\tD.) All of the above ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level4();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level3();
						}
						break;
				case 1: System.out.println("\n3)In what respect computers are superior to human beings?");
						System.out.println("\nA.) Diligence\t\tB.) Intelligence");
						System.out.println("\nC.) Both of above\t\tD.) None of above ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("a"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level4();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level3();
						}
						break;
				case 2: System.out.println("\n3)Which of the following is called low level languages?");
						System.out.println("\nA.) Machine language\t\tB.) Assembly language");
						System.out.println("\nC.) Both of the above\t\tD.) Delete ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level4();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level3();
						}
						break;
				case 3: System.out.println("\n3)A number system that has eight different symbols to represent any quantity is known as");
						System.out.println("\nA.) Binary\t\tB.) Octal");
						System.out.println("\nC.) Decimal\t\tD.) Hexadecimal ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level4();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level3();
						}
						break;
				case 4: System.out.println("\n3)Which of the following storage devices can store maximum amount of data?");
						System.out.println("\nA.) Floppy Disk\t\tB.) Hard Disk");
						System.out.println("\nC.) Compact Disk\t\tD.) Magneto Optic Disk ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level4();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level3();
						}
						break;
				case 5: System.out.println("\n3)Which of the following produces the best quality graphics reproduction?");
						System.out.println("\nA.) Laser printer\t\tB.) Ink jet printer");
						System.out.println("\nC.) Plotter\t\tD.) Dot matrix printer ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level4();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level3();
						}
						break;
				case 6: System.out.println("\n3)Mnemonic a memory trick is used in which of the following language?");
						System.out.println("\nA.) Machine language\t\tB.) Assembly language");
						System.out.println("\nC.) High level language\t\tD.) None of above ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level4();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level3();
						}
						break;
				case 7: System.out.println("\n3)The term gigabyte refers to");
						System.out.println("\nA.) 1024 bytes\t\tB.) 1024 kilobytes");
						System.out.println("\nC.) 1024 megabytes\t\tD.) 1024 gigabyte ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level4();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level3();
						}
						break;
				case 8: System.out.println("\n3)_______ computers are also called personal computers");
						System.out.println("\nA.) Mainframe Computer\t\tB.) Mini Computers");
						System.out.println("\nC.) Micro Computers\t\tD.) Super Computers ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level4();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level3();
						}
						break;
				case 9: System.out.println("3)Which one is the largest space?");
						System.out.println("\nA.) kilobyte\t\tB.) petabyte");
						System.out.println("\nC.) terabyte\t\tD.) gigabyte ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level4();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level3();
						}

			}
		}
		public static void level4() throws IOException
		{
			System.out.println("\nYOU HAVE ENTERED IN LEVEL 4!");
			System.out.println("This is C Programming Level ");
			Random rand = new Random();
			String ans;
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			switch(rand.nextInt(10))
			{
				case 0:	System.out.println("\n4)'C' is often called a");
						System.out.println("\nA.) Object oriented language\t\tB.) High level language");
						System.out.println("\nC.) Assembly language\t\tD.) Machine level language ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level5();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level4();
						}
						break;
				case 1: System.out.println("\n4)The loop in which the statements within the loop are executed at least once is called");
						System.out.println("\nA.) do-while\t\tB.) while");
						System.out.println("\nC.) for\t\tD.) goto ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("a"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level5();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level4();
						}
						break;
				case 2: System.out.println("\n4)The control automatically passes to the first statement after the loop in");
						System.out.println("\nA.) continue statement\t\tB.) break statement");
						System.out.println("\nC.) switch statement\t\tD.) if statement ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level5();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level4();
						}
						break;
				case 3: System.out.println("\n4)A self contained block of statements that perform a coherent task of some kind is called a");
						System.out.println("\nA.) Monitor\t\tB.) Function");
						System.out.println("\nC.) Program\t\tD.) Structure ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level5();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level4();
						}
						break;
				case 4: System.out.println("\n4)Unsigned integer occupies");
						System.out.println("\nA.) Two bytes\t\tB.) Four bytes");
						System.out.println("\nC.) One byte\t\tD.) Eight bytes ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level5();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level4();
						}
						break;
				case 5: System.out.println("\n3)Each C preprocessor directive begins with");
						System.out.println("\nA.) #\t\tB.) include");
						System.out.println("\nC.) main()\t\tD.) { ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("a"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level5();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level4();
						}
						break;
				case 6: System.out.println("\n4)The << operator is used for");
						System.out.println("\nA.) Right shifting\t\tB.) Left shifting");
						System.out.println("\nC.) Bitwise shifting\t\tD.) Bitwise complement ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level5();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level4();
						}
						break;
				case 7: System.out.println("\n4)The C language includes the header file standard input & output in");
						System.out.println("\nA.) stdlib.h library\t\tB.) stdio.h library");
						System.out.println("\nC.) conio.h library\t\tD.) #include library ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("b"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level5();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level4();
						}
						break;
				case 8: System.out.println("\n4)The statement which is used to terminate the control from the loop is");
						System.out.println("\nA.) break\t\tB.) continue");
						System.out.println("\nC.) goto\t\tD.) exit ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("a"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level5();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level4();
						}
						break;
				case 9: System.out.println("4)Set of values of the same type, which have a single name followed by an index is called");
						System.out.println("\nA.) function\t\tB.) structure");
						System.out.println("\nC.) array\t\tD.) union ");
						System.out.println("Enter your choice : ");
						ans = stdin.readLine();
						if (ans.equalsIgnoreCase("c"))
						{
							System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
							System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
							level5();
						}
						else
						{
							System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
							System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
							counters();
							if(count==5)
							{
								System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
								System.out.println("YOUR GAME HAS FINISHED NOW");
							}
							else
								level4();
						}

				}
			}
			public static void level5() throws IOException
			{
				System.out.println("\nYOU HAVE ENTERED IN LEVEL 5!");
				System.out.println("This is Basic C Programming Level");
				Random rand = new Random();
				String ans;
				BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
				switch(rand.nextInt(10))
				{
					case 0:	System.out.println("\n5)Turbo C 4.5 is based on");
							System.out.println("\nA.) DOS\t\tB.) WINDOWS");
							System.out.println("\nC.) UNIX\t\tD.) NONE ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level6();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level5();
							}
							break;
					case 1: System.out.println("\n5)Find the output of following c code?");
							System.out.println("#include<stdio.h>\n"+"int main(){\n"+"\tint a=4,b=5;\n"+"\tprintit(a, b);\n"+"}\n");
							System.out.println("printit(int b, int a){\n"+"\tprintf("+"\"%d %d\""+", a, b);\n"+"\t{\n"+"\t\tint a=0;");
							System.out.println("\t\tint b=1;\n"+"\t\tprintf("+"\"%d %d\""+", a, b);\n"+"\t}\n"+"\treturn 0;\n"+"}");
							System.out.println("\nA.) 4 5 0 1\t\tB.) 5 4 0 1");
							System.out.println("\nC.) 5 4 5 4\t\tD.) Compilation error ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level6();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level5();
							}
							break;
					case 2: System.out.println("\n5)Find the output of following c code.");
							System.out.println("#include<stdio.h>\n"+"int main(){\n"+"\tint i=1,j=2,k=3;\n"+"\tif(i==1)");
							System.out.println("\t\tif(j==2)\n"+"\t\t\tif(k==3){\n"+"\t\t\t\tprintf("+"\"ok\""+");\n"+"\t\t\t\tbreak;\n"+"\t\t\t}");
							System.out.println("\telse\n"+"\t\tprintf("+"\"continue\""+");\n"+"\t\tprintf("+"\"bye\""+");\n"+"\treturn 0;\n"+"}");
							System.out.println("\nA.) ok\t\tB.) okbye");
							System.out.println("\nC.) Misplaced break\t\tD.) None of these ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("c"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level6();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level5();
							}
							break;
					case 3: System.out.println("\n5)What will be output if you will execute following c code?");
							System.out.println("#include<stdio.h>\n"+"int main(){\n"+"\tchar c=+'A';\n"+"\tprintf(\"%d\",c);\n"+"\treturn 0;\n"+"}");
							System.out.println("\nA.) 65\t\tB.) 135");
							System.out.println("\nC.) Garbage value\t\tD.) 0 ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("d"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level2();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level5();
							}
							break;
					case 4: System.out.println("\n5)What will be output if you will execute following c code?");
							System.out.println("#include<stdio.h>\n"+"int main(){\n"+"\tint z;\n"+"\tz=5,3,2;");
							System.out.println("\tprintf(\"%d\",z);\n"+"\treturn 0;\n"+"}");
							System.out.println("\nA.) 5\t\tB.) 3");
							System.out.println("\nC.) 2\t\tD.) Compilation error ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("a"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level6();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level5();
							}
							break;
					case 5: System.out.println("\n5)What will be output if you will execute following c code?");
							System.out.println("#include<stdio.h>\n"+"int main(){\n"+"\tint num,a=5;\n"+"\tnum=+++a;");
							System.out.println("\tprintf(\"%d  %d\",num,a);\n"+"\treturn 0;\n"+"}");
							System.out.println("\nA.) 5 5\t\tB.) 6 6");
							System.out.println("\nC.) 7 7\t\tD.) 5 6 ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level6();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level5();
							}
							break;
					case 6: System.out.println("\n5)What will be output if you will execute following c code?");
							System.out.println("#include<stdio.h>\n"+"int main(){\n"+"\tint i=5,j=10,num;\n"+"\tnum=++i,++j,i+j;");
							System.out.println("\tprintf(\"%d  %d  %d\",num,i,j);\n"+"\treturn 0;\n"+"}");
							System.out.println("\nA.) 5 5 10\t\tB.) 5 6 11");
							System.out.println("\nC.) 6 6 11\t\tD.) Compilation error ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("c"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level6();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level5();
							}
							break;
					case 7: System.out.println("\n5)What will be output if you will execute following c code?");
							System.out.println("int main(){\n"+"\tfloat x;\n"+"\tx=(int(float(double)5.5));");
							System.out.println("\tprintf(\"%f\",x);\n"+"\treturn 0;\n"+"}");
							System.out.println("\nA.) 5.5\t\tB.) 5.500000");
							System.out.println("\nC.) 6.000000\t\tD.) Compilation error ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("d"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level6();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level5();
							}
							break;
					case 8: System.out.println("\n5)What will be output if you will execute following c code?");
							System.out.println("#include<stdio.h>\n"+"main(){\n"+"\tprintf(\"%p\", main());\n"+"}");
							System.out.println("\nA.) Prints the address of main function\t\tB.) Prints 0");
							System.out.println("\nC.) Is an error\t\tD.) Is an infinite loop ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("a"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level6();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level5();
							}
							break;
					case 9: System.out.println("\n5)What will be output if you will execute following c code?");
							System.out.println("#include<stdio.h>\n"+"main(){\n"+"\tlong i = 65536;\n"+"\tprintf(\"%d\", i);\n"+"}");
							System.out.println("\nA.) 0\t\tB.) 65536");
							System.out.println("\nC.) -1\t\tD.) 65 ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("a"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level6();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level5();
							}
							break;
				}
			}
			public static void level6() throws IOException
			{
				System.out.println("\nYOU HAVE ENTERED IN LEVEL 6!");
				System.out.println("This is Basic C++ Programming Level");
				Random rand = new Random();
				String ans;
				BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
				switch(rand.nextInt(10))
				{
					case 0:	System.out.println("\n6)Looping in a program means");
							System.out.println("\nA.) Jumping to the specified branch of program\t\tB.) Repeat the specified lines of code");
							System.out.println("\nC.) Both of above\t\tD.) None of above ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level7();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level6();
							}
							break;
					case 1: System.out.println("\n6)The difference between while structure and do structure for looping is");
							System.out.println("\nA.) In while statement the condition is tested at the end of first iteration\t\tB.) In do structure the condition is tested at the beginning of first iteration");
							System.out.println("\nC.) The do structure decides whether to start the loop code or not whereas while statement decides whether to repeat the code or not\t\tD.) In while structure condition is tested before executing statements inside loop whereas in do structure condition is tested before repeating the statements inside loop ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("d"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level7();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level6();
							}
							break;
					case 2: System.out.println("\n6)Which of the following is not a jump statement in C++?");
							System.out.println("\nA.) break\t\tB.) goto");
							System.out.println("\nC.) exit\t\tD.) switch ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("d"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level7();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level6();
							}
							break;
					case 3: System.out.println("\n6)Which of the following is selection statement in C++?");
							System.out.println("\nA.) break\t\tB.) goto");
							System.out.println("\nC.) exit\t\tD.) switch ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("d"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level7();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level6();
							}
							break;
					case 4: System.out.println("\n6)The continue statement");
							System.out.println("\nA.) resumes the program if it is hanged\t\tB.) resumes the program if it was break was applied");
							System.out.println("\nC.) skips the rest of the loop in current iteration\t\tD.) all of above ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("c"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level7();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level6();
							}
							break;
					case 5: System.out.println("\n6)Which of the following is false for switch statement in C++?");
							System.out.println("\nA.)  It uses labels instead of blocks\t\tB.) we need to put break statement at the end of the group of statement of a condition");
							System.out.println("\nC.) we can put range for case such as case 1..3\t\tD.) None of above ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("c"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level7();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level6();
							}
							break;
					case 6: System.out.println("\n6)The 'return 0;' statement in main function indicates");
							System.out.println("\nA.) The program did nothing; completed 0 tasks\t\tB.) The program worked as expected without any errors during its execution");
							System.out.println("\nC.) not to end the program yet.\t\tD.) None of above ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level7();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level6();
							}
							break;
					case 7: System.out.println("\n6)Identify the correct statement regarding scope of variables");
							System.out.println("\nA.) Global variables are declared in a separate file and accessible from any program.\t\tB.) Local variables are declared inside a function and accessible within the function only.");
							System.out.println("\nC.) Global variables are declared inside a function and accessible from anywhere in program.\t\tD.) Local variables are declared in the main body of the program and accessible only from functions. ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level7();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level6();
							}
							break;
					case 8: System.out.println("\n6)Which of the following is output statement in C++?");
							System.out.println("\nA.) print\t\tB.) write");
							System.out.println("\nC.) cout\t\tD.) cin ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("c"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level7();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level6();
							}
							break;
					case 9: System.out.println("\n6)In an assignment statement\na=b;\nWhich of the following statement is true?");
							System.out.println("\nA.) The variable a and the variable b are equal.\t\tB.) The value of b is assigned to variable a but the later changes on variable b will not effect the value of variable a");
							System.out.println("\nC.) The value of b is assigned to variable a and the later changes on variable b will effect the value of variable a\t\tD.) The value of variable a is assigned to variable b and the value of variable b is assigned to variable a. ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level7();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level6();
							}
							break;
				}
			}
			public static void level7() throws IOException
			{
				System.out.println("\nYOU HAVE ENTERED IN LEVEL 7!");
				System.out.println("This is Basic C++ Programming Level");
				Random rand = new Random();
				String ans;
				BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
				switch(rand.nextInt(10))
				{
					case 0:	System.out.println("\n7)Which one of the following is not a fundamental data type in C++");
							System.out.println("\nA.) float\t\tB.) string");
							System.out.println("\nC.) int\t\tD.) wchar_t ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("a"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level8();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level7();
							}
							break;
					case 1: System.out.println("\n7)Which of the following is a valid destructor of the class name \"Country\"");
							System.out.println("\nA.) int ~Country()\t\tB.) void Country()");
							System.out.println("\nC.) int ~Country(Country obj)\t\tD.) void ~Country() ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level8();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level7();
							}
							break;
					case 2: System.out.println("\n7)Which of the following functions below can be used Allocate space for array in memory?");
							System.out.println("\nA.) calloc()\t\tB.) malloc()");
							System.out.println("\nC.) Realloc()\t\tD.) both a and b ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("d"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level8();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level7();
							}
							break;
					case 3: System.out.println("\n7)A continue statement causes execution to skip to");
							System.out.println("\nA.) the return 0; statement\t\tB.) the first statement after the loop");
							System.out.println("\nC.) the statement following the continue statement\t\tD.) the next iteration of the loop ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("c"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level8();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level7();
							}
							break;
					case 4: System.out.println("\n7)Which one of the following is not a valid reserved keyword in C++");
							System.out.println("\nA.) Explicit\t\tB.) Public");
							System.out.println("\nC.) Implicit\t\tD.) Private ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("c"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level8();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level7();
							}
							break;
					case 5: System.out.println("\n7)If class A is friend of class B and if class B is friend of class C, which of the following is true?");
							System.out.println("\nA.) Class C is friend of class A\t\tB.) Class A is friend of class C");
							System.out.println("\nC.) Class A and Class C do not have any friend relationship\t\tD.) None of the above ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level8();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level7();
							}
							break;
					case 6: System.out.println("\n7)Which looping process checks the test condition at the end of the loop?");
							System.out.println("\nA.) for\t\tB.) while");
							System.out.println("\nC.) do-while\t\tD.) no looping process checks the test condition at the end ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("a"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level8();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level7();
							}
							break;
					case 7: System.out.println("\n7)The default access level assigned to members of a class is ___________");
							System.out.println("\nA.) Private\t\tB.) Public");
							System.out.println("\nC.) Protected\t\tD.) Needs to be assigned ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("c"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level8();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level7();
							}
							break;
					case 8: System.out.println("\n7)class derived: public base1, public base2 { } is an example of");
							System.out.println("\nA.) Polymorphic inheritance\t\tB.) Multilevel inheritance");
							System.out.println("\nC.) Hierarchical inheritance\t\tD.) Multiple inheritance ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level8();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level7();
							}
							break;
					case 9: System.out.println("\n7)When class B is inherited from class A, what is the order in which the constructers of those classes are called");
							System.out.println("\nA.) Class A first Class B next\t\tB.) Class B first Class A next");
							System.out.println("\nC.) Class B's only as it is the child class\t\tD.) Class A's only as it is the parent class ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("a"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level8();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level7();
							}
							break;
				}
			}
			public static void level8() throws IOException
			{
				System.out.println("\nYOU HAVE ENTERED IN LEVEL 8!");
				System.out.println("This is Basic JAVA Programming Level");
				Random rand = new Random();
				String ans;
				BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
				switch(rand.nextInt(10))
				{
					case 0:	System.out.println("\n8)___________ is the ability of a Java application to perform multiple tasks at the same time.");
							System.out.println("\nA.) multiprogramming\t\tB.) multithreading");
							System.out.println("\nC.) multiprocessing\t\tD.) multitasking ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level9();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level8();
							}
							break;
					case 1: System.out.println("\n8)Java is designed for the distributed environment of the Internet, because it handles _________ protocols");
							System.out.println("\nA.) UDP\t\tB.) TCP/IP");
							System.out.println("\nC.) FTP\t\tD.) TEL ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level9();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level8();
							}
							break;
					case 2: System.out.println("\n8)_______ is the earlier name of Java");
							System.out.println("\nA.) Oak\t\tB.) Basic");
							System.out.println("\nC.) C\t\tD.) Perl ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level9();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level8();
							}
							break;
					case 3: System.out.println("\n8)Which property does not hold good for Java?");
							System.out.println("\nA.) object oriented\t\tB.) secure");
							System.out.println("\nC.) dynamic\t\tD.) complex ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("d"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level9();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level8();
							}
							break;
					case 4: System.out.println("\n8)A compiler converts the Java program into an intermediate language representation called ____________.");
							System.out.println("\nA.) bytecode\t\tB.) byte");
							System.out.println("\nC.) byteclass\t\tD.) bytejava ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("a"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level9();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level8();
							}
							break;
					case 5: System.out.println("\n8)_____________ operator is used to create an object.");
							System.out.println("\nA.) class\t\tB.) new");
							System.out.println("\nC.) print\t\tD.) print ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level9();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level8();
							}
							break;
					case 6: System.out.println("\n8)Java platform consists of JVM and a package of readymade software components. This package is known as ___________.");
							System.out.println("\nA.) Java API\t\tB.) JVM API");
							System.out.println("\nC.) JM API\t\tD.) API ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("a"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level9();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level8();
							}
							break;
					case 7: System.out.println("\n8)Which of the following is not a looping statement ____________?");
							System.out.println("\nA.) for\t\tB.) switch");
							System.out.println("\nC.) while\t\tD.) d0-while ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level9();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level8();
							}
							break;
					case 8: System.out.println("\n8)_____________ is a multi-way branch statement");
							System.out.println("\nA.) switch\t\tB.) continue");
							System.out.println("\nC.) break\t\tD.) label ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("a"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level9();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level8();
							}
							break;
					case 9: System.out.println("\n8)A class that is inherited is called a ____________.");
							System.out.println("\nA.) superclass\t\tB.) subclass");
							System.out.println("\nC.) subsetclass\t\tD.) relativeclass ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("a"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								level9();
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level8();
							}
							break;
				}
			}
			public static void level9() throws IOException
			{
				System.out.println("\nYOU HAVE ENTERED IN LEVEL 9!");
				System.out.println("This is Basic JAVA Programming Level");
				Random rand = new Random();
				String ans;
				BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
				switch(rand.nextInt(10))
				{
					case 0:	System.out.println("\n9)A/An _________ determines the features of a class that may be used by other classes.");
							System.out.println("\nA.) specifier\t\tB.) inheritance");
							System.out.println("\nC.) implementation\t\tD.) access specifier ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("d"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								System.out.println("\nThanks for Playing! Have a nice day");
								System.exit(0);
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level9();
							}
							break;
					case 1: System.out.println("\n8)Java is designed for the distributed environment of the Internet, because it handles _________ protocols");
							System.out.println("\nA.) UDP\t\tB.) TCP/IP");
							System.out.println("\nC.) FTP\t\tD.) TEL ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								System.out.println("\nThanks for Playing! Have a nice day");
								System.exit(0);
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level9();
							}
							break;
					case 2: System.out.println("\n9)Which property of Java allows the creation of hierarchical classifications?");
							System.out.println("\nA.) interface\t\tB.) inheritance");
							System.out.println("\nC.) robust\t\tD.) distributed ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								System.out.println("\nThanks for Playing! Have a nice day");
								System.exit(0);
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level9();
							}
							break;
					case 3: System.out.println("\n9)The class at the top of the exception classes hierarchy is called ____________.");
							System.out.println("\nA.) common\t\tB.) throwable");
							System.out.println("\nC.) NULL\t\tD.) catch ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								System.out.println("\nThanks for Playing! Have a nice day");
								System.exit(0);
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level9();
							}
							break;
					case 4: System.out.println("\n9)Find the keyword which is not used to implement exception.");
							System.out.println("\nA.) try\t\tB.) catch");
							System.out.println("\nC.) finally\t\tD.) access");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("d"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								System.out.println("\nThanks for Playing! Have a nice day");
								System.exit(0);
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level9();
							}
							break;
					case 5: System.out.println("\n9)The argument to sleep() specifies the delay period in _____________.");
							System.out.println("\nA.) microseconds\t\tB.) milliseconds");
							System.out.println("\nC.) seconds\t\tD.) minutes ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								System.out.println("\nThanks for Playing! Have a nice day");
								System.exit(0);
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level9();
							}
							break;
					case 6: System.out.println("\n9)Which of the following is not a Java data type? 1. byte 2. register 3. long 4. nibble 5. int 6. char");
							System.out.println("\nA.) 4 and 5 only\t\tB.) 1 and 3 only");
							System.out.println("\nC.) 5 and 6 only\t\tD.) 2 and 4 only ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("d"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								System.out.println("\nThanks for Playing! Have a nice day");
								System.exit(0);
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level9();
							}
							break;
					case 7: System.out.println("\n9)State True or False");
							System.out.println("1. The data members and methods of a class are defined inside the class body");
							System.out.println("2. The syntax used to declare a class variable is: <variable_name> <data_type>");
							System.out.println("3. An access Specifier defines where a method can be accessed");
							System.out.println("\nA.) 1-T, 2-T, 3-F\t\tB.) 1-F, 2-T, 3-F");
							System.out.println("\nC.) 1-T, 2-T, 3-T\t\tD.) 1-T, 2-F, 3-T ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("d"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								System.out.println("\nThanks for Playing! Have a nice day");
								System.exit(0);
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level9();
							}
							break;
					case 8: System.out.println("\n9)Sharing of common information is achieved by concept of :");
							System.out.println("\nA.) polymorphism\t\tB.) encapsulation");
							System.out.println("\nC.) inheritance\t\tD.) none of above ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("c"))
							{
								System.out.println("\nAAP KA JAWAB BILKUL SAHI HAI");
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								System.out.println("\nThanks for Playing! Have a nice day");
								System.exit(0);
							}
							else
							{
								System.out.println("AFSOS AAPKA JAWAB GALAT HAI");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level9();
							}
							break;
					case 9: System.out.println("\n9)Which one of these lists contains only Java programming language keywords?");
							System.out.println("\nA.) class, if, void, long, Int, continue\t\tB.) goto, instanceof, native, finally, default, throws");
							System.out.println("\nC.) try, virtual, throw, final, volatile, transient\t\tD.) strictfp, constant, super, implements, do ");
							System.out.println("Enter your choice : ");
							ans = stdin.readLine();
							if (ans.equalsIgnoreCase("b"))
							{
							
								System.out.println("\nCONGRATULATIONS! ABSOLUTELY RIGHT ANSWER");
								System.out.println("\nThanks for Playing! Have a nice day");
								System.exit(0);
							}
							else
							{
								System.out.println("U R GAME ENDS HERE");
								System.out.println("SORRY! YOU HAVE CHOSEN WRONG ANSWER");
								counters();
								level9();
							}
							break;
				}
			}
		
			public static void counters() throws IOException
			{
				count++;
			/*	System.out.println("\nyou have "+(5-count)+" chances left");
				System.out.println("\n*************************************\n");*/
				if(count==5)
				{
					System.out.println("AAPKA KHEL YAHIN SAMAPT HOTA HAI");
					System.out.println("YOUR GAME HAS FINISHED NOW");
					System.exit(0);
				}
			}
}
