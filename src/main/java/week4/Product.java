package week4;

import java.time.LocalDate;

public class Product {

	public static int NEW = 1;
	public static int OLD = 2;
	public static int VINTAGE = 3;

	public static int STATUS_S = 1;
	public static int STATUS_A_PLUS = 2;
	public static int STATUS_B = 3;
	public static int STATUS_B_PLUS = 4;

	private long productId;
	private String productName;
	private int price;
	private int type;
	private LocalDate dateOfRegistration;
	private LocalDate dateOfUpdate;

}
