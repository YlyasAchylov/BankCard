import java.util.Scanner;

public class Project_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("------------- �� Bankas�na Ho�geldiniz --------------");
		System.out.println("Ad�n�z� giriniz: ");
		String ad = scan.nextLine();

		System.out.println("Soyad�n�z� giriniz: ");
		String soyad = scan.nextLine();

		System.out.println("Do�um tarihinizi g.aa.yy �eklinde  giriniz: ");
		int dogum = scan.nextInt();
		if (dogum <= 10150 || dogum >= 310817) {
			System.out.println("Do�um tarihinizi yanl�� giridiniz!");
		} else {
			System.out.println("L�tfen 4 haneli �ifre belirleyiniz: ");
			int ilksifre = scan.nextInt();
			if (ilksifre == dogum || ilksifre == dogum % 1000) {
				System.out.println("Belirleyeceginiz �ifre dogum tarihinizle ayn� olamaz!");
			} else if (ilksifre < 1000 || ilksifre > 9999) {
				System.out.println("L�tfen 4 haneli �ifre belirleyiniz!");
			} else {
				System.out.println("L�tfen �ifrenizi onaylay�n: ");
				int ilksifreonay = scan.nextInt();
				if (ilksifre != ilksifreonay) {
					System.out.println("Onay �ifrenizi yanl�� girdiniz!");
				} else {

					double guncelbakiye = 0;
					System.out.println("�ifreniz ba�ar�yla belirlendi!");
					System.out.println("Yeni �ifreniz: " + ilksifreonay);
					for (int i = 1; i < 11; i++) {
						System.out.println("Ad�n�z: " + ad);
						System.out.println("Soyad�n�z: " + soyad);
						System.out.println("Kart numaran�z: " + "4546494748");
						System.out.println("Kart �ifreniz: " + ilksifreonay);
						System.out.println("G�ncel bakiyeniz: " + guncelbakiye);

						System.out.println("*" + " Para y�klemek i�in '1' bas�n�z.");
						System.out.println("**" + " Para �ekmek i�in '2' bas�n�z");
						System.out.println("***" + " Al��veri� yapmak i�in '3' bas�n�z.");
						System.out.println("****" + " �ifrenizi de�i�tirmek i�in '4' bas�n�z.");
						System.out.println("*****" + " Bilgilerinizi �grenmek i�in '5' bas�n�z.");
						System.out.println("******" + " Kart�n�z� almak i�in '6' bas�n�z.");
					}
					int giris = scan.nextInt();
					if (giris > 1 || giris > 6) {
						System.out.println("L�tfen tekrar deneyiniz!");
					} else if (giris == 1) {

						System.out.println("G�ncel bakiyeniz: " + guncelbakiye);

						System.out.println("K�s�ratl� tutar girmeyiniz \n Y�klemek istedi�in tutar� giriniz: ");
						double parayukle = scan.nextInt();
						if (parayukle <= 0) {
							System.out.println("Para y�kleme i�leminiz iptal edildi!");
						} else {

							System.out.println("Para Y�kleme i�leminiz ba�ar�yla ger�ekle�tirilmi�tir!");
							guncelbakiye = guncelbakiye + parayukle;
							System.out.println("G�ncel Bakiyeniz:" + guncelbakiye);
						}

					}

					else if (giris == 2) {
						if (guncelbakiye <= 0) {
							System.out.println("�ekebilece�iniz tutar 00.00");
						}

						else {
							System.out.println("�ekebilece�iniz tutar " + guncelbakiye);
							System.out.println(
									"Bankamatiklerimiz 5TL vermemektedir! \n �ekmek istedi�iniz tutar� giriniz: ");
							double cekilen = scan.nextDouble();
							if (cekilen > guncelbakiye) {
								System.out.println("Yanl�� tutar giri�i yapt�n�z!");
							} else {
								System.out.println("Para �ekme i�leminiz ba�ar�yla ger�ekle�tirilmi�tir!");

								guncelbakiye = guncelbakiye - cekilen;
							}

						}

					}

					else if (giris == 3) {
						if (guncelbakiye < 0) {
							System.out.println("Al��veri� yapabilmek i�in para y�klemeniz gerekmektedir!");
						} else {
							System.out.println("Al�iveri� yapmak istediginiz magazay� se�iniz: ");
							System.out.println("'1' + Marc Jacobs");
							System.out.println("'2' + Versace");
							System.out.println("'3' + Valentino");
							int magaza = scan.nextInt();
							if (magaza < 1 || magaza > 3) {
								System.out.println("Yanl�� magaza se�imi yapt�n�z!");
							} else {
								if (magaza == 1) {
									System.out.println("----------Marc Jacobs----------");
									System.out.println("'1' Ayakkab�(600TL)");
									System.out.println("'2' Tak�m elbise(1200TL) ");
									System.out.println("'3' TShirt(200TL)");
									int marcj = scan.nextInt();
									if (marcj < 0 || marcj > 3) {
										System.out.println("Yanl�� �r�n se�imi yapt�n�z!");
									} else if (guncelbakiye < 200) {
										System.out.println("Marc Jacobsda en ucuz �r�n 200TLdir.");
									} else if (marcj == 1 && guncelbakiye >= 600) {
										System.out.println(
												"Se�ti�iniz �r�n� (Ayakkab�) ba�ar�yla sat�n ald�n�z! \n Se�tiginiz �r�n 2 i� g�n� i�erisinde kargoya verilecektir!");
									} else if (marcj == 2 && guncelbakiye >= 1200) {
										System.out.println(
												"Se�ti�iniz �r�n� (Tak�m elbise) ba�ar�yla sat�n ald�n�z! \n Se�tiginiz �r�n 2 i� g�n� i�erisinde kargoya verilecektir!");
									} else if (marcj == 3 && guncelbakiye >= 200) {
										System.out.println(
												"Se�ti�iniz �r�n� (TShirt) ba�ar�yla sat�n ald�n�z! \n Se�tiginiz �r�n 2 i� g�n� i�erisinde kargoya verilecektir!");
									}
								}

								if (magaza == 2) {
									System.out.println("----------Versace----------");
									System.out.println("'1' �apka(130TL)");
									System.out.println("'2' �orap(12TL) ");
									System.out.println("'3' G�mlek(260TL)");
									int versc = scan.nextInt();
									if (versc < 0 || versc > 3) {
										System.out.println("Yanl�� �r�n se�imi yapt�n�z!");
									} else if (guncelbakiye < 12) {
										System.out.println("Versaceda en ucuz �r�n 12TLdir.");
									} else if (guncelbakiye < 200) {
										System.out.println("Marc Jacobsda en ucuz �r�n 200TLdir.");
									} else if (versc == 1 && guncelbakiye >= 130) {
										System.out.println(
												"Se�ti�iniz �r�n� (�apka) ba�ar�yla sat�n ald�n�z! \n Se�tiginiz �r�n 2 i� g�n� i�erisinde kargoya verilecektir!");
									} else if (versc == 2 && guncelbakiye >= 12) {
										System.out.println(
												"Se�ti�iniz �r�n� (�orap) ba�ar�yla sat�n ald�n�z! \n Se�tiginiz �r�n 2 i� g�n� i�erisinde kargoya verilecektir!");
									} else if (versc == 3 && guncelbakiye >= 260) {
										System.out.println(
												"Se�ti�iniz �r�n� (G�mlek) ba�ar�yla sat�n ald�n�z! \n Se�tiginiz �r�n 2 i� g�n� i�erisinde kargoya verilecektir!");
									}
								}
								if (magaza == 3) {
									System.out.println("----------Valentino----------");
									System.out.println("'1' �anta(840TL)");
									System.out.println("'2' Bilezik(95TL) ");
									System.out.println("'3' Saat(3000TL)");
									int valent = scan.nextInt();
									if (valent < 0 || valent > 3) {
										System.out.println("Yanl�� �r�n se�imi yapt�n�z!");
									} else if (guncelbakiye < 95) {
										System.out.println("Versaceda en ucuz �r�n 260TLdir.");
									} else if (guncelbakiye < 200) {
										System.out.println("Marc Jacobsda en ucuz �r�n 200TLdir.");
									} else if (valent == 1 && guncelbakiye >= 840) {
										System.out.println(
												"Se�ti�iniz �r�n� (�anta) ba�ar�yla sat�n ald�n�z! \n Se�tiginiz �r�n 2 i� g�n� i�erisinde kargoya verilecektir!");
									} else if (valent == 2 && guncelbakiye >= 95) {
										System.out.println(
												"Se�ti�iniz �r�n� (Bilezik) ba�ar�yla sat�n ald�n�z! \n Se�tiginiz �r�n 2 i� g�n� i�erisinde kargoya verilecektir!");
									} else if (valent == 3 && guncelbakiye >= 3000) {
										System.out.println(
												"Se�ti�iniz �r�n� (Saat) ba�ar�yla sat�n ald�n�z! \n Se�tiginiz �r�n 2 i� g�n� i�erisinde kargoya verilecektir!");
									}

								}

							}

						}
					}

					if (giris == 4) {
						System.out.println("Eski �ifrenizi giriniz: ");
						int eskisifre = scan.nextInt();
						if (eskisifre != ilksifreonay) {
							System.out.println("Eski �ifrenizi yanl�� girdiniz!");
						}

						else if (eskisifre == dogum || eskisifre == dogum % 1000) {
							System.out.println("Eski �ifrenizi yanl�� girdiniz!");

						}

						else if (ilksifre < 1000 || ilksifre > 9999) {
							System.out.println("Belirledi�iniz �ifre 4 haneydi!");
						}

						else {

							System.out.println("Eski �ifreniz onayland�.Yeni �ifrenizi belirleyiniz: ");
							int degistirilmissifre = scan.nextInt();
							System.out.println("Yeni �ifrenizi onaylay�n�z: ");
							int degistirilmissifreonay = scan.nextInt();

							if (degistirilmissifre != degistirilmissifreonay) {
								System.out.println("Onay �ifrenizi yanl�� girdiniz!");
							}

							else {
								System.out.println("Yeni �ifre belirlediniz!");
								System.out.println("Yeni �ifreniz: " + degistirilmissifreonay);
							}
						}
					}

					if (giris == 5) {
						System.out.println("Ad�n�z: " + ad);
						System.out.println("Soyad�n�z: " + soyad);
						System.out.println("Kart numaran�z: " + "4546494748");
						System.out.println("Kart �ifreniz: " + degistirilmissifre);
						System.out.println("G�ncel bakiyeniz: " + guncelbakiye);
					}

					if (giris == 6) {
						System.out.println("��leminiz iptal edildi! \n Kart�n�z� al�n�z!");
					}

				}

			}
		}

	}

}
