package entity;

public class sinhvientunhien extends sinhvien {
private Double toan;
private Double ly;
private Double hoa;
private Double DiemTB;

public Double getToan() {
	return toan;
}
public void setToan(Double toan) {
	this.toan = toan;
}
public Double getLy() {
	return ly;
}
public void setLy(Double ly) {
	this.ly = ly;
}
public Double getHoa() {
	return hoa;
}
public void setHoa(Double hoa) {
	this.hoa = hoa;
}
  public sinhvientunhien(String ten , String lop,
					double toan, double ly ,double hoa){
		super(ten, lop);
		this.toan = toan;
		this.ly = ly;
		this.hoa=hoa;
	};
	public void output() {
		System.out.println( "truong:  " + super.Truong + ", "+
							"ten : " + super.getTen() + ","+
							"lop : " + super.getkhoa() + ","+
							"toan : " + this.getToan() + ","+
							"ly : " + this.getLy() + ","+
							"hoa : " + this.getHoa() + "}" );
	}
//	public void TDiemTB() {
//		DiemTB=((this.getToan()*2)+this.getLy()+this.getHoa())/4;
//		if(DiemTB>=5.0) {
//			System.out.print("Diem tren trung binh  ");
//			System.out.println("Ten: "+super.getTen()+"  "
//					+"Khoa: "+super.getkhoa()+"  "
//					+"Diem TB:"+DiemTB);
//		}else {
//			System.out.println("Diem duoi trung binh  ");
//			System.out.println("Ten: "+super.getTen()+"  "
//					+"Khoa: "+super.getkhoa()+"  "
//					+"Diem TB:"+DiemTB);
//		}
//		
	}
		
	


