package entity;

public class sinhvienxahoi extends sinhvien {
	private Double sinh;
	private Double su;
	private Double dia;
	public Double getSinh() {
		return sinh;
	}
	public void setSinh(Double sinh) {
		this.sinh = sinh;
	}
	public Double getSu() {
		return su;
	}
	public void setSu(Double su) {
		this.su = su;
	}
	public Double getDia() {
		return dia;
	}
	public void setDia(Double dia) {
		this.dia = dia;
	}
	public sinhvienxahoi(String Ten,String khoa,Double Van,Double Su,Double Dia){
		 super(Ten,khoa);
		 this.sinh= Van;
		 this.su= Su;
		 this.dia= Dia;
	 }
	public void outputXH() {
		System.out.println("{ Truong: "+super.Truong +"  "
							+"Ten: "+super.getTen()+"  "
							+"Khoa: "+super.getkhoa()+"  "
							+"Sinh "+this.getSinh()+"  "
							+"Su: "+this.getSu()+"  "
							+"Dia: "+this.getDia());
	}

	
}

