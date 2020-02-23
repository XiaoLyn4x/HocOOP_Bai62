package buiphuongnga.com.model;

public class SinhVien {
	private String hoTen;
	private double diem;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public SinhVien(String hoTen, double diem )
	{
		this.hoTen=hoTen;
		this.diem=diem;
		System.out.println("Đây là constructor có đối số");
	}
	public SinhVien()
	{
		System.out.println("Đây là constructor mặc định");
		this.hoTen="Ông Obama";
	}
	public void xuatThongTin()
	{
		System.out.println(this.hoTen+"->"+this.diem);
	}
	public String toString() {
		return "Họ tên = "+this.hoTen+"\nĐiểm = "+this.diem;
	}
	
}
