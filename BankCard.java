import java.util.Scanner;

public class Project_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("------------- Ýþ Bankasýna Hoþgeldiniz --------------");
		System.out.println("Adýnýzý giriniz: ");
		String ad = scan.nextLine();

		System.out.println("Soyadýnýzý giriniz: ");
		String soyad = scan.nextLine();

		System.out.println("Doðum tarihinizi g.aa.yy þeklinde  giriniz: ");
		int dogum = scan.nextInt();
		if (dogum <= 10150 || dogum >= 310817) {
			System.out.println("Doðum tarihinizi yanlýþ giridiniz!");
		} else {
			System.out.println("Lütfen 4 haneli þifre belirleyiniz: ");
			int ilksifre = scan.nextInt();
			if (ilksifre == dogum || ilksifre == dogum % 1000) {
				System.out.println("Belirleyeceginiz þifre dogum tarihinizle ayný olamaz!");
			} else if (ilksifre < 1000 || ilksifre > 9999) {
				System.out.println("Lütfen 4 haneli þifre belirleyiniz!");
			} else {
				System.out.println("Lütfen þifrenizi onaylayýn: ");
				int ilksifreonay = scan.nextInt();
				if (ilksifre != ilksifreonay) {
					System.out.println("Onay þifrenizi yanlýþ girdiniz!");
				} else {

					double guncelbakiye = 0;
					System.out.println("Þifreniz baþarýyla belirlendi!");
					System.out.println("Yeni þifreniz: " + ilksifreonay);
					for (int i = 1; i < 11; i++) {
						System.out.println("Adýnýz: " + ad);
						System.out.println("Soyadýnýz: " + soyad);
						System.out.println("Kart numaranýz: " + "4546494748");
						System.out.println("Kart þifreniz: " + ilksifreonay);
						System.out.println("Güncel bakiyeniz: " + guncelbakiye);

						System.out.println("*" + " Para yüklemek için '1' basýnýz.");
						System.out.println("**" + " Para çekmek için '2' basýnýz");
						System.out.println("***" + " Alýþveriþ yapmak için '3' basýnýz.");
						System.out.println("****" + " Þifrenizi deðiþtirmek için '4' basýnýz.");
						System.out.println("*****" + " Bilgilerinizi ögrenmek için '5' basýnýz.");
						System.out.println("******" + " Kartýnýzý almak için '6' basýnýz.");
					}
					int giris = scan.nextInt();
					if (giris > 1 || giris > 6) {
						System.out.println("Lütfen tekrar deneyiniz!");
					} else if (giris == 1) {

						System.out.println("Güncel bakiyeniz: " + guncelbakiye);

						System.out.println("Küsüratlý tutar girmeyiniz \n Yüklemek istediðin tutarý giriniz: ");
						double parayukle = scan.nextInt();
						if (parayukle <= 0) {
							System.out.println("Para yükleme iþleminiz iptal edildi!");
						} else {

							System.out.println("Para Yükleme iþleminiz baþarýyla gerçekleþtirilmiþtir!");
							guncelbakiye = guncelbakiye + parayukle;
							System.out.println("Güncel Bakiyeniz:" + guncelbakiye);
						}

					}

					else if (giris == 2) {
						if (guncelbakiye <= 0) {
							System.out.println("Çekebileceðiniz tutar 00.00");
						}

						else {
							System.out.println("Çekebileceðiniz tutar " + guncelbakiye);
							System.out.println(
									"Bankamatiklerimiz 5TL vermemektedir! \n Çekmek istediðiniz tutarý giriniz: ");
							double cekilen = scan.nextDouble();
							if (cekilen > guncelbakiye) {
								System.out.println("Yanlýþ tutar giriþi yaptýnýz!");
							} else {
								System.out.println("Para çekme iþleminiz baþarýyla gerçekleþtirilmiþtir!");

								guncelbakiye = guncelbakiye - cekilen;
							}

						}

					}

					else if (giris == 3) {
						if (guncelbakiye < 0) {
							System.out.println("Alýþveriþ yapabilmek için para yüklemeniz gerekmektedir!");
						} else {
							System.out.println("Alýiveriþ yapmak istediginiz magazayý seçiniz: ");
							System.out.println("'1' + Marc Jacobs");
							System.out.println("'2' + Versace");
							System.out.println("'3' + Valentino");
							int magaza = scan.nextInt();
							if (magaza < 1 || magaza > 3) {
								System.out.println("Yanlýþ magaza seçimi yaptýnýz!");
							} else {
								if (magaza == 1) {
									System.out.println("----------Marc Jacobs----------");
									System.out.println("'1' Ayakkabý(600TL)");
									System.out.println("'2' Takým elbise(1200TL) ");
									System.out.println("'3' TShirt(200TL)");
									int marcj = scan.nextInt();
									if (marcj < 0 || marcj > 3) {
										System.out.println("Yanlýþ ürün seçimi yaptýnýz!");
									} else if (guncelbakiye < 200) {
										System.out.println("Marc Jacobsda en ucuz ürün 200TLdir.");
									} else if (marcj == 1 && guncelbakiye >= 600) {
										System.out.println(
												"Seçtiðiniz ürünü (Ayakkabý) baþarýyla satýn aldýnýz! \n Seçtiginiz ürün 2 iþ günü içerisinde kargoya verilecektir!");
									} else if (marcj == 2 && guncelbakiye >= 1200) {
										System.out.println(
												"Seçtiðiniz ürünü (Takým elbise) baþarýyla satýn aldýnýz! \n Seçtiginiz ürün 2 iþ günü içerisinde kargoya verilecektir!");
									} else if (marcj == 3 && guncelbakiye >= 200) {
										System.out.println(
												"Seçtiðiniz ürünü (TShirt) baþarýyla satýn aldýnýz! \n Seçtiginiz ürün 2 iþ günü içerisinde kargoya verilecektir!");
									}
								}

								if (magaza == 2) {
									System.out.println("----------Versace----------");
									System.out.println("'1' Þapka(130TL)");
									System.out.println("'2' Çorap(12TL) ");
									System.out.println("'3' Gömlek(260TL)");
									int versc = scan.nextInt();
									if (versc < 0 || versc > 3) {
										System.out.println("Yanlýþ ürün seçimi yaptýnýz!");
									} else if (guncelbakiye < 12) {
										System.out.println("Versaceda en ucuz ürün 12TLdir.");
									} else if (guncelbakiye < 200) {
										System.out.println("Marc Jacobsda en ucuz ürün 200TLdir.");
									} else if (versc == 1 && guncelbakiye >= 130) {
										System.out.println(
												"Seçtiðiniz ürünü (Þapka) baþarýyla satýn aldýnýz! \n Seçtiginiz ürün 2 iþ günü içerisinde kargoya verilecektir!");
									} else if (versc == 2 && guncelbakiye >= 12) {
										System.out.println(
												"Seçtiðiniz ürünü (Çorap) baþarýyla satýn aldýnýz! \n Seçtiginiz ürün 2 iþ günü içerisinde kargoya verilecektir!");
									} else if (versc == 3 && guncelbakiye >= 260) {
										System.out.println(
												"Seçtiðiniz ürünü (Gömlek) baþarýyla satýn aldýnýz! \n Seçtiginiz ürün 2 iþ günü içerisinde kargoya verilecektir!");
									}
								}
								if (magaza == 3) {
									System.out.println("----------Valentino----------");
									System.out.println("'1' Çanta(840TL)");
									System.out.println("'2' Bilezik(95TL) ");
									System.out.println("'3' Saat(3000TL)");
									int valent = scan.nextInt();
									if (valent < 0 || valent > 3) {
										System.out.println("Yanlýþ ürün seçimi yaptýnýz!");
									} else if (guncelbakiye < 95) {
										System.out.println("Versaceda en ucuz ürün 260TLdir.");
									} else if (guncelbakiye < 200) {
										System.out.println("Marc Jacobsda en ucuz ürün 200TLdir.");
									} else if (valent == 1 && guncelbakiye >= 840) {
										System.out.println(
												"Seçtiðiniz ürünü (Çanta) baþarýyla satýn aldýnýz! \n Seçtiginiz ürün 2 iþ günü içerisinde kargoya verilecektir!");
									} else if (valent == 2 && guncelbakiye >= 95) {
										System.out.println(
												"Seçtiðiniz ürünü (Bilezik) baþarýyla satýn aldýnýz! \n Seçtiginiz ürün 2 iþ günü içerisinde kargoya verilecektir!");
									} else if (valent == 3 && guncelbakiye >= 3000) {
										System.out.println(
												"Seçtiðiniz ürünü (Saat) baþarýyla satýn aldýnýz! \n Seçtiginiz ürün 2 iþ günü içerisinde kargoya verilecektir!");
									}

								}

							}

						}
					}

					if (giris == 4) {
						System.out.println("Eski þifrenizi giriniz: ");
						int eskisifre = scan.nextInt();
						if (eskisifre != ilksifreonay) {
							System.out.println("Eski þifrenizi yanlýþ girdiniz!");
						}

						else if (eskisifre == dogum || eskisifre == dogum % 1000) {
							System.out.println("Eski þifrenizi yanlýþ girdiniz!");

						}

						else if (ilksifre < 1000 || ilksifre > 9999) {
							System.out.println("Belirlediðiniz þifre 4 haneydi!");
						}

						else {

							System.out.println("Eski þifreniz onaylandý.Yeni þifrenizi belirleyiniz: ");
							int degistirilmissifre = scan.nextInt();
							System.out.println("Yeni þifrenizi onaylayýnýz: ");
							int degistirilmissifreonay = scan.nextInt();

							if (degistirilmissifre != degistirilmissifreonay) {
								System.out.println("Onay þifrenizi yanlýþ girdiniz!");
							}

							else {
								System.out.println("Yeni þifre belirlediniz!");
								System.out.println("Yeni þifreniz: " + degistirilmissifreonay);
							}
						}
					}

					if (giris == 5) {
						System.out.println("Adýnýz: " + ad);
						System.out.println("Soyadýnýz: " + soyad);
						System.out.println("Kart numaranýz: " + "4546494748");
						System.out.println("Kart þifreniz: " + degistirilmissifre);
						System.out.println("Güncel bakiyeniz: " + guncelbakiye);
					}

					if (giris == 6) {
						System.out.println("Ýþleminiz iptal edildi! \n Kartýnýzý alýnýz!");
					}

				}

			}
		}

	}

}
