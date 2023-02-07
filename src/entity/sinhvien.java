package entity;

public abstract class sinhvien  {
	
		 public static String Truong = "javabasic";
		private String ten = "Nam nung non" ;
		private String khoa;
		public static String getTruong() {
			return Truong;
		}
		public static void setTruong(String truong) {
			Truong = truong;
		}
		public String getTen() {
			return ten;
		}
		public void setTen(String ten) {
			this.ten = ten;
		}
		public String getkhoa() {
			return khoa;
		}
		public void setLop(String lop) {
			this.khoa = khoa;
			
		}
		
		sinhvien(String ten , String lop){
			this.ten = ten;
			this.khoa = khoa;
		};
		
		
}
